import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoGridFS(true);
        java.util.Set<java.lang.String> strSet13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.excludeFields(strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.statisticsIndexName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoClientOptions(mongoClientOptions18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.mongoCollectionFilter(basicDBObject22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoLocalPassword("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("filter");
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoClientOptions(mongoClientOptions36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoClientOptions(mongoClientOptions39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoClientOptions(mongoClientOptions46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoClientOptions(mongoClientOptions54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = builder55.build();
        java.lang.String str57 = mongoDBRiverDefinition56.getMongoAdminPassword();
        boolean boolean58 = mongoDBRiverDefinition56.isMongoSecondaryReadPreference();
        java.lang.String str59 = mongoDBRiverDefinition56.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet60 = mongoDBRiverDefinition56.getParentTypes();
        boolean boolean61 = mongoDBRiverDefinition56.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject62 = mongoDBRiverDefinition56.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder42.mongoCollectionFilter(basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder35.mongoOplogFilter(basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder16.mongoCollectionFilter(basicDBObject62);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(strSet60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(basicDBObject62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition9.getMongoCollection();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.getIncludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoClientOptions(mongoClientOptions10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.statisticsTypeName("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder26.build();
        boolean boolean28 = mongoDBRiverDefinition27.isStoreStatistics();
        boolean boolean29 = mongoDBRiverDefinition27.isMongoSSLVerifyCertificate();
        java.lang.String str30 = mongoDBRiverDefinition27.getTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList31 = mongoDBRiverDefinition27.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder13.mongoServers(serverAddressList31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder4.mongoServers(serverAddressList31);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(serverAddressList31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoAdminUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoLocalPassword("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.throttleSize((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollection("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.scriptType("drop_collection");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        com.mongodb.MongoClientOptions mongoClientOptions10 = mongoDBRiverDefinition9.getMongoClientOptions();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoGridFS();
        int int12 = mongoDBRiverDefinition9.getConnectTimeout();
        java.lang.String str13 = mongoDBRiverDefinition9.getTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoAdminPassword();
        boolean boolean13 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition11.getParentTypes();
        boolean boolean16 = mongoDBRiverDefinition11.isMongoUseSSL();
        int int17 = mongoDBRiverDefinition11.getSocketTimeout();
        java.lang.String str18 = mongoDBRiverDefinition11.getScriptType();
        java.lang.String str19 = mongoDBRiverDefinition11.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition11.getIncludeFields();
        int int21 = mongoDBRiverDefinition11.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminUser("gridfs");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory13.newScript(strMap14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory13.newScript(strMap16);
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoClientOptions(mongoClientOptions27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoClientOptions(mongoClientOptions35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = builder36.build();
        java.lang.String str38 = mongoDBRiverDefinition37.getMongoAdminPassword();
        boolean boolean39 = mongoDBRiverDefinition37.isMongoSecondaryReadPreference();
        java.lang.String str40 = mongoDBRiverDefinition37.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet41 = mongoDBRiverDefinition37.getParentTypes();
        boolean boolean42 = mongoDBRiverDefinition37.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject43 = mongoDBRiverDefinition37.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder23.mongoCollectionFilter(basicDBObject43);
        org.elasticsearch.river.RiverSettings riverSettings45 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
        org.elasticsearch.script.ExecutableScript executableScript46 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder10.mongoCollectionFilter(basicDBObject43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder10.throttleSize((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder10.indexName("ssl.null");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.scriptType("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.socketTimeout(1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(strSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(basicDBObject43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(executableScript46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory4.newScript(strMap5);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) docScoreNativeScriptFactory4);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript9 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj11 = docScoreSearchScript9.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript9.setNextScore((float) 1);
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.scriptType("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoDb("include_fields");
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) builder38);
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoClientOptions(mongoClientOptions43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject47 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder42.mongoCollectionFilter(basicDBObject47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.includeCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.mongoUseSSL(false);
        java.lang.Object obj59 = docScoreSearchScript0.unwrap((java.lang.Object) builder54);
        org.elasticsearch.common.settings.Settings settings61 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = null;
        org.elasticsearch.river.RiverSettings riverSettings63 = new org.elasticsearch.river.RiverSettings(settings61, strMap62);
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = riverSettings63.settings();
        org.elasticsearch.common.settings.Settings settings65 = riverSettings63.globalSettings();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) settings65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions68 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoClientOptions(mongoClientOptions68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder67.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder71.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder71.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder71.indexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.socketTimeout((int) (byte) 10);
        java.lang.Object obj84 = docScoreSearchScript0.unwrap((java.lang.Object) builder83);
        // The following exception was thrown during execution in test generation
        try {
            long long85 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(strMap64);
        org.junit.Assert.assertNull(settings65);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(obj84);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoCollectionFilter(basicDBObject10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder15.includeFields((java.util.Set<java.lang.String>) strSet24);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoClientOptions(mongoClientOptions34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.indexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.includeCollection("filter");
        docScoreSearchScript0.setNextVar("include_collection", (java.lang.Object) "filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoClientOptions(mongoClientOptions51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject55 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder50.mongoCollectionFilter(basicDBObject55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder50.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder66.throttleSize(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder66.riverName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder66.indexName("connect_timeout");
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) builder74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder74.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition78 = builder77.build();
        int int79 = mongoDBRiverDefinition78.getSocketTimeout();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoAdminUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoClientOptions(mongoClientOptions10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoCollectionFilter(basicDBObject14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.includeCollection("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.mongoLocalPassword("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoClientOptions(mongoClientOptions27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoAdminPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoDb("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoClientOptions(mongoClientOptions36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.connectTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.indexName("hi!");
        java.lang.String[] strArray61 = new java.lang.String[] { "disable_index_refresh", "collection", "host", "user", "script_type", "socket_timeout", "include_fields", "bulk", "connect_timeout", "actions", "collection", "connect_timeout", "type" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder45.excludeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder32.parentTypes((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder8.excludeFields((java.util.Set<java.lang.String>) strSet62);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        com.mongodb.MongoClientOptions mongoClientOptions10 = mongoDBRiverDefinition9.getMongoClientOptions();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoGridFS();
        int int12 = mongoDBRiverDefinition9.getConnectTimeout();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoGridFS();
        boolean boolean14 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        java.lang.String str15 = mongoDBRiverDefinition9.getTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.scriptType("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoDb("");
        com.mongodb.BasicDBObject basicDBObject21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.mongoCollectionFilter(basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.socketTimeout(1);
        org.bson.types.Binary binary25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.initialTimestamp(binary25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoClientOptions(mongoClientOptions2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.socketTimeout((int) 'a');
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory8 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        org.elasticsearch.script.ExecutableScript executableScript10 = docScoreNativeScriptFactory8.newScript(strMap9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory8.newScript(strMap11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoClientOptions(mongoClientOptions22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder23.build();
        java.lang.String str25 = mongoDBRiverDefinition24.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions26 = mongoDBRiverDefinition24.getMongoClientOptions();
        boolean boolean27 = mongoDBRiverDefinition24.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions28 = mongoDBRiverDefinition24.getMongoClientOptions();
        java.lang.String str29 = mongoDBRiverDefinition24.getScript();
        com.mongodb.BasicDBObject basicDBObject30 = mongoDBRiverDefinition24.getMongoOplogFilter();
        java.lang.String str31 = mongoDBRiverDefinition24.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject32 = mongoDBRiverDefinition24.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript33 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder1.mongoCollectionFilter(basicDBObject32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder0.mongoOplogFilter(basicDBObject32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoAdminUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.script("size");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(executableScript10);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(mongoClientOptions28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(basicDBObject30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNotNull(executableScript33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.includeCollection("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoLocalPassword("gridfs");
        java.util.Set<java.lang.String> strSet15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.includeFields(strSet15);
        java.lang.String[] strArray20 = new java.lang.String[] { "advanced_transformation", "ssl", "secondary_read_preference" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder16.includeFields((java.util.Set<java.lang.String>) strSet21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder16.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder25.connectTimeout((int) 'a');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition11.getInitialTimestamp();
        int int16 = mongoDBRiverDefinition11.getSocketTimeout();
        java.util.Set<java.lang.String> strSet17 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoDb();
        boolean boolean19 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        java.lang.String str20 = mongoDBRiverDefinition11.getRiverIndexName();
        java.lang.String str21 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str22 = mongoDBRiverDefinition11.getMongoAdminUser();
        boolean boolean23 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        boolean boolean24 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        boolean boolean25 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.riverName("index");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean14 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.lang.String str16 = mongoDBRiverDefinition11.getScript();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition11.getMongoOplogFilter();
        java.lang.String str18 = mongoDBRiverDefinition11.getStatisticsTypeName();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = mongoDBRiverDefinition11.getInitialTimestamp();
        int int20 = mongoDBRiverDefinition11.getThrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = mongoDBRiverDefinition11.getInitialTimestamp();
        boolean boolean22 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        boolean boolean23 = mongoDBRiverDefinition11.isSkipInitialImport();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(basicDBObject17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.riverIndexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.riverName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.statisticsTypeName("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoLocalPassword("socket_timeout.socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder23.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder23.includeCollection("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder23.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoClientOptions(mongoClientOptions32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoClientOptions(mongoClientOptions40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.statisticsIndexName("user");
        java.lang.String[] strArray70 = new java.lang.String[] { "bulk", "include_fields", "filter", "concurrent_bulk_requests", "drop_collection", "local", "servers", "password", "null.null", "disable_index_refresh", "advanced_transformation", "script", "", "parent_types", "type", "advanced_transformation", "port", "admin", "collection", "bulk", "localhost", "index", "actions", "options", "advanced_transformation", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder39.parentTypes((java.util.Set<java.lang.String>) strSet71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder30.parentTypes((java.util.Set<java.lang.String>) strSet71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder18.includeFields((java.util.Set<java.lang.String>) strSet71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.advancedTransformation(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        java.lang.String str14 = mongoDBRiverDefinition11.getScript();
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition11.getMongoServers();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(serverAddressList15);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.riverName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.indexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = builder12.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder12.connectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoSecondaryReadPreference(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoCollection("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.includeCollection("filter");
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder10.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.riverName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.script("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoClientOptions(mongoClientOptions37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.typeName("options");
        java.lang.String[] strArray79 = new java.lang.String[] { "script_type", "flush_interval", "localhost", "credentials", "local", "localhost", "user", "exclude_fields", "include_collection", "user", "localhost", "actions", "secondary_read_preference", "gridfs", "exclude_fields", "", "type", "store_statistics", "credentials", "include_collection", "options", "ssl_verify_certificate", "initial_timestamp", "", "localhost", "size", "servers", "disable_index_refresh", "ssl_verify_certificate", "initial_timestamp", "flush_interval", "", "user", "skip_initial_import", "", "parent_types", "filter", "" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder40.includeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder35.includeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder22.parentTypes((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder22.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder22.script("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder22.statisticsIndexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder22.importAllCollections(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap(obj1);
        docScoreSearchScript0.setNextScore((float) '#');
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.riverName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        docScoreSearchScript0.setNextVar(".", (java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.riverName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.indexName("initial_timestamp");
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoClientOptions(mongoClientOptions15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoLocalPassword("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoClientOptions(mongoClientOptions16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.typeName("include_fields");
        com.mongodb.BasicDBObject basicDBObject24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoCollectionFilter(basicDBObject24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoClientOptions(mongoClientOptions27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.connectTimeout((int) (short) 10);
        java.lang.String[] strArray75 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder25.parentTypes((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder14.includeFields((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder14.includeCollection("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder14.connectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.storeStatistics(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoClientOptions(mongoClientOptions3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoClientOptions(mongoClientOptions11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder12.build();
        java.lang.String str14 = mongoDBRiverDefinition13.getMongoDb();
        java.lang.String str15 = mongoDBRiverDefinition13.getStatisticsTypeName();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = mongoDBRiverDefinition13.getInitialTimestamp();
        int int18 = mongoDBRiverDefinition13.getSocketTimeout();
        int int19 = mongoDBRiverDefinition13.getConnectTimeout();
        java.lang.String str20 = mongoDBRiverDefinition13.getMongoAdminUser();
        java.lang.String str21 = mongoDBRiverDefinition13.getMongoAdminUser();
        java.lang.String str22 = mongoDBRiverDefinition13.getTypeName();
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition13.getIncludeFields();
        java.lang.String str24 = mongoDBRiverDefinition13.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject25 = mongoDBRiverDefinition13.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings27 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.common.settings.Settings settings28 = riverSettings27.globalSettings();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNull(settings28);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.scriptType("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder10.build();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        java.lang.String str21 = mongoDBRiverDefinition19.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet22 = mongoDBRiverDefinition19.getIncludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertNull(basicDBObject20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(strSet22);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder11.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = builder19.build();
        boolean boolean21 = mongoDBRiverDefinition20.isStoreStatistics();
        boolean boolean22 = mongoDBRiverDefinition20.isMongoSSLVerifyCertificate();
        java.lang.String str23 = mongoDBRiverDefinition20.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition20.getMongoOplogFilter();
        int int25 = mongoDBRiverDefinition20.getSocketTimeout();
        java.lang.String str26 = mongoDBRiverDefinition20.getMongoCollection();
        boolean boolean27 = mongoDBRiverDefinition20.isDropCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = mongoDBRiverDefinition20.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.mongoServers(serverAddressList28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder10.typeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder31.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(basicDBObject24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(serverAddressList28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition32);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoClientOptions(mongoClientOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.throttleSize(0);
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoClientOptions(mongoClientOptions17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoClientOptions(mongoClientOptions32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder33.build();
        java.lang.String str35 = mongoDBRiverDefinition34.getMongoAdminPassword();
        boolean boolean36 = mongoDBRiverDefinition34.isMongoSecondaryReadPreference();
        java.lang.String str37 = mongoDBRiverDefinition34.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet38 = mongoDBRiverDefinition34.getParentTypes();
        boolean boolean39 = mongoDBRiverDefinition34.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject40 = mongoDBRiverDefinition34.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder20.mongoCollectionFilter(basicDBObject40);
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings15, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder8.mongoCollectionFilter(basicDBObject40);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        org.elasticsearch.script.ScriptService scriptService45 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "bulk_timeout", riverSettings44, scriptService45);
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = riverSettings44.settings();
        org.elasticsearch.river.RiverSettings riverSettings48 = new org.elasticsearch.river.RiverSettings(settings0, strMap47);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = riverSettings48.settings();
        org.elasticsearch.common.settings.Settings settings50 = riverSettings48.globalSettings();
        org.elasticsearch.common.settings.Settings settings51 = riverSettings48.globalSettings();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = riverSettings48.settings();
        org.elasticsearch.common.settings.Settings settings53 = riverSettings48.globalSettings();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = riverSettings48.settings();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(basicDBObject40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNull(settings50);
        org.junit.Assert.assertNull(settings51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(settings53);
        org.junit.Assert.assertNotNull(strMap54);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoOplogFilter(basicDBObject5);
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalUser("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder12.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.indexName("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.statisticsIndexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder12.mongoAdminPassword("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder12.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoClientOptions(mongoClientOptions26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoClientOptions(mongoClientOptions34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder35.build();
        java.lang.String str37 = mongoDBRiverDefinition36.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions38 = mongoDBRiverDefinition36.getMongoClientOptions();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions40 = mongoDBRiverDefinition36.getMongoClientOptions();
        java.lang.String str41 = mongoDBRiverDefinition36.getScript();
        boolean boolean42 = mongoDBRiverDefinition36.isMongoGridFS();
        java.util.Set<java.lang.String> strSet43 = mongoDBRiverDefinition36.getIncludeFields();
        com.mongodb.BasicDBObject basicDBObject44 = mongoDBRiverDefinition36.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder12.mongoCollectionFilter(basicDBObject44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder12.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder12.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.includeCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.statisticsTypeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.advancedTransformation(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(mongoClientOptions40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(strSet43);
        org.junit.Assert.assertNotNull(basicDBObject44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        com.mongodb.MongoClientOptions mongoClientOptions10 = mongoDBRiverDefinition9.getMongoClientOptions();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition9.getIncludeFields();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition9.getMongoOplogFilter();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.getParentTypes();
        java.lang.String str15 = mongoDBRiverDefinition9.getRiverName();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoLocalPassword();
        boolean boolean17 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertNull(basicDBObject13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.typeName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.typeName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.importAllCollections(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoClientOptions(mongoClientOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.socketTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.throttleSize(0);
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoClientOptions(mongoClientOptions31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoClientOptions(mongoClientOptions39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = builder40.build();
        java.lang.String str42 = mongoDBRiverDefinition41.getMongoAdminPassword();
        boolean boolean43 = mongoDBRiverDefinition41.isMongoSecondaryReadPreference();
        java.lang.String str44 = mongoDBRiverDefinition41.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet45 = mongoDBRiverDefinition41.getParentTypes();
        boolean boolean46 = mongoDBRiverDefinition41.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject47 = mongoDBRiverDefinition41.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder27.mongoCollectionFilter(basicDBObject47);
        org.elasticsearch.river.RiverSettings riverSettings49 = new org.elasticsearch.river.RiverSettings(settings22, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder15.mongoCollectionFilter(basicDBObject47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder8.mongoOplogFilter(basicDBObject47);
        org.elasticsearch.river.RiverSettings riverSettings52 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject47);
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = riverSettings52.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = riverSettings52.settings();
        org.elasticsearch.common.settings.Settings settings55 = riverSettings52.globalSettings();
        org.elasticsearch.script.ScriptService scriptService56 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "name", riverSettings52, scriptService56);
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = riverSettings52.settings();
        org.elasticsearch.river.RiverSettings riverSettings59 = new org.elasticsearch.river.RiverSettings(settings0, strMap58);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(settings55);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition57);
        org.junit.Assert.assertNotNull(strMap58);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("include_fields");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoCollection("null.null.null.null");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        boolean boolean13 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        boolean boolean14 = mongoDBRiverDefinition11.isSkipInitialImport();
        java.lang.String str15 = mongoDBRiverDefinition11.getMongoOplogNamespace();
        java.lang.String str16 = mongoDBRiverDefinition11.getTypeName();
        java.lang.String str17 = mongoDBRiverDefinition11.getStatisticsTypeName();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str19 = mongoDBRiverDefinition11.getMongoOplogNamespace();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = mongoDBRiverDefinition11.getInitialTimestamp();
        boolean boolean21 = mongoDBRiverDefinition11.isMongoUseSSL();
        boolean boolean22 = mongoDBRiverDefinition11.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition11.getIncludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null.null" + "'", str15, "null.null");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null.null" + "'", str19, "null.null");
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strSet23);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean14 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.lang.String str16 = mongoDBRiverDefinition11.getScript();
        boolean boolean17 = mongoDBRiverDefinition11.isMongoGridFS();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        java.lang.String str20 = mongoDBRiverDefinition11.getTypeName();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition11.getParentTypes();
        java.lang.String str22 = mongoDBRiverDefinition11.getScriptType();
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str24 = mongoDBRiverDefinition11.getIncludeCollection();
        java.lang.String str25 = mongoDBRiverDefinition11.getScript();
        java.util.Set<java.lang.String> strSet26 = mongoDBRiverDefinition11.getExcludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(strSet26);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoLocalUser();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition9.getInitialTimestamp();
        boolean boolean16 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoAdminPassword();
        int int18 = mongoDBRiverDefinition9.getSocketTimeout();
        boolean boolean19 = mongoDBRiverDefinition9.isMongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getScript();
        java.lang.String str14 = mongoDBRiverDefinition11.getIncludeCollection();
        java.lang.String str15 = mongoDBRiverDefinition11.getMongoLocalUser();
        int int16 = mongoDBRiverDefinition11.getConnectTimeout();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition11.getMongoServers();
        com.mongodb.MongoClientOptions mongoClientOptions18 = mongoDBRiverDefinition11.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition11.getMongoOplogFilter();
        java.lang.String str20 = mongoDBRiverDefinition11.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertNull(mongoClientOptions18);
        org.junit.Assert.assertNull(basicDBObject19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null.null" + "'", str20, "null.null");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean12 = mongoDBRiverDefinition9.isMongoGridFS();
        int int13 = mongoDBRiverDefinition9.getConnectTimeout();
        com.mongodb.MongoClientOptions mongoClientOptions14 = mongoDBRiverDefinition9.getMongoClientOptions();
        boolean boolean15 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        int int16 = mongoDBRiverDefinition9.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.ServerAddress[] serverAddressArray5 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList6 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList6, serverAddressArray5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.typeName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.indexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.statisticsIndexName("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder16.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder16.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder16.storeStatistics(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serverAddressArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoCollectionFilter(basicDBObject10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder15.includeFields((java.util.Set<java.lang.String>) strSet24);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoClientOptions(mongoClientOptions30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.socketTimeout((int) 'a');
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory40 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = null;
        org.elasticsearch.script.ExecutableScript executableScript42 = docScoreNativeScriptFactory40.newScript(strMap41);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = null;
        org.elasticsearch.script.ExecutableScript executableScript44 = docScoreNativeScriptFactory40.newScript(strMap43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoClientOptions(mongoClientOptions46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoClientOptions(mongoClientOptions54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = builder55.build();
        java.lang.String str57 = mongoDBRiverDefinition56.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions58 = mongoDBRiverDefinition56.getMongoClientOptions();
        boolean boolean59 = mongoDBRiverDefinition56.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions60 = mongoDBRiverDefinition56.getMongoClientOptions();
        java.lang.String str61 = mongoDBRiverDefinition56.getScript();
        com.mongodb.BasicDBObject basicDBObject62 = mongoDBRiverDefinition56.getMongoOplogFilter();
        java.lang.String str63 = mongoDBRiverDefinition56.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition56.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript65 = docScoreNativeScriptFactory40.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder37.mongoCollectionFilter(basicDBObject64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder37.statisticsTypeName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoLocalUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.connectTimeout(10);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) builder74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions78 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.mongoClientOptions(mongoClientOptions78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder77.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder85.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder87.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder89.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder93 = builder91.mongoSSLVerifyCertificate(false);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) builder91);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(executableScript42);
        org.junit.Assert.assertNotNull(executableScript44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(mongoClientOptions58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(mongoClientOptions60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(basicDBObject62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(basicDBObject64);
        org.junit.Assert.assertNotNull(executableScript65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder93);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean14 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.lang.String str16 = mongoDBRiverDefinition11.getScript();
        boolean boolean17 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoLocalPassword();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition11.getIncludeFields();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = mongoDBRiverDefinition11.getInitialTimestamp();
        boolean boolean21 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition11.getIncludeCollection();
        java.lang.String str23 = mongoDBRiverDefinition11.getMongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.typeName("");
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        int int10 = mongoDBRiverDefinition9.getThrottleSize();
        boolean boolean11 = mongoDBRiverDefinition9.isDropCollection();
        boolean boolean12 = mongoDBRiverDefinition9.isSkipInitialImport();
        java.lang.String str13 = mongoDBRiverDefinition9.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition9.getMongoOplogFilter();
        boolean boolean15 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str16 = mongoDBRiverDefinition9.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.connectTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.riverName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.connectTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoUseSSL(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition9.getMongoOplogFilter();
        boolean boolean13 = mongoDBRiverDefinition9.isDropCollection();
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoAdminUser();
        java.lang.String str15 = mongoDBRiverDefinition9.getRiverIndexName();
        java.lang.String str16 = mongoDBRiverDefinition9.getRiverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoAdminUser("initial_timestamp.null");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean12 = mongoDBRiverDefinition9.isDropCollection();
        java.lang.String str13 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean14 = mongoDBRiverDefinition9.isMongoUseSSL();
        boolean boolean15 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        int int16 = mongoDBRiverDefinition9.getThrottleSize();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoAdminPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition9.getMongoOplogFilter();
        boolean boolean13 = mongoDBRiverDefinition9.isDropCollection();
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoLocalUser();
        boolean boolean15 = mongoDBRiverDefinition9.isDropCollection();
        boolean boolean16 = mongoDBRiverDefinition9.isMongoGridFS();
        int int17 = mongoDBRiverDefinition9.getConnectTimeout();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition9.getIncludeFields();
        boolean boolean19 = mongoDBRiverDefinition9.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition9.getMongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(basicDBObject20);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory4.newScript(strMap5);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) docScoreNativeScriptFactory4);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript9 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj11 = docScoreSearchScript9.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript9.setNextScore((float) 1);
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoClientOptions(mongoClientOptions21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject25 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.mongoCollectionFilter(basicDBObject25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder20.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = builder28.build();
        boolean boolean30 = mongoDBRiverDefinition29.isStoreStatistics();
        java.util.List<com.mongodb.ServerAddress> serverAddressList31 = mongoDBRiverDefinition29.getMongoServers();
        java.lang.String str32 = mongoDBRiverDefinition29.getScriptType();
        java.lang.String str33 = mongoDBRiverDefinition29.getMongoAdminPassword();
        java.lang.String str34 = mongoDBRiverDefinition29.getMongoLocalPassword();
        java.lang.String str35 = mongoDBRiverDefinition29.getMongoOplogNamespace();
        boolean boolean36 = mongoDBRiverDefinition29.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) boolean36);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(serverAddressList31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null.null" + "'", str35, "null.null");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.typeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoClientOptions(mongoClientOptions8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.connectTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.indexName("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "disable_index_refresh", "collection", "host", "user", "script_type", "socket_timeout", "include_fields", "bulk", "connect_timeout", "actions", "collection", "connect_timeout", "type" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder17.excludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.importAllCollections(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoLocalUser();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition9.getInitialTimestamp();
        boolean boolean16 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition9.getParentTypes();
        int int19 = mongoDBRiverDefinition9.getConnectTimeout();
        com.mongodb.MongoClientOptions mongoClientOptions20 = mongoDBRiverDefinition9.getMongoClientOptions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(mongoClientOptions20);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.typeName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoDb("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoAdminPassword("localhost");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.riverIndexName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.scriptType("servers");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition11.getInitialTimestamp();
        int int16 = mongoDBRiverDefinition11.getSocketTimeout();
        int int17 = mongoDBRiverDefinition11.getConnectTimeout();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str19 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str20 = mongoDBRiverDefinition11.getTypeName();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str22 = mongoDBRiverDefinition11.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        java.lang.String str25 = mongoDBRiverDefinition11.getScriptType();
        boolean boolean26 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp27 = mongoDBRiverDefinition11.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet28 = mongoDBRiverDefinition11.getExcludeFields();
        boolean boolean29 = mongoDBRiverDefinition11.isMongoGridFS();
        com.mongodb.MongoClientOptions mongoClientOptions30 = mongoDBRiverDefinition11.getMongoClientOptions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardTimestamp27);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(mongoClientOptions30);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory4.newScript(strMap5);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) docScoreNativeScriptFactory4);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript9 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj11 = docScoreSearchScript9.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript9.setNextScore((float) 1);
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.scriptType("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoDb("include_fields");
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) builder38);
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoClientOptions(mongoClientOptions43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject47 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder42.mongoCollectionFilter(basicDBObject47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.includeCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.mongoUseSSL(false);
        java.lang.Object obj59 = docScoreSearchScript0.unwrap((java.lang.Object) builder54);
        org.elasticsearch.common.settings.Settings settings61 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = null;
        org.elasticsearch.river.RiverSettings riverSettings63 = new org.elasticsearch.river.RiverSettings(settings61, strMap62);
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = riverSettings63.settings();
        org.elasticsearch.common.settings.Settings settings65 = riverSettings63.globalSettings();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) settings65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions68 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoClientOptions(mongoClientOptions68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder69.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder69.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder69.typeName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder69.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder69.socketTimeout(1);
        java.lang.Object obj82 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = docScoreSearchScript0.unwrap(obj83);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(strMap64);
        org.junit.Assert.assertNull(settings65);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 1 + "'", obj82, 1);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoCollectionFilter(basicDBObject10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder15.includeFields((java.util.Set<java.lang.String>) strSet24);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoClientOptions(mongoClientOptions32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoClientOptions(mongoClientOptions40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = builder41.build();
        java.lang.String str43 = mongoDBRiverDefinition42.getMongoAdminPassword();
        boolean boolean44 = mongoDBRiverDefinition42.isMongoSecondaryReadPreference();
        java.lang.String str45 = mongoDBRiverDefinition42.getMongoLocalUser();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp46 = mongoDBRiverDefinition42.getInitialTimestamp();
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) wildcardTimestamp46);
        org.apache.lucene.search.Scorer scorer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(wildcardTimestamp46);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition11.getInitialTimestamp();
        int int16 = mongoDBRiverDefinition11.getSocketTimeout();
        int int17 = mongoDBRiverDefinition11.getConnectTimeout();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminUser();
        boolean boolean19 = mongoDBRiverDefinition11.isImportAllCollections();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition11.getMongoOplogFilter();
        java.lang.String str21 = mongoDBRiverDefinition11.getMongoLocalUser();
        java.lang.String str22 = mongoDBRiverDefinition11.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(basicDBObject20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.getTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean15 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        java.lang.String str16 = mongoDBRiverDefinition9.getScript();
        int int17 = mongoDBRiverDefinition9.getThrottleSize();
        java.lang.String str18 = mongoDBRiverDefinition9.getScriptType();
        java.lang.String str19 = mongoDBRiverDefinition9.getMongoLocalUser();
        boolean boolean20 = mongoDBRiverDefinition9.isSkipInitialImport();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean12 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        boolean boolean14 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean15 = mongoDBRiverDefinition9.isSkipInitialImport();
        java.lang.String str16 = mongoDBRiverDefinition9.getTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoCollection("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.includeCollection("filter");
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder10.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.riverName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.script("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoClientOptions(mongoClientOptions37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.typeName("options");
        java.lang.String[] strArray79 = new java.lang.String[] { "script_type", "flush_interval", "localhost", "credentials", "local", "localhost", "user", "exclude_fields", "include_collection", "user", "localhost", "actions", "secondary_read_preference", "gridfs", "exclude_fields", "", "type", "store_statistics", "credentials", "include_collection", "options", "ssl_verify_certificate", "initial_timestamp", "", "localhost", "size", "servers", "disable_index_refresh", "ssl_verify_certificate", "initial_timestamp", "flush_interval", "", "user", "skip_initial_import", "", "parent_types", "filter", "" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder40.includeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder35.includeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder22.parentTypes((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder84.mongoAdminPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder88.throttleSize(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder88.mongoDb("null.null");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean14 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean16 = mongoDBRiverDefinition11.isMongoGridFS();
        java.lang.String str17 = mongoDBRiverDefinition11.getRiverName();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition11.getIncludeFields();
        boolean boolean19 = mongoDBRiverDefinition11.isSkipInitialImport();
        boolean boolean20 = mongoDBRiverDefinition11.isDropCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isAdvancedTransformation();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition7.getParentTypes();
        java.lang.String str10 = mongoDBRiverDefinition7.getMongoLocalPassword();
        boolean boolean11 = mongoDBRiverDefinition7.isMongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        java.lang.String[] strArray49 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder56.socketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder62.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList64 = mongoDBRiverDefinition63.getMongoServers();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition63.getParentTypes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition63);
        org.junit.Assert.assertNotNull(serverAddressList64);
        org.junit.Assert.assertNull(strSet65);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        boolean boolean13 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition11.getMongoOplogFilter();
        java.lang.String str15 = mongoDBRiverDefinition11.getScriptType();
        com.mongodb.MongoClientOptions mongoClientOptions16 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.lang.String str17 = mongoDBRiverDefinition11.getMongoLocalUser();
        java.lang.String str18 = mongoDBRiverDefinition11.getRiverName();
        boolean boolean19 = mongoDBRiverDefinition11.isDropCollection();
        java.lang.String str20 = mongoDBRiverDefinition11.getMongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(mongoClientOptions16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.storeStatistics(true);
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoClientOptions(mongoClientOptions13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoDb();
        int int13 = mongoDBRiverDefinition9.getConnectTimeout();
        java.lang.String str14 = mongoDBRiverDefinition9.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition9.getMongoOplogFilter();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition9.getMongoOplogFilter();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.lang.String str18 = mongoDBRiverDefinition9.getRiverIndexName();
        java.lang.String str19 = mongoDBRiverDefinition9.getMongoLocalUser();
        java.lang.String str20 = mongoDBRiverDefinition9.getStatisticsTypeName();
        int int21 = mongoDBRiverDefinition9.getSocketTimeout();
        java.lang.String str22 = mongoDBRiverDefinition9.getScript();
        java.lang.String str23 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        java.lang.String str24 = mongoDBRiverDefinition9.getMongoDb();
        java.lang.String str25 = mongoDBRiverDefinition9.getScript();
        java.lang.String str26 = mongoDBRiverDefinition9.getMongoDb();
        int int27 = mongoDBRiverDefinition9.getThrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(basicDBObject15);
        org.junit.Assert.assertNull(basicDBObject16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null.null" + "'", str23, "null.null");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str14 = mongoDBRiverDefinition9.getRiverName();
        java.lang.String str15 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoLocalPassword();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = mongoDBRiverDefinition9.getInitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardTimestamp17);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getScript();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoCollection();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition11.getIncludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions16 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean17 = mongoDBRiverDefinition11.isMongoUseSSL();
        boolean boolean18 = mongoDBRiverDefinition11.isImportAllCollections();
        java.lang.String str19 = mongoDBRiverDefinition11.getIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions20 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.lang.String str21 = mongoDBRiverDefinition11.getStatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(mongoClientOptions20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.statisticsTypeName("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoClientOptions(mongoClientOptions10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoCollectionFilter(basicDBObject14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder17.build();
        boolean boolean19 = mongoDBRiverDefinition18.isStoreStatistics();
        boolean boolean20 = mongoDBRiverDefinition18.isMongoSSLVerifyCertificate();
        java.lang.String str21 = mongoDBRiverDefinition18.getTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList22 = mongoDBRiverDefinition18.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder4.mongoServers(serverAddressList22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoClientOptions(mongoClientOptions25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject29 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.mongoCollectionFilter(basicDBObject29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoClientOptions(mongoClientOptions36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions44 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoClientOptions(mongoClientOptions44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder45.build();
        java.lang.String str47 = mongoDBRiverDefinition46.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions48 = mongoDBRiverDefinition46.getMongoClientOptions();
        boolean boolean49 = mongoDBRiverDefinition46.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions50 = mongoDBRiverDefinition46.getMongoClientOptions();
        java.lang.String str51 = mongoDBRiverDefinition46.getScript();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition46.getMongoOplogFilter();
        java.lang.String str53 = mongoDBRiverDefinition46.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject54 = mongoDBRiverDefinition46.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder34.mongoCollectionFilter(basicDBObject54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder23.mongoOplogFilter(basicDBObject54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoCollection("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.script("include_fields");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(serverAddressList22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(mongoClientOptions50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(basicDBObject52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(basicDBObject54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoOplogFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoAdminPassword("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.mongoUseSSL(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoClientOptions(mongoClientOptions4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.mongoCollectionFilter(basicDBObject8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoOplogFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.storeStatistics(false);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoClientOptions(mongoClientOptions41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.importAllCollections(false);
        com.mongodb.ServerAddress[] serverAddressArray45 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList46 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList46, serverAddressArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder40.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder39.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoSSLVerifyCertificate(false);
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions55 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoClientOptions(mongoClientOptions55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject59 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder54.mongoCollectionFilter(basicDBObject59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder62.build();
        int int64 = mongoDBRiverDefinition63.getSocketTimeout();
        java.lang.String str65 = mongoDBRiverDefinition63.getScriptType();
        com.mongodb.MongoClientOptions mongoClientOptions66 = mongoDBRiverDefinition63.getMongoClientOptions();
        com.mongodb.MongoClientOptions mongoClientOptions67 = mongoDBRiverDefinition63.getMongoClientOptions();
        java.lang.String str68 = mongoDBRiverDefinition63.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet69 = mongoDBRiverDefinition63.getIncludeFields();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp70 = mongoDBRiverDefinition63.getInitialTimestamp();
        docScoreSearchScript0.setNextVar("store_statistics", (java.lang.Object) mongoDBRiverDefinition63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions74 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoClientOptions(mongoClientOptions74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder77.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions82 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.mongoClientOptions(mongoClientOptions82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition84 = builder83.build();
        java.lang.String str85 = mongoDBRiverDefinition84.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions86 = mongoDBRiverDefinition84.getMongoClientOptions();
        boolean boolean87 = mongoDBRiverDefinition84.isMongoSecondaryReadPreference();
        int int88 = mongoDBRiverDefinition84.getThrottleSize();
        java.lang.String str89 = mongoDBRiverDefinition84.getMongoAdminUser();
        java.lang.String str90 = mongoDBRiverDefinition84.getStatisticsIndexName();
        java.lang.String str91 = mongoDBRiverDefinition84.getMongoOplogNamespace();
        docScoreSearchScript0.setNextVar("options", (java.lang.Object) mongoDBRiverDefinition84);
        // The following exception was thrown during execution in test generation
        try {
            float float93 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(serverAddressArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + false + "'", obj52, false);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(mongoClientOptions66);
        org.junit.Assert.assertNull(mongoClientOptions67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(strSet69);
        org.junit.Assert.assertNull(wildcardTimestamp70);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNull(mongoClientOptions86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "null.null" + "'", str91, "null.null");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoAdminPassword("bulk_timeout");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.includeCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoAdminUser("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoClientOptions(mongoClientOptions16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.mongoLocalPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.mongoAdminPassword("null.null");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalPassword("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.statisticsIndexName("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoClientOptions(mongoClientOptions33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.connectTimeout((int) (short) 10);
        java.lang.String[] strArray81 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet82 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet82, strArray81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder38.excludeFields((java.util.Set<java.lang.String>) strSet82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder29.includeFields((java.util.Set<java.lang.String>) strSet82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder86.riverName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder86.skipInitialImport(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.socketTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoDb("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("include_collection");
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder31.build();
        com.mongodb.MongoClientOptions mongoClientOptions33 = mongoDBRiverDefinition32.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition32.getMongoCollectionFilter();
        boolean boolean35 = mongoDBRiverDefinition32.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition32.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition32.getIncludeCollection();
        java.lang.String str38 = mongoDBRiverDefinition32.getIndexName();
        docScoreSearchScript0.setNextVar("null.null.null.null", (java.lang.Object) mongoDBRiverDefinition32);
        docScoreSearchScript0.setNextScore((float) 10);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition32);
        org.junit.Assert.assertNull(mongoClientOptions33);
        org.junit.Assert.assertNull(basicDBObject34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(basicDBObject36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "bulk_size" + "'", str38, "bulk_size");
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.typeName("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoCollectionFilter(basicDBObject10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder15.includeFields((java.util.Set<java.lang.String>) strSet24);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript31 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj33 = docScoreSearchScript31.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript31.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoClientOptions(mongoClientOptions38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions55 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoClientOptions(mongoClientOptions55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.importAllCollections(false);
        com.mongodb.ServerAddress[] serverAddressArray59 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList60 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList60, serverAddressArray59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder53.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder53.skipInitialImport(false);
        docScoreSearchScript31.setNextVar("import_all_collections", (java.lang.Object) builder53);
        docScoreSearchScript0.setNextVar("bulk", (java.lang.Object) docScoreSearchScript31);
        java.lang.Object obj69 = null;
        docScoreSearchScript0.setNextVar("db", obj69);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript71 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj73 = docScoreSearchScript71.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory75 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap76 = null;
        org.elasticsearch.script.ExecutableScript executableScript77 = docScoreNativeScriptFactory75.newScript(strMap76);
        docScoreSearchScript71.setNextVar("localhost", (java.lang.Object) docScoreNativeScriptFactory75);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript80 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj82 = docScoreSearchScript80.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript80.setNextScore((float) 1);
        docScoreSearchScript71.setNextVar("credentials", (java.lang.Object) 1);
        java.lang.Object obj86 = null;
        java.lang.Object obj87 = docScoreSearchScript71.unwrap(obj86);
        java.lang.Object obj88 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript71);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext89 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript71.setNextReader(atomicReaderContext89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(serverAddressArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + "hi!" + "'", obj73, "hi!");
        org.junit.Assert.assertNotNull(executableScript77);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + "hi!" + "'", obj82, "hi!");
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(obj88);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.lang.String str14 = mongoDBRiverDefinition11.getScriptType();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition11.getExcludeFields();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition11.getParentTypes();
        java.lang.String str17 = mongoDBRiverDefinition11.getRiverIndexName();
        java.lang.String str18 = mongoDBRiverDefinition11.getIndexName();
        java.lang.String str19 = mongoDBRiverDefinition11.getMongoCollection();
        java.lang.String str20 = mongoDBRiverDefinition11.getMongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.statisticsIndexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout(1000);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript19 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj21 = docScoreSearchScript19.unwrap((java.lang.Object) 8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder23.riverName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.socketTimeout((int) (byte) 100);
        docScoreSearchScript19.setNextVar("", (java.lang.Object) builder33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder33.script("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoClientOptions(mongoClientOptions42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder41.mongoCollectionFilter(basicDBObject46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder41.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoAdminUser("");
        org.elasticsearch.common.settings.Settings settings58 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions60 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.mongoClientOptions(mongoClientOptions60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions67 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.mongoClientOptions(mongoClientOptions67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder66.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder70.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions75 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoClientOptions(mongoClientOptions75);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = builder76.build();
        java.lang.String str78 = mongoDBRiverDefinition77.getMongoAdminPassword();
        boolean boolean79 = mongoDBRiverDefinition77.isMongoSecondaryReadPreference();
        java.lang.String str80 = mongoDBRiverDefinition77.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet81 = mongoDBRiverDefinition77.getParentTypes();
        boolean boolean82 = mongoDBRiverDefinition77.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject83 = mongoDBRiverDefinition77.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder63.mongoCollectionFilter(basicDBObject83);
        org.elasticsearch.river.RiverSettings riverSettings85 = new org.elasticsearch.river.RiverSettings(settings58, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder55.mongoCollectionFilter(basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder40.mongoCollectionFilter(basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder16.mongoOplogFilter(basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder16.includeCollection("socket_timeout.socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder16.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder92.mongoLocalUser("collection");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 8 + "'", obj21, 8);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNull(strSet81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(basicDBObject83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean12 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        boolean boolean14 = mongoDBRiverDefinition9.isImportAllCollections();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        java.lang.String str16 = mongoDBRiverDefinition9.getRiverName();
        java.lang.String str17 = mongoDBRiverDefinition9.getScriptType();
        boolean boolean18 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean19 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean20 = mongoDBRiverDefinition9.isStoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(basicDBObject15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        boolean boolean13 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        boolean boolean14 = mongoDBRiverDefinition11.isSkipInitialImport();
        java.lang.String str15 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str16 = mongoDBRiverDefinition11.getMongoOplogNamespace();
        java.lang.String str17 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean18 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        java.lang.String str19 = mongoDBRiverDefinition11.getScript();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = mongoDBRiverDefinition11.getInitialTimestamp();
        java.lang.String str21 = mongoDBRiverDefinition11.getIncludeCollection();
        boolean boolean22 = mongoDBRiverDefinition11.isMongoGridFS();
        java.lang.String str23 = mongoDBRiverDefinition11.getMongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null.null" + "'", str16, "null.null");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoAdminPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder11.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = builder19.build();
        boolean boolean21 = mongoDBRiverDefinition20.isStoreStatistics();
        boolean boolean22 = mongoDBRiverDefinition20.isMongoSSLVerifyCertificate();
        java.lang.String str23 = mongoDBRiverDefinition20.getMongoDb();
        java.util.List<com.mongodb.ServerAddress> serverAddressList24 = mongoDBRiverDefinition20.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder6.mongoServers(serverAddressList24);
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder6.mongoClientOptions(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(serverAddressList24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        int int10 = mongoDBRiverDefinition9.getSocketTimeout();
        java.lang.String str11 = mongoDBRiverDefinition9.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str13 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        java.lang.String str14 = mongoDBRiverDefinition9.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoDb();
        java.lang.String str17 = mongoDBRiverDefinition9.getScriptType();
        java.lang.String str18 = mongoDBRiverDefinition9.getMongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null.null" + "'", str13, "null.null");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(serverAddressList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoCollection("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.typeName("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoClientOptions(mongoClientOptions25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.mongoAdminPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoDb("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoClientOptions(mongoClientOptions34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.connectTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.indexName("hi!");
        java.lang.String[] strArray59 = new java.lang.String[] { "disable_index_refresh", "collection", "host", "user", "script_type", "socket_timeout", "include_fields", "bulk", "connect_timeout", "actions", "collection", "connect_timeout", "type" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder43.excludeFields((java.util.Set<java.lang.String>) strSet60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder30.parentTypes((java.util.Set<java.lang.String>) strSet60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder21.includeFields((java.util.Set<java.lang.String>) strSet60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder4.includeFields((java.util.Set<java.lang.String>) strSet60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder4.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.scriptType("admin");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.getTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean15 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        java.lang.String str16 = mongoDBRiverDefinition9.getScript();
        java.lang.String str17 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean18 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        boolean boolean19 = mongoDBRiverDefinition9.isMongoUseSSL();
        java.lang.String str20 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null.null" + "'", str20, "null.null");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str14 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str16 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoDb();
        java.lang.String str18 = mongoDBRiverDefinition9.getRiverName();
        int int19 = mongoDBRiverDefinition9.getConnectTimeout();
        int int20 = mongoDBRiverDefinition9.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(serverAddressList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("socket_timeout.socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.includeCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.connectTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.indexName("host");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoClientOptions(mongoClientOptions16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoClientOptions(mongoClientOptions31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.connectTimeout((int) (short) 10);
        java.lang.String[] strArray79 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.connectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder86.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder88.mongoAdminUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder90.statisticsIndexName("concurrent_requests.concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder90.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder96 = builder90.mongoSSLVerifyCertificate(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        java.lang.String[] strArray49 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.dropCollection(true);
        org.bson.types.BSONTimestamp bSONTimestamp55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.initialTimestamp(bSONTimestamp55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder0.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getStatisticsIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition9.getMongoOplogFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition9.getInitialTimestamp();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition9.getMongoOplogFilter();
        java.lang.String str15 = mongoDBRiverDefinition9.getMongoLocalUser();
        java.lang.String str16 = mongoDBRiverDefinition9.getRiverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 8);
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoCollectionFilter(basicDBObject10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder13.build();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition14.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition14.getMongoCollectionFilter();
        boolean boolean17 = mongoDBRiverDefinition14.isAdvancedTransformation();
        java.lang.String str18 = mongoDBRiverDefinition14.getScript();
        java.lang.String str19 = mongoDBRiverDefinition14.getIndexName();
        java.lang.String str20 = mongoDBRiverDefinition14.getMongoAdminPassword();
        int int21 = mongoDBRiverDefinition14.getConnectTimeout();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript0.setNextScore((float) 10);
        docScoreSearchScript0.setNextVar("secondary_read_preference", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore(100.0f);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 8 + "'", obj2, 8);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNull(basicDBObject16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "bulk_size" + "'", str19, "bulk_size");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition11.getInitialTimestamp();
        int int16 = mongoDBRiverDefinition11.getSocketTimeout();
        int int17 = mongoDBRiverDefinition11.getConnectTimeout();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str19 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str20 = mongoDBRiverDefinition11.getTypeName();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str22 = mongoDBRiverDefinition11.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        java.lang.String str24 = mongoDBRiverDefinition11.getMongoAdminPassword();
        boolean boolean25 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        java.lang.String str26 = mongoDBRiverDefinition11.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoClientOptions(mongoClientOptions4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoLocalPassword("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.riverName("secondary_read_preference");
        java.lang.Object obj12 = docScoreSearchScript0.unwrap((java.lang.Object) "secondary_read_preference");
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = docScoreSearchScript0.unwrap(obj13);
        java.lang.Object obj16 = null;
        docScoreSearchScript0.setNextVar("name", obj16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoClientOptions(mongoClientOptions28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder29.build();
        java.lang.String str31 = mongoDBRiverDefinition30.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions32 = mongoDBRiverDefinition30.getMongoClientOptions();
        boolean boolean33 = mongoDBRiverDefinition30.isMongoSecondaryReadPreference();
        boolean boolean34 = mongoDBRiverDefinition30.isDropCollection();
        java.lang.String str35 = mongoDBRiverDefinition30.getScriptType();
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoClientOptions(mongoClientOptions39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions47 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoClientOptions(mongoClientOptions47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = builder48.build();
        java.lang.String str50 = mongoDBRiverDefinition49.getMongoAdminPassword();
        boolean boolean51 = mongoDBRiverDefinition49.isMongoSecondaryReadPreference();
        java.lang.String str52 = mongoDBRiverDefinition49.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet53 = mongoDBRiverDefinition49.getParentTypes();
        boolean boolean54 = mongoDBRiverDefinition49.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject55 = mongoDBRiverDefinition49.getMongoCollectionFilter();
        int int56 = mongoDBRiverDefinition49.getConnectTimeout();
        boolean boolean57 = mongoDBRiverDefinition49.isMongoGridFS();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition49);
        java.lang.String str59 = mongoDBRiverDefinition49.getScriptType();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "secondary_read_preference" + "'", obj12, "secondary_read_preference");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(strSet53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(basicDBObject55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.lang.String str14 = mongoDBRiverDefinition11.getScript();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition11.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition11.getIncludeFields();
        int int17 = mongoDBRiverDefinition11.getThrottleSize();
        boolean boolean18 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        java.lang.String str20 = mongoDBRiverDefinition11.getMongoAdminPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.riverIndexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoClientOptions(mongoClientOptions22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoClientOptions(mongoClientOptions30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder29.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoClientOptions(mongoClientOptions37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.connectTimeout((int) (short) 10);
        java.lang.String[] strArray85 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder42.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder14.parentTypes((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder14.indexName("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder14.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder96 = builder14.advancedTransformation(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.includeCollection("exclude_fields");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoAdminPassword();
        java.lang.String str15 = mongoDBRiverDefinition11.getMongoAdminUser();
        boolean boolean16 = mongoDBRiverDefinition11.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoAdminUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("flush_interval");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoLocalUser("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.mongoCollection("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoClientOptions(mongoClientOptions22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.connectTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.indexName("hi!");
        java.lang.String[] strArray47 = new java.lang.String[] { "disable_index_refresh", "collection", "host", "user", "script_type", "socket_timeout", "include_fields", "bulk", "connect_timeout", "actions", "collection", "connect_timeout", "type" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder31.excludeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder20.includeFields((java.util.Set<java.lang.String>) strSet48);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition11.getInitialTimestamp();
        int int16 = mongoDBRiverDefinition11.getSocketTimeout();
        int int17 = mongoDBRiverDefinition11.getConnectTimeout();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str19 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str20 = mongoDBRiverDefinition11.getTypeName();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str22 = mongoDBRiverDefinition11.getMongoCollection();
        boolean boolean23 = mongoDBRiverDefinition11.isStoreStatistics();
        com.mongodb.MongoClientOptions mongoClientOptions24 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean25 = mongoDBRiverDefinition11.isMongoUseSSL();
        java.lang.String str26 = mongoDBRiverDefinition11.getTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList27 = mongoDBRiverDefinition11.getMongoServers();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(serverAddressList27);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder15.build();
        java.lang.String str17 = mongoDBRiverDefinition16.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions18 = mongoDBRiverDefinition16.getMongoClientOptions();
        boolean boolean19 = mongoDBRiverDefinition16.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions20 = mongoDBRiverDefinition16.getMongoClientOptions();
        java.lang.String str21 = mongoDBRiverDefinition16.getScript();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition16.getMongoOplogFilter();
        java.lang.String str23 = mongoDBRiverDefinition16.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings25 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = riverSettings25.settings();
        org.elasticsearch.script.ScriptService scriptService27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "local", riverSettings25, scriptService27);
        org.elasticsearch.script.ScriptService scriptService29 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "script_type", riverSettings25, scriptService29);
        org.elasticsearch.common.settings.Settings settings31 = riverSettings25.globalSettings();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(mongoClientOptions20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(basicDBObject22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition28);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition30);
        org.junit.Assert.assertNull(settings31);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.socketTimeout((int) 'a');
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory11.newScript(strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory11.newScript(strMap14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoClientOptions(mongoClientOptions17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoClientOptions(mongoClientOptions25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder26.build();
        java.lang.String str28 = mongoDBRiverDefinition27.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions29 = mongoDBRiverDefinition27.getMongoClientOptions();
        boolean boolean30 = mongoDBRiverDefinition27.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions31 = mongoDBRiverDefinition27.getMongoClientOptions();
        java.lang.String str32 = mongoDBRiverDefinition27.getScript();
        com.mongodb.BasicDBObject basicDBObject33 = mongoDBRiverDefinition27.getMongoOplogFilter();
        java.lang.String str34 = mongoDBRiverDefinition27.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition27.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript36 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder8.mongoCollectionFilter(basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder8.skipInitialImport(false);
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.mongoClientOptions(mongoClientOptions40);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(mongoClientOptions31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(basicDBObject33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.scriptType("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.statisticsIndexName("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.mongoDb("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.script("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.typeName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoDb("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.mongoLocalUser("null.null.null.null");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoClientOptions(mongoClientOptions22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.riverIndexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.advancedTransformation(false);
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoClientOptions(mongoClientOptions36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoClientOptions(mongoClientOptions39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions47 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoClientOptions(mongoClientOptions47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = builder48.build();
        java.lang.String str50 = mongoDBRiverDefinition49.getMongoDb();
        java.lang.String str51 = mongoDBRiverDefinition49.getStatisticsTypeName();
        boolean boolean52 = mongoDBRiverDefinition49.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp53 = mongoDBRiverDefinition49.getInitialTimestamp();
        int int54 = mongoDBRiverDefinition49.getSocketTimeout();
        int int55 = mongoDBRiverDefinition49.getConnectTimeout();
        java.lang.String str56 = mongoDBRiverDefinition49.getMongoAdminUser();
        java.lang.String str57 = mongoDBRiverDefinition49.getMongoAdminUser();
        java.lang.String str58 = mongoDBRiverDefinition49.getTypeName();
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition49.getIncludeFields();
        java.lang.String str60 = mongoDBRiverDefinition49.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject61 = mongoDBRiverDefinition49.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject62 = mongoDBRiverDefinition49.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder35.mongoOplogFilter(basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder16.mongoCollectionFilter(basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.connectTimeout(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(wildcardTimestamp53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(strSet59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(basicDBObject61);
        org.junit.Assert.assertNotNull(basicDBObject62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.getTypeName();
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean16 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean17 = mongoDBRiverDefinition9.isMongoUseSSL();
        java.lang.String str18 = mongoDBRiverDefinition9.getMongoLocalUser();
        java.lang.String str19 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        java.lang.String str20 = mongoDBRiverDefinition9.getMongoAdminUser();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition9.getParentTypes();
        boolean boolean22 = mongoDBRiverDefinition9.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(serverAddressList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null.null" + "'", str19, "null.null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean12 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        boolean boolean14 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean15 = mongoDBRiverDefinition9.isImportAllCollections();
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str17 = mongoDBRiverDefinition9.getIndexName();
        boolean boolean18 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        boolean boolean19 = mongoDBRiverDefinition9.isStoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "bulk_size" + "'", str17, "bulk_size");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoClientOptions(mongoClientOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoClientOptions(mongoClientOptions13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder14.build();
        java.lang.String str16 = mongoDBRiverDefinition15.getMongoDb();
        java.lang.String str17 = mongoDBRiverDefinition15.getStatisticsTypeName();
        boolean boolean18 = mongoDBRiverDefinition15.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = mongoDBRiverDefinition15.getInitialTimestamp();
        int int20 = mongoDBRiverDefinition15.getSocketTimeout();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition15.getIncludeFields();
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) strSet21);
        docScoreSearchScript0.setNextScore((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float25 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strSet21);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition11.getInitialTimestamp();
        int int16 = mongoDBRiverDefinition11.getSocketTimeout();
        int int17 = mongoDBRiverDefinition11.getConnectTimeout();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str19 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str20 = mongoDBRiverDefinition11.getTypeName();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str22 = mongoDBRiverDefinition11.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        java.lang.String str25 = mongoDBRiverDefinition11.getScriptType();
        boolean boolean26 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp27 = mongoDBRiverDefinition11.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet28 = mongoDBRiverDefinition11.getExcludeFields();
        boolean boolean29 = mongoDBRiverDefinition11.isMongoGridFS();
        java.lang.String str30 = mongoDBRiverDefinition11.getTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardTimestamp27);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.typeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoAdminPassword("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoCollectionFilter(basicDBObject10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder15.includeFields((java.util.Set<java.lang.String>) strSet24);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder15.statisticsIndexName("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.indexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder29.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder29.riverName("import_all_collections");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoAdminPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.indexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.typeName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.connectTimeout((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoDb();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str14 = mongoDBRiverDefinition9.getScriptType();
        int int15 = mongoDBRiverDefinition9.getConnectTimeout();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoCollection();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoClientOptions(mongoClientOptions2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.socketTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("bulk_size");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript18 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj20 = docScoreSearchScript18.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript18.setNextScore((float) 1);
        docScoreSearchScript18.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoClientOptions(mongoClientOptions27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.typeName("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.indexName("host");
        docScoreSearchScript18.setNextVar("drop_collection", (java.lang.Object) builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoClientOptions(mongoClientOptions41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject45 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.mongoCollectionFilter(basicDBObject45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder40.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray58 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder50.includeFields((java.util.Set<java.lang.String>) strSet59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder34.includeFields((java.util.Set<java.lang.String>) strSet59);
        org.elasticsearch.common.settings.Settings settings63 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions65 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoClientOptions(mongoClientOptions65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder64.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder68.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions73 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoClientOptions(mongoClientOptions73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition75 = builder74.build();
        java.lang.String str76 = mongoDBRiverDefinition75.getMongoDb();
        boolean boolean77 = mongoDBRiverDefinition75.isMongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject78 = mongoDBRiverDefinition75.getMongoOplogFilter();
        com.mongodb.BasicDBObject basicDBObject79 = mongoDBRiverDefinition75.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings80 = new org.elasticsearch.river.RiverSettings(settings63, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder62.mongoCollectionFilter(basicDBObject79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder17.mongoOplogFilter(basicDBObject79);
        org.elasticsearch.river.RiverSettings riverSettings83 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject79);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(basicDBObject78);
        org.junit.Assert.assertNotNull(basicDBObject79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.mongoCollection("parent_types");
        com.mongodb.BasicDBObject basicDBObject19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoCollectionFilter(basicDBObject19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoAdminPassword("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoGridFS(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.ServerAddress[] serverAddressArray5 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList6 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList6, serverAddressArray5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.typeName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.indexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.disableIndexRefresh(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serverAddressArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        int int10 = mongoDBRiverDefinition9.getSocketTimeout();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition9.getIncludeFields();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        int int13 = mongoDBRiverDefinition9.getConnectTimeout();
        boolean boolean14 = mongoDBRiverDefinition9.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getMongoLocalUser();
        java.lang.String str14 = mongoDBRiverDefinition11.getIncludeCollection();
        java.lang.String str15 = mongoDBRiverDefinition11.getRiverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        boolean boolean15 = mongoDBRiverDefinition11.isImportAllCollections();
        com.mongodb.MongoClientOptions mongoClientOptions16 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition11.getMongoServers();
        int int18 = mongoDBRiverDefinition11.getThrottleSize();
        boolean boolean19 = mongoDBRiverDefinition11.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition11.getMongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(basicDBObject20);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoClientOptions(mongoClientOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoClientOptions(mongoClientOptions13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.mongoSecondaryReadPreference(false);
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.mongoClientOptions(mongoClientOptions19);
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoClientOptions(mongoClientOptions32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder33.build();
        java.lang.String str35 = mongoDBRiverDefinition34.getMongoAdminPassword();
        boolean boolean36 = mongoDBRiverDefinition34.isMongoSecondaryReadPreference();
        java.lang.String str37 = mongoDBRiverDefinition34.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet38 = mongoDBRiverDefinition34.getParentTypes();
        java.lang.String str39 = mongoDBRiverDefinition34.getMongoAdminPassword();
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) str39);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory4.newScript(strMap5);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) docScoreNativeScriptFactory4);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript9 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj11 = docScoreSearchScript9.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript9.setNextScore((float) 1);
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.scriptType("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoDb("include_fields");
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) builder38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoClientOptions(mongoClientOptions41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions49 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoClientOptions(mongoClientOptions49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = builder50.build();
        java.lang.String str52 = mongoDBRiverDefinition51.getMongoAdminPassword();
        boolean boolean53 = mongoDBRiverDefinition51.isMongoSecondaryReadPreference();
        java.lang.String str54 = mongoDBRiverDefinition51.getMongoLocalUser();
        java.lang.Object obj55 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions57 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoClientOptions(mongoClientOptions57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions65 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoClientOptions(mongoClientOptions65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition67 = builder66.build();
        java.lang.String str68 = mongoDBRiverDefinition67.getMongoDb();
        java.lang.String str69 = mongoDBRiverDefinition67.getMongoLocalUser();
        java.lang.Object obj70 = docScoreSearchScript0.unwrap((java.lang.Object) str69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions73 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoClientOptions(mongoClientOptions73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder72.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject77 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder72.mongoCollectionFilter(basicDBObject77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder72.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition81 = builder80.build();
        boolean boolean82 = mongoDBRiverDefinition81.isStoreStatistics();
        boolean boolean83 = mongoDBRiverDefinition81.isMongoSSLVerifyCertificate();
        java.lang.String str84 = mongoDBRiverDefinition81.getMongoDb();
        java.lang.String str85 = mongoDBRiverDefinition81.getMongoAdminUser();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) str85);
        java.lang.Object obj88 = null;
        docScoreSearchScript0.setNextVar("password", obj88);
        java.lang.Object obj90 = null;
        java.lang.Object obj91 = docScoreSearchScript0.unwrap(obj90);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + "" + "'", obj70, "");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoCollectionFilter(basicDBObject10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder15.includeFields((java.util.Set<java.lang.String>) strSet24);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder15.mongoLocalPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder15.statisticsTypeName("admin");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean14 = mongoDBRiverDefinition9.isAdvancedTransformation();
        boolean boolean15 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean16 = mongoDBRiverDefinition9.isMongoUseSSL();
        int int17 = mongoDBRiverDefinition9.getSocketTimeout();
        java.lang.String str18 = mongoDBRiverDefinition9.getMongoCollection();
        boolean boolean19 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str20 = mongoDBRiverDefinition9.getStatisticsIndexName();
        boolean boolean21 = mongoDBRiverDefinition9.isStoreStatistics();
        java.lang.String str22 = mongoDBRiverDefinition9.getStatisticsIndexName();
        boolean boolean23 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoAdminPassword("include_fields.include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoAdminPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.mongoCollection("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("port");
        java.util.Set<java.lang.String> strSet11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.excludeFields(strSet11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoSSLVerifyCertificate(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.script("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoSecondaryReadPreference(false);
        org.bson.types.BSONTimestamp bSONTimestamp21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.initialTimestamp(bSONTimestamp21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(false);
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoAdminPassword("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.mongoCollection("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.scriptType("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.scriptType("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoUseSSL(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoClientOptions(mongoClientOptions15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoSecondaryReadPreference(false);
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder14.mongoClientOptions(mongoClientOptions21);
        docScoreSearchScript2.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoClientOptions(mongoClientOptions26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoLocalPassword("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.riverName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.socketTimeout((int) (byte) -1);
        docScoreSearchScript2.setNextVar("store_statistics", (java.lang.Object) builder33);
        org.elasticsearch.common.settings.Settings settings38 = null;
        org.elasticsearch.common.settings.Settings settings41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoClientOptions(mongoClientOptions43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.throttleSize(0);
        org.elasticsearch.common.settings.Settings settings53 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions55 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoClientOptions(mongoClientOptions55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions62 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoClientOptions(mongoClientOptions62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder65.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions70 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoClientOptions(mongoClientOptions70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder71.build();
        java.lang.String str73 = mongoDBRiverDefinition72.getMongoAdminPassword();
        boolean boolean74 = mongoDBRiverDefinition72.isMongoSecondaryReadPreference();
        java.lang.String str75 = mongoDBRiverDefinition72.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet76 = mongoDBRiverDefinition72.getParentTypes();
        boolean boolean77 = mongoDBRiverDefinition72.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject78 = mongoDBRiverDefinition72.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder58.mongoCollectionFilter(basicDBObject78);
        org.elasticsearch.river.RiverSettings riverSettings80 = new org.elasticsearch.river.RiverSettings(settings53, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder46.mongoCollectionFilter(basicDBObject78);
        org.elasticsearch.river.RiverSettings riverSettings82 = new org.elasticsearch.river.RiverSettings(settings41, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.script.ScriptService scriptService83 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition84 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "bulk_timeout", riverSettings82, scriptService83);
        java.util.Map<java.lang.String, java.lang.Object> strMap85 = riverSettings82.settings();
        org.elasticsearch.river.RiverSettings riverSettings86 = new org.elasticsearch.river.RiverSettings(settings38, strMap85);
        java.util.Map<java.lang.String, java.lang.Object> strMap87 = riverSettings86.settings();
        docScoreSearchScript2.setNextVar("parent_types", (java.lang.Object) riverSettings86);
        org.elasticsearch.script.ScriptService scriptService89 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition90 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "ssl.null", riverSettings86, scriptService89);
        boolean boolean91 = mongoDBRiverDefinition90.isMongoSecondaryReadPreference();
        java.lang.String str92 = mongoDBRiverDefinition90.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet93 = mongoDBRiverDefinition90.getExcludeFields();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(strSet76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(basicDBObject78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNotNull(strMap87);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNull(strSet93);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.getMongoLocalUser();
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoCollection();
        java.lang.String str15 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        java.lang.String str16 = mongoDBRiverDefinition9.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null.null" + "'", str15, "null.null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean14 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition11.getParentTypes();
        java.lang.String str17 = mongoDBRiverDefinition11.getIncludeCollection();
        boolean boolean18 = mongoDBRiverDefinition11.isStoreStatistics();
        boolean boolean19 = mongoDBRiverDefinition11.isMongoGridFS();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = mongoDBRiverDefinition11.getInitialTimestamp();
        boolean boolean21 = mongoDBRiverDefinition11.isImportAllCollections();
        java.lang.String str22 = mongoDBRiverDefinition11.getScriptType();
        boolean boolean23 = mongoDBRiverDefinition11.isSkipInitialImport();
        java.util.Set<java.lang.String> strSet24 = mongoDBRiverDefinition11.getIncludeFields();
        java.util.Set<java.lang.String> strSet25 = mongoDBRiverDefinition11.getIncludeFields();
        boolean boolean26 = mongoDBRiverDefinition11.isStoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("include_fields");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.riverName("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.socketTimeout((-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition11.getInitialTimestamp();
        int int16 = mongoDBRiverDefinition11.getSocketTimeout();
        int int17 = mongoDBRiverDefinition11.getConnectTimeout();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminUser();
        boolean boolean19 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        boolean boolean20 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        java.lang.String str21 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str22 = mongoDBRiverDefinition11.getMongoCollection();
        java.lang.String str23 = mongoDBRiverDefinition11.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null.null" + "'", str23, "null.null");
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoCollectionFilter(basicDBObject10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder15.includeFields((java.util.Set<java.lang.String>) strSet24);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript31 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj33 = docScoreSearchScript31.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript31.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoClientOptions(mongoClientOptions38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions55 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoClientOptions(mongoClientOptions55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.importAllCollections(false);
        com.mongodb.ServerAddress[] serverAddressArray59 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList60 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList60, serverAddressArray59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder53.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder53.skipInitialImport(false);
        docScoreSearchScript31.setNextVar("import_all_collections", (java.lang.Object) builder53);
        docScoreSearchScript0.setNextVar("bulk", (java.lang.Object) docScoreSearchScript31);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(serverAddressArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoLocalPassword("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoClientOptions(mongoClientOptions16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.typeName("include_fields");
        com.mongodb.BasicDBObject basicDBObject24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoCollectionFilter(basicDBObject24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoClientOptions(mongoClientOptions27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.connectTimeout((int) (short) 10);
        java.lang.String[] strArray75 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder25.parentTypes((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder14.includeFields((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder80.riverIndexName("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder82.socketTimeout(1000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoClientOptions(mongoClientOptions8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.riverName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoClientOptions(mongoClientOptions21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.connectTimeout((int) (short) 10);
        java.lang.String[] strArray69 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder17.parentTypes((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.script("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.typeName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder78.indexName("ssl.null");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoDb();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str14 = mongoDBRiverDefinition9.getScriptType();
        int int15 = mongoDBRiverDefinition9.getConnectTimeout();
        java.lang.String str16 = mongoDBRiverDefinition9.getTypeName();
        boolean boolean17 = mongoDBRiverDefinition9.isSkipInitialImport();
        java.lang.String str18 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition9.getExcludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strSet19);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory4.newScript(strMap5);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) docScoreNativeScriptFactory4);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript9 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj11 = docScoreSearchScript9.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript9.setNextScore((float) 1);
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.scriptType("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoDb("include_fields");
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) builder38);
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoClientOptions(mongoClientOptions43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject47 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder42.mongoCollectionFilter(basicDBObject47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.includeCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.mongoUseSSL(false);
        java.lang.Object obj59 = docScoreSearchScript0.unwrap((java.lang.Object) builder54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions61 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.mongoClientOptions(mongoClientOptions61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder64.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions69 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoClientOptions(mongoClientOptions69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition71 = builder70.build();
        java.lang.String str72 = mongoDBRiverDefinition71.getMongoDb();
        boolean boolean73 = mongoDBRiverDefinition71.isDisableIndexRefresh();
        boolean boolean74 = mongoDBRiverDefinition71.isSkipInitialImport();
        java.lang.String str75 = mongoDBRiverDefinition71.getMongoOplogNamespace();
        java.lang.String str76 = mongoDBRiverDefinition71.getTypeName();
        java.lang.String str77 = mongoDBRiverDefinition71.getStatisticsTypeName();
        java.util.Set<java.lang.String> strSet78 = mongoDBRiverDefinition71.getIncludeFields();
        java.lang.String str79 = mongoDBRiverDefinition71.getMongoOplogNamespace();
        java.util.List<com.mongodb.ServerAddress> serverAddressList80 = mongoDBRiverDefinition71.getMongoServers();
        java.lang.Object obj81 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition71);
        docScoreSearchScript0.setNextScore(10.0f);
        // The following exception was thrown during execution in test generation
        try {
            long long84 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "null.null" + "'", str75, "null.null");
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(strSet78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "null.null" + "'", str79, "null.null");
        org.junit.Assert.assertNotNull(serverAddressList80);
        org.junit.Assert.assertNotNull(obj81);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 8);
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.connectTimeout(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.socketTimeout(8);
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) 8);
        docScoreSearchScript0.setNextScore((float) 8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoClientOptions(mongoClientOptions23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.typeName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.typeName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoClientOptions(mongoClientOptions38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoClientOptions(mongoClientOptions46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder47.build();
        java.lang.String str49 = mongoDBRiverDefinition48.getMongoDb();
        boolean boolean50 = mongoDBRiverDefinition48.isDisableIndexRefresh();
        java.lang.String str51 = mongoDBRiverDefinition48.getIndexName();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition48.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder32.mongoCollectionFilter(basicDBObject52);
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) builder32);
        docScoreSearchScript0.setNextScore((float) 27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions59 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoClientOptions(mongoClientOptions59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject63 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder58.mongoCollectionFilter(basicDBObject63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.mongoAdminUser("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions72 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoClientOptions(mongoClientOptions72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder71.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder75.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions80 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.mongoClientOptions(mongoClientOptions80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition82 = builder81.build();
        java.lang.String str83 = mongoDBRiverDefinition82.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions84 = mongoDBRiverDefinition82.getMongoClientOptions();
        boolean boolean85 = mongoDBRiverDefinition82.isMongoSecondaryReadPreference();
        int int86 = mongoDBRiverDefinition82.getThrottleSize();
        java.lang.String str87 = mongoDBRiverDefinition82.getMongoAdminUser();
        java.lang.String str88 = mongoDBRiverDefinition82.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList89 = mongoDBRiverDefinition82.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder68.mongoServers(serverAddressList89);
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) builder68);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 8 + "'", obj2, 8);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(basicDBObject52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNull(mongoClientOptions84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(serverAddressList89);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.scriptType("name.name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.bson.types.Binary binary17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.initialTimestamp(binary17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoDb();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean14 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        boolean boolean15 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        java.lang.String str16 = mongoDBRiverDefinition9.getStatisticsTypeName();
        boolean boolean17 = mongoDBRiverDefinition9.isDropCollection();
        java.lang.String str18 = mongoDBRiverDefinition9.getMongoAdminUser();
        java.lang.String str19 = mongoDBRiverDefinition9.getScriptType();
        java.lang.String str20 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        boolean boolean21 = mongoDBRiverDefinition9.isSkipInitialImport();
        java.util.Set<java.lang.String> strSet22 = mongoDBRiverDefinition9.getExcludeFields();
        boolean boolean23 = mongoDBRiverDefinition9.isMongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null.null" + "'", str20, "null.null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean14 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition11.getMongoClientOptions();
        java.lang.String str16 = mongoDBRiverDefinition11.getScript();
        boolean boolean17 = mongoDBRiverDefinition11.isMongoGridFS();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str19 = mongoDBRiverDefinition11.getStatisticsIndexName();
        int int20 = mongoDBRiverDefinition11.getConnectTimeout();
        int int21 = mongoDBRiverDefinition11.getThrottleSize();
        boolean boolean22 = mongoDBRiverDefinition11.isMongoUseSSL();
        int int23 = mongoDBRiverDefinition11.getConnectTimeout();
        int int24 = mongoDBRiverDefinition11.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoClientOptions(mongoClientOptions18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.importAllCollections(false);
        com.mongodb.ServerAddress[] serverAddressArray22 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList23 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList23, serverAddressArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder16.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalPassword("include_fields");
        java.util.List<com.mongodb.ServerAddress> serverAddressList33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoServers(serverAddressList33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoClientOptions(mongoClientOptions38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder45.build();
        boolean boolean47 = mongoDBRiverDefinition46.isStoreStatistics();
        boolean boolean48 = mongoDBRiverDefinition46.isMongoSSLVerifyCertificate();
        java.lang.String str49 = mongoDBRiverDefinition46.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList50 = mongoDBRiverDefinition46.getMongoServers();
        java.lang.String str51 = mongoDBRiverDefinition46.getMongoLocalUser();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp52 = mongoDBRiverDefinition46.getInitialTimestamp();
        java.lang.String str53 = mongoDBRiverDefinition46.getMongoLocalUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList54 = mongoDBRiverDefinition46.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder36.mongoServers(serverAddressList54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.riverName("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.dropCollection(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(serverAddressArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(serverAddressList50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(wildcardTimestamp52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(serverAddressList54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.statisticsIndexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoLocalPassword("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.statisticsTypeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.script("exclude_fields");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.dropCollection(true);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript19 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj21 = docScoreSearchScript19.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoClientOptions(mongoClientOptions23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoClientOptions(mongoClientOptions31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder32.build();
        java.lang.String str34 = mongoDBRiverDefinition33.getMongoDb();
        java.lang.String str35 = mongoDBRiverDefinition33.getStatisticsTypeName();
        boolean boolean36 = mongoDBRiverDefinition33.isImportAllCollections();
        java.lang.String str37 = mongoDBRiverDefinition33.getRiverIndexName();
        boolean boolean38 = mongoDBRiverDefinition33.isMongoGridFS();
        boolean boolean39 = mongoDBRiverDefinition33.isMongoGridFS();
        java.lang.String str40 = mongoDBRiverDefinition33.getMongoLocalUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList41 = mongoDBRiverDefinition33.getMongoServers();
        java.lang.Object obj42 = docScoreSearchScript19.unwrap((java.lang.Object) serverAddressList41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder14.mongoServers(serverAddressList41);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(serverAddressList41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "[]");
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.scriptType("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.statisticsIndexName("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoLocalUser("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.skipInitialImport(true);
        org.bson.types.Binary binary17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.initialTimestamp(binary17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getScript();
        java.lang.String str14 = mongoDBRiverDefinition11.getIncludeCollection();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition11.getIncludeFields();
        int int16 = mongoDBRiverDefinition11.getThrottleSize();
        boolean boolean17 = mongoDBRiverDefinition11.isStoreStatistics();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        java.lang.String str19 = mongoDBRiverDefinition11.getIndexName();
        java.lang.String str20 = mongoDBRiverDefinition11.getMongoAdminUser();
        int int21 = mongoDBRiverDefinition11.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoLocalPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoAdminPassword("null.null");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.indexName("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoLocalPassword("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.socketTimeout((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoClientOptions(mongoClientOptions16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoClientOptions(mongoClientOptions31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.connectTimeout((int) (short) 10);
        java.lang.String[] strArray79 = new java.lang.String[] { "actions", "user", "name", "bulk_size", "", "script_type", "db", "disable_index_refresh", "local", "port", "filter", "gridfs", "drop_collection", "hi!", "include_collection", "secondary_read_preference", "options", "script_type", "index", "import_all_collections", "options", "connect_timeout", "index", "name", "gridfs", "name", "db", "script", "bulk_timeout", "flush_interval", "", "ssl_verify_certificate", "collection", "admin", "include_collection", "concurrent_requests", "secondary_read_preference", "bulk_timeout", "collection", "script_type", "gridfs", "script_type" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.connectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder86.mongoDb("initial_timestamp");
        com.mongodb.MongoClientOptions mongoClientOptions89 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder86.mongoClientOptions(mongoClientOptions89);
        java.lang.Class<?> wildcardClass91 = builder86.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = builder10.build();
        java.lang.String str18 = mongoDBRiverDefinition17.getMongoCollection();
        java.lang.String str19 = mongoDBRiverDefinition17.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.scriptType("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.statisticsIndexName("user");
        java.lang.String[] strArray50 = new java.lang.String[] { "bulk", "include_fields", "filter", "concurrent_bulk_requests", "drop_collection", "local", "servers", "password", "null.null", "disable_index_refresh", "advanced_transformation", "script", "", "parent_types", "type", "advanced_transformation", "port", "admin", "collection", "bulk", "localhost", "index", "actions", "options", "advanced_transformation", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder19.parentTypes((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder10.mongoUseSSL(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        boolean boolean13 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        int int14 = mongoDBRiverDefinition11.getConnectTimeout();
        boolean boolean15 = mongoDBRiverDefinition11.isImportAllCollections();
        java.lang.String str16 = mongoDBRiverDefinition11.getScriptType();
        boolean boolean17 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        java.lang.String str18 = mongoDBRiverDefinition11.getStatisticsIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean14 = mongoDBRiverDefinition9.isAdvancedTransformation();
        boolean boolean15 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean16 = mongoDBRiverDefinition9.isMongoUseSSL();
        int int17 = mongoDBRiverDefinition9.getSocketTimeout();
        java.lang.String str18 = mongoDBRiverDefinition9.getMongoCollection();
        boolean boolean19 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str20 = mongoDBRiverDefinition9.getTypeName();
        java.lang.String str21 = mongoDBRiverDefinition9.getMongoCollection();
        java.lang.String str22 = mongoDBRiverDefinition9.getScriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean14 = mongoDBRiverDefinition9.isAdvancedTransformation();
        int int15 = mongoDBRiverDefinition9.getSocketTimeout();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = mongoDBRiverDefinition9.getInitialTimestamp();
        boolean boolean17 = mongoDBRiverDefinition9.isDropCollection();
        int int18 = mongoDBRiverDefinition9.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition9.getMongoAdminUser();
        boolean boolean14 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        java.lang.String str15 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null.null" + "'", str15, "null.null");
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        java.lang.String str23 = mongoDBRiverDefinition22.getMongoDb();
        java.lang.String str24 = mongoDBRiverDefinition22.getScript();
        java.lang.String str25 = mongoDBRiverDefinition22.getIncludeCollection();
        java.util.Set<java.lang.String> strSet26 = mongoDBRiverDefinition22.getIncludeFields();
        int int27 = mongoDBRiverDefinition22.getThrottleSize();
        boolean boolean28 = mongoDBRiverDefinition22.isStoreStatistics();
        com.mongodb.BasicDBObject basicDBObject29 = mongoDBRiverDefinition22.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder10.mongoCollectionFilter(basicDBObject29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder10.mongoUseSSL(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(basicDBObject29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder20.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition21);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.script("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.skipInitialImport(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoDb("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.riverIndexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoClientOptions(mongoClientOptions22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.mongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoAdminUser("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoClientOptions(mongoClientOptions33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoClientOptions(mongoClientOptions41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder42.build();
        java.lang.String str44 = mongoDBRiverDefinition43.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions45 = mongoDBRiverDefinition43.getMongoClientOptions();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions47 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str48 = mongoDBRiverDefinition43.getScript();
        com.mongodb.BasicDBObject basicDBObject49 = mongoDBRiverDefinition43.getMongoOplogFilter();
        java.lang.String str50 = mongoDBRiverDefinition43.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition43.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder31.mongoCollectionFilter(basicDBObject51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder20.mongoOplogFilter(basicDBObject51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder20.connectTimeout(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(mongoClientOptions47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(basicDBObject49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(basicDBObject51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoLocalPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoAdminPassword("null.null");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSSLVerifyCertificate(false);
        org.bson.types.Binary binary13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.initialTimestamp(binary13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        com.mongodb.MongoClientOptions mongoClientOptions10 = mongoDBRiverDefinition9.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition9.getScript();
        java.lang.String str14 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str15 = mongoDBRiverDefinition9.getRiverName();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition9.getParentTypes();
        java.lang.String str17 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str18 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = mongoDBRiverDefinition9.getMongoServers();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition9.getIncludeFields();
        int int21 = mongoDBRiverDefinition9.getThrottleSize();
        boolean boolean22 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        boolean boolean23 = mongoDBRiverDefinition9.isMongoGridFS();
        boolean boolean24 = mongoDBRiverDefinition9.isStoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "bulk_size" + "'", str17, "bulk_size");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(serverAddressList19);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongoDBRiverDefinition5.getMongoServers();
        java.lang.Class<?> wildcardClass9 = mongoDBRiverDefinition5.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null.null" + "'", str6, "null.null");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition11.getStatisticsTypeName();
        boolean boolean14 = mongoDBRiverDefinition11.isImportAllCollections();
        java.lang.String str15 = mongoDBRiverDefinition11.getRiverIndexName();
        boolean boolean16 = mongoDBRiverDefinition11.isMongoGridFS();
        java.lang.String str17 = mongoDBRiverDefinition11.getIndexName();
        int int18 = mongoDBRiverDefinition11.getConnectTimeout();
        java.lang.String str19 = mongoDBRiverDefinition11.getMongoAdminUser();
        boolean boolean20 = mongoDBRiverDefinition11.isAdvancedTransformation();
        java.lang.String str21 = mongoDBRiverDefinition11.getIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition11.getMongoClientOptions();
        boolean boolean14 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition11.getMongoClientOptions();
        int int16 = mongoDBRiverDefinition11.getThrottleSize();
        java.lang.String str17 = mongoDBRiverDefinition11.getMongoAdminUser();
        java.lang.String str18 = mongoDBRiverDefinition11.getTypeName();
        java.lang.String str19 = mongoDBRiverDefinition11.getMongoOplogNamespace();
        boolean boolean20 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        int int21 = mongoDBRiverDefinition11.getSocketTimeout();
        boolean boolean22 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        java.lang.String str23 = mongoDBRiverDefinition11.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null.null" + "'", str19, "null.null");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.includeCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.script("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoCollectionFilter(basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.riverIndexName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoAdminPassword("null.null");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoClientOptions(mongoClientOptions35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder38.indexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder38.mongoCollection("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions52 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoClientOptions(mongoClientOptions52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder55.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.connectTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.indexName("hi!");
        java.lang.String[] strArray77 = new java.lang.String[] { "disable_index_refresh", "collection", "host", "user", "script_type", "socket_timeout", "include_fields", "bulk", "connect_timeout", "actions", "collection", "connect_timeout", "type" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder61.excludeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder48.includeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder33.excludeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder12.includeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder12.statisticsIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder85.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder87.throttleSize((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder87.typeName("options");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder91);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        com.mongodb.MongoClientOptions mongoClientOptions10 = mongoDBRiverDefinition9.getMongoClientOptions();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition9.getMongoClientOptions();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition9.getMongoClientOptions();
        boolean boolean14 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        java.lang.String str15 = mongoDBRiverDefinition9.getScript();
        boolean boolean16 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null.null" + "'", str17, "null.null");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.mongoLocalPassword("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder12.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder12.riverIndexName("size");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoClientOptions(mongoClientOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoClientOptions(mongoClientOptions16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.socketTimeout((int) 'a');
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory22.newScript(strMap23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory22.newScript(strMap25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoClientOptions(mongoClientOptions28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoClientOptions(mongoClientOptions36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition38 = builder37.build();
        java.lang.String str39 = mongoDBRiverDefinition38.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions40 = mongoDBRiverDefinition38.getMongoClientOptions();
        boolean boolean41 = mongoDBRiverDefinition38.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions42 = mongoDBRiverDefinition38.getMongoClientOptions();
        java.lang.String str43 = mongoDBRiverDefinition38.getScript();
        com.mongodb.BasicDBObject basicDBObject44 = mongoDBRiverDefinition38.getMongoOplogFilter();
        java.lang.String str45 = mongoDBRiverDefinition38.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject46 = mongoDBRiverDefinition38.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript47 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.mongoCollectionFilter(basicDBObject46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder8.mongoOplogFilter(basicDBObject46);
        org.elasticsearch.river.RiverSettings riverSettings50 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject46);
        org.elasticsearch.script.ScriptService scriptService51 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("import_all_collections", "disable_index_refresh", riverSettings50, scriptService51);
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = riverSettings50.settings();
        org.elasticsearch.river.RiverSettings riverSettings54 = new org.elasticsearch.river.RiverSettings(settings0, strMap53);
        org.elasticsearch.common.settings.Settings settings55 = riverSettings54.globalSettings();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(executableScript24);
        org.junit.Assert.assertNotNull(executableScript26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(mongoClientOptions42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(basicDBObject44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(basicDBObject46);
        org.junit.Assert.assertNotNull(executableScript47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(settings55);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getMongoDb();
        boolean boolean13 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        int int14 = mongoDBRiverDefinition11.getConnectTimeout();
        boolean boolean15 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        boolean boolean16 = mongoDBRiverDefinition11.isMongoSSLVerifyCertificate();
        java.lang.String str17 = mongoDBRiverDefinition11.getScriptType();
        int int18 = mongoDBRiverDefinition11.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoAdminUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.connectTimeout((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.throttleSize((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoClientOptions(mongoClientOptions23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.socketTimeout((int) (byte) 100);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript31 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj33 = docScoreSearchScript31.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript31.setNextScore((float) 1);
        docScoreSearchScript31.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoClientOptions(mongoClientOptions40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder41.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.typeName("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.indexName("host");
        docScoreSearchScript31.setNextVar("drop_collection", (java.lang.Object) builder47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoClientOptions(mongoClientOptions54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject58 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.mongoCollectionFilter(basicDBObject58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray71 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder63.includeFields((java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder47.includeFields((java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder28.parentTypes((java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder17.parentTypes((java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder2.includeFields((java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder78.skipInitialImport(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.connectTimeout((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.socketTimeout((int) (byte) 100);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript20 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj22 = docScoreSearchScript20.unwrap((java.lang.Object) "hi!");
        docScoreSearchScript20.setNextScore((float) 1);
        docScoreSearchScript20.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoClientOptions(mongoClientOptions29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.connectTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.typeName("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.indexName("host");
        docScoreSearchScript20.setNextVar("drop_collection", (java.lang.Object) builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoClientOptions(mongoClientOptions43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject47 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder42.mongoCollectionFilter(basicDBObject47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder42.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.statisticsTypeName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoSSLVerifyCertificate(false);
        java.lang.String[] strArray60 = new java.lang.String[] { "collection", "admin", "store_statistics", "include_fields", "script" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder52.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder36.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder17.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder6.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder6.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions70 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoClientOptions(mongoClientOptions70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder69.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoAdminUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.statisticsIndexName("flush_interval");
        com.mongodb.MongoClientOptions mongoClientOptions78 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.mongoClientOptions(mongoClientOptions78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions81 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder80.mongoClientOptions(mongoClientOptions81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder80.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject85 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder80.mongoCollectionFilter(basicDBObject85);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder80.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition89 = builder88.build();
        boolean boolean90 = mongoDBRiverDefinition89.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList91 = mongoDBRiverDefinition89.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder77.mongoServers(serverAddressList91);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder93 = builder6.mongoServers(serverAddressList91);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder95 = builder93.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder97 = builder95.statisticsIndexName("bulk");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(serverAddressList91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder97);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.typeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.typeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.socketTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.socketTimeout(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean14 = mongoDBRiverDefinition9.isAdvancedTransformation();
        boolean boolean15 = mongoDBRiverDefinition9.isSkipInitialImport();
        boolean boolean16 = mongoDBRiverDefinition9.isMongoUseSSL();
        int int17 = mongoDBRiverDefinition9.getConnectTimeout();
        boolean boolean18 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition9.getExcludeFields();
        java.lang.String str20 = mongoDBRiverDefinition9.getScriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory4.newScript(strMap5);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) docScoreNativeScriptFactory4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoClientOptions(mongoClientOptions10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoClientOptions(mongoClientOptions18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = builder19.build();
        java.lang.String str21 = mongoDBRiverDefinition20.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions22 = mongoDBRiverDefinition20.getMongoClientOptions();
        boolean boolean23 = mongoDBRiverDefinition20.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions24 = mongoDBRiverDefinition20.getMongoClientOptions();
        java.lang.String str25 = mongoDBRiverDefinition20.getScript();
        com.mongodb.BasicDBObject basicDBObject26 = mongoDBRiverDefinition20.getMongoOplogFilter();
        java.lang.String str27 = mongoDBRiverDefinition20.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition20.getMongoCollectionFilter();
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoClientOptions(mongoClientOptions31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoClientOptions(mongoClientOptions39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = builder40.build();
        java.lang.String str42 = mongoDBRiverDefinition41.getMongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions43 = mongoDBRiverDefinition41.getMongoClientOptions();
        boolean boolean44 = mongoDBRiverDefinition41.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions45 = mongoDBRiverDefinition41.getMongoClientOptions();
        int int46 = mongoDBRiverDefinition41.getThrottleSize();
        java.lang.String str47 = mongoDBRiverDefinition41.getMongoAdminUser();
        java.lang.String str48 = mongoDBRiverDefinition41.getTypeName();
        java.lang.String str49 = mongoDBRiverDefinition41.getMongoOplogNamespace();
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) str49);
        // The following exception was thrown during execution in test generation
        try {
            float float51 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(mongoClientOptions24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(basicDBObject26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "null.null" + "'", str49, "null.null");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "null.null" + "'", obj50, "null.null");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.importAllCollections(false);
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.indexName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        boolean boolean10 = mongoDBRiverDefinition9.isStoreStatistics();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition9.getMongoServers();
        boolean boolean12 = mongoDBRiverDefinition9.isDropCollection();
        java.lang.String str13 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean14 = mongoDBRiverDefinition9.isMongoUseSSL();
        boolean boolean15 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        boolean boolean16 = mongoDBRiverDefinition9.isDropCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.typeName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.typeName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoAdminPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.connectTimeout(1);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoAdminUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoClientOptions(mongoClientOptions26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoClientOptions(mongoClientOptions34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder35.build();
        java.lang.String str37 = mongoDBRiverDefinition36.getMongoAdminPassword();
        boolean boolean38 = mongoDBRiverDefinition36.isMongoSecondaryReadPreference();
        java.lang.String str39 = mongoDBRiverDefinition36.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition36.getParentTypes();
        boolean boolean41 = mongoDBRiverDefinition36.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject42 = mongoDBRiverDefinition36.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder22.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder10.mongoCollectionFilter(basicDBObject42);
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoClientOptions(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(strSet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoClientOptions(mongoClientOptions4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder13.build();
        java.lang.String str15 = mongoDBRiverDefinition14.getMongoDb();
        java.lang.String str16 = mongoDBRiverDefinition14.getStatisticsTypeName();
        boolean boolean17 = mongoDBRiverDefinition14.isImportAllCollections();
        java.lang.String str18 = mongoDBRiverDefinition14.getRiverIndexName();
        boolean boolean19 = mongoDBRiverDefinition14.isMongoGridFS();
        boolean boolean20 = mongoDBRiverDefinition14.isMongoGridFS();
        java.lang.String str21 = mongoDBRiverDefinition14.getMongoLocalUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList22 = mongoDBRiverDefinition14.getMongoServers();
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoClientOptions(mongoClientOptions26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.importAllCollections(false);
        com.mongodb.ServerAddress[] serverAddressArray30 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList31 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList31, serverAddressArray30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder25.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder25.mongoCollection("local");
        docScoreSearchScript0.setNextVar("include_collection", (java.lang.Object) builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoClientOptions(mongoClientOptions38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.skipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoClientOptions(mongoClientOptions46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder47.build();
        java.lang.String str49 = mongoDBRiverDefinition48.getMongoDb();
        java.lang.String str50 = mongoDBRiverDefinition48.getScript();
        java.lang.String str51 = mongoDBRiverDefinition48.getIncludeCollection();
        java.util.Set<java.lang.String> strSet52 = mongoDBRiverDefinition48.getIncludeFields();
        int int53 = mongoDBRiverDefinition48.getThrottleSize();
        boolean boolean54 = mongoDBRiverDefinition48.isStoreStatistics();
        com.mongodb.BasicDBObject basicDBObject55 = mongoDBRiverDefinition48.getMongoCollectionFilter();
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "hi!" + "'", obj2, "hi!");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(serverAddressList22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(serverAddressArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(strSet52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(basicDBObject55);
    }
}

