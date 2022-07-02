import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test9501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9501");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        int int9 = builder2.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.mongoAdminPassword("skip_initial_import");
        boolean boolean12 = builder11.getmongoUseSSL();
        builder11.mongoSSLVerifyCertificate = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9502");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getBULK_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getIncludeCollection();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.isMongoSecondaryReadPreference();
        java.lang.String str16 = mongoDBRiverDefinition8.getMongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "skip_initial_import" + "'", str9, "skip_initial_import");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "bulk" + "'", str10, "bulk");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "actions" + "'", str11, "actions");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "secondary_read_preference" + "'", str14, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9503");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        java.util.Set<java.lang.String> strSet9 = builder0.excludeFields;
        int int10 = builder0.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.typeName("mongodb-1638820218363");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoAdminUser("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9504");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        java.lang.String str11 = mongoDBRiverDefinition8.getINCLUDE_COLLECTION_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.getdropCollection();
        boolean boolean13 = mongoDBRiverDefinition8.isMongoGridFS();
        boolean boolean14 = mongoDBRiverDefinition8.getdisableIndexRefresh();
        boolean boolean15 = mongoDBRiverDefinition8.skipInitialImport;
        boolean boolean16 = mongoDBRiverDefinition8.getmongoGridFS();
        java.util.Set<java.lang.String> strSet17 = mongoDBRiverDefinition8.getIncludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_collection" + "'", str11, "include_collection");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strSet17);
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9505");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        boolean boolean8 = builder5.mongoUseSSL;
        java.lang.String str9 = builder5.gettypeName();
        java.lang.String str10 = builder5.getincludeCollection();
        builder5.setimportAllCollections(true);
        builder5.mongoDb = "mongodb-1638820218326";
        builder5.setmongoAdminUser("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder5.script("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder5.mongoGridFS(false);
        boolean boolean21 = builder5.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9506");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getUSER_FIELD();
        int int14 = mongoDBRiverDefinition8.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition8.parentTypes;
        boolean boolean16 = mongoDBRiverDefinition8.getskipInitialImport();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "drop_collection" + "'", str12, "drop_collection");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "user" + "'", str13, "user");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9507");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        builder0.setriverIndexName("flush_interval");
        java.lang.String str10 = builder0.indexName;
        builder0.mongoUseSSL = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.scriptType("script_type");
        builder0.mongoLocalPassword = "script";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9508");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString16();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString18();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9509");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder2.mongoGridFS = true;
        builder2.mongoAdminUser = "include_collection";
        builder2.importAllCollections = false;
        java.lang.String str9 = builder2.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.mongoCollection("size");
        builder15.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str19 = mongoDBRiverDefinition18.getTHROTTLE_SIZE_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition18.getGRIDFS_FIELD();
        boolean boolean21 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        java.lang.String str22 = mongoDBRiverDefinition18.getStatisticsTypeName();
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition18.getIncludeFields();
        int int24 = mongoDBRiverDefinition18.getDEFAULT_DB_PORT();
        java.lang.String str25 = mongoDBRiverDefinition18.getDB_FIELD();
        java.lang.String str26 = mongoDBRiverDefinition18.getACTIONS_FIELD();
        int int27 = mongoDBRiverDefinition18.connectTimeout;
        org.elasticsearch.common.logging.ESLogger eSLogger28 = mongoDBRiverDefinition18.getlogger();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongoDBRiverDefinition18.mongoServers;
        builder2.setmongoServers(serverAddressList29);
        builder2.setmongoAdminUser("gridfs");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "include_collection" + "'", str9, "include_collection");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "throttle_size" + "'", str19, "throttle_size");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "gridfs" + "'", str20, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27017 + "'", int24 == 27017);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "db" + "'", str25, "db");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "actions" + "'", str26, "actions");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(eSLogger28);
        org.junit.Assert.assertNotNull(serverAddressList29);
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9510");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        builder0.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet7 = builder6.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.advancedTransformation(false);
        builder6.setimportAllCollections(false);
        builder6.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet17 = builder16.parentTypes;
        boolean boolean18 = builder16.skipInitialImport;
        java.lang.String[] strArray49 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        builder16.setincludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder6.includeFields((java.util.Set<java.lang.String>) strSet50);
        builder0.parentTypes = strSet50;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder0.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet60 = builder59.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder59.mongoCollection("size");
        org.elasticsearch.common.settings.Settings settings63 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet67 = builder66.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder66.mongoCollection("size");
        builder69.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder69);
        java.lang.String str73 = mongoDBRiverDefinition72.getTHROTTLE_SIZE_FIELD();
        java.lang.String str74 = mongoDBRiverDefinition72.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue75 = mongoDBRiverDefinition72.getDEFAULT_BULK_SIZE();
        boolean boolean76 = mongoDBRiverDefinition72.getmongoGridFS();
        boolean boolean77 = mongoDBRiverDefinition72.mongoGridFS;
        java.lang.String str78 = mongoDBRiverDefinition72.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject79 = mongoDBRiverDefinition72.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings80 = new org.elasticsearch.river.RiverSettings(settings63, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder62.mongoCollectionFilter(basicDBObject79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder0.mongoCollectionFilter(basicDBObject79);
        builder0.socketTimeout = '4';
        builder0.setskipInitialImport(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNull(strSet60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNull(strSet67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "throttle_size" + "'", str73, "throttle_size");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "admin" + "'", str74, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "bulk_size" + "'", str78, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9511");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList10 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean11 = mongoDBRiverDefinition8.advancedTransformation;
        boolean boolean12 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean13 = mongoDBRiverDefinition8.storeStatistics;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertNotNull(serverAddressList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9512");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoGridFS;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue13 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        java.lang.String str14 = mongoDBRiverDefinition8.getPORT_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteSizeValue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "port" + "'", str14, "port");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "skip_initial_import" + "'", str16, "skip_initial_import");
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9513");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.lang.String str12 = mongoDBRiverDefinition8.getTypeName();
        java.lang.String str13 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getStatisticsTypeName();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str16 = mongoDBRiverDefinition8.getADVANCED_TRANSFORMATION_FIELD();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter17 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings18 = serializedObjectSupporter17.deserializeObjectRiverSettings4();
        java.lang.String str19 = serializedObjectSupporter17.deserializeObjectString10();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString2();
        org.elasticsearch.river.RiverSettings riverSettings21 = serializedObjectSupporter17.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings22 = serializedObjectSupporter17.deserializeObjectRiverSettings3();
        java.lang.String str23 = serializedObjectSupporter17.deserializeObjectString8();
        mongoDBRiverDefinition8.serializedObjectSupporter = serializedObjectSupporter17;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gridfs" + "'", str13, "gridfs");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "advanced_transformation" + "'", str16, "advanced_transformation");
        org.junit.Assert.assertNull(riverSettings18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_river" + "'", str19, "_river");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_river" + "'", str20, "_river");
        org.junit.Assert.assertNull(riverSettings21);
        org.junit.Assert.assertNull(riverSettings22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_river" + "'", str23, "_river");
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9514");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        builder2.indexName = "disable_index_refresh";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoDb("localhost");
        java.lang.String str8 = builder7.gettypeName();
        java.lang.String str9 = builder7.gettypeName();
        builder7.riverName = "size";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9515");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        builder12.setthrottleSize((-1));
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = builder12.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder12.storeStatistics(false);
        builder19.setmongoUseSSL(true);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory28 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject30 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        com.mongodb.BasicDBObject basicDBObject33 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript34 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        builder19.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder19.mongoAdminUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.mongoLocalUser("mongodb-1638820218363");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript34);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9516");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getUSER_FIELD();
        int int14 = mongoDBRiverDefinition8.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str15 = mongoDBRiverDefinition8.mongoLocalUser;
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str17 = mongoDBRiverDefinition8.mongoAdminPassword;
        java.lang.String str18 = mongoDBRiverDefinition8.getDB_FIELD();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition8.getIncludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "drop_collection" + "'", str12, "drop_collection");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "user" + "'", str13, "user");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "db" + "'", str18, "db");
        org.junit.Assert.assertNull(strSet19);
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9517");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        java.lang.String str4 = builder2.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.riverIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject9 = builder8.mongoOplogFilter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(basicDBObject9);
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9518");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("");
        builder10.mongoGridFS = true;
        builder10.setdisableIndexRefresh(false);
        java.lang.String str15 = builder10.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.riverName("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoDb("include_fields");
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        builder17.mongoClientOptions = mongoClientOptions20;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9519");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp52 = builder49.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet56 = builder55.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder55.mongoCollection("size");
        builder58.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder58);
        java.lang.String str62 = mongoDBRiverDefinition61.getTHROTTLE_SIZE_FIELD();
        java.lang.String str63 = mongoDBRiverDefinition61.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue64 = mongoDBRiverDefinition61.getDEFAULT_BULK_SIZE();
        boolean boolean65 = mongoDBRiverDefinition61.getmongoGridFS();
        boolean boolean66 = mongoDBRiverDefinition61.mongoGridFS;
        java.lang.String str67 = mongoDBRiverDefinition61.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject68 = mongoDBRiverDefinition61.mongoCollectionFilter;
        builder49.mongoOplogFilter = basicDBObject68;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder49.mongoDb("concurrent_bulk_requests");
        java.lang.String str72 = builder49.getmongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(wildcardTimestamp52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(strSet56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "throttle_size" + "'", str62, "throttle_size");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "admin" + "'", str63, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "bulk_size" + "'", str67, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject68);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "concurrent_bulk_requests" + "'", str72, "concurrent_bulk_requests");
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9520");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        int int12 = mongoDBRiverDefinition8.getThrottleSize();
        java.lang.String str13 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        java.lang.String str14 = mongoDBRiverDefinition8.getCONNECTION_TIMEOUT();
        java.lang.String str15 = mongoDBRiverDefinition8.getCONCURRENT_REQUESTS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null.size" + "'", str13, "null.size");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "connect_timeout" + "'", str14, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "concurrent_requests" + "'", str15, "concurrent_requests");
    }

    @Test
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9521");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        builder12.setthrottleSize((-1));
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = builder12.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder12.storeStatistics(false);
        builder19.setmongoUseSSL(true);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory28 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject30 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        com.mongodb.BasicDBObject basicDBObject33 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript34 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        builder19.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder19.mongoAdminUser("mongodb-1638820217755");
        int int41 = builder40.getthrottleSize();
        builder40.setmongoSecondaryReadPreference(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript34);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9522");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean14 = mongoDBRiverDefinition8.isMongoUseSSL();
        boolean boolean15 = mongoDBRiverDefinition8.storeStatistics;
        java.lang.String str16 = mongoDBRiverDefinition8.getScript();
        int int17 = mongoDBRiverDefinition8.getDEFAULT_BULK_ACTIONS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
    }

    @Test
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9523");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.isMongoGridFS();
        int int11 = mongoDBRiverDefinition8.getDEFAULT_BULK_ACTIONS();
        java.lang.String str12 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getRiverName();
        boolean boolean14 = mongoDBRiverDefinition8.getmongoUseSSL();
        boolean boolean15 = mongoDBRiverDefinition8.getstoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ssl" + "'", str9, "ssl");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "parent_types" + "'", str12, "parent_types");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9524");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.disableIndexRefresh(true);
        java.lang.String str10 = builder0.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoLocalPassword("type");
        builder0.setsocketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.importAllCollections(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9525");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getFILTER_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getLOCAL_DB_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.statisticsTypeName;
        int int15 = mongoDBRiverDefinition8.connectTimeout;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "actions" + "'", str10, "actions");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "filter" + "'", str11, "filter");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "skip_initial_import" + "'", str12, "skip_initial_import");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "local" + "'", str13, "local");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9526");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        builder4.mongoAdminPassword = "name";
        java.lang.String str9 = builder4.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder4.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder2.excludeFields((java.util.Set<java.lang.String>) strSet46);
        java.lang.String str51 = builder2.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder2.mongoGridFS(false);
        boolean boolean54 = builder53.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp55 = builder53.initialTimestamp;
        builder53.setdropCollection(false);
        java.util.Set<java.lang.String> strSet58 = builder53.parentTypes;
        com.mongodb.BasicDBObject basicDBObject59 = builder53.mongoOplogFilter;
        com.mongodb.BasicDBObject basicDBObject60 = builder53.mongoOplogFilter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(wildcardTimestamp55);
        org.junit.Assert.assertNull(strSet58);
        org.junit.Assert.assertNull(basicDBObject59);
        org.junit.Assert.assertNull(basicDBObject60);
    }

    @Test
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9527");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory1 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript4 = docScoreNativeScriptFactory1.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject3);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        com.mongodb.BasicDBObject basicDBObject10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript11 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory1.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet17 = builder16.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.mongoCollection("size");
        builder16.setscript("index");
        builder16.mongoGridFS = true;
        builder16.setstatisticsIndexName("gridfs");
        org.elasticsearch.common.settings.Settings settings26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet30 = builder29.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder29.mongoCollection("size");
        builder32.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str36 = mongoDBRiverDefinition35.getTHROTTLE_SIZE_FIELD();
        java.lang.String str37 = mongoDBRiverDefinition35.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue38 = mongoDBRiverDefinition35.getDEFAULT_BULK_SIZE();
        boolean boolean39 = mongoDBRiverDefinition35.getmongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition35.mongoGridFS;
        java.lang.String str41 = mongoDBRiverDefinition35.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject42 = mongoDBRiverDefinition35.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings26, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder16.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings45 = new org.elasticsearch.river.RiverSettings(settings13, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = riverSettings45.settings();
        org.elasticsearch.script.ExecutableScript executableScript47 = docScoreNativeScriptFactory1.newScript(strMap46);
        org.elasticsearch.common.settings.Settings settings48 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet52 = builder51.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder51.mongoCollection("size");
        builder54.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder54);
        java.lang.String str58 = mongoDBRiverDefinition57.getTHROTTLE_SIZE_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition57.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue60 = mongoDBRiverDefinition57.getDEFAULT_BULK_SIZE();
        boolean boolean61 = mongoDBRiverDefinition57.getmongoGridFS();
        boolean boolean62 = mongoDBRiverDefinition57.mongoGridFS;
        java.lang.String str63 = mongoDBRiverDefinition57.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition57.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings65 = new org.elasticsearch.river.RiverSettings(settings48, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = riverSettings65.settings();
        org.elasticsearch.script.ExecutableScript executableScript67 = docScoreNativeScriptFactory1.newScript(strMap66);
        org.elasticsearch.river.RiverSettings riverSettings68 = new org.elasticsearch.river.RiverSettings(settings0, strMap66);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(executableScript4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNotNull(executableScript11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "throttle_size" + "'", str36, "throttle_size");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "admin" + "'", str37, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "bulk_size" + "'", str41, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(executableScript47);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(strSet52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "throttle_size" + "'", str58, "throttle_size");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "admin" + "'", str59, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "bulk_size" + "'", str63, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject64);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(executableScript67);
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9528");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue10 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        int int11 = mongoDBRiverDefinition8.getSocketTimeout();
        java.lang.String str12 = mongoDBRiverDefinition8.getMongoAdminUser();
        boolean boolean13 = mongoDBRiverDefinition8.importAllCollections;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "flush_interval" + "'", str9, "flush_interval");
        org.junit.Assert.assertNotNull(byteSizeValue10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9529");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getTYPE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getCONCURRENT_BULK_REQUESTS_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.getdisableIndexRefresh();
        boolean boolean15 = mongoDBRiverDefinition8.isStoreStatistics();
        java.lang.String str16 = mongoDBRiverDefinition8.getRiverIndexName();
        int int17 = mongoDBRiverDefinition8.connectTimeout;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition8.getInitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "type" + "'", str12, "type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "concurrent_bulk_requests" + "'", str13, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp18);
    }

    @Test
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9530");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        int int11 = mongoDBRiverDefinition8.connectTimeout;
        java.lang.String str12 = mongoDBRiverDefinition8.getStatisticsIndexName();
        java.lang.String str13 = mongoDBRiverDefinition8.getOPTIONS_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.mongoLocalUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "options" + "'", str13, "options");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9531");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.socketTimeout(1000);
        boolean boolean13 = builder10.getimportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9532");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString14();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218363" + "'", str3, "mongodb-1638820218363");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb-1638820218449" + "'", str7, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_river" + "'", str8, "_river");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_river" + "'", str9, "_river");
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9533");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        java.lang.String str12 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue13 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        java.lang.String str14 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        int int15 = mongoDBRiverDefinition8.getDEFAULT_DB_PORT();
        java.lang.String str16 = mongoDBRiverDefinition8.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null.size" + "'", str11, "null.size");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null.size" + "'", str12, "null.size");
        org.junit.Assert.assertNotNull(byteSizeValue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "parent_types" + "'", str14, "parent_types");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9534");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        builder0.includeCollection = "mongodb-1638820218363";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.scriptType("mongodb-1638820218424");
        java.lang.String str11 = builder0.mongoLocalUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9535");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.settypeName("initial_timestamp");
        builder2.setriverName("size");
        java.util.Set<java.lang.String> strSet11 = builder2.excludeFields;
        builder2.setscript("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder2.typeName("user");
        boolean boolean16 = builder15.mongoUseSSL;
        builder15.setconnectTimeout((int) (byte) 100);
        builder15.mongoSSLVerifyCertificate = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9536");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.getmongoGridFS();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str15 = mongoDBRiverDefinition8.getMongoAdminUser();
        java.lang.String str16 = mongoDBRiverDefinition8.getSTORE_STATISTICS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue17 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "parent_types" + "'", str12, "parent_types");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "store_statistics" + "'", str16, "store_statistics");
        org.junit.Assert.assertNotNull(byteSizeValue17);
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9537");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        int int9 = builder0.getconnectTimeout();
        java.lang.String str10 = builder0.getriverIndexName();
        boolean boolean11 = builder0.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoLocalUser("exclude_fields");
        com.mongodb.BasicDBObject basicDBObject14 = builder13.mongoOplogFilter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(basicDBObject14);
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9538");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition8.getMongoOplogFilter();
        java.lang.String str13 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getMongoLocalUser();
        java.lang.String str15 = mongoDBRiverDefinition8.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean16 = mongoDBRiverDefinition8.getstoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "parent_types" + "'", str13, "parent_types");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "disable_index_refresh" + "'", str15, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9539");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        java.lang.String str12 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        java.lang.String str13 = mongoDBRiverDefinition8.getADVANCED_TRANSFORMATION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getUSER_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null.size" + "'", str11, "null.size");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null.size" + "'", str12, "null.size");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "advanced_transformation" + "'", str13, "advanced_transformation");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "user" + "'", str14, "user");
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9540");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject12 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder0.setmongoCollectionFilter(basicDBObject15);
        builder0.mongoLocalPassword = "initial_timestamp";
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoClientOptions(mongoClientOptions21);
        boolean boolean23 = builder22.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder22.typeName("name");
        java.util.Set<java.lang.String> strSet26 = builder25.getincludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(strSet26);
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9541");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        java.util.List<com.mongodb.ServerAddress> serverAddressList51 = builder2.mongoServers;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(serverAddressList51);
    }

    @Test
    public void test9542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9542");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        java.util.Set<java.lang.String> strSet4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.includeFields(strSet4);
        java.lang.String str6 = builder5.mongoCollection;
        java.util.Set<java.lang.String> strSet7 = builder5.getexcludeFields();
        int int8 = builder5.socketTimeout;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test9543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9543");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setmongoAdminUser("disable_index_refresh");
        java.lang.String str8 = builder5.indexName;
        builder5.setmongoCollection("disable_index_refresh");
        builder5.mongoSSLVerifyCertificate = true;
        builder5.mongoLocalPassword = "ssl";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test9544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9544");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getMongoAdminPassword();
        boolean boolean13 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean14 = mongoDBRiverDefinition8.isMongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ssl" + "'", str11, "ssl");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test9545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9545");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject6 = builder0.mongoOplogFilter;
        builder0.setdisableIndexRefresh(false);
        java.lang.String str9 = builder0.gettypeName();
        java.lang.String str10 = builder0.getriverIndexName();
        builder0.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.statisticsIndexName("mongodb-1638820218449");
        boolean boolean15 = builder0.getmongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test9546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9546");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        builder2.indexName = "disable_index_refresh";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoDb("localhost");
        int int8 = builder7.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.statisticsIndexName("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        java.lang.String str19 = builder11.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder11.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet25 = builder24.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.advancedTransformation(false);
        builder26.mongoAdminPassword = "name";
        java.lang.String str31 = builder26.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet35 = builder34.parentTypes;
        boolean boolean36 = builder34.skipInitialImport;
        java.lang.String[] strArray67 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        builder34.setincludeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder26.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder24.excludeFields((java.util.Set<java.lang.String>) strSet68);
        builder11.includeFields = strSet68;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder10.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder10.socketTimeout(1000);
        builder76.setthrottleSize((int) (short) -1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test9547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9547");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray15 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet16);
        boolean boolean19 = builder0.getadvancedTransformation();
        boolean boolean20 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.typeName("collection");
        java.lang.String str23 = builder22.getscript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test9548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9548");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        builder0.setimportAllCollections(true);
        builder0.mongoLocalPassword = "_river";
        java.util.Set<java.lang.String> strSet12 = builder0.parentTypes;
        builder0.setconnectTimeout(8);
        boolean boolean15 = builder0.getmongoGridFS();
        builder0.mongoSecondaryReadPreference = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test9549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9549");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        boolean boolean11 = mongoDBRiverDefinition8.isMongoUseSSL();
        java.lang.String str12 = mongoDBRiverDefinition8.scriptType;
        boolean boolean13 = mongoDBRiverDefinition8.getdropCollection();
        java.lang.String str14 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.getdropCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "flush_interval" + "'", str14, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test9550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9550");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        builder0.includeCollection = "mongodb-1638820218363";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.parentTypes;
        builder13.indexName = "disable_index_refresh";
        builder13.setriverName("ssl_verify_certificate");
        builder13.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = builder13.initialTimestamp;
        builder13.riverIndexName = "db";
        com.mongodb.BasicDBObject basicDBObject24 = builder13.mongoCollectionFilter;
        builder10.setmongoCollectionFilter(basicDBObject24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str27 = mongoDBRiverDefinition26.mongoAdminUser;
        java.lang.String str28 = mongoDBRiverDefinition26.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "flush_interval" + "'", str28, "flush_interval");
    }

    @Test
    public void test9551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9551");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820217755" + "'", str4, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
    }

    @Test
    public void test9552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9552");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        java.lang.String[] strArray35 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder2.setincludeFields((java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = builder2.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder2.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder2.socketTimeout((int) (byte) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test9553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9553");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder2.mongoGridFS = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoUseSSL(false);
        builder2.setskipInitialImport(true);
        builder2.setmongoAdminPassword("null.size");
        builder2.setdisableIndexRefresh(false);
        boolean boolean13 = builder2.storeStatistics;
        org.bson.types.Binary binary14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder2.initialTimestamp(binary14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9554");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        boolean boolean7 = builder6.importAllCollections;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test9555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9555");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        int int11 = mongoDBRiverDefinition8.connectTimeout;
        boolean boolean12 = mongoDBRiverDefinition8.skipInitialImport;
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition8.getIncludeFields();
        boolean boolean14 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test9556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9556");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getUSER_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getStatisticsTypeName();
        boolean boolean16 = mongoDBRiverDefinition8.getmongoUseSSL();
        java.lang.String str17 = mongoDBRiverDefinition8.getStatisticsTypeName();
        boolean boolean18 = mongoDBRiverDefinition8.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "drop_collection" + "'", str13, "drop_collection");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "user" + "'", str14, "user");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test9557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9557");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        int int8 = builder5.getthrottleSize();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str10 = mongoDBRiverDefinition9.riverIndexName;
        boolean boolean11 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str12 = mongoDBRiverDefinition9.indexName;
        java.lang.String str13 = mongoDBRiverDefinition9.mongoLocalUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "name" + "'", str12, "name");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test9558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9558");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        builder0.setsocketTimeout(10);
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder0.build();
        java.lang.String str8 = mongoDBRiverDefinition7.getStatisticsIndexName();
        java.lang.String str9 = mongoDBRiverDefinition7.typeName;
        java.lang.String str10 = mongoDBRiverDefinition7.riverName;
        java.lang.String str11 = mongoDBRiverDefinition7.mongoCollection;
        java.lang.String str12 = mongoDBRiverDefinition7.mongoAdminPassword;
        boolean boolean13 = mongoDBRiverDefinition7.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9559");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        java.lang.String str6 = builder5.getindexName();
        builder5.mongoDb = "throttle_size";
        java.lang.String str9 = builder5.getmongoAdminPassword();
        java.lang.String str10 = builder5.mongoAdminUser;
        java.lang.String str11 = builder5.mongoLocalUser;
        java.util.Set<java.lang.String> strSet12 = builder5.getparentTypes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test9560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9560");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        int int12 = mongoDBRiverDefinition8.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean13 = mongoDBRiverDefinition8.isImportAllCollections();
        java.lang.String str14 = mongoDBRiverDefinition8.mongoDb;
        java.lang.String str15 = mongoDBRiverDefinition8.mongoAdminUser;
        java.lang.String str16 = mongoDBRiverDefinition8.getMongoAdminPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test9561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9561");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString13();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218424" + "'", str5, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb-1638820218408" + "'", str7, "mongodb-1638820218408");
    }

    @Test
    public void test9562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9562");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoCollection("size");
        int int15 = builder11.getsocketTimeout();
        builder11.settypeName("initial_timestamp");
        builder11.setriverName("size");
        java.util.Set<java.lang.String> strSet20 = builder11.excludeFields;
        java.lang.String str21 = builder11.getmongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) str21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet25 = builder24.getexcludeFields();
        com.mongodb.BasicDBObject basicDBObject26 = builder24.mongoCollectionFilter;
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder24);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet35 = builder34.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder34.mongoCollection("size");
        builder37.setmongoAdminUser("disable_index_refresh");
        builder37.setriverIndexName("ssl_verify_certificate");
        builder37.typeName = "mongodb-1638820218424";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet47 = builder46.includeFields;
        builder46.setmongoSecondaryReadPreference(true);
        java.lang.String str50 = builder46.riverName;
        com.mongodb.BasicDBObject basicDBObject51 = builder46.getmongoCollectionFilter();
        builder37.setmongoCollectionFilter(basicDBObject51);
        java.lang.Object obj53 = docScoreSearchScript0.unwrap((java.lang.Object) builder37);
        docScoreSearchScript0.setNextScore((float) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double56 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(strSet47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(basicDBObject51);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test9563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9563");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition8.mongoCollectionFilter;
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition8.getMongoOplogFilter();
        int int17 = mongoDBRiverDefinition8.getSocketTimeout();
        java.lang.String str18 = mongoDBRiverDefinition8.getCONNECTION_TIMEOUT();
        java.lang.String str19 = mongoDBRiverDefinition8.getPORT_FIELD();
        boolean boolean20 = mongoDBRiverDefinition8.mongoUseSSL;
        int int21 = mongoDBRiverDefinition8.connectTimeout;
        java.lang.String str22 = mongoDBRiverDefinition8.getMongoCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNull(basicDBObject16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "connect_timeout" + "'", str18, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "port" + "'", str19, "port");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "size" + "'", str22, "size");
    }

    @Test
    public void test9564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9564");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.getInitialTimestamp();
        boolean boolean11 = mongoDBRiverDefinition8.getimportAllCollections();
        java.lang.String str12 = mongoDBRiverDefinition8.getNAME_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition8.getInitialTimestamp();
        boolean boolean14 = mongoDBRiverDefinition8.storeStatistics;
        boolean boolean15 = mongoDBRiverDefinition8.getdisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "name" + "'", str12, "name");
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test9565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9565");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder2.setscript("index");
        builder2.mongoGridFS = true;
        builder2.setstatisticsIndexName("gridfs");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet16 = builder15.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.mongoCollection("size");
        builder18.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str22 = mongoDBRiverDefinition21.getTHROTTLE_SIZE_FIELD();
        java.lang.String str23 = mongoDBRiverDefinition21.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue24 = mongoDBRiverDefinition21.getDEFAULT_BULK_SIZE();
        boolean boolean25 = mongoDBRiverDefinition21.getmongoGridFS();
        boolean boolean26 = mongoDBRiverDefinition21.mongoGridFS;
        java.lang.String str27 = mongoDBRiverDefinition21.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition21.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings29 = new org.elasticsearch.river.RiverSettings(settings12, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder2.mongoCollectionFilter(basicDBObject28);
        java.lang.String str31 = builder30.getindexName();
        java.lang.String str32 = builder30.getincludeCollection();
        builder30.mongoAdminUser = "concurrent_bulk_requests";
        org.bson.types.Binary binary35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.initialTimestamp(binary35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "throttle_size" + "'", str22, "throttle_size");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "bulk_size" + "'", str27, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test9566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9566");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.isStoreStatistics();
        java.lang.String str16 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition8.getStatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "exclude_fields" + "'", str16, "exclude_fields");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test9567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9567");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) builder11);
        com.mongodb.BasicDBObject basicDBObject13 = builder11.mongoOplogFilter;
        java.lang.String str14 = builder11.indexName;
        builder11.settypeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.mongoGridFS(true);
        builder18.mongoDb = "bulk_size";
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(basicDBObject13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test9568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9568");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.parentTypes;
        java.lang.String str13 = builder11.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.common.settings.Settings settings26 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory27 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject29 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript30 = docScoreNativeScriptFactory27.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory31 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject33 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript34 = docScoreNativeScriptFactory31.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        com.mongodb.BasicDBObject basicDBObject36 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory31.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject36);
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory27.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject36);
        org.elasticsearch.river.RiverSettings riverSettings39 = new org.elasticsearch.river.RiverSettings(settings26, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject36);
        org.elasticsearch.script.ExecutableScript executableScript40 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder11.mongoOplogFilter(basicDBObject36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder11.statisticsIndexName("password");
        java.lang.String str44 = builder43.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder43.mongoLocalPassword("");
        builder46.mongoAdminPassword = "type";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory49 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject51 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript52 = docScoreNativeScriptFactory49.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory53 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject55 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript56 = docScoreNativeScriptFactory53.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject55);
        com.mongodb.BasicDBObject basicDBObject58 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript59 = docScoreNativeScriptFactory53.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory49.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory61 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject63 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript64 = docScoreNativeScriptFactory61.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject63);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory65 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject67 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript68 = docScoreNativeScriptFactory65.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        com.mongodb.BasicDBObject basicDBObject70 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript71 = docScoreNativeScriptFactory65.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.script.ExecutableScript executableScript72 = docScoreNativeScriptFactory61.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.script.ExecutableScript executableScript73 = docScoreNativeScriptFactory49.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        builder46.setmongoCollectionFilter(basicDBObject70);
        builder0.setmongoOplogFilter(basicDBObject70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder0.mongoAdminUser("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition78 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder77);
        java.lang.String str79 = mongoDBRiverDefinition78.getACTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(executableScript24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject29);
        org.junit.Assert.assertNotNull(executableScript30);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript34);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(executableScript38);
        org.junit.Assert.assertNotNull(executableScript40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(basicDBObject51);
        org.junit.Assert.assertNotNull(executableScript52);
        org.junit.Assert.assertNotNull(basicDBObject55);
        org.junit.Assert.assertNotNull(executableScript56);
        org.junit.Assert.assertNotNull(basicDBObject58);
        org.junit.Assert.assertNotNull(executableScript59);
        org.junit.Assert.assertNotNull(executableScript60);
        org.junit.Assert.assertNotNull(basicDBObject63);
        org.junit.Assert.assertNotNull(executableScript64);
        org.junit.Assert.assertNotNull(basicDBObject67);
        org.junit.Assert.assertNotNull(executableScript68);
        org.junit.Assert.assertNotNull(basicDBObject70);
        org.junit.Assert.assertNotNull(executableScript71);
        org.junit.Assert.assertNotNull(executableScript72);
        org.junit.Assert.assertNotNull(executableScript73);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "actions" + "'", str79, "actions");
    }

    @Test
    public void test9569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9569");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        builder0.setsocketTimeout(10);
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder0.build();
        java.lang.String str8 = mongoDBRiverDefinition7.getStatisticsIndexName();
        java.lang.String str9 = mongoDBRiverDefinition7.typeName;
        java.lang.String str10 = mongoDBRiverDefinition7.riverName;
        java.lang.String str11 = mongoDBRiverDefinition7.getACTIONS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition7.getIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "actions" + "'", str11, "actions");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test9570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9570");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.riverName;
        int int12 = mongoDBRiverDefinition8.getDEFAULT_BULK_ACTIONS();
        java.lang.String str13 = mongoDBRiverDefinition8.mongoLocalUser;
        boolean boolean14 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean15 = mongoDBRiverDefinition8.getdisableIndexRefresh();
        java.lang.String str16 = mongoDBRiverDefinition8.getScriptType();
        java.lang.String str17 = mongoDBRiverDefinition8.mongoLocalUser;
        java.lang.String str18 = mongoDBRiverDefinition8.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "connect_timeout" + "'", str18, "connect_timeout");
    }

    @Test
    public void test9571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9571");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        boolean boolean50 = builder2.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder2.mongoSSLVerifyCertificate(false);
        com.mongodb.MongoClientOptions mongoClientOptions53 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoClientOptions(mongoClientOptions53);
        java.lang.String str55 = builder52.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder52.includeCollection("throttle_size");
        java.lang.String str58 = builder57.scriptType;
        builder57.setthrottleSize((int) 'a');
        com.mongodb.MongoClientOptions mongoClientOptions61 = null;
        builder57.mongoClientOptions = mongoClientOptions61;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test9572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9572");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        boolean boolean50 = builder2.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder2.mongoSSLVerifyCertificate(false);
        builder2.storeStatistics = true;
        java.util.Set<java.lang.String> strSet55 = builder2.parentTypes;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(strSet55);
    }

    @Test
    public void test9573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9573");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.includeCollection("mongodb-1638820218424");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test9574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9574");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet4 = builder3.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder3.advancedTransformation(false);
        java.lang.String str7 = builder6.getindexName();
        builder6.mongoDb = "throttle_size";
        java.lang.String str10 = builder6.getmongoAdminPassword();
        builder6.mongoSecondaryReadPreference = true;
        builder6.mongoLocalUser = "_river";
        com.mongodb.BasicDBObject basicDBObject15 = builder6.mongoCollectionFilter;
        java.lang.String str16 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet20 = builder19.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder19.mongoCollection("size");
        int int23 = builder19.getsocketTimeout();
        builder19.settypeName("initial_timestamp");
        builder19.setriverName("size");
        builder19.mongoLocalPassword = "socket_timeout";
        java.lang.String str30 = builder19.getmongoDb();
        com.mongodb.BasicDBObject basicDBObject31 = builder19.mongoCollectionFilter;
        builder6.setmongoCollectionFilter(basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(basicDBObject31);
    }

    @Test
    public void test9575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9575");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet6 = builder5.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoCollection("size");
        builder8.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.includeCollection("throttle_size");
        boolean boolean14 = builder13.getimportAllCollections();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        java.lang.String str18 = builder17.riverIndexName;
        java.util.Set<java.lang.String> strSet19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.includeFields(strSet19);
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        builder17.mongoClientOptions = mongoClientOptions21;
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        builder24.mongoAdminPassword = "name";
        java.lang.String str29 = builder24.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet33 = builder32.parentTypes;
        boolean boolean34 = builder32.skipInitialImport;
        java.lang.String[] strArray65 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        builder32.setincludeFields((java.util.Set<java.lang.String>) strSet66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder24.includeFields((java.util.Set<java.lang.String>) strSet66);
        builder69.riverName = "disable_index_refresh";
        builder69.setindexName("actions");
        com.mongodb.BasicDBObject basicDBObject74 = builder69.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings75 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
        builder17.mongoOplogFilter = basicDBObject74;
        builder13.mongoCollectionFilter = basicDBObject74;
        org.elasticsearch.river.RiverSettings riverSettings78 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
        org.elasticsearch.script.ScriptService scriptService79 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition80 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_collection", "throttle_size", riverSettings78, scriptService79);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(basicDBObject74);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition80);
    }

    @Test
    public void test9576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9576");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoLocalUser("");
        boolean boolean5 = builder4.getmongoGridFS();
        boolean boolean6 = builder4.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoCollection("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.getinitialTimestamp();
        builder10.mongoGridFS = true;
        builder10.mongoLocalUser = "bulk_size";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
    }

    @Test
    public void test9577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9577");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        java.util.Set<java.lang.String> strSet6 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("parent_types");
        builder0.mongoLocalPassword = "mongodb-1638820218299";
        java.util.Set<java.lang.String> strSet11 = builder0.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoDb("script_type");
        builder13.setmongoLocalUser("flush_interval");
        java.lang.String str16 = builder13.getmongoCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9578");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.typeName;
        boolean boolean16 = mongoDBRiverDefinition8.importAllCollections;
        boolean boolean17 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        java.lang.String str18 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        boolean boolean19 = mongoDBRiverDefinition8.getmongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "exclude_fields" + "'", str14, "exclude_fields");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "exclude_fields" + "'", str18, "exclude_fields");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test9579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9579");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject6 = builder0.mongoOplogFilter;
        builder0.setdisableIndexRefresh(false);
        java.lang.String str9 = builder0.gettypeName();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        builder0.mongoClientOptions = mongoClientOptions10;
        boolean boolean12 = builder0.disableIndexRefresh;
        builder0.throttleSize = 10;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test9580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9580");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.typeName;
        java.lang.String str16 = mongoDBRiverDefinition8.getMongoCollection();
        boolean boolean17 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str18 = mongoDBRiverDefinition8.mongoAdminUser;
        java.lang.String str19 = mongoDBRiverDefinition8.getIMPORT_ALL_COLLECTIONS_FIELD();
        boolean boolean20 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        java.lang.String str21 = mongoDBRiverDefinition8.getINCLUDE_COLLECTION_FIELD();
        boolean boolean22 = mongoDBRiverDefinition8.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "exclude_fields" + "'", str14, "exclude_fields");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "size" + "'", str16, "size");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "import_all_collections" + "'", str19, "import_all_collections");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "include_collection" + "'", str21, "include_collection");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test9581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9581");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition8.includeFields;
        java.lang.String str14 = mongoDBRiverDefinition8.getMongoCollection();
        java.lang.String str15 = mongoDBRiverDefinition8.getStatisticsIndexName();
        boolean boolean16 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        java.lang.String str17 = mongoDBRiverDefinition8.statisticsIndexName;
        java.lang.String str18 = mongoDBRiverDefinition8.getScriptType();
        java.lang.String str19 = mongoDBRiverDefinition8.getOPTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "size" + "'", str14, "size");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "options" + "'", str19, "options");
    }

    @Test
    public void test9582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9582");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.riverName;
        boolean boolean12 = mongoDBRiverDefinition8.advancedTransformation;
        boolean boolean13 = mongoDBRiverDefinition8.importAllCollections;
        java.lang.String str14 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ssl_verify_certificate" + "'", str14, "ssl_verify_certificate");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test9583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9583");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getPORT_FIELD();
        int int13 = mongoDBRiverDefinition8.throttleSize;
        int int14 = mongoDBRiverDefinition8.getDEFAULT_BULK_ACTIONS();
        java.lang.String str15 = mongoDBRiverDefinition8.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "port" + "'", str12, "port");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test9584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9584");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        java.lang.String str6 = builder0.includeCollection;
        java.lang.String str7 = builder0.script;
        java.lang.String str8 = builder0.riverIndexName;
        boolean boolean9 = builder0.disableIndexRefresh;
        boolean boolean10 = builder0.getmongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet11 = builder0.getexcludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test9585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9585");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition8.getMongoOplogFilter();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition8.getMongoCollectionFilter();
        boolean boolean14 = mongoDBRiverDefinition8.getdropCollection();
        java.lang.String str15 = mongoDBRiverDefinition8.riverIndexName;
        java.lang.String str16 = mongoDBRiverDefinition8.getPASSWORD_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition8.getScript();
        java.lang.String str18 = mongoDBRiverDefinition8.statisticsIndexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "password" + "'", str16, "password");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test9586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9586");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.isStoreStatistics();
        java.lang.String str15 = mongoDBRiverDefinition8.scriptType;
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str17 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition8.statisticsTypeName;
        java.lang.String str19 = mongoDBRiverDefinition8.getIMPORT_ALL_COLLECTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ssl" + "'", str13, "ssl");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ssl_verify_certificate" + "'", str17, "ssl_verify_certificate");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "import_all_collections" + "'", str19, "import_all_collections");
    }

    @Test
    public void test9587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9587");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.getdropCollection();
        java.lang.String str13 = mongoDBRiverDefinition8.getLOCAL_DB_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getIMPORT_ALL_COLLECTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "local" + "'", str13, "local");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "import_all_collections" + "'", str14, "import_all_collections");
    }

    @Test
    public void test9588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9588");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        java.lang.String str7 = builder0.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoUseSSL(false);
        builder0.mongoAdminPassword = "advanced_transformation";
        boolean boolean12 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder0.initialTimestamp;
        builder0.setstoreStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.dropCollection(false);
        com.mongodb.BasicDBObject basicDBObject18 = builder0.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet19 = builder0.getexcludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(basicDBObject18);
        org.junit.Assert.assertNull(strSet19);
    }

    @Test
    public void test9589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9589");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setmongoAdminUser("disable_index_refresh");
        java.lang.String str8 = builder5.indexName;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        com.mongodb.BasicDBObject basicDBObject18 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.script.ExecutableScript executableScript20 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder5.mongoCollectionFilter(basicDBObject18);
        java.lang.String str22 = builder21.riverName;
        builder21.includeCollection = "mongodb-1638820218424";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder21.storeStatistics(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(executableScript19);
        org.junit.Assert.assertNotNull(executableScript20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test9590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9590");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition8.getPORT_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition8.getBULK_SIZE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition8.statisticsTypeName;
        java.lang.String str20 = mongoDBRiverDefinition8.getScript();
        java.lang.String str21 = mongoDBRiverDefinition8.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str22 = mongoDBRiverDefinition8.getFILTER_FIELD();
        java.lang.String str23 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondary_read_preference" + "'", str15, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "port" + "'", str17, "port");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "bulk_size" + "'", str18, "bulk_size");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "include_collection" + "'", str21, "include_collection");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "filter" + "'", str22, "filter");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "flush_interval" + "'", str23, "flush_interval");
    }

    @Test
    public void test9591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9591");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isDropCollection();
        java.lang.String str13 = mongoDBRiverDefinition8.getFILTER_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition8.getInitialTimestamp();
        int int16 = mongoDBRiverDefinition8.getConnectTimeout();
        java.lang.String str17 = mongoDBRiverDefinition8.getRiverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "filter" + "'", str13, "filter");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test9592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9592");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition8.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions17 = mongoDBRiverDefinition8.mongoClientOptions;
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition8.getMongoServers();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondary_read_preference" + "'", str15, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(serverAddressList18);
    }

    @Test
    public void test9593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9593");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition8.includeFields;
        java.lang.String str14 = mongoDBRiverDefinition8.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getINDEX_OBJECT();
        int int16 = mongoDBRiverDefinition8.getSocketTimeout();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition8.getMongoServers();
        java.lang.String str18 = mongoDBRiverDefinition8.riverName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "concurrent_bulk_requests" + "'", str14, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index" + "'", str15, "index");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test9594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9594");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        boolean boolean8 = builder5.mongoUseSSL;
        java.lang.String str9 = builder5.gettypeName();
        java.lang.String str10 = builder5.getincludeCollection();
        builder5.setimportAllCollections(true);
        builder5.mongoDb = "mongodb-1638820218326";
        java.lang.String str15 = builder5.statisticsIndexName;
        builder5.setdisableIndexRefresh(true);
        builder5.settypeName("");
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder5.getmongoClientOptions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(mongoClientOptions20);
    }

    @Test
    public void test9595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9595");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str13 = mongoDBRiverDefinition8.getTYPE_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "type" + "'", str13, "type");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test9596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9596");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getMongoAdminUser();
        boolean boolean16 = mongoDBRiverDefinition8.isStoreStatistics();
        java.lang.String str17 = mongoDBRiverDefinition8.getRiverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "drop_collection" + "'", str13, "drop_collection");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "secondary_read_preference" + "'", str14, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test9597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9597");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        builder6.setmongoAdminUser("throttle_size");
        boolean boolean9 = builder6.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        java.lang.String str14 = builder12.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory28 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject30 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory32 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject34 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory32.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject34);
        com.mongodb.BasicDBObject basicDBObject37 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory32.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.script.ExecutableScript executableScript39 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.river.RiverSettings riverSettings40 = new org.elasticsearch.river.RiverSettings(settings27, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.script.ExecutableScript executableScript41 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder12.mongoOplogFilter(basicDBObject37);
        boolean boolean43 = builder42.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder42.mongoLocalPassword("_river");
        boolean boolean46 = builder45.dropCollection;
        java.util.List<com.mongodb.ServerAddress> serverAddressList47 = builder45.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.advancedTransformation(false);
        builder48.mongoAdminPassword = "name";
        boolean boolean53 = builder48.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject54 = builder48.mongoOplogFilter;
        builder48.setdisableIndexRefresh(false);
        java.lang.String str57 = builder48.gettypeName();
        builder48.skipInitialImport = false;
        builder48.setstatisticsTypeName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.advancedTransformation(false);
        builder62.mongoAdminPassword = "name";
        boolean boolean67 = builder62.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory68 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject70 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript71 = docScoreNativeScriptFactory68.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory72 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject74 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript75 = docScoreNativeScriptFactory72.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
        com.mongodb.BasicDBObject basicDBObject77 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript78 = docScoreNativeScriptFactory72.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject77);
        org.elasticsearch.script.ExecutableScript executableScript79 = docScoreNativeScriptFactory68.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject77);
        builder62.setmongoCollectionFilter(basicDBObject77);
        builder62.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList83 = builder62.mongoServers;
        builder48.mongoServers = serverAddressList83;
        builder45.setmongoServers(serverAddressList83);
        builder6.setmongoServers(serverAddressList83);
        builder6.setmongoAdminUser("host");
        builder6.indexName = "store_statistics";
        builder6.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder6.skipInitialImport(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(executableScript18);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(executableScript26);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(basicDBObject34);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNotNull(executableScript38);
        org.junit.Assert.assertNotNull(executableScript39);
        org.junit.Assert.assertNotNull(executableScript41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(serverAddressList47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(basicDBObject54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(basicDBObject70);
        org.junit.Assert.assertNotNull(executableScript71);
        org.junit.Assert.assertNotNull(basicDBObject74);
        org.junit.Assert.assertNotNull(executableScript75);
        org.junit.Assert.assertNotNull(basicDBObject77);
        org.junit.Assert.assertNotNull(executableScript78);
        org.junit.Assert.assertNotNull(executableScript79);
        org.junit.Assert.assertNotNull(serverAddressList83);
        org.junit.Assert.assertNotNull(builder94);
    }

    @Test
    public void test9598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9598");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder2.mongoGridFS = true;
        builder2.mongoAdminUser = "include_collection";
        boolean boolean7 = builder2.getstoreStatistics();
        boolean boolean8 = builder2.getstoreStatistics();
        boolean boolean9 = builder2.skipInitialImport;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test9599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9599");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoGridFS;
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition8.getIncludeFields();
        int int14 = mongoDBRiverDefinition8.getDEFAULT_BULK_ACTIONS();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition8.getInitialTimestamp();
        java.lang.String str16 = mongoDBRiverDefinition8.getStatisticsIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9600");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.statisticsIndexName;
        boolean boolean13 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean14 = mongoDBRiverDefinition8.isStoreStatistics();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue15 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        java.lang.String str16 = mongoDBRiverDefinition8.mongoDb;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteSizeValue15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9601");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        boolean boolean5 = builder0.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.connectTimeout((int) '#');
        builder0.settypeName("drop_collection");
        java.lang.String str10 = builder0.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.mongoCollection("size");
        builder16.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str20 = mongoDBRiverDefinition19.getTHROTTLE_SIZE_FIELD();
        boolean boolean21 = mongoDBRiverDefinition19.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition19.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition19.getIncludeFields();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition19.mongoCollectionFilter;
        java.lang.String str25 = mongoDBRiverDefinition19.getTHROTTLE_SIZE_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions26 = mongoDBRiverDefinition19.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition19.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder0.mongoCollectionFilter(basicDBObject27);
        boolean boolean29 = builder0.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "throttle_size" + "'", str20, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(basicDBObject22);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "throttle_size" + "'", str25, "throttle_size");
        org.junit.Assert.assertNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test9602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9602");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        java.lang.String str8 = builder2.mongoDb;
        builder2.mongoLocalUser = "secondary_read_preference";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.riverName("mongodb-1638820217755");
        builder12.script = "_river";
        builder12.mongoCollection = "mongodb-1638820218424";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet20 = builder19.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder19.mongoCollection("size");
        int int23 = builder19.getsocketTimeout();
        builder19.setmongoSecondaryReadPreference(false);
        builder19.setskipInitialImport(true);
        com.mongodb.BasicDBObject basicDBObject28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder19.mongoOplogFilter(basicDBObject28);
        boolean boolean30 = builder29.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.advancedTransformation(false);
        builder33.mongoGridFS = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.mongoUseSSL(false);
        java.lang.String str38 = builder33.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet42 = builder41.includeFields;
        builder41.setmongoGridFS(true);
        boolean boolean45 = builder41.disableIndexRefresh;
        java.lang.String[] strArray62 = new java.lang.String[] { "socket_timeout", "mongodb-1638820218387", "flush_interval", "db", "socket_timeout", "host", "concurrent_requests", "concurrent_requests", "bulk_timeout", "disable_index_refresh", "index", "disable_index_refresh", "local", "throttle_size", "script_type", "parent_types" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder41.parentTypes((java.util.Set<java.lang.String>) strSet63);
        builder33.excludeFields = strSet63;
        builder29.excludeFields = strSet63;
        builder12.includeFields = strSet63;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder12.dropCollection(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder70);
    }

    @Test
    public void test9603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9603");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject12 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder0.setmongoCollectionFilter(basicDBObject15);
        builder0.mongoLocalPassword = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.storeStatistics(false);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter25 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings27 = serializedObjectSupporter25.deserializeObjectRiverSettings1();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString3();
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter25.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings30 = serializedObjectSupporter25.deserializeObjectRiverSettings1();
        builder24.serializedObjectSupporter = serializedObjectSupporter25;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb-1638820218387" + "'", str26, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "mongodb-1638820218264" + "'", str28, "mongodb-1638820218264");
        org.junit.Assert.assertNull(riverSettings29);
        org.junit.Assert.assertNull(riverSettings30);
    }

    @Test
    public void test9604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9604");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.riverName;
        int int12 = mongoDBRiverDefinition8.getDEFAULT_BULK_ACTIONS();
        java.lang.String str13 = mongoDBRiverDefinition8.mongoLocalUser;
        boolean boolean14 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.lang.String str16 = mongoDBRiverDefinition8.getCOLLECTION_FIELD();
        boolean boolean17 = mongoDBRiverDefinition8.dropCollection;
        java.lang.String str18 = mongoDBRiverDefinition8.getBULK_TIMEOUT_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition8.scriptType;
        java.lang.String str20 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(basicDBObject15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "collection" + "'", str16, "collection");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "bulk_timeout" + "'", str18, "bulk_timeout");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "secondary_read_preference" + "'", str20, "secondary_read_preference");
    }

    @Test
    public void test9605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9605");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        builder2.indexName = "servers";
        builder2.mongoLocalUser = "script_type";
        int int10 = builder2.socketTimeout;
        java.lang.String str11 = builder2.includeCollection;
        builder2.setconnectTimeout((int) (short) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test9606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9606");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
    }

    @Test
    public void test9607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9607");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTypeName();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition8.getExcludeFields();
        java.lang.String str11 = mongoDBRiverDefinition8.mongoLocalUser;
        java.lang.String str12 = mongoDBRiverDefinition8.getSOCKET_TIMEOUT();
        java.lang.String str13 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "socket_timeout" + "'", str12, "socket_timeout");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "exclude_fields" + "'", str13, "exclude_fields");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script" + "'", str14, "script");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "parent_types" + "'", str15, "parent_types");
    }

    @Test
    public void test9608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9608");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        builder0.skipInitialImport = false;
        builder0.indexName = "exclude_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.riverIndexName("name");
        java.lang.String str16 = builder15.getstatisticsIndexName();
        builder15.mongoCollection = "mongodb-1638820218299";
        boolean boolean19 = builder15.dropCollection;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test9609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9609");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getCOLLECTION_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter12 = mongoDBRiverDefinition8.serializedObjectSupporter;
        java.lang.String str13 = mongoDBRiverDefinition8.getCOLLECTION_FIELD();
        int int14 = mongoDBRiverDefinition8.getDEFAULT_DB_PORT();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "flush_interval" + "'", str9, "flush_interval");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "collection" + "'", str10, "collection");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "drop_collection" + "'", str11, "drop_collection");
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "collection" + "'", str13, "collection");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
    }

    @Test
    public void test9610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9610");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        boolean boolean3 = builder0.getdropCollection();
        java.lang.String str4 = builder0.includeCollection;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test9611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9611");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.riverName;
        boolean boolean12 = mongoDBRiverDefinition8.storeStatistics;
        java.lang.String str13 = mongoDBRiverDefinition8.statisticsTypeName;
        java.lang.String str14 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getSCRIPT_FIELD();
        boolean boolean16 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "skip_initial_import" + "'", str14, "skip_initial_import");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test9612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9612");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setmongoAdminUser("disable_index_refresh");
        builder5.mongoDb = "hi!";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        builder10.mongoAdminPassword = "name";
        builder10.mongoSSLVerifyCertificate = true;
        builder10.setmongoLocalPassword("throttle_size");
        builder10.settypeName("mongodb-1638820218424");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder10.scriptType("filter");
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoClientOptions(mongoClientOptions23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.advancedTransformation(false);
        builder25.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder25.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder25.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet37 = builder36.parentTypes;
        boolean boolean38 = builder36.skipInitialImport;
        java.lang.String[] strArray69 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        builder36.setincludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder25.includeFields((java.util.Set<java.lang.String>) strSet70);
        builder22.setparentTypes((java.util.Set<java.lang.String>) strSet70);
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder5.riverIndexName("bulk");
        java.util.Set<java.lang.String> strSet78 = builder77.parentTypes;
        builder77.setindexName("mongodb-1638820218299");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(strSet78);
    }

    @Test
    public void test9613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9613");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getTYPE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.mongoGridFS;
        int int15 = mongoDBRiverDefinition8.getThrottleSize();
        java.lang.String str16 = mongoDBRiverDefinition8.getRiverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "type" + "'", str12, "type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "include_fields" + "'", str13, "include_fields");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9614");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertNull(riverSettings5);
    }

    @Test
    public void test9615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9615");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.typeName;
        java.lang.String str16 = mongoDBRiverDefinition8.getMongoCollection();
        java.lang.String str17 = mongoDBRiverDefinition8.getTYPE_FIELD();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition8.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions19 = mongoDBRiverDefinition8.mongoClientOptions;
        java.lang.String str20 = mongoDBRiverDefinition8.getSTORE_STATISTICS_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition8.getMongoAdminPassword();
        boolean boolean22 = mongoDBRiverDefinition8.isMongoUseSSL();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter23 = mongoDBRiverDefinition8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "exclude_fields" + "'", str14, "exclude_fields");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "size" + "'", str16, "size");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "type" + "'", str17, "type");
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNull(mongoClientOptions19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "store_statistics" + "'", str20, "store_statistics");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter23);
    }

    @Test
    public void test9616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9616");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString16();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb-1638820218264" + "'", str8, "mongodb-1638820218264");
    }

    @Test
    public void test9617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9617");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.storeStatistics;
        java.lang.String str5 = builder0.mongoAdminPassword;
        builder0.storeStatistics = true;
        builder0.advancedTransformation = true;
        boolean boolean10 = builder0.advancedTransformation;
        java.lang.String str11 = builder0.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.statisticsTypeName("port");
        java.lang.String str14 = builder0.typeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test9618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9618");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoUseSSL;
        java.lang.String str13 = mongoDBRiverDefinition8.getScript();
        java.lang.String str14 = mongoDBRiverDefinition8.getINDEX_OBJECT();
        boolean boolean15 = mongoDBRiverDefinition8.getdisableIndexRefresh();
        java.lang.String str16 = mongoDBRiverDefinition8.getIndexName();
        java.lang.String str17 = mongoDBRiverDefinition8.mongoCollection;
        java.lang.String str18 = mongoDBRiverDefinition8.getSERVERS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition8.getBULK_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition8.mongoLocalUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "index" + "'", str14, "index");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "name" + "'", str16, "name");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "size" + "'", str17, "size");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "servers" + "'", str18, "servers");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "bulk" + "'", str19, "bulk");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test9619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9619");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.getadvancedTransformation();
        boolean boolean14 = mongoDBRiverDefinition8.dropCollection;
        java.lang.String str15 = mongoDBRiverDefinition8.getRiverIndexName();
        java.lang.String str16 = mongoDBRiverDefinition8.script;
        boolean boolean17 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean18 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        boolean boolean19 = mongoDBRiverDefinition8.getskipInitialImport();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition8.parentTypes;
        int int21 = mongoDBRiverDefinition8.socketTimeout;
        boolean boolean22 = mongoDBRiverDefinition8.getstoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_fields" + "'", str11, "include_fields");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test9620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9620");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        builder4.mongoAdminPassword = "name";
        java.lang.String str9 = builder4.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder4.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder2.excludeFields((java.util.Set<java.lang.String>) strSet46);
        java.util.List<com.mongodb.ServerAddress> serverAddressList51 = builder50.mongoServers;
        boolean boolean52 = builder50.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet58 = builder57.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder57.mongoCollection("size");
        builder60.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        java.lang.String str64 = mongoDBRiverDefinition63.getTHROTTLE_SIZE_FIELD();
        java.lang.String str65 = mongoDBRiverDefinition63.getADMIN_DB_FIELD();
        boolean boolean66 = mongoDBRiverDefinition63.mongoSecondaryReadPreference;
        java.lang.String str67 = mongoDBRiverDefinition63.getDROP_COLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet68 = mongoDBRiverDefinition63.excludeFields;
        boolean boolean69 = mongoDBRiverDefinition63.isMongoGridFS();
        boolean boolean70 = mongoDBRiverDefinition63.isStoreStatistics();
        java.util.List<com.mongodb.ServerAddress> serverAddressList71 = mongoDBRiverDefinition63.mongoServers;
        builder50.mongoServers = serverAddressList71;
        java.lang.String str73 = builder50.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(serverAddressList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNull(strSet58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "throttle_size" + "'", str64, "throttle_size");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "admin" + "'", str65, "admin");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "drop_collection" + "'", str67, "drop_collection");
        org.junit.Assert.assertNull(strSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(serverAddressList71);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test9621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9621");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.typeName;
        java.lang.String str14 = mongoDBRiverDefinition8.statisticsIndexName;
        java.lang.String str15 = mongoDBRiverDefinition8.getSCRIPT_TYPE_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean17 = mongoDBRiverDefinition8.getmongoGridFS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition8.mongoServers;
        java.lang.String str19 = mongoDBRiverDefinition8.getDB_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition8.getBULK_TIMEOUT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script_type" + "'", str15, "script_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "name" + "'", str16, "name");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "db" + "'", str19, "db");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "bulk_timeout" + "'", str20, "bulk_timeout");
    }

    @Test
    public void test9622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9622");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.getmongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_fields" + "'", str11, "include_fields");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9623");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition8.advancedTransformation;
        boolean boolean14 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition8.getMongoServers();
        boolean boolean16 = mongoDBRiverDefinition8.dropCollection;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter17 = mongoDBRiverDefinition8.serializedObjectSupporter;
        java.lang.String str18 = mongoDBRiverDefinition8.getBULK_TIMEOUT_FIELD();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition8.getMongoOplogFilter();
        java.lang.String str20 = mongoDBRiverDefinition8.getDISABLE_INDEX_REFRESH_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serverAddressList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "bulk_timeout" + "'", str18, "bulk_timeout");
        org.junit.Assert.assertNull(basicDBObject19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "disable_index_refresh" + "'", str20, "disable_index_refresh");
    }

    @Test
    public void test9624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9624");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getSOCKET_TIMEOUT();
        java.lang.String str12 = mongoDBRiverDefinition8.includeCollection;
        java.lang.String str13 = mongoDBRiverDefinition8.getINDEX_OBJECT();
        java.lang.String str14 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition8.initialTimestamp;
        java.lang.String str16 = mongoDBRiverDefinition8.getHOST_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "socket_timeout" + "'", str11, "socket_timeout");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "index" + "'", str13, "index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "flush_interval" + "'", str14, "flush_interval");
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "host" + "'", str16, "host");
    }

    @Test
    public void test9625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9625");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.mongoLocalUser;
        java.lang.String str11 = mongoDBRiverDefinition8.typeName;
        java.lang.String str12 = mongoDBRiverDefinition8.getMongoLocalUser();
        boolean boolean13 = mongoDBRiverDefinition8.isMongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9626");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoLocalPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        builder2.setmongoClientOptions(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test9627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9627");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray15 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet16);
        boolean boolean19 = builder0.getadvancedTransformation();
        boolean boolean20 = builder0.getadvancedTransformation();
        java.lang.String str21 = builder0.mongoCollection;
        builder0.setmongoLocalPassword("concurrent_requests");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test9628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9628");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.getmongoUseSSL();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str17 = mongoDBRiverDefinition8.getIncludeCollection();
        java.lang.String str18 = mongoDBRiverDefinition8.getINDEX_OBJECT();
        java.lang.String str19 = mongoDBRiverDefinition8.mongoLocalUser;
        java.lang.String str20 = mongoDBRiverDefinition8.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition8.getMongoOplogFilter();
        java.lang.String str22 = mongoDBRiverDefinition8.scriptType;
        com.mongodb.MongoClientOptions mongoClientOptions23 = mongoDBRiverDefinition8.mongoClientOptions;
        java.lang.String str24 = mongoDBRiverDefinition8.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "index" + "'", str18, "index");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(basicDBObject21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(mongoClientOptions23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test9629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9629");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        builder10.riverIndexName = "ssl";
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString11();
        java.lang.String str15 = serializedObjectSupporter13.deserializeObjectString17();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString7();
        java.lang.String str17 = serializedObjectSupporter13.deserializeObjectString9();
        builder10.serializedObjectSupporter = serializedObjectSupporter13;
        java.lang.String str19 = serializedObjectSupporter13.deserializeObjectString11();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb-1638820218387" + "'", str14, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb-1638820218449" + "'", str15, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb-1638820218326" + "'", str16, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb-1638820218363" + "'", str17, "mongodb-1638820218363");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb-1638820218387" + "'", str19, "mongodb-1638820218387");
    }

    @Test
    public void test9630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9630");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString15();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218264" + "'", str5, "mongodb-1638820218264");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb-1638820218424" + "'", str7, "mongodb-1638820218424");
    }

    @Test
    public void test9631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9631");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder0.getmongoClientOptions();
        builder0.statisticsTypeName = "bulk_timeout";
        boolean boolean9 = builder0.getstoreStatistics();
        builder0.script = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.statisticsIndexName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(false);
        builder14.mongoAdminPassword = "name";
        java.lang.String str19 = builder14.mongoCollection;
        java.util.Set<java.lang.String> strSet20 = builder14.includeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = builder14.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet25 = builder22.includeFields;
        boolean boolean26 = builder22.getmongoGridFS();
        java.util.Set<java.lang.String> strSet27 = builder22.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder22.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory33 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject35 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript36 = docScoreNativeScriptFactory33.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        builder30.setmongoCollectionFilter(basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder30.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder30.setparentTypes((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder22.parentTypes((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder14.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter51 = builder14.serializedObjectSupporter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder14.scriptType("drop_collection");
        java.util.Set<java.lang.String> strSet54 = builder14.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder13.includeFields(strSet54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoGridFS(false);
        builder57.setstoreStatistics(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNull(serializedObjectSupporter51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test9632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9632");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoLocalPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.mongoLocalPassword("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoAdminPassword("db");
        builder9.mongoLocalUser = "include_fields";
        builder9.importAllCollections = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test9633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9633");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        java.lang.String str7 = builder0.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoUseSSL(false);
        builder0.mongoAdminPassword = "advanced_transformation";
        boolean boolean12 = builder0.mongoGridFS;
        builder0.mongoCollection = "bulk_timeout";
        builder0.riverIndexName = "db";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder0.mongoClientOptions(mongoClientOptions19);
        java.util.Set<java.lang.String> strSet21 = null;
        builder20.parentTypes = strSet21;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = builder20.initialTimestamp;
        java.lang.String str24 = builder20.getmongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test9634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9634");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        builder15.mongoAdminPassword = "name";
        java.lang.String str20 = builder15.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        boolean boolean25 = builder23.skipInitialImport;
        java.lang.String[] strArray56 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder0.includeFields = strSet57;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder0.mongoSecondaryReadPreference(true);
        java.util.List<com.mongodb.ServerAddress> serverAddressList65 = builder64.mongoServers;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(serverAddressList65);
    }

    @Test
    public void test9635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9635");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean14 = mongoDBRiverDefinition8.isMongoUseSSL();
        java.lang.String str15 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition8.statisticsTypeName;
        java.lang.String str17 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition8.getMongoServers();
        java.lang.String str19 = mongoDBRiverDefinition8.getMongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "drop_collection" + "'", str15, "drop_collection");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ssl_verify_certificate" + "'", str17, "ssl_verify_certificate");
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test9636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9636");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.includeCollection("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("store_statistics");
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.mongoClientOptions;
        com.mongodb.BasicDBObject basicDBObject15 = builder11.getmongoCollectionFilter();
        builder11.mongoDb = "skip_initial_import";
        builder11.scriptType = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder11.mongoSSLVerifyCertificate(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test9637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9637");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        java.lang.String str7 = builder0.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoUseSSL(false);
        builder0.mongoAdminPassword = "advanced_transformation";
        boolean boolean12 = builder0.mongoGridFS;
        builder0.setscriptType("");
        builder0.mongoDb = "size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.riverIndexName("filter");
        builder0.statisticsIndexName = "mongodb-1638820218363";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test9638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9638");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str13 = mongoDBRiverDefinition8.riverName;
        boolean boolean14 = mongoDBRiverDefinition8.isAdvancedTransformation();
        java.lang.String str15 = mongoDBRiverDefinition8.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition8.getUSER_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "include_collection" + "'", str15, "include_collection");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "user" + "'", str16, "user");
    }

    @Test
    public void test9639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9639");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        java.lang.String str6 = builder0.includeCollection;
        java.lang.String str7 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        builder8.setmongoCollectionFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoDb("mongodb-1638820218387");
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
        builder17.parentTypes = strSet34;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder0.includeFields((java.util.Set<java.lang.String>) strSet34);
        builder38.storeStatistics = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(executableScript14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(executableScript24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test9640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9640");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString16();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings12 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertNull(riverSettings5);
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb-1638820218264" + "'", str8, "mongodb-1638820218264");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_river" + "'", str9, "_river");
        org.junit.Assert.assertNull(riverSettings10);
        org.junit.Assert.assertNull(riverSettings11);
        org.junit.Assert.assertNull(riverSettings12);
    }
}

