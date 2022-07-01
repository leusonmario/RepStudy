import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getDEFAULT_DB_HOST();
        int int6 = mongoDBRiverDefinition2.socketTimeout;
        org.elasticsearch.common.unit.TimeValue timeValue7 = mongoDBRiverDefinition2.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean8 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        boolean boolean9 = mongoDBRiverDefinition2.isDropCollection();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition2.excludeFields;
        boolean boolean11 = mongoDBRiverDefinition2.importAllCollections;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalPassword("");
        builder9.mongoCollection = "flush_interval";
        com.mongodb.BasicDBObject basicDBObject12 = builder9.mongoOplogFilter;
        builder9.mongoLocalPassword = "disable_index_refresh";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder9.connectTimeout(1);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean6 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        java.lang.String str7 = mongoDBRiverDefinition1.getFILTER_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "filter" + "'", str7, "filter");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        boolean boolean20 = builder14.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray21 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList22 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList22, serverAddressArray21);
        builder14.mongoServers = serverAddressList22;
        java.lang.String str25 = builder14.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder14.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder14.skipInitialImport(true);
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder34.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoGridFS(true);
        builder38.setmongoCollection("drop_collection");
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) builder38);
        java.lang.String str44 = builder38.statisticsTypeName;
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serverAddressArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str8 = builder7.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str11 = builder10.typeName;
        com.mongodb.BasicDBObject basicDBObject12 = null;
        builder10.mongoCollectionFilter = basicDBObject12;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.mongoOplogFilter = basicDBObject14;
        builder10.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = builder10.mongoServers;
        java.lang.String[] strArray22 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet23);
        builder7.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet23);
        java.lang.String str28 = builder27.getscript();
        boolean boolean29 = builder27.advancedTransformation;
        builder27.setimportAllCollections(false);
        java.lang.String str32 = builder27.mongoLocalPassword;
        builder27.setriverIndexName("");
        boolean boolean35 = builder27.mongoSecondaryReadPreference;
        java.lang.String str36 = builder27.statisticsTypeName;
        builder27.skipInitialImport = false;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.getstoreStatistics();
        builder0.statisticsIndexName = "admin";
        builder0.setskipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoLocalUser("name");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        java.lang.String str11 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalUser("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        int int15 = mongoDBRiverDefinition14.getThrottleSize();
        int int16 = mongoDBRiverDefinition14.getConnectTimeout();
        java.lang.String str17 = mongoDBRiverDefinition14.getBULK_TIMEOUT_FIELD();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "bulk_timeout" + "'", str17, "bulk_timeout");
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str4 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        int int6 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str7 = mongoDBRiverDefinition1.getFILTER_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "script" + "'", str4, "script");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "filter" + "'", str7, "filter");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        java.lang.String str4 = mongoDBRiverDefinition2.getRiverIndexName();
        java.lang.String str5 = mongoDBRiverDefinition2.getPASSWORD_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getDB_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.dropCollection;
        boolean boolean8 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        boolean boolean9 = mongoDBRiverDefinition2.getmongoUseSSL();
        java.lang.String str10 = mongoDBRiverDefinition2.getMongoDb();
        java.lang.String str11 = mongoDBRiverDefinition2.getTHROTTLE_SIZE_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "password" + "'", str5, "password");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "db" + "'", str6, "db");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "throttle_size" + "'", str11, "throttle_size");
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str5 = mongoDBRiverDefinition1.getTypeName();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = mongoDBRiverDefinition1.getInitialTimestamp();
        java.lang.String str7 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "local" + "'", str7, "local");
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoGridFS(true);
        java.lang.String str9 = builder0.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setconnectTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder0.mongoClientOptions;
        builder0.setmongoLocalUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoCollection = "db";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(mongoClientOptions13);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        java.lang.Object obj14 = null;
        docScoreSearchScript0.setNextVar("gridfs", obj14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str18 = builder17.typeName;
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder17.mongoCollectionFilter = basicDBObject19;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoAdminPassword("db");
        builder22.disableIndexRefresh = true;
        builder22.setconnectTimeout(1000);
        builder22.setriverIndexName("skip_initial_import");
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) builder22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.util.Set<java.lang.String> strSet33 = builder31.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject35 = null;
        builder31.setmongoOplogFilter(basicDBObject35);
        boolean boolean37 = builder31.dropCollection;
        boolean boolean38 = builder31.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder31.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        java.util.Set<java.lang.String> strSet43 = builder41.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject45 = null;
        builder41.setmongoOplogFilter(basicDBObject45);
        boolean boolean47 = builder41.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray48 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList49 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList49, serverAddressArray48);
        builder41.mongoServers = serverAddressList49;
        java.lang.String str52 = builder41.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str54 = builder53.typeName;
        com.mongodb.BasicDBObject basicDBObject55 = null;
        builder53.mongoCollectionFilter = basicDBObject55;
        java.lang.String str57 = builder53.mongoAdminUser;
        builder53.disableIndexRefresh = false;
        java.lang.String str60 = builder53.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str62 = builder61.typeName;
        com.mongodb.BasicDBObject basicDBObject63 = null;
        builder61.mongoCollectionFilter = basicDBObject63;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder61.mongoUseSSL(true);
        java.lang.String[] strArray76 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        builder66.setparentTypes((java.util.Set<java.lang.String>) strSet77);
        builder53.parentTypes = strSet77;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder41.parentTypes((java.util.Set<java.lang.String>) strSet77);
        builder40.setparentTypes((java.util.Set<java.lang.String>) strSet77);
        java.lang.String str83 = builder40.includeCollection;
        java.lang.String str84 = builder40.getindexName();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) builder40);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(strSet43);
        org.junit.Assert.assertNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(serverAddressArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        java.lang.String str5 = builder0.getriverName();
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str12 = builder11.typeName;
        com.mongodb.BasicDBObject basicDBObject13 = null;
        builder11.mongoCollectionFilter = basicDBObject13;
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder11.mongoOplogFilter = basicDBObject15;
        builder11.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = builder11.mongoServers;
        java.lang.String[] strArray23 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder11.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        builder8.parentTypes = strSet24;
        builder0.excludeFields = strSet24;
        builder0.statisticsIndexName = "drop_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder0.socketTimeout((int) (byte) -1);
        builder32.mongoLocalUser = "concurrent_requests";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getStatisticsIndexName();
        java.lang.String str7 = mongoDBRiverDefinition2.getTypeName();
        boolean boolean8 = mongoDBRiverDefinition2.isDropCollection();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.getParentTypes();
        java.lang.String str10 = mongoDBRiverDefinition2.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition2.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "exclude_fields" + "'", str11, "exclude_fields");
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        builder5.mongoClientOptions = mongoClientOptions6;
        builder5.setmongoCollection("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.advancedTransformation(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = builder11.getinitialTimestamp();
        boolean boolean13 = builder11.skipInitialImport;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.getincludeCollection();
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.util.Set<java.lang.String> strSet27 = builder25.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject29 = null;
        builder25.setmongoOplogFilter(basicDBObject29);
        com.mongodb.BasicDBObject basicDBObject31 = builder25.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        builder16.setmongoOplogFilter(basicDBObject31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder8.mongoCollectionFilter(basicDBObject31);
        builder34.mongoSecondaryReadPreference = false;
        builder34.setmongoAdminPassword("db");
        java.util.Set<java.lang.String> strSet39 = builder34.parentTypes;
        builder34.settypeName("local");
        com.mongodb.BasicDBObject basicDBObject42 = builder34.mongoOplogFilter;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(basicDBObject31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(strSet39);
        org.junit.Assert.assertNull(basicDBObject42);
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        builder0.mongoUseSSL = true;
        builder0.setscriptType("gridfs");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder0.mongoCollectionFilter = basicDBObject10;
        builder0.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str15 = builder14.typeName;
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder14.mongoCollectionFilter = basicDBObject16;
        java.lang.String str18 = builder14.mongoAdminUser;
        builder14.disableIndexRefresh = false;
        java.lang.String str21 = builder14.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str23 = builder22.typeName;
        com.mongodb.BasicDBObject basicDBObject24 = null;
        builder22.mongoCollectionFilter = basicDBObject24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder22.mongoUseSSL(true);
        java.lang.String[] strArray37 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder27.setparentTypes((java.util.Set<java.lang.String>) strSet38);
        builder14.parentTypes = strSet38;
        builder0.parentTypes = strSet38;
        boolean boolean43 = builder0.getskipInitialImport();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.mongoAdminUser("actions");
        com.mongodb.BasicDBObject basicDBObject46 = builder0.mongoOplogFilter;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(basicDBObject46);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoGridFS(true);
        builder13.advancedTransformation = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.getmongoClientOptions();
        int int9 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.statisticsIndexName("advanced_transformation");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str4 = mongoDBRiverDefinition1.mongoLocalUser;
        java.lang.String str5 = mongoDBRiverDefinition1.getRiverIndexName();
        java.lang.String str6 = mongoDBRiverDefinition1.getSTORE_STATISTICS_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = mongoDBRiverDefinition1.getlogger();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "store_statistics" + "'", str6, "store_statistics");
        org.junit.Assert.assertNotNull(eSLogger7);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        java.lang.String str5 = builder0.getriverName();
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.typeName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str15 = mongoDBRiverDefinition13.scriptType;
        boolean boolean16 = mongoDBRiverDefinition13.importAllCollections;
        java.lang.String str17 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition13.mongoServers;
        builder11.setmongoServers(serverAddressList18);
        boolean boolean20 = builder11.getimportAllCollections();
        builder11.disableIndexRefresh = false;
        int int23 = builder11.getconnectTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "collection" + "'", str17, "collection");
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition12.excludeFields;
        java.lang.String str15 = mongoDBRiverDefinition12.mongoAdminUser;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) mongoDBRiverDefinition12);
        java.util.Set<java.lang.String> strSet17 = mongoDBRiverDefinition12.getParentTypes();
        java.lang.String str18 = mongoDBRiverDefinition12.getFILTER_FIELD();
        boolean boolean19 = mongoDBRiverDefinition12.isMongoSecondaryReadPreference();
        boolean boolean20 = mongoDBRiverDefinition12.getimportAllCollections();
        boolean boolean21 = mongoDBRiverDefinition12.storeStatistics;
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "filter" + "'", str18, "filter");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        java.lang.String str11 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalUser("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.getPARENT_TYPES_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getStatisticsIndexName();
        java.lang.String str17 = mongoDBRiverDefinition14.getSCRIPT_TYPE_FIELD();
        int int18 = mongoDBRiverDefinition14.getDEFAULT_BULK_ACTIONS();
        boolean boolean19 = mongoDBRiverDefinition14.getskipInitialImport();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "parent_types" + "'", str15, "parent_types");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "script_type" + "'", str17, "script_type");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1000 + "'", int18 == 1000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        boolean boolean8 = builder0.mongoSecondaryReadPreference;
        builder0.setadvancedTransformation(false);
        int int11 = builder0.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoAdminPassword("include_collection");
        java.util.Set<java.lang.String> strSet15 = builder0.parentTypes;
        java.lang.String str16 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str18 = builder17.typeName;
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder17.mongoCollectionFilter = basicDBObject19;
        java.lang.String str21 = builder17.mongoAdminUser;
        builder17.disableIndexRefresh = false;
        java.lang.String str24 = builder17.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder17.mongoClientOptions;
        builder17.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        java.util.Set<java.lang.String> strSet30 = builder28.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject32 = null;
        builder28.setmongoOplogFilter(basicDBObject32);
        boolean boolean34 = builder28.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet37 = builder36.excludeFields;
        builder36.setriverName("hi!");
        builder36.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str43 = builder42.typeName;
        com.mongodb.BasicDBObject basicDBObject44 = null;
        builder42.mongoCollectionFilter = basicDBObject44;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder42.mongoUseSSL(true);
        java.lang.String[] strArray57 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        builder47.setparentTypes((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder47.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str64 = builder63.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str66 = builder65.typeName;
        com.mongodb.BasicDBObject basicDBObject67 = null;
        builder65.mongoCollectionFilter = basicDBObject67;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder65.mongoUseSSL(true);
        java.lang.String[] strArray80 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        builder70.setparentTypes((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder63.parentTypes((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder62.parentTypes((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder17.excludeFields((java.util.Set<java.lang.String>) strSet81);
        builder0.includeFields = strSet81;
        java.util.Set<java.lang.String> strSet89 = builder0.parentTypes;
        builder0.setadvancedTransformation(false);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(mongoClientOptions25);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(strSet37);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNull(strSet89);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        java.lang.String str51 = mongoDBRiverDefinition50.getCONNECTION_TIMEOUT();
        int int52 = mongoDBRiverDefinition50.getConnectTimeout();
        boolean boolean53 = mongoDBRiverDefinition50.getmongoSecondaryReadPreference();
        java.lang.String str54 = mongoDBRiverDefinition50.getACTIONS_FIELD();
        int int55 = mongoDBRiverDefinition50.connectTimeout;
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition50);
        java.lang.String str57 = mongoDBRiverDefinition50.statisticsTypeName;
        java.lang.String str58 = mongoDBRiverDefinition50.getHOST_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition50.getINDEX_OBJECT();
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "connect_timeout" + "'", str51, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "actions" + "'", str54, "actions");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "host" + "'", str58, "host");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "index" + "'", str59, "index");
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str8 = builder7.mongoCollection;
        builder7.setmongoUseSSL(false);
        builder7.setconnectTimeout(0);
        boolean boolean13 = builder7.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder7.mongoClientOptions(mongoClientOptions15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str18 = builder17.typeName;
        builder17.setsocketTimeout(0);
        boolean boolean21 = builder17.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str24 = builder23.typeName;
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder23.mongoCollectionFilter = basicDBObject25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder23.mongoUseSSL(true);
        java.lang.String[] strArray38 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder28.setparentTypes((java.util.Set<java.lang.String>) strSet39);
        builder17.setparentTypes((java.util.Set<java.lang.String>) strSet39);
        java.lang.String str43 = builder17.statisticsIndexName;
        builder17.advancedTransformation = false;
        java.lang.String str46 = builder17.mongoDb;
        java.util.List<com.mongodb.ServerAddress> serverAddressList47 = builder17.getmongoServers();
        java.lang.String str48 = builder17.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str50 = builder49.typeName;
        com.mongodb.BasicDBObject basicDBObject51 = null;
        builder49.mongoCollectionFilter = basicDBObject51;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder49.mongoUseSSL(true);
        java.lang.String[] strArray64 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        builder54.setparentTypes((java.util.Set<java.lang.String>) strSet65);
        builder17.includeFields = strSet65;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder16.includeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet65);
        java.lang.String str71 = builder70.getmongoLocalUser();
        builder70.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder70.mongoLocalUser("gridfs");
        com.mongodb.MongoClientOptions mongoClientOptions76 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder70.mongoClientOptions(mongoClientOptions76);
        boolean boolean78 = builder70.getmongoSecondaryReadPreference();
        java.lang.String str79 = builder70.typeName;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(serverAddressList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setmongoUseSSL(false);
        builder0.setconnectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.connectTimeout((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean9 = builder0.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.socketTimeout(52);
        builder11.setstoreStatistics(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        builder0.typeName = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str14 = mongoDBRiverDefinition13.getBULK_SIZE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition13.getDEFAULT_DB_HOST();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "localhost" + "'", str15, "localhost");
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition2.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = mongoDBRiverDefinition2.mongoServers;
        boolean boolean8 = mongoDBRiverDefinition2.isDropCollection();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition2.initialTimestamp;
        java.lang.String str10 = mongoDBRiverDefinition2.getScript();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition2.getMongoClientOptions();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(mongoClientOptions11);
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        java.lang.String str51 = mongoDBRiverDefinition50.getCONNECTION_TIMEOUT();
        int int52 = mongoDBRiverDefinition50.getConnectTimeout();
        boolean boolean53 = mongoDBRiverDefinition50.getmongoSecondaryReadPreference();
        java.lang.String str54 = mongoDBRiverDefinition50.getACTIONS_FIELD();
        int int55 = mongoDBRiverDefinition50.connectTimeout;
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder57);
        boolean boolean60 = builder57.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder57.storeStatistics(false);
        java.lang.Object obj63 = docScoreSearchScript0.unwrap((java.lang.Object) builder62);
        docScoreSearchScript0.setNextScore((float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double66 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "connect_timeout" + "'", str51, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "actions" + "'", str54, "actions");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getSOCKET_TIMEOUT();
        java.lang.String str6 = mongoDBRiverDefinition2.getSCRIPT_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = mongoDBRiverDefinition2.getlogger();
        java.lang.String str8 = mongoDBRiverDefinition2.getPASSWORD_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition2.getTYPE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition2.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "socket_timeout" + "'", str5, "socket_timeout");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertNotNull(eSLogger7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "password" + "'", str8, "password");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "type" + "'", str9, "type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "skip_initial_import" + "'", str10, "skip_initial_import");
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        builder0.includeCollection = "port";
        builder0.setmongoGridFS(false);
        java.lang.String str9 = builder0.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.connectTimeout(10);
        builder0.setscriptType("");
        java.util.Set<java.lang.String> strSet14 = builder0.parentTypes;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getNAME_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.excludeFields;
        boolean boolean7 = mongoDBRiverDefinition1.disableIndexRefresh;
        int int8 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str9 = mongoDBRiverDefinition1.mongoAdminUser;
        java.lang.String str10 = mongoDBRiverDefinition1.indexName;
        boolean boolean11 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name" + "'", str4, "name");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bulk" + "'", str5, "bulk");
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.util.Set<java.lang.String> strSet14 = builder12.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.setmongoOplogFilter(basicDBObject16);
        com.mongodb.BasicDBObject basicDBObject18 = builder12.getmongoCollectionFilter();
        builder11.mongoCollectionFilter = basicDBObject18;
        org.elasticsearch.river.RiverSettings riverSettings20 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoCollectionFilter(basicDBObject18);
        int int22 = builder0.throttleSize;
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder0.mongoClientOptions;
        boolean boolean24 = builder0.getmongoGridFS();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        builder0.setsocketTimeout(0);
        boolean boolean4 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.getTypeName();
        java.lang.String str7 = mongoDBRiverDefinition5.getSERVERS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition5.getDEFAULT_DB_HOST();
        java.lang.String str9 = mongoDBRiverDefinition5.getSOCKET_TIMEOUT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "servers" + "'", str7, "servers");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "socket_timeout" + "'", str9, "socket_timeout");
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.getincludeCollection();
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.util.Set<java.lang.String> strSet27 = builder25.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject29 = null;
        builder25.setmongoOplogFilter(basicDBObject29);
        com.mongodb.BasicDBObject basicDBObject31 = builder25.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        builder16.setmongoOplogFilter(basicDBObject31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder8.mongoCollectionFilter(basicDBObject31);
        boolean boolean35 = builder8.getmongoSSLVerifyCertificate();
        builder8.setimportAllCollections(true);
        int int38 = builder8.getsocketTimeout();
        com.mongodb.MongoClientOptions mongoClientOptions39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder8.mongoClientOptions(mongoClientOptions39);
        builder40.setsocketTimeout(52);
        builder40.connectTimeout = (short) -1;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(basicDBObject31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.statisticsIndexName;
        java.lang.String str6 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition2.includeFields;
        java.lang.String str8 = mongoDBRiverDefinition2.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition2.getMongoAdminPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "secondary_read_preference" + "'", str3, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondary_read_preference" + "'", str4, "secondary_read_preference");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "connect_timeout" + "'", str6, "connect_timeout");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder0.mongoCollectionFilter = basicDBObject10;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.riverName("concurrent_requests");
        int int14 = builder13.getsocketTimeout();
        builder13.typeName = "hi!";
        builder13.mongoAdminPassword = "";
        java.lang.String str19 = builder13.getmongoDb();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.mongoAdminUser;
        builder0.setskipInitialImport(true);
        java.util.Set<java.lang.String> strSet6 = builder0.includeFields;
        java.util.Set<java.lang.String> strSet7 = builder0.getparentTypes();
        builder0.setthrottleSize((int) (byte) 1);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        java.lang.String str7 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        boolean boolean8 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition2.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition2.includeFields;
        java.lang.String str11 = mongoDBRiverDefinition2.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition2.getUSER_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition2.getCOLLECTION_FIELD();
        boolean boolean14 = mongoDBRiverDefinition2.getmongoGridFS();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "bulk_timeout" + "'", str9, "bulk_timeout");
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_collection" + "'", str11, "include_collection");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "user" + "'", str12, "user");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "collection" + "'", str13, "collection");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.util.Set<java.lang.String> strSet14 = builder12.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.setmongoOplogFilter(basicDBObject16);
        com.mongodb.BasicDBObject basicDBObject18 = builder12.getmongoCollectionFilter();
        builder11.mongoCollectionFilter = basicDBObject18;
        org.elasticsearch.river.RiverSettings riverSettings20 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoCollectionFilter(basicDBObject18);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = builder0.getinitialTimestamp();
        boolean boolean23 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        java.lang.String str28 = builder24.mongoAdminUser;
        java.lang.String str29 = builder24.getriverName();
        builder24.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder24.mongoLocalUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder24.typeName("import_all_collections");
        java.util.Set<java.lang.String> strSet36 = builder24.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder37);
        int int39 = mongoDBRiverDefinition38.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList40 = mongoDBRiverDefinition38.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder24.mongoServers(serverAddressList40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder0.mongoServers(serverAddressList40);
        int int43 = builder42.getthrottleSize();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(strSet36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertNotNull(serverAddressList40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        boolean boolean11 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoLocalUser("name");
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.statisticsTypeName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder0.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.throttleSize((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoSecondaryReadPreference(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setstatisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str8 = builder7.typeName;
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder7.mongoCollectionFilter = basicDBObject9;
        java.lang.String str11 = builder7.mongoAdminUser;
        builder7.disableIndexRefresh = false;
        java.lang.String str14 = builder7.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.typeName;
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder15.mongoCollectionFilter = basicDBObject17;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder15.mongoUseSSL(true);
        java.lang.String[] strArray30 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        builder20.setparentTypes((java.util.Set<java.lang.String>) strSet31);
        builder7.parentTypes = strSet31;
        builder0.excludeFields = strSet31;
        builder0.setincludeCollection("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder0.connectTimeout((int) (byte) 10);
        builder0.setdisableIndexRefresh(false);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoCollection();
        java.lang.String str7 = mongoDBRiverDefinition2.riverIndexName;
        int int8 = mongoDBRiverDefinition2.socketTimeout;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.getExcludeFields();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.skipInitialImport(false);
        boolean boolean6 = builder0.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setscriptType("filter");
        java.lang.String str10 = builder0.mongoLocalPassword;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        java.lang.String str11 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalUser("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.getPARENT_TYPES_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getStatisticsIndexName();
        java.lang.String str17 = mongoDBRiverDefinition14.getSCRIPT_TYPE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition14.getEXCLUDE_FIELDS_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue19 = mongoDBRiverDefinition14.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean20 = mongoDBRiverDefinition14.dropCollection;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "parent_types" + "'", str15, "parent_types");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "script_type" + "'", str17, "script_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "exclude_fields" + "'", str18, "exclude_fields");
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setriverName("");
        boolean boolean6 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.riverName("socket_timeout");
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder0.mongoClientOptions;
        builder0.storeStatistics = false;
        java.lang.Class<?> wildcardClass12 = builder0.getClass();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        boolean boolean9 = builder8.getmongoGridFS();
        java.util.Set<java.lang.String> strSet10 = builder8.getincludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoSSLVerifyCertificate(true);
        builder8.socketTimeout = 10;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoLocalUser("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder8.mongoClientOptions;
        builder8.setindexName("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder8.mongoLocalPassword("filter");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.disableIndexRefresh = true;
        builder5.setmongoUseSSL(true);
        builder5.setmongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.mongoAdminUser("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        boolean boolean20 = builder14.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder14.socketTimeout((int) ' ');
        java.lang.String str23 = builder22.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder22.mongoCollection("drop_collection");
        com.mongodb.BasicDBObject basicDBObject26 = builder22.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.util.Set<java.lang.String> strSet29 = builder27.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject31 = null;
        builder27.setmongoOplogFilter(basicDBObject31);
        boolean boolean33 = builder27.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout((int) ' ');
        java.lang.String str36 = builder35.mongoCollection;
        org.elasticsearch.common.settings.Settings settings37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str39 = builder38.typeName;
        com.mongodb.BasicDBObject basicDBObject40 = null;
        builder38.mongoCollectionFilter = basicDBObject40;
        java.lang.String str42 = builder38.mongoAdminUser;
        builder38.disableIndexRefresh = false;
        java.lang.String str45 = builder38.getincludeCollection();
        org.elasticsearch.common.settings.Settings settings46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder47);
        java.util.Set<java.lang.String> strSet49 = builder47.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject51 = null;
        builder47.setmongoOplogFilter(basicDBObject51);
        com.mongodb.BasicDBObject basicDBObject53 = builder47.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings54 = new org.elasticsearch.river.RiverSettings(settings46, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder38.setmongoOplogFilter(basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings56 = new org.elasticsearch.river.RiverSettings(settings37, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder35.setmongoCollectionFilter(basicDBObject53);
        builder22.mongoOplogFilter = basicDBObject53;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder13.mongoOplogFilter(basicDBObject53);
        builder13.statisticsIndexName = "options";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(strSet49);
        org.junit.Assert.assertNull(mongoClientOptions50);
        org.junit.Assert.assertNotNull(basicDBObject53);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet12 = builder10.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.setmongoOplogFilter(basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject16 = builder10.getmongoCollectionFilter();
        builder10.setskipInitialImport(false);
        builder10.setimportAllCollections(true);
        int int21 = builder10.connectTimeout;
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) builder10);
        java.lang.Object obj24 = null;
        docScoreSearchScript0.setNextVar("script_type", obj24);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        boolean boolean11 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoLocalUser("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoDb("collection");
        boolean boolean17 = builder16.importAllCollections;
        java.lang.String str18 = builder16.scriptType;
        boolean boolean19 = builder16.getdisableIndexRefresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        int int3 = builder0.getconnectTimeout();
        builder0.mongoLocalUser = "socket_timeout";
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoOplogFilter();
        java.lang.String str7 = builder0.getmongoDb();
        builder0.setmongoAdminPassword("hi!");
        java.lang.String str10 = builder0.script;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str19 = mongoDBRiverDefinition18.getCONNECTION_TIMEOUT();
        java.lang.String str20 = mongoDBRiverDefinition18.getCREDENTIALS_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition18.getIMPORT_ALL_COLLECTIONS_FIELD();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        builder8.mongoCollectionFilter = basicDBObject22;
        builder8.statisticsTypeName = "include_collection";
        java.lang.String str26 = builder8.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp27 = builder8.getinitialTimestamp();
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder8.mongoClientOptions;
        java.util.Set<java.lang.String> strSet29 = builder8.includeFields;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "connect_timeout" + "'", str19, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "credentials" + "'", str20, "credentials");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "import_all_collections" + "'", str21, "import_all_collections");
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "include_collection" + "'", str26, "include_collection");
        org.junit.Assert.assertNull(wildcardTimestamp27);
        org.junit.Assert.assertNull(mongoClientOptions28);
        org.junit.Assert.assertNull(strSet29);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        java.lang.String str3 = builder0.getscript();
        java.lang.String str4 = builder0.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.script("gridfs");
        builder0.setindexName("filter");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        java.util.Set<java.lang.String> strSet3 = builder1.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions4 = builder1.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject5 = null;
        builder1.setmongoOplogFilter(basicDBObject5);
        boolean boolean7 = builder1.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        builder1.mongoServers = serverAddressList9;
        builder1.typeName = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition19.getMongoServers();
        builder1.mongoServers = serverAddressList20;
        builder1.typeName = "exclude_fields";
        java.util.Set<java.lang.String> strSet24 = builder1.includeFields;
        java.lang.String str25 = builder1.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition26.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings28 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(mongoClientOptions4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serverAddressArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(basicDBObject27);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setmongoAdminUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.statisticsTypeName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str15 = mongoDBRiverDefinition13.scriptType;
        boolean boolean16 = mongoDBRiverDefinition13.importAllCollections;
        java.lang.String str17 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition13.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoServers(serverAddressList18);
        int int20 = builder19.getthrottleSize();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder19.connectTimeout((-1));
        builder22.mongoAdminPassword = "credentials";
        builder22.setincludeCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder22.socketTimeout((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "collection" + "'", str17, "collection");
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminUser("hi!");
        builder11.throttleSize = (-1);
        boolean boolean14 = builder11.mongoUseSSL;
        boolean boolean15 = builder11.getmongoGridFS();
        builder11.mongoLocalPassword = "bulk_timeout";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str6 = mongoDBRiverDefinition1.getRiverIndexName();
        java.lang.String str7 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        boolean boolean9 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        boolean boolean10 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "concurrent_requests" + "'", str7, "concurrent_requests");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclude_fields" + "'", str8, "exclude_fields");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject13 = null;
        builder9.setmongoOplogFilter(basicDBObject13);
        boolean boolean15 = builder9.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.mongoGridFS(true);
        builder9.setstatisticsTypeName("servers");
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) "servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        java.util.Set<java.lang.String> strSet23 = builder21.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.lang.String str27 = mongoDBRiverDefinition26.getSIZE_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue28 = mongoDBRiverDefinition26.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str29 = mongoDBRiverDefinition26.getSSL_CONNECTION_FIELD();
        java.lang.String str30 = mongoDBRiverDefinition26.getCONNECTION_TIMEOUT();
        boolean boolean31 = mongoDBRiverDefinition26.getmongoUseSSL();
        java.lang.Object obj32 = docScoreSearchScript0.unwrap((java.lang.Object) boolean31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        java.lang.String str36 = mongoDBRiverDefinition35.getMongoCollection();
        java.lang.String str37 = mongoDBRiverDefinition35.scriptType;
        java.lang.String str38 = mongoDBRiverDefinition35.getCOLLECTION_FIELD();
        java.lang.String str39 = mongoDBRiverDefinition35.getINCLUDE_COLLECTION_FIELD();
        int int40 = mongoDBRiverDefinition35.getSocketTimeout();
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) int40);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str45 = builder44.typeName;
        com.mongodb.BasicDBObject basicDBObject46 = null;
        builder44.mongoCollectionFilter = basicDBObject46;
        java.lang.String str48 = builder44.mongoAdminUser;
        builder44.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.statisticsIndexName("port");
        builder44.setskipInitialImport(false);
        boolean boolean55 = builder44.mongoSecondaryReadPreference;
        builder44.setindexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition58 = builder44.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder44.riverName("script_type");
        java.lang.Object obj61 = docScoreSearchScript0.unwrap((java.lang.Object) builder44);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str65 = builder64.typeName;
        com.mongodb.BasicDBObject basicDBObject66 = null;
        builder64.mongoCollectionFilter = basicDBObject66;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder64.mongoAdminPassword("db");
        builder69.importAllCollections = false;
        java.util.Set<java.lang.String> strSet72 = builder69.parentTypes;
        com.mongodb.BasicDBObject basicDBObject73 = builder69.mongoOplogFilter;
        builder69.riverName = "user";
        boolean boolean76 = builder69.mongoSSLVerifyCertificate;
        builder69.statisticsIndexName = "concurrent_bulk_requests";
        java.util.Set<java.lang.String> strSet79 = builder69.getparentTypes();
        java.lang.Object obj80 = docScoreSearchScript0.unwrap((java.lang.Object) builder69);
        // The following exception was thrown during execution in test generation
        try {
            double double81 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "servers" + "'", obj20, "servers");
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "size" + "'", str27, "size");
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ssl" + "'", str29, "ssl");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "connect_timeout" + "'", str30, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "collection" + "'", str38, "collection");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "include_collection" + "'", str39, "include_collection");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(strSet72);
        org.junit.Assert.assertNull(basicDBObject73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(strSet79);
        org.junit.Assert.assertNotNull(obj80);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.typeName;
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder8.mongoCollectionFilter = basicDBObject10;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoUseSSL(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder13.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        builder0.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder0.statisticsIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.riverName("script_type");
        builder29.setmongoAdminUser("exclude_fields");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        java.util.Set<java.lang.String> strSet9 = builder7.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject11 = null;
        builder7.setmongoOplogFilter(basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject13 = builder7.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = riverSettings14.settings();
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings5, strMap15);
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings4, strMap15);
        org.elasticsearch.river.RiverSettings riverSettings18 = new org.elasticsearch.river.RiverSettings(settings3, strMap15);
        org.elasticsearch.river.RiverSettings riverSettings19 = new org.elasticsearch.river.RiverSettings(settings2, strMap15);
        org.elasticsearch.script.ScriptService scriptService20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_collection", "advanced_transformation", riverSettings19, scriptService20);
        java.lang.String str22 = mongoDBRiverDefinition21.getMongoOplogNamespace();
        java.lang.String str23 = mongoDBRiverDefinition21.typeName;
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "include_collection.include_collection" + "'", str22, "include_collection.include_collection");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "include_collection" + "'", str23, "include_collection");
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        boolean boolean8 = builder0.mongoSecondaryReadPreference;
        builder0.setadvancedTransformation(false);
        int int11 = builder0.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str14 = builder13.typeName;
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder13.mongoCollectionFilter = basicDBObject15;
        java.lang.String str17 = builder13.mongoAdminUser;
        builder13.disableIndexRefresh = false;
        java.lang.String str20 = builder13.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder13.getmongoClientOptions();
        int int22 = builder13.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.util.Set<java.lang.String> strSet26 = builder24.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject28 = null;
        builder24.setmongoOplogFilter(basicDBObject28);
        boolean boolean30 = builder24.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet33 = builder32.excludeFields;
        builder32.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder32.mongoAdminUser("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject38 = builder32.mongoOplogFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str40 = builder39.typeName;
        com.mongodb.BasicDBObject basicDBObject41 = null;
        builder39.mongoCollectionFilter = basicDBObject41;
        java.lang.String str43 = builder39.mongoAdminUser;
        builder39.disableIndexRefresh = false;
        java.lang.String str46 = builder39.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder39.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        java.util.Set<java.lang.String> strSet50 = builder48.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject52 = null;
        builder48.setmongoOplogFilter(basicDBObject52);
        boolean boolean54 = builder48.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray55 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList56 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList56, serverAddressArray55);
        builder48.mongoServers = serverAddressList56;
        java.lang.String str59 = builder48.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str61 = builder60.typeName;
        com.mongodb.BasicDBObject basicDBObject62 = null;
        builder60.mongoCollectionFilter = basicDBObject62;
        java.lang.String str64 = builder60.mongoAdminUser;
        builder60.disableIndexRefresh = false;
        java.lang.String str67 = builder60.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str69 = builder68.typeName;
        com.mongodb.BasicDBObject basicDBObject70 = null;
        builder68.mongoCollectionFilter = basicDBObject70;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder68.mongoUseSSL(true);
        java.lang.String[] strArray83 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        builder73.setparentTypes((java.util.Set<java.lang.String>) strSet84);
        builder60.parentTypes = strSet84;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder48.parentTypes((java.util.Set<java.lang.String>) strSet84);
        builder39.setexcludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder32.parentTypes((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder13.includeFields((java.util.Set<java.lang.String>) strSet84);
        builder0.parentTypes = strSet84;
        java.util.List<com.mongodb.ServerAddress> serverAddressList93 = builder0.getmongoServers();
        builder0.setstatisticsTypeName("null.null");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(basicDBObject38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(mongoClientOptions47);
        org.junit.Assert.assertNull(strSet50);
        org.junit.Assert.assertNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(serverAddressArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(serverAddressList93);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        java.util.Set<java.lang.String> strSet9 = builder7.includeFields;
        java.lang.String str10 = builder7.getstatisticsIndexName();
        builder7.setsocketTimeout(10);
        builder7.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder7.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder7.mongoCollectionFilter = basicDBObject17;
        builder7.setmongoSecondaryReadPreference(true);
        builder7.setindexName("options");
        builder7.setmongoDb("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.util.Set<java.lang.String> strSet27 = builder25.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject29 = null;
        builder25.setmongoOplogFilter(basicDBObject29);
        boolean boolean31 = builder25.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray32 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList33 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList33, serverAddressArray32);
        builder25.mongoServers = serverAddressList33;
        java.lang.String str36 = builder25.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str38 = builder37.typeName;
        com.mongodb.BasicDBObject basicDBObject39 = null;
        builder37.mongoCollectionFilter = basicDBObject39;
        java.lang.String str41 = builder37.mongoAdminUser;
        builder37.disableIndexRefresh = false;
        java.lang.String str44 = builder37.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str46 = builder45.typeName;
        com.mongodb.BasicDBObject basicDBObject47 = null;
        builder45.mongoCollectionFilter = basicDBObject47;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder45.mongoUseSSL(true);
        java.lang.String[] strArray60 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        builder50.setparentTypes((java.util.Set<java.lang.String>) strSet61);
        builder37.parentTypes = strSet61;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder25.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject68 = builder65.mongoCollectionFilter;
        org.elasticsearch.common.settings.Settings settings69 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder70);
        java.util.Set<java.lang.String> strSet72 = builder70.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions73 = builder70.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject74 = null;
        builder70.setmongoOplogFilter(basicDBObject74);
        com.mongodb.BasicDBObject basicDBObject76 = builder70.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings77 = new org.elasticsearch.river.RiverSettings(settings69, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject76);
        builder65.setmongoOplogFilter(basicDBObject76);
        builder7.mongoOplogFilter = basicDBObject76;
        builder7.setmongoLocalPassword("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder7.script("script_type");
        boolean boolean84 = builder83.getadvancedTransformation();
        builder83.settypeName("include_fields");
        java.lang.Object obj87 = docScoreSearchScript0.unwrap((java.lang.Object) "include_fields");
        // The following exception was thrown during execution in test generation
        try {
            long long88 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(serverAddressArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(basicDBObject68);
        org.junit.Assert.assertNull(strSet72);
        org.junit.Assert.assertNull(mongoClientOptions73);
        org.junit.Assert.assertNotNull(basicDBObject76);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + "include_fields" + "'", obj87, "include_fields");
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = builder0.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminPassword("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.throttleSize((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str15 = builder14.typeName;
        builder14.setsocketTimeout(0);
        builder14.mongoAdminUser = "collection";
        boolean boolean20 = builder14.getdisableIndexRefresh();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder14.connectTimeout(1);
        boolean boolean23 = builder14.getmongoUseSSL();
        java.util.List<com.mongodb.ServerAddress> serverAddressList24 = builder14.getmongoServers();
        builder0.mongoServers = serverAddressList24;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(serverAddressList24);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.mongoAdminUser;
        java.lang.String str4 = builder0.statisticsTypeName;
        boolean boolean5 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoDb("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.script("bulk_size");
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        boolean boolean14 = mongoDBRiverDefinition13.mongoSSLVerifyCertificate;
        java.lang.String str15 = mongoDBRiverDefinition13.getGRIDFS_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.importAllCollections;
        java.lang.String str17 = mongoDBRiverDefinition13.getStatisticsIndexName();
        java.lang.String str18 = mongoDBRiverDefinition13.getTypeName();
        boolean boolean19 = mongoDBRiverDefinition13.isDropCollection();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition13.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings21 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        builder9.mongoOplogFilter = basicDBObject20;
        builder9.mongoSecondaryReadPreference = false;
        builder9.riverName = "include_fields";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gridfs" + "'", str15, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(basicDBObject20);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        builder40.setconnectTimeout((int) '4');
        java.lang.String str43 = builder40.riverName;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setriverName("");
        java.util.Set<java.lang.String> strSet6 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminUser("socket_timeout");
        java.lang.String str9 = builder0.riverIndexName;
        boolean boolean10 = builder0.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition2.getIncludeFields();
        java.lang.String str4 = mongoDBRiverDefinition2.getCONCURRENT_REQUESTS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "concurrent_requests" + "'", str4, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        java.lang.String[] strArray12 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.mongoSSLVerifyCertificate(true);
        int int19 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.util.Set<java.lang.String> strSet22 = builder20.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.getmongoClientOptions();
        builder20.setriverName("");
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder20.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder0.mongoCollectionFilter(basicDBObject27);
        builder29.typeName = "script";
        builder29.setsocketTimeout((int) (byte) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getPORT_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getScriptType();
        java.lang.String str5 = mongoDBRiverDefinition2.getIncludeCollection();
        java.lang.String str6 = mongoDBRiverDefinition2.getDB_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "port" + "'", str3, "port");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "db" + "'", str6, "db");
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str5 = builder4.typeName;
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder4.mongoCollectionFilter = basicDBObject6;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder4.mongoUseSSL(true);
        builder4.connectTimeout = (byte) -1;
        int int12 = builder4.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.statisticsIndexName("initial_timestamp");
        java.lang.String str15 = builder14.mongoLocalUser;
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        java.util.Set<java.lang.String> strSet19 = builder17.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder17.setmongoOplogFilter(basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject23 = builder17.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings16, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder14.mongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder0.mongoCollectionFilter = basicDBObject23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        java.lang.String str31 = mongoDBRiverDefinition30.getCONNECTION_TIMEOUT();
        java.lang.String str32 = mongoDBRiverDefinition30.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue33 = mongoDBRiverDefinition30.getDEFAULT_BULK_SIZE();
        java.lang.String str34 = mongoDBRiverDefinition30.indexName;
        java.lang.String str35 = mongoDBRiverDefinition30.getCONNECTION_TIMEOUT();
        boolean boolean36 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject37 = mongoDBRiverDefinition30.getMongoCollectionFilter();
        builder0.mongoOplogFilter = basicDBObject37;
        builder0.mongoLocalPassword = "secondary_read_preference";
        builder0.setmongoLocalPassword("options");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNull(mongoClientOptions20);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "connect_timeout" + "'", str31, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "credentials" + "'", str32, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "connect_timeout" + "'", str35, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(basicDBObject37);
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoGridFS(true);
        java.lang.String str9 = builder0.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setconnectTimeout(100);
        builder0.settypeName("localhost");
        builder0.socketTimeout = (byte) 10;
        int int17 = builder0.connectTimeout;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str19 = mongoDBRiverDefinition18.getCONNECTION_TIMEOUT();
        java.lang.String str20 = mongoDBRiverDefinition18.getCREDENTIALS_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition18.getIMPORT_ALL_COLLECTIONS_FIELD();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        builder8.mongoCollectionFilter = basicDBObject22;
        builder8.statisticsTypeName = "include_collection";
        builder8.throttleSize = (short) 100;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "connect_timeout" + "'", str19, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "credentials" + "'", str20, "credentials");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "import_all_collections" + "'", str21, "import_all_collections");
        org.junit.Assert.assertNotNull(basicDBObject22);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoAdminUser("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject14 = builder8.mongoOplogFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.typeName;
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder15.mongoCollectionFilter = basicDBObject17;
        java.lang.String str19 = builder15.mongoAdminUser;
        builder15.disableIndexRefresh = false;
        java.lang.String str22 = builder15.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder15.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.util.Set<java.lang.String> strSet26 = builder24.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject28 = null;
        builder24.setmongoOplogFilter(basicDBObject28);
        boolean boolean30 = builder24.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray31 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList32 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList32, serverAddressArray31);
        builder24.mongoServers = serverAddressList32;
        java.lang.String str35 = builder24.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str37 = builder36.typeName;
        com.mongodb.BasicDBObject basicDBObject38 = null;
        builder36.mongoCollectionFilter = basicDBObject38;
        java.lang.String str40 = builder36.mongoAdminUser;
        builder36.disableIndexRefresh = false;
        java.lang.String str43 = builder36.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str45 = builder44.typeName;
        com.mongodb.BasicDBObject basicDBObject46 = null;
        builder44.mongoCollectionFilter = basicDBObject46;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder44.mongoUseSSL(true);
        java.lang.String[] strArray59 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        builder49.setparentTypes((java.util.Set<java.lang.String>) strSet60);
        builder36.parentTypes = strSet60;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder24.parentTypes((java.util.Set<java.lang.String>) strSet60);
        builder15.setexcludeFields((java.util.Set<java.lang.String>) strSet60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder68.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder68.statisticsTypeName("script_type");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(mongoClientOptions23);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(serverAddressArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        java.lang.String str7 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str8 = mongoDBRiverDefinition2.mongoLocalPassword;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue9 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        boolean boolean10 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        boolean boolean11 = mongoDBRiverDefinition2.isMongoSSLVerifyCertificate();
        boolean boolean12 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteSizeValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.isMongoGridFS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition1.mongoServers;
        int int6 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str7 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "exclude_fields" + "'", str7, "exclude_fields");
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.connectTimeout((int) '#');
        java.lang.String str14 = builder13.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str16 = builder13.getmongoAdminPassword();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder40.mongoLocalPassword("index");
        com.mongodb.BasicDBObject basicDBObject44 = builder40.getmongoCollectionFilter();
        boolean boolean45 = builder40.getskipInitialImport();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(basicDBObject44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminUser("hi!");
        com.mongodb.BasicDBObject basicDBObject12 = builder11.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.connectTimeout((-1));
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = builder14.getmongoServers();
        builder14.throttleSize = 32;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(serverAddressList15);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        java.lang.String str9 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminPassword("local");
        java.lang.String str12 = builder11.getmongoLocalPassword();
        java.util.Set<java.lang.String> strSet13 = builder11.includeFields;
        builder11.connectTimeout = (short) 100;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoAdminPassword("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        java.lang.String str19 = mongoDBRiverDefinition18.getUSER_FIELD();
        int int20 = mongoDBRiverDefinition18.getSocketTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "user" + "'", str19, "user");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        boolean boolean7 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder0.build();
        java.lang.String str9 = mongoDBRiverDefinition8.getNAME_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getMongoLocalPassword();
        java.lang.String str11 = mongoDBRiverDefinition8.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "name" + "'", str9, "name");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "connect_timeout" + "'", str11, "connect_timeout");
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder5.build();
        builder5.importAllCollections = true;
        builder5.setstatisticsTypeName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder5.includeCollection("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder5.scriptType("advanced_transformation");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        boolean boolean6 = mongoDBRiverDefinition1.mongoGridFS;
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition1.includeFields;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null.null" + "'", str7, "null.null");
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = builder0.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminPassword("script_type");
        int int12 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.script("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoDb("servers");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getSOCKET_TIMEOUT();
        boolean boolean6 = mongoDBRiverDefinition2.mongoSecondaryReadPreference;
        java.lang.String str7 = mongoDBRiverDefinition2.getDEFAULT_DB_HOST();
        java.lang.String str8 = mongoDBRiverDefinition2.getBULK_SIZE_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "socket_timeout" + "'", str5, "socket_timeout");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bulk_size" + "'", str8, "bulk_size");
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        boolean boolean6 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str7 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str8 = mongoDBRiverDefinition1.getRiverName();
        boolean boolean9 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str10 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        boolean boolean11 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean12 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "throttle_size" + "'", str10, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        com.mongodb.BasicDBObject basicDBObject12 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        builder0.setmongoCollectionFilter(basicDBObject12);
        builder0.skipInitialImport = false;
        java.lang.String str19 = builder0.gettypeName();
        builder0.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.indexName("");
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setriverName("");
        boolean boolean6 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.riverName("socket_timeout");
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder0.mongoClientOptions;
        java.lang.String str10 = builder0.getriverName();
        builder0.setsocketTimeout((int) (short) 0);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "socket_timeout" + "'", str10, "socket_timeout");
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("socket_timeout", "user", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setstatisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(true);
        java.util.Set<java.lang.String> strSet8 = builder7.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.connectTimeout((int) (short) 1);
        builder12.setmongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoGridFS(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory17 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        java.util.Set<java.lang.String> strSet23 = builder21.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder21.setmongoOplogFilter(basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject27 = builder21.getmongoCollectionFilter();
        builder20.mongoCollectionFilter = basicDBObject27;
        org.elasticsearch.river.RiverSettings riverSettings29 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder33);
        java.util.Set<java.lang.String> strSet35 = builder33.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject37 = null;
        builder33.setmongoOplogFilter(basicDBObject37);
        com.mongodb.BasicDBObject basicDBObject39 = builder33.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings40 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject39);
        org.elasticsearch.script.ExecutableScript executableScript41 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder12.mongoOplogFilter(basicDBObject39);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder42.getmongoClientOptions();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertNotNull(executableScript41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(mongoClientOptions43);
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        int int4 = mongoDBRiverDefinition2.getConnectTimeout();
        boolean boolean5 = mongoDBRiverDefinition2.advancedTransformation;
        java.lang.String str6 = mongoDBRiverDefinition2.getCOLLECTION_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = mongoDBRiverDefinition2.initialTimestamp;
        java.lang.String str8 = mongoDBRiverDefinition2.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclude_fields" + "'", str8, "exclude_fields");
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder0.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.advancedTransformation(false);
        boolean boolean9 = builder8.skipInitialImport;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("");
        java.util.Set<java.lang.String> strSet12 = builder8.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        boolean boolean16 = mongoDBRiverDefinition15.getdropCollection();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        boolean boolean6 = builder0.getmongoGridFS();
        java.lang.String str7 = builder0.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.riverIndexName("index");
        builder0.setincludeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.skipInitialImport(false);
        builder13.socketTimeout = '#';
        boolean boolean16 = builder13.getmongoSecondaryReadPreference();
        boolean boolean17 = builder13.storeStatistics;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoAdminPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.riverName;
        java.lang.String str5 = mongoDBRiverDefinition2.riverIndexName;
        java.lang.String str6 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.dropCollection;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "flush_interval" + "'", str6, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

