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
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isMongoUseSSL();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition7.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        java.lang.String str13 = mongoDBRiverDefinition7.getRiverName();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition7.getIncludeFields();
        java.lang.String str15 = mongoDBRiverDefinition7.getMongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9502");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "options");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0d);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) 35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoClientOptions(mongoClientOptions10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder13.build();
        boolean boolean17 = mongoDBRiverDefinition16.isDisableIndexRefresh();
        java.lang.String str18 = mongoDBRiverDefinition16.getIndexName();
        int int19 = mongoDBRiverDefinition16.getSocketTimeout();
        boolean boolean20 = mongoDBRiverDefinition16.isMongoSecondaryReadPreference();
        java.util.List<com.mongodb.ServerAddress> serverAddressList21 = mongoDBRiverDefinition16.getMongoServers();
        java.lang.String str22 = mongoDBRiverDefinition16.getMongoAdminPassword();
        java.lang.String str23 = mongoDBRiverDefinition16.getStatisticsTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList24 = mongoDBRiverDefinition16.getMongoServers();
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoClientOptions(mongoClientOptions27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder30.build();
        boolean boolean34 = mongoDBRiverDefinition33.isDisableIndexRefresh();
        int int35 = mongoDBRiverDefinition33.getThrottleSize();
        boolean boolean36 = mongoDBRiverDefinition33.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition33.getIncludeFields();
        boolean boolean38 = mongoDBRiverDefinition33.isMongoSecondaryReadPreference();
        java.lang.String str39 = mongoDBRiverDefinition33.getMongoLocalPassword();
        java.lang.String str40 = mongoDBRiverDefinition33.getMongoLocalPassword();
        java.lang.Object obj41 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoClientOptions(mongoClientOptions46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = builder49.build();
        boolean boolean53 = mongoDBRiverDefinition52.isDisableIndexRefresh();
        int int54 = mongoDBRiverDefinition52.getThrottleSize();
        java.lang.String str55 = mongoDBRiverDefinition52.getMongoCollection();
        boolean boolean56 = mongoDBRiverDefinition52.isMongoGridFS();
        boolean boolean57 = mongoDBRiverDefinition52.isStoreStatistics();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp58 = mongoDBRiverDefinition52.getInitialTimestamp();
        java.lang.String str59 = mongoDBRiverDefinition52.getIndexName();
        boolean boolean60 = mongoDBRiverDefinition52.isAdvancedTransformation();
        java.lang.String str61 = mongoDBRiverDefinition52.getMongoCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList62 = mongoDBRiverDefinition52.getMongoServers();
        boolean boolean63 = mongoDBRiverDefinition52.isStoreStatistics();
        docScoreSearchScript0.setNextVar("actions.actions", (java.lang.Object) mongoDBRiverDefinition52);
        java.lang.String str65 = mongoDBRiverDefinition52.getStatisticsIndexName();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "options" + "'", obj2, "options");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serverAddressList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(serverAddressList24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(wildcardTimestamp58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(serverAddressList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9503");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition7.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition7.getMongoServers();
        java.lang.String str13 = mongoDBRiverDefinition7.getStatisticsIndexName();
        java.lang.String str14 = mongoDBRiverDefinition7.getRiverName();
        boolean boolean15 = mongoDBRiverDefinition7.isStoreStatistics();
        java.lang.String str16 = mongoDBRiverDefinition7.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9504");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition7.getIncludeFields();
        boolean boolean9 = mongoDBRiverDefinition7.isImportAllCollections();
        java.lang.String str10 = mongoDBRiverDefinition7.getIncludeCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition7.getMongoServers();
        boolean boolean12 = mongoDBRiverDefinition7.isMongoSecondaryReadPreference();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition7.getParentTypes();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition7.getIncludeFields();
        int int15 = mongoDBRiverDefinition7.getSocketTimeout();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition7.getExcludeFields();
        int int17 = mongoDBRiverDefinition7.getSocketTimeout();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition7.getParentTypes();
        boolean boolean19 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9505");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoAdminUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.statisticsTypeName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder22.build();
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
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition23);
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9506");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition7.getIncludeFields();
        java.lang.Boolean boolean12 = mongoDBRiverDefinition7.isMongos();
        java.lang.String str13 = mongoDBRiverDefinition7.getRiverIndexName();
        boolean boolean14 = mongoDBRiverDefinition7.isSkipInitialImport();
        java.lang.String str15 = mongoDBRiverDefinition7.getIndexName();
        java.lang.String str16 = mongoDBRiverDefinition7.getMongoLocalPassword();
        java.util.Set<java.lang.String> strSet17 = mongoDBRiverDefinition7.getExcludeFields();
        boolean boolean18 = mongoDBRiverDefinition7.isSkipInitialImport();
        com.mongodb.MongoClientOptions mongoClientOptions19 = mongoDBRiverDefinition7.getMongoClientOptions();
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition7.getMongoServers();
        java.lang.String str21 = mongoDBRiverDefinition7.getMongoAdminUser();
        boolean boolean22 = mongoDBRiverDefinition7.isStoreStatistics();
        java.lang.String str23 = mongoDBRiverDefinition7.getScriptType();
        java.lang.String str24 = mongoDBRiverDefinition7.getIndexName();
        com.mongodb.BasicDBObject basicDBObject25 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(basicDBObject25);
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9507");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.statisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoLocalUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.scriptType("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.socketTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoSecondaryReadPreference(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9508");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition7.getIncludeFields();
        boolean boolean9 = mongoDBRiverDefinition7.isImportAllCollections();
        java.lang.String str10 = mongoDBRiverDefinition7.getIncludeCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition7.getMongoServers();
        java.lang.String str12 = mongoDBRiverDefinition7.getMongoCollection();
        java.lang.String str13 = mongoDBRiverDefinition7.getMongoAdminPassword();
        boolean boolean14 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition7.getMongoServers();
        boolean boolean16 = mongoDBRiverDefinition7.isStoreStatistics();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition7.getMongoOplogFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition7.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition7.getIncludeFields();
        java.lang.String str20 = mongoDBRiverDefinition7.getMongoLocalPassword();
        java.lang.String str21 = mongoDBRiverDefinition7.getMongoCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serverAddressList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(basicDBObject17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9509");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isMongoUseSSL();
        boolean boolean11 = mongoDBRiverDefinition7.isAdvancedTransformation();
        java.lang.Boolean boolean12 = mongoDBRiverDefinition7.isMongos();
        int int13 = mongoDBRiverDefinition7.getThrottleSize();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition7.getMongoOplogFilter();
        java.lang.String str15 = mongoDBRiverDefinition7.getMongoAdminUser();
        java.lang.String str16 = mongoDBRiverDefinition7.getIncludeCollection();
        java.lang.String str17 = mongoDBRiverDefinition7.getScriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9510");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.riverIndexName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.indexName("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.statisticsTypeName("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.riverIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.includeCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder25.statisticsIndexName("flush_interval.flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder25.mongoCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.riverIndexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoClientOptions(mongoClientOptions37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder40.build();
        java.util.Set<java.lang.String> strSet44 = mongoDBRiverDefinition43.getIncludeFields();
        boolean boolean45 = mongoDBRiverDefinition43.isImportAllCollections();
        java.lang.String str46 = mongoDBRiverDefinition43.getIncludeCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList47 = mongoDBRiverDefinition43.getMongoServers();
        java.lang.String str48 = mongoDBRiverDefinition43.getMongoCollection();
        java.lang.String str49 = mongoDBRiverDefinition43.getMongoAdminPassword();
        boolean boolean50 = mongoDBRiverDefinition43.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList51 = mongoDBRiverDefinition43.getMongoServers();
        int int52 = mongoDBRiverDefinition43.getThrottleSize();
        java.util.List<com.mongodb.ServerAddress> serverAddressList53 = mongoDBRiverDefinition43.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder33.mongoServers(serverAddressList53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder12.mongoServers(serverAddressList53);
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
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition43);
        org.junit.Assert.assertNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(serverAddressList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(serverAddressList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(serverAddressList53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9511");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.statisticsTypeName("admin");
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoClientOptions(mongoClientOptions21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder24.build();
        boolean boolean28 = mongoDBRiverDefinition27.isDisableIndexRefresh();
        java.lang.String str29 = mongoDBRiverDefinition27.getIndexName();
        java.lang.Boolean boolean30 = mongoDBRiverDefinition27.isMongos();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition27.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder15.mongoCollectionFilter(basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings35 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings38 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings39 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(basicDBObject31);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9512");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoClientOptions(mongoClientOptions3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        boolean boolean10 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        int int11 = mongoDBRiverDefinition9.getThrottleSize();
        boolean boolean12 = mongoDBRiverDefinition9.isMongoUseSSL();
        boolean boolean13 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.Boolean boolean14 = mongoDBRiverDefinition9.isMongos();
        java.lang.String str15 = mongoDBRiverDefinition9.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.RiverSettings riverSettings18 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(basicDBObject16);
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9513");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.connectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.riverIndexName("servers");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9514");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoLocalUser("sandbox");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.indexName("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.statisticsTypeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoAdminPassword("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.indexName("script_type");
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoDb("sandbox");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsIndexName("name");
        java.lang.String[] strArray31 = new java.lang.String[] { "bulk", "host", "sandbox", "script", "exclude_fields.exclude_fields", "drop_collection" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder22.parentTypes((java.util.Set<java.lang.String>) strSet32);
        org.bson.types.BSONTimestamp bSONTimestamp35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.initialTimestamp(bSONTimestamp35);
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9515");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition7.getIndexName();
        boolean boolean10 = mongoDBRiverDefinition7.isMongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition7.isSkipInitialImport();
        java.lang.String str12 = mongoDBRiverDefinition7.getIndexName();
        boolean boolean13 = mongoDBRiverDefinition7.isMongoUseSSL();
        java.lang.String str14 = mongoDBRiverDefinition7.getMongoAdminPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9516");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getConnectTimeout();
        int int10 = mongoDBRiverDefinition7.getSocketTimeout();
        boolean boolean11 = mongoDBRiverDefinition7.isMongoGridFS();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition7.getIncludeFields();
        int int13 = mongoDBRiverDefinition7.getConnectTimeout();
        java.lang.String str14 = mongoDBRiverDefinition7.getMongoDb();
        boolean boolean15 = mongoDBRiverDefinition7.isStoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9517");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition7.getIncludeFields();
        boolean boolean9 = mongoDBRiverDefinition7.isImportAllCollections();
        java.lang.String str10 = mongoDBRiverDefinition7.getIncludeCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition7.getMongoServers();
        boolean boolean12 = mongoDBRiverDefinition7.isMongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        java.lang.String str14 = mongoDBRiverDefinition7.getRiverName();
        java.lang.String str15 = mongoDBRiverDefinition7.getMongoCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9518");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.script("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.storeStatistics(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9519");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.script("gridfs");
        com.mongodb.ServerAddress[] serverAddressArray13 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList14 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList14, serverAddressArray13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoClientOptions(mongoClientOptions18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.riverIndexName("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoClientOptions(mongoClientOptions31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.mongoLocalUser("sandbox");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.typeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoClientOptions(mongoClientOptions38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.indexName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.script("gridfs");
        com.mongodb.ServerAddress[] serverAddressArray50 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList51 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList51, serverAddressArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder45.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder36.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder29.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder16.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder16.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder16.riverName(".scripts");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder16.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions64 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoClientOptions(mongoClientOptions64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.mongoLocalUser("sandbox");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.socketTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder63.mongoLocalPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.statisticsTypeName("hi!");
        java.lang.String[] strArray81 = new java.lang.String[] { "disable_index_refresh", "user", "secondary_read_preference", "bulk_size" };
        java.util.LinkedHashSet<java.lang.String> strSet82 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet82, strArray81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder74.includeFields((java.util.Set<java.lang.String>) strSet82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder71.excludeFields((java.util.Set<java.lang.String>) strSet82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder62.excludeFields((java.util.Set<java.lang.String>) strSet82);
        com.mongodb.MongoClientOptions mongoClientOptions87 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder86.mongoClientOptions(mongoClientOptions87);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(serverAddressArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(serverAddressArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9520");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalUser("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.script("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoClientOptions(mongoClientOptions18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.importAllCollections(true);
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoClientOptions(mongoClientOptions26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoLocalUser("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoClientOptions(mongoClientOptions35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.mongoLocalUser("sandbox");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.socketTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.mongoDb("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder34.indexName("disable_index_refresh");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript45 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions48 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoClientOptions(mongoClientOptions48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder55.isMongos((java.lang.Boolean) false);
        java.lang.String[] strArray83 = new java.lang.String[] { "filter", "include_collection", "admin", "hi!", "include_fields", "sandbox", "ssl_verify_certificate", "host", "initial_timestamp", "", "hi!", "db", "exclude_fields", "servers", "servers", "actions", "local", "initial_timestamp", "script_type", "collection", "skip_initial_import", "concurrent_bulk_requests", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder59.includeFields((java.util.Set<java.lang.String>) strSet84);
        docScoreSearchScript45.setNextVar("local", (java.lang.Object) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder34.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder29.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet84);
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
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9521");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        java.lang.String str10 = mongoDBRiverDefinition7.getMongoCollection();
        java.lang.String str11 = mongoDBRiverDefinition7.getStatisticsIndexName();
        int int12 = mongoDBRiverDefinition7.getThrottleSize();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition7.getExcludeFields();
        java.lang.String str14 = mongoDBRiverDefinition7.getMongoAdminPassword();
        boolean boolean15 = mongoDBRiverDefinition7.isMongoSSLVerifyCertificate();
        java.lang.String str16 = mongoDBRiverDefinition7.getStatisticsTypeName();
        com.mongodb.MongoClientOptions mongoClientOptions17 = mongoDBRiverDefinition7.getMongoClientOptions();
        boolean boolean18 = mongoDBRiverDefinition7.isAdvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9522");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.statisticsTypeName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.riverIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.riverIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.throttleSize((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.skipInitialImport(false);
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
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9523");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition7.getIndexName();
        java.lang.Boolean boolean10 = mongoDBRiverDefinition7.isMongos();
        java.lang.String str11 = mongoDBRiverDefinition7.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition7.getMongoLocalUser();
        java.lang.String str13 = mongoDBRiverDefinition7.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition7.getMongoServers();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition7.getInitialTimestamp();
        boolean boolean16 = mongoDBRiverDefinition7.isAdvancedTransformation();
        int int17 = mongoDBRiverDefinition7.getSocketTimeout();
        int int18 = mongoDBRiverDefinition7.getSocketTimeout();
        java.lang.String str19 = mongoDBRiverDefinition7.getStatisticsIndexName();
        java.lang.String str20 = mongoDBRiverDefinition7.getMongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9524");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoLocalUser("sandbox");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoClientOptions(mongoClientOptions11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.isMongos((java.lang.Boolean) false);
        java.lang.String[] strArray46 = new java.lang.String[] { "filter", "include_collection", "admin", "hi!", "include_fields", "sandbox", "ssl_verify_certificate", "host", "initial_timestamp", "", "hi!", "db", "exclude_fields", "servers", "servers", "actions", "local", "initial_timestamp", "script_type", "collection", "skip_initial_import", "concurrent_bulk_requests", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder22.includeFields((java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder5.includeFields((java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder2.includeFields((java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions53 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoClientOptions(mongoClientOptions53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.mongoLocalUser("sandbox");
        com.mongodb.BasicDBObject basicDBObject57 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder52.mongoOplogFilter(basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder52.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions62 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoClientOptions(mongoClientOptions62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition68 = builder65.build();
        java.util.Set<java.lang.String> strSet69 = mongoDBRiverDefinition68.getIncludeFields();
        boolean boolean70 = mongoDBRiverDefinition68.isImportAllCollections();
        java.lang.String str71 = mongoDBRiverDefinition68.getIncludeCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList72 = mongoDBRiverDefinition68.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder52.mongoServers(serverAddressList72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder51.mongoServers(serverAddressList72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.statisticsTypeName("hi!");
        java.lang.String[] strArray82 = new java.lang.String[] { "disable_index_refresh", "user", "secondary_read_preference", "bulk_size" };
        java.util.LinkedHashSet<java.lang.String> strSet83 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet83, strArray82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder75.includeFields((java.util.Set<java.lang.String>) strSet83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder51.excludeFields((java.util.Set<java.lang.String>) strSet83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder51.script("filter");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition68);
        org.junit.Assert.assertNull(strSet69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(serverAddressList72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9525");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition7.getIndexName();
        boolean boolean10 = mongoDBRiverDefinition7.isMongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition7.isSkipInitialImport();
        java.lang.String str12 = mongoDBRiverDefinition7.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition7.getIndexName();
        java.lang.String str14 = mongoDBRiverDefinition7.getRiverName();
        boolean boolean15 = mongoDBRiverDefinition7.isImportAllCollections();
        java.lang.String str16 = mongoDBRiverDefinition7.getTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9526");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoClientOptions(mongoClientOptions4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.mongoLocalUser("sandbox");
        com.mongodb.BasicDBObject basicDBObject8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.mongoOplogFilter(basicDBObject8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoClientOptions(mongoClientOptions13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder16.build();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition19.getIncludeFields();
        boolean boolean21 = mongoDBRiverDefinition19.isImportAllCollections();
        java.lang.String str22 = mongoDBRiverDefinition19.getIncludeCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = mongoDBRiverDefinition19.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder3.mongoServers(serverAddressList23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder3.mongoAdminUser("parent_types");
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray48 = new java.lang.String[] { "parent_types", "name", "host", "servers", "skip_initial_import", "disable_index_refresh", "concurrent_bulk_requests", "options", "local", "include_collection", "disable_index_refresh", "exclude_fields", "skip_initial_import", "name", "collection", "exclude_fields", "secondary_read_preference", "include_fields", "advanced_transformation" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder28.excludeFields((java.util.Set<java.lang.String>) strSet49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder28.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions57 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoClientOptions(mongoClientOptions57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder60.build();
        boolean boolean64 = mongoDBRiverDefinition63.isDisableIndexRefresh();
        int int65 = mongoDBRiverDefinition63.getThrottleSize();
        boolean boolean66 = mongoDBRiverDefinition63.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet67 = mongoDBRiverDefinition63.getIncludeFields();
        java.lang.Boolean boolean68 = mongoDBRiverDefinition63.isMongos();
        java.lang.String str69 = mongoDBRiverDefinition63.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject70 = mongoDBRiverDefinition63.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder55.mongoOplogFilter(basicDBObject70);
        org.elasticsearch.river.RiverSettings riverSettings72 = new org.elasticsearch.river.RiverSettings(settings27, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder3.mongoOplogFilter(basicDBObject70);
        org.elasticsearch.river.RiverSettings riverSettings74 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.script.ScriptService scriptService75 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition76 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "", riverSettings74, scriptService75);
        java.lang.String str77 = mongoDBRiverDefinition76.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(serverAddressList23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(strSet67);
        org.junit.Assert.assertNull(boolean68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(basicDBObject70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9527");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition7.getIndexName();
        java.lang.Boolean boolean10 = mongoDBRiverDefinition7.isMongos();
        java.lang.String str11 = mongoDBRiverDefinition7.getIndexName();
        java.lang.Boolean boolean12 = mongoDBRiverDefinition7.isMongos();
        boolean boolean13 = mongoDBRiverDefinition7.isMongoSecondaryReadPreference();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition7.getMongoServers();
        boolean boolean15 = mongoDBRiverDefinition7.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions16 = mongoDBRiverDefinition7.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        java.lang.String str18 = mongoDBRiverDefinition7.getMongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9528");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoLocalUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.connectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoClientOptions(mongoClientOptions10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder13.build();
        boolean boolean17 = mongoDBRiverDefinition16.isDisableIndexRefresh();
        java.lang.String str18 = mongoDBRiverDefinition16.getIndexName();
        java.lang.Boolean boolean19 = mongoDBRiverDefinition16.isMongos();
        java.lang.String str20 = mongoDBRiverDefinition16.getIndexName();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition16.getMongoOplogFilter();
        java.lang.String str22 = mongoDBRiverDefinition16.getMongoAdminPassword();
        java.lang.String str23 = mongoDBRiverDefinition16.getIndexName();
        int int24 = mongoDBRiverDefinition16.getConnectTimeout();
        com.mongodb.MongoClientOptions mongoClientOptions25 = mongoDBRiverDefinition16.getMongoClientOptions();
        boolean boolean26 = mongoDBRiverDefinition16.isAdvancedTransformation();
        java.util.List<com.mongodb.ServerAddress> serverAddressList27 = mongoDBRiverDefinition16.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder2.mongoServers(serverAddressList27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("sandbox");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.mongoDb("script.default_lang");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(basicDBObject21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serverAddressList27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9529");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoLocalUser("sandbox");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoOplogFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.riverIndexName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.riverIndexName("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.statisticsTypeName("is_mongos");
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
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9530");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoLocalUser("sandbox");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.socketTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoLocalPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoClientOptions(mongoClientOptions10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder13.build();
        boolean boolean17 = mongoDBRiverDefinition16.isDisableIndexRefresh();
        java.lang.String str18 = mongoDBRiverDefinition16.getIndexName();
        int int19 = mongoDBRiverDefinition16.getSocketTimeout();
        boolean boolean20 = mongoDBRiverDefinition16.isMongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = mongoDBRiverDefinition16.getInitialTimestamp();
        boolean boolean22 = mongoDBRiverDefinition16.isAdvancedTransformation();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = mongoDBRiverDefinition16.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.mongoServers(serverAddressList23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder0.mongoCollection("sandbox");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(serverAddressList23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9531");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "options");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0d);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = docScoreSearchScript0.unwrap(obj7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoClientOptions(mongoClientOptions11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = builder14.build();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition17.getInitialTimestamp();
        java.lang.String str19 = mongoDBRiverDefinition17.getMongoDb();
        java.lang.String str20 = mongoDBRiverDefinition17.getMongoAdminUser();
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests", (java.lang.Object) str20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder27.build();
        boolean boolean31 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        int int32 = mongoDBRiverDefinition30.getThrottleSize();
        boolean boolean33 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet34 = mongoDBRiverDefinition30.getIncludeFields();
        boolean boolean35 = mongoDBRiverDefinition30.isMongoSecondaryReadPreference();
        java.lang.String str36 = mongoDBRiverDefinition30.getMongoLocalPassword();
        java.lang.String str37 = mongoDBRiverDefinition30.getMongoAdminUser();
        java.util.Set<java.lang.String> strSet38 = mongoDBRiverDefinition30.getIncludeFields();
        boolean boolean39 = mongoDBRiverDefinition30.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject40 = mongoDBRiverDefinition30.getMongoCollectionFilter();
        docScoreSearchScript0.setNextVar("is_mongos", (java.lang.Object) basicDBObject40);
        org.elasticsearch.common.settings.Settings settings42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.statisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoClientOptions(mongoClientOptions51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions58 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoClientOptions(mongoClientOptions58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.statisticsTypeName("disable_index_refresh");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory64 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = null;
        org.elasticsearch.script.ExecutableScript executableScript66 = docScoreNativeScriptFactory64.newScript(strMap65);
        org.elasticsearch.common.settings.Settings settings67 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions69 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoClientOptions(mongoClientOptions69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder68.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition75 = builder72.build();
        boolean boolean76 = mongoDBRiverDefinition75.isDisableIndexRefresh();
        int int77 = mongoDBRiverDefinition75.getThrottleSize();
        boolean boolean78 = mongoDBRiverDefinition75.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet79 = mongoDBRiverDefinition75.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList80 = mongoDBRiverDefinition75.getMongoServers();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition75.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings82 = new org.elasticsearch.river.RiverSettings(settings67, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        org.elasticsearch.script.ExecutableScript executableScript83 = docScoreNativeScriptFactory64.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder61.mongoCollectionFilter(basicDBObject81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder54.mongoCollectionFilter(basicDBObject81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder49.mongoOplogFilter(basicDBObject81);
        org.elasticsearch.river.RiverSettings riverSettings87 = new org.elasticsearch.river.RiverSettings(settings42, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "options" + "'", obj2, "options");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(basicDBObject40);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(executableScript66);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(strSet79);
        org.junit.Assert.assertNotNull(serverAddressList80);
        org.junit.Assert.assertNotNull(basicDBObject81);
        org.junit.Assert.assertNotNull(executableScript83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9532");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.riverIndexName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder9.build();
        boolean boolean13 = mongoDBRiverDefinition12.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition12.getIndexName();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition12.isMongos();
        java.lang.String str16 = mongoDBRiverDefinition12.getIndexName();
        java.lang.String str17 = mongoDBRiverDefinition12.getMongoLocalUser();
        java.lang.String str18 = mongoDBRiverDefinition12.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = mongoDBRiverDefinition12.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder0.mongoServers(serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.mongoDb("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("script_type");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(serverAddressList19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9533");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.socketTimeout((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.script("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoClientOptions(mongoClientOptions29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.throttleSize(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoClientOptions(mongoClientOptions42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder45.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.statisticsTypeName("admin");
        org.elasticsearch.common.settings.Settings settings54 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions56 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoClientOptions(mongoClientOptions56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder55.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder59.build();
        java.util.Set<java.lang.String> strSet63 = mongoDBRiverDefinition62.getIncludeFields();
        boolean boolean64 = mongoDBRiverDefinition62.isImportAllCollections();
        boolean boolean65 = mongoDBRiverDefinition62.isAdvancedTransformation();
        java.lang.String str66 = mongoDBRiverDefinition62.getScriptType();
        com.mongodb.BasicDBObject basicDBObject67 = mongoDBRiverDefinition62.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings68 = new org.elasticsearch.river.RiverSettings(settings54, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder53.mongoOplogFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder40.mongoOplogFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder27.mongoOplogFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder2.mongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoDb("store_statistics");
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition62);
        org.junit.Assert.assertNull(strSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(basicDBObject67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9534");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isMongoUseSSL();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition7.getMongoClientOptions();
        java.lang.String str12 = mongoDBRiverDefinition7.getStatisticsIndexName();
        boolean boolean13 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition7.getScriptType();
        boolean boolean15 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9535");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        java.lang.String str10 = mongoDBRiverDefinition7.getScriptType();
        java.lang.String str11 = mongoDBRiverDefinition7.getScript();
        java.lang.String str12 = mongoDBRiverDefinition7.getMongoCollection();
        java.lang.String str13 = mongoDBRiverDefinition7.getIndexName();
        java.lang.String str14 = mongoDBRiverDefinition7.getMongoLocalPassword();
        java.lang.String str15 = mongoDBRiverDefinition7.getTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9536");
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoClientOptions(mongoClientOptions8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder11.build();
        boolean boolean15 = mongoDBRiverDefinition14.isDisableIndexRefresh();
        int int16 = mongoDBRiverDefinition14.getThrottleSize();
        boolean boolean17 = mongoDBRiverDefinition14.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition14.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = mongoDBRiverDefinition14.getMongoServers();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition14.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings21 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService scriptService22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("servers", "parent_types", riverSettings21, scriptService22);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = riverSettings21.settings();
        org.elasticsearch.script.ScriptService scriptService25 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk", "parent_types", riverSettings21, scriptService25);
        org.elasticsearch.script.ScriptService scriptService27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("is_mongos", "hi!", riverSettings21, scriptService27);
        java.lang.String str29 = mongoDBRiverDefinition28.getStatisticsIndexName();
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(serverAddressList19);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition26);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9537");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getConnectTimeout();
        java.lang.String str10 = mongoDBRiverDefinition7.getIndexName();
        java.lang.String str11 = mongoDBRiverDefinition7.getRiverIndexName();
        java.lang.String str12 = mongoDBRiverDefinition7.getMongoCollection();
        boolean boolean13 = mongoDBRiverDefinition7.isMongoSSLVerifyCertificate();
        java.lang.String str14 = mongoDBRiverDefinition7.getIndexName();
        java.lang.String str15 = mongoDBRiverDefinition7.getMongoLocalUser();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition7.isMongos();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9538");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) (byte) 100);
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoClientOptions(mongoClientOptions11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = builder14.build();
        boolean boolean18 = mongoDBRiverDefinition17.isDisableIndexRefresh();
        int int19 = mongoDBRiverDefinition17.getThrottleSize();
        boolean boolean20 = mongoDBRiverDefinition17.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList22 = mongoDBRiverDefinition17.getMongoServers();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition17.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings9, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.river.RiverSettings riverSettings25 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings7, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.river.RiverSettings riverSettings27 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.script.ScriptService scriptService28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script.default_lang", "collection", riverSettings27, scriptService28);
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) "script.default_lang");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoClientOptions(mongoClientOptions33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = builder36.build();
        boolean boolean40 = mongoDBRiverDefinition39.isDisableIndexRefresh();
        int int41 = mongoDBRiverDefinition39.getThrottleSize();
        boolean boolean42 = mongoDBRiverDefinition39.isDisableIndexRefresh();
        java.lang.String str43 = mongoDBRiverDefinition39.getIndexName();
        java.lang.String str44 = mongoDBRiverDefinition39.getMongoAdminUser();
        boolean boolean45 = mongoDBRiverDefinition39.isMongoUseSSL();
        java.lang.String str46 = mongoDBRiverDefinition39.getMongoAdminUser();
        com.mongodb.BasicDBObject basicDBObject47 = mongoDBRiverDefinition39.getMongoCollectionFilter();
        docScoreSearchScript0.setNextVar("size", (java.lang.Object) mongoDBRiverDefinition39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoClientOptions(mongoClientOptions51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.statisticsTypeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder54.includeCollection("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.mongoDb("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoSecondaryReadPreference(false);
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) builder64);
        docScoreSearchScript0.setNextScore(100.0f);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext68 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(serverAddressList22);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "script.default_lang" + "'", obj30, "script.default_lang");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9539");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isMongoUseSSL();
        boolean boolean11 = mongoDBRiverDefinition7.isAdvancedTransformation();
        java.lang.Boolean boolean12 = mongoDBRiverDefinition7.isMongos();
        java.lang.String str13 = mongoDBRiverDefinition7.getMongoCollection();
        java.lang.String str14 = mongoDBRiverDefinition7.getScriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9540");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoLocalPassword("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.riverName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.statisticsIndexName("collection");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9541");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.scriptType("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.throttleSize((int) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.skipInitialImport(false);
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
    public void test9542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9542");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str11 = mongoDBRiverDefinition7.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition7.getMongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition7.getMongoServers();
        java.lang.String str14 = mongoDBRiverDefinition7.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test9543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9543");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        boolean boolean11 = mongoDBRiverDefinition7.isSkipInitialImport();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition7.getMongoServers();
        java.lang.String str13 = mongoDBRiverDefinition7.getMongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test9544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9544");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition7.getIndexName();
        java.lang.Boolean boolean10 = mongoDBRiverDefinition7.isMongos();
        java.lang.String str11 = mongoDBRiverDefinition7.getIndexName();
        java.lang.Boolean boolean12 = mongoDBRiverDefinition7.isMongos();
        boolean boolean13 = mongoDBRiverDefinition7.isMongoSecondaryReadPreference();
        boolean boolean14 = mongoDBRiverDefinition7.isMongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition7.getRiverIndexName();
        java.lang.String str16 = mongoDBRiverDefinition7.getTypeName();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        java.lang.String str18 = mongoDBRiverDefinition7.getMongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test9545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9545");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.statisticsIndexName("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.socketTimeout((int) (short) 100);
        com.mongodb.ServerAddress[] serverAddressArray13 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList14 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList14, serverAddressArray13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList14);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(serverAddressArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test9546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9546");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition7.getInitialTimestamp();
        int int9 = mongoDBRiverDefinition7.getConnectTimeout();
        java.lang.String str10 = mongoDBRiverDefinition7.getIncludeCollection();
        java.lang.String str11 = mongoDBRiverDefinition7.getMongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test9547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9547");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoClientOptions(mongoClientOptions3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.statisticsTypeName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.mongoLocalPassword("include_collection");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoClientOptions(mongoClientOptions22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.typeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.mongoLocalUser("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.scriptType("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoClientOptions(mongoClientOptions37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder40.build();
        java.util.Set<java.lang.String> strSet44 = mongoDBRiverDefinition43.getIncludeFields();
        boolean boolean45 = mongoDBRiverDefinition43.isImportAllCollections();
        java.lang.String str46 = mongoDBRiverDefinition43.getIncludeCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList47 = mongoDBRiverDefinition43.getMongoServers();
        boolean boolean48 = mongoDBRiverDefinition43.isMongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject49 = mongoDBRiverDefinition43.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder35.mongoOplogFilter(basicDBObject49);
        org.elasticsearch.river.RiverSettings riverSettings51 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject49);
        org.elasticsearch.river.RiverSettings riverSettings52 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder14.mongoOplogFilter(basicDBObject49);
        org.elasticsearch.river.RiverSettings riverSettings54 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject49);
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = riverSettings54.settings();
        org.elasticsearch.river.RiverSettings riverSettings56 = new org.elasticsearch.river.RiverSettings(settings0, strMap55);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
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
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition43);
        org.junit.Assert.assertNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(serverAddressList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(basicDBObject49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test9548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9548");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        java.lang.String str8 = mongoDBRiverDefinition7.getTypeName();
        boolean boolean9 = mongoDBRiverDefinition7.isImportAllCollections();
        int int10 = mongoDBRiverDefinition7.getThrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test9549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9549");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str11 = mongoDBRiverDefinition7.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition7.getMongoAdminUser();
        java.lang.String str13 = mongoDBRiverDefinition7.getMongoDb();
        java.lang.String str14 = mongoDBRiverDefinition7.getRiverIndexName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition7.getMongoServers();
        int int16 = mongoDBRiverDefinition7.getConnectTimeout();
        boolean boolean17 = mongoDBRiverDefinition7.isStoreStatistics();
        java.lang.String str18 = mongoDBRiverDefinition7.getIncludeCollection();
        java.lang.String str19 = mongoDBRiverDefinition7.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition7.getIncludeFields();
        boolean boolean21 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        boolean boolean22 = mongoDBRiverDefinition7.isMongoSSLVerifyCertificate();
        java.lang.String str23 = mongoDBRiverDefinition7.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(serverAddressList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null.null" + "'", str19, "null.null");
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test9550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9550");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition7.getIncludeFields();
        java.lang.Boolean boolean12 = mongoDBRiverDefinition7.isMongos();
        java.lang.String str13 = mongoDBRiverDefinition7.getRiverIndexName();
        int int14 = mongoDBRiverDefinition7.getSocketTimeout();
        java.lang.String str15 = mongoDBRiverDefinition7.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition7.getMongoOplogFilter();
        int int17 = mongoDBRiverDefinition7.getThrottleSize();
        java.lang.String str18 = mongoDBRiverDefinition7.getStatisticsIndexName();
        java.lang.String str19 = mongoDBRiverDefinition7.getMongoAdminPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(basicDBObject16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test9551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9551");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition7.getIndexName();
        java.lang.Boolean boolean10 = mongoDBRiverDefinition7.isMongos();
        java.lang.String str11 = mongoDBRiverDefinition7.getIndexName();
        java.lang.Boolean boolean12 = mongoDBRiverDefinition7.isMongos();
        int int13 = mongoDBRiverDefinition7.getConnectTimeout();
        java.lang.String str14 = mongoDBRiverDefinition7.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test9552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9552");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoLocalUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoCollection("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder6.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongoDBRiverDefinition7.getMongoServers();
        boolean boolean9 = mongoDBRiverDefinition7.isAdvancedTransformation();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(basicDBObject10);
    }

    @Test
    public void test9553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9553");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "options");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0d);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) 35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray29 = new java.lang.String[] { "parent_types", "name", "host", "servers", "skip_initial_import", "disable_index_refresh", "concurrent_bulk_requests", "options", "local", "include_collection", "disable_index_refresh", "exclude_fields", "skip_initial_import", "name", "collection", "exclude_fields", "secondary_read_preference", "include_fields", "advanced_transformation" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.statisticsIndexName("db");
        java.lang.Object obj35 = docScoreSearchScript0.unwrap((java.lang.Object) "db");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoClientOptions(mongoClientOptions39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = builder42.build();
        java.util.Set<java.lang.String> strSet46 = mongoDBRiverDefinition45.getIncludeFields();
        boolean boolean47 = mongoDBRiverDefinition45.isDropCollection();
        java.lang.String str48 = mongoDBRiverDefinition45.getMongoCollection();
        java.lang.Object obj49 = docScoreSearchScript0.unwrap((java.lang.Object) str48);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "options" + "'", obj2, "options");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "db" + "'", obj35, "db");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition45);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test9554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9554");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray20 = new java.lang.String[] { "parent_types", "name", "host", "servers", "skip_initial_import", "disable_index_refresh", "concurrent_bulk_requests", "options", "local", "include_collection", "disable_index_refresh", "exclude_fields", "skip_initial_import", "name", "collection", "exclude_fields", "secondary_read_preference", "include_fields", "advanced_transformation" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet21);
        java.lang.String[] strArray56 = new java.lang.String[] { "parent_types", "actions", "throttle_size", "type", "options", "host", "user", "credentials", "bulk_size", "ssl_verify_certificate", "skip_initial_import", "type", "", "script", "bulk", "host", "servers", "secondary_read_preference", "host", "sandbox", "exclude_fields", "disable_index_refresh", "disable_index_refresh", "credentials", "script", "ssl_verify_certificate", "throttle_size", "include_collection", "concurrent_bulk_requests", "sandbox", "hi!", "name" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.statisticsTypeName("hi!");
        java.lang.String[] strArray67 = new java.lang.String[] { "disable_index_refresh", "user", "secondary_read_preference", "bulk_size" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder60.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder59.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoAdminPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder71.script("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder71.mongoLocalUser("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder71.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder71.includeCollection("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.riverIndexName("flush_interval");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test9555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9555");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.riverIndexName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoClientOptions(mongoClientOptions6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder9.build();
        boolean boolean13 = mongoDBRiverDefinition12.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition12.getIndexName();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition12.isMongos();
        java.lang.String str16 = mongoDBRiverDefinition12.getIndexName();
        java.lang.String str17 = mongoDBRiverDefinition12.getMongoLocalUser();
        java.lang.String str18 = mongoDBRiverDefinition12.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = mongoDBRiverDefinition12.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder0.mongoServers(serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.skipInitialImport(false);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory24.newScript(strMap25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoClientOptions(mongoClientOptions28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder31.build();
        boolean boolean35 = mongoDBRiverDefinition34.isDisableIndexRefresh();
        int int36 = mongoDBRiverDefinition34.getThrottleSize();
        boolean boolean37 = mongoDBRiverDefinition34.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet38 = mongoDBRiverDefinition34.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList39 = mongoDBRiverDefinition34.getMongoServers();
        com.mongodb.BasicDBObject basicDBObject40 = mongoDBRiverDefinition34.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript41 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoClientOptions(mongoClientOptions43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.statisticsTypeName("disable_index_refresh");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory49 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = null;
        org.elasticsearch.script.ExecutableScript executableScript51 = docScoreNativeScriptFactory49.newScript(strMap50);
        org.elasticsearch.common.settings.Settings settings52 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoClientOptions(mongoClientOptions54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = builder57.build();
        boolean boolean61 = mongoDBRiverDefinition60.isDisableIndexRefresh();
        int int62 = mongoDBRiverDefinition60.getThrottleSize();
        boolean boolean63 = mongoDBRiverDefinition60.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet64 = mongoDBRiverDefinition60.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList65 = mongoDBRiverDefinition60.getMongoServers();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition60.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings67 = new org.elasticsearch.river.RiverSettings(settings52, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
        org.elasticsearch.script.ExecutableScript executableScript68 = docScoreNativeScriptFactory49.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder46.mongoCollectionFilter(basicDBObject66);
        org.elasticsearch.script.ExecutableScript executableScript70 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
        org.elasticsearch.river.RiverSettings riverSettings71 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder0.mongoCollectionFilter(basicDBObject66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.socketTimeout(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder72.importAllCollections(true);
        org.bson.types.Binary binary77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder72.initialTimestamp(binary77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(serverAddressList19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(executableScript26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertNotNull(serverAddressList39);
        org.junit.Assert.assertNotNull(basicDBObject40);
        org.junit.Assert.assertNotNull(executableScript41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(executableScript51);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(strSet64);
        org.junit.Assert.assertNotNull(serverAddressList65);
        org.junit.Assert.assertNotNull(basicDBObject66);
        org.junit.Assert.assertNotNull(executableScript68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(executableScript70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test9556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9556");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "options");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0d);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder12.build();
        boolean boolean16 = mongoDBRiverDefinition15.isDisableIndexRefresh();
        java.lang.String str17 = mongoDBRiverDefinition15.getIndexName();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoSSLVerifyCertificate();
        com.mongodb.MongoClientOptions mongoClientOptions19 = mongoDBRiverDefinition15.getMongoClientOptions();
        java.lang.String str20 = mongoDBRiverDefinition15.getIncludeCollection();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition15.getParentTypes();
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) mongoDBRiverDefinition15);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "options" + "'", obj2, "options");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(mongoClientOptions19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(strSet21);
    }

    @Test
    public void test9557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9557");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoClientOptions(mongoClientOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoCollection("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoAdminUser("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = builder17.build();
        boolean boolean21 = mongoDBRiverDefinition20.isDisableIndexRefresh();
        int int22 = mongoDBRiverDefinition20.getThrottleSize();
        boolean boolean23 = mongoDBRiverDefinition20.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet24 = mongoDBRiverDefinition20.getIncludeFields();
        java.lang.Boolean boolean25 = mongoDBRiverDefinition20.isMongos();
        java.lang.String str26 = mongoDBRiverDefinition20.getRiverIndexName();
        boolean boolean27 = mongoDBRiverDefinition20.isSkipInitialImport();
        java.lang.String str28 = mongoDBRiverDefinition20.getIndexName();
        java.lang.String str29 = mongoDBRiverDefinition20.getMongoLocalPassword();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition20.getExcludeFields();
        boolean boolean31 = mongoDBRiverDefinition20.isSkipInitialImport();
        com.mongodb.MongoClientOptions mongoClientOptions32 = mongoDBRiverDefinition20.getMongoClientOptions();
        java.util.List<com.mongodb.ServerAddress> serverAddressList33 = mongoDBRiverDefinition20.getMongoServers();
        java.lang.String str34 = mongoDBRiverDefinition20.getMongoAdminUser();
        java.lang.String str35 = mongoDBRiverDefinition20.getRiverIndexName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList36 = mongoDBRiverDefinition20.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder0.mongoServers(serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder0.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.connectTimeout(35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.script("throttle_size");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(serverAddressList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(serverAddressList36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test9558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9558");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray20 = new java.lang.String[] { "parent_types", "name", "host", "servers", "skip_initial_import", "disable_index_refresh", "concurrent_bulk_requests", "options", "local", "include_collection", "disable_index_refresh", "exclude_fields", "skip_initial_import", "name", "collection", "exclude_fields", "secondary_read_preference", "include_fields", "advanced_transformation" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet21);
        java.lang.String[] strArray56 = new java.lang.String[] { "parent_types", "actions", "throttle_size", "type", "options", "host", "user", "credentials", "bulk_size", "ssl_verify_certificate", "skip_initial_import", "type", "", "script", "bulk", "host", "servers", "secondary_read_preference", "host", "sandbox", "exclude_fields", "disable_index_refresh", "disable_index_refresh", "credentials", "script", "ssl_verify_certificate", "throttle_size", "include_collection", "concurrent_bulk_requests", "sandbox", "hi!", "name" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.statisticsTypeName("hi!");
        java.lang.String[] strArray67 = new java.lang.String[] { "disable_index_refresh", "user", "secondary_read_preference", "bulk_size" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder60.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder59.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder59.skipInitialImport(false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test9559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9559");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        boolean boolean10 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition7.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition7.getMongoServers();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        boolean boolean14 = mongoDBRiverDefinition7.isAdvancedTransformation();
        java.lang.String str15 = mongoDBRiverDefinition7.getRiverName();
        java.lang.String str16 = mongoDBRiverDefinition7.getTypeName();
        java.lang.String str17 = mongoDBRiverDefinition7.getRiverName();
        java.lang.String str18 = mongoDBRiverDefinition7.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition7.getMongoOplogFilter();
        boolean boolean20 = mongoDBRiverDefinition7.isMongoSSLVerifyCertificate();
        boolean boolean21 = mongoDBRiverDefinition7.isAdvancedTransformation();
        int int22 = mongoDBRiverDefinition7.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(basicDBObject19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test9560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9560");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.riverIndexName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoDb("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.connectTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.script("bulk.bulk.bulk.bulk");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }
}

