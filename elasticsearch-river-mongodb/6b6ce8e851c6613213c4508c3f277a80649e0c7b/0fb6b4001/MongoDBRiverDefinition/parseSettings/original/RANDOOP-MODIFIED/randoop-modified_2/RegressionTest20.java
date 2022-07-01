import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory1 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoCollection("");
        java.lang.String[] strArray8 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.includeFields((java.util.Set<java.lang.String>) strSet9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory26 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder30.build();
        boolean boolean34 = mongoDBRiverDefinition33.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings27, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings38 = new org.elasticsearch.river.RiverSettings(settings25, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder20.mongoOplogFilter(basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder13.mongoOplogFilter(basicDBObject35);
        org.elasticsearch.script.ExecutableScript executableScript41 = docScoreNativeScriptFactory1.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.mongoClientOptions(mongoClientOptions51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder48.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings68 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory69 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings70 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition76 = builder73.build();
        boolean boolean77 = mongoDBRiverDefinition76.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject78 = mongoDBRiverDefinition76.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings79 = new org.elasticsearch.river.RiverSettings(settings70, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.script.ExecutableScript executableScript80 = docScoreNativeScriptFactory69.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.RiverSettings riverSettings81 = new org.elasticsearch.river.RiverSettings(settings68, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder63.mongoOplogFilter(basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder54.mongoCollectionFilter(basicDBObject78);
        org.elasticsearch.script.ExecutableScript executableScript84 = docScoreNativeScriptFactory1.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder85.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder87.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition90 = builder87.build();
        java.lang.String str91 = mongoDBRiverDefinition90.getIncludeCollection();
        boolean boolean92 = mongoDBRiverDefinition90.isMongoSSLVerifyCertificate();
        java.lang.String str93 = mongoDBRiverDefinition90.getIndexName();
        java.lang.String str94 = mongoDBRiverDefinition90.getMongoDb();
        boolean boolean95 = mongoDBRiverDefinition90.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject96 = mongoDBRiverDefinition90.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript97 = docScoreNativeScriptFactory1.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject96);
        org.elasticsearch.river.RiverSettings riverSettings98 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject96);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(executableScript41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(basicDBObject78);
        org.junit.Assert.assertNotNull(executableScript80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(executableScript84);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(basicDBObject96);
        org.junit.Assert.assertNotNull(executableScript97);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 1L);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = docScoreSearchScript0.unwrap(obj7);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoLocalPassword("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.indexName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoGridFS(true);
        java.lang.String[] strArray44 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder33.includeFields((java.util.Set<java.lang.String>) strSet45);
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder33.parentTypes((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder28.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder21.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder4.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder4.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder96 = builder4.typeName("name");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder19.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder19.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder19.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder19.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.dropCollection(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoClientOptions(mongoClientOptions31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder50.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder50.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder65.mongoUseSSL(true);
        java.lang.String[] strArray83 = new java.lang.String[] { "size", "concurrent_bulk_requests", "admin", "include_collection", "localhost", "socket_timeout", "script_type", "index", "include_fields", "advanced_transformation", "concurrent_bulk_requests", "include_fields", "host" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder65.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder50.parentTypes((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder37.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder32.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder16.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder16.riverIndexName("index");
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
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoCollection();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoLocalUser();
        boolean boolean14 = mongoDBRiverDefinition5.isSkipInitialImport();
        boolean boolean15 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str16 = mongoDBRiverDefinition5.getStatisticsIndexName();
        java.lang.String str17 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        java.lang.String str18 = mongoDBRiverDefinition5.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null." + "'", str17, "null.");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.statisticsTypeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.includeCollection("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.includeCollection("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder4.statisticsTypeName("parent_types");
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
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.throttleSize(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder6.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.statisticsTypeName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoSecondaryReadPreference(false);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = builder26.build();
        java.lang.String str30 = mongoDBRiverDefinition29.getIncludeCollection();
        boolean boolean31 = mongoDBRiverDefinition29.isMongoSSLVerifyCertificate();
        java.lang.String str32 = mongoDBRiverDefinition29.getMongoDb();
        java.lang.String str33 = mongoDBRiverDefinition29.getScriptType();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition29.getMongoCollectionFilter();
        java.lang.String str35 = mongoDBRiverDefinition29.getIncludeCollection();
        java.lang.String str36 = mongoDBRiverDefinition29.getStatisticsTypeName();
        java.lang.String str37 = mongoDBRiverDefinition29.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition29.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings39 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder22.mongoCollectionFilter(basicDBObject38);
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(basicDBObject34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(basicDBObject38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        boolean boolean24 = mongoDBRiverDefinition23.isMongoUseSSL();
        boolean boolean25 = mongoDBRiverDefinition23.isMongoGridFS();
        java.util.Set<java.lang.String> strSet26 = mongoDBRiverDefinition23.getIncludeFields();
        docScoreSearchScript0.setNextVar("import_all_collections.import_all_collections", (java.lang.Object) strSet26);
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.dropCollection(true);
        org.elasticsearch.common.settings.Settings settings41 = null;
        org.elasticsearch.common.settings.Settings settings42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder45.build();
        boolean boolean49 = mongoDBRiverDefinition48.isDisableIndexRefresh();
        boolean boolean50 = mongoDBRiverDefinition48.isDropCollection();
        java.lang.String str51 = mongoDBRiverDefinition48.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition48.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings53 = new org.elasticsearch.river.RiverSettings(settings42, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        org.elasticsearch.river.RiverSettings riverSettings54 = new org.elasticsearch.river.RiverSettings(settings41, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder36.mongoCollectionFilter(basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.statisticsTypeName("skip_initial_import");
        java.lang.Object obj58 = docScoreSearchScript0.unwrap((java.lang.Object) "skip_initial_import");
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext59 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(basicDBObject52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "skip_initial_import" + "'", obj58, "skip_initial_import");
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        boolean boolean10 = mongoDBRiverDefinition9.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings12 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.common.settings.Settings settings14 = riverSettings13.globalSettings();
        org.elasticsearch.script.ScriptService scriptService15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "ssl_verify_certificate", riverSettings13, scriptService15);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNull(settings14);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory0 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.elasticsearch.script.ExecutableScript executableScript2 = docScoreNativeScriptFactory0.newScript(strMap1);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = builder7.build();
        boolean boolean11 = mongoDBRiverDefinition10.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition10.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.riverName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.mongoUseSSL(false);
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder30.build();
        java.lang.String str34 = mongoDBRiverDefinition33.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings27, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder26.mongoCollectionFilter(basicDBObject35);
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(executableScript38);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = builder17.build();
        java.lang.String str21 = mongoDBRiverDefinition20.getIncludeCollection();
        boolean boolean22 = mongoDBRiverDefinition20.isMongoSSLVerifyCertificate();
        java.lang.String str23 = mongoDBRiverDefinition20.getIndexName();
        java.lang.String str24 = mongoDBRiverDefinition20.getMongoDb();
        boolean boolean25 = mongoDBRiverDefinition20.isDisableIndexRefresh();
        java.lang.String str26 = mongoDBRiverDefinition20.getIndexName();
        java.lang.String str27 = mongoDBRiverDefinition20.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition20.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder14.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.statisticsIndexName("size.size");
        java.lang.Class<?> wildcardClass32 = builder31.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.disableIndexRefresh(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str10 = mongoDBRiverDefinition5.getTypeName();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoCollection();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder15.build();
        boolean boolean19 = mongoDBRiverDefinition18.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings21 = new org.elasticsearch.river.RiverSettings(settings12, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.river.RiverSettings riverSettings23 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings9, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder8.mongoCollectionFilter(basicDBObject20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder8.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder8.mongoLocalPassword("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.statisticsIndexName("import_all_collections.import_all_collections");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoLocalPassword();
        boolean boolean12 = mongoDBRiverDefinition5.isStoreStatistics();
        boolean boolean13 = mongoDBRiverDefinition5.isMongoGridFS();
        int int14 = mongoDBRiverDefinition5.getSocketTimeout();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition5.getInitialTimestamp();
        boolean boolean16 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.scriptType("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder15.build();
        java.lang.String str19 = mongoDBRiverDefinition18.getIncludeCollection();
        boolean boolean20 = mongoDBRiverDefinition18.isMongoSSLVerifyCertificate();
        java.lang.String str21 = mongoDBRiverDefinition18.getMongoDb();
        java.lang.String str22 = mongoDBRiverDefinition18.getScriptType();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        java.lang.String str24 = mongoDBRiverDefinition18.getIncludeCollection();
        java.lang.String str25 = mongoDBRiverDefinition18.getStatisticsTypeName();
        java.lang.String str26 = mongoDBRiverDefinition18.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder12.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder12.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder12.mongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.scriptType("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = mongoDBRiverDefinition5.getMongoServers();
        boolean boolean10 = mongoDBRiverDefinition5.isSkipInitialImport();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition5.getExcludeFields();
        int int12 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoAdminUser();
        boolean boolean14 = mongoDBRiverDefinition5.isImportAllCollections();
        java.lang.String str15 = mongoDBRiverDefinition5.getMongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(serverAddressList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder4.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoDb("local");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory25.newScript(strMap26);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory28 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings29 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = builder32.build();
        boolean boolean36 = mongoDBRiverDefinition35.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject37 = mongoDBRiverDefinition35.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings38 = new org.elasticsearch.river.RiverSettings(settings29, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.script.ExecutableScript executableScript39 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.script.ExecutableScript executableScript40 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.common.settings.Settings settings41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.mongoClientOptions(mongoClientOptions51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder48.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings68 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory69 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings70 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition76 = builder73.build();
        boolean boolean77 = mongoDBRiverDefinition76.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject78 = mongoDBRiverDefinition76.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings79 = new org.elasticsearch.river.RiverSettings(settings70, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.script.ExecutableScript executableScript80 = docScoreNativeScriptFactory69.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.RiverSettings riverSettings81 = new org.elasticsearch.river.RiverSettings(settings68, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder63.mongoOplogFilter(basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder54.mongoCollectionFilter(basicDBObject78);
        org.elasticsearch.river.RiverSettings riverSettings84 = new org.elasticsearch.river.RiverSettings(settings41, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.script.ExecutableScript executableScript85 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder18.mongoCollectionFilter(basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder15.mongoCollectionFilter(basicDBObject78);
        org.elasticsearch.river.RiverSettings riverSettings88 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.RiverSettings riverSettings89 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.common.settings.Settings settings90 = riverSettings89.globalSettings();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNotNull(executableScript39);
        org.junit.Assert.assertNotNull(executableScript40);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(basicDBObject78);
        org.junit.Assert.assertNotNull(executableScript80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(executableScript85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNull(settings90);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition5.getMongoServers();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition5.getIncludeFields();
        boolean boolean15 = mongoDBRiverDefinition5.isImportAllCollections();
        boolean boolean16 = mongoDBRiverDefinition5.isMongoUseSSL();
        java.lang.String str17 = mongoDBRiverDefinition5.getRiverName();
        boolean boolean18 = mongoDBRiverDefinition5.isMongoUseSSL();
        java.lang.String str19 = mongoDBRiverDefinition5.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoCollection();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoUseSSL();
        int int10 = mongoDBRiverDefinition5.getSocketTimeout();
        java.lang.String str11 = mongoDBRiverDefinition5.getScriptType();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.throttleSize(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.scriptType("null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder23.build();
        java.lang.String str27 = mongoDBRiverDefinition26.getIncludeCollection();
        boolean boolean28 = mongoDBRiverDefinition26.isMongoSSLVerifyCertificate();
        java.lang.String str29 = mongoDBRiverDefinition26.getIndexName();
        java.lang.String str30 = mongoDBRiverDefinition26.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions32 = mongoDBRiverDefinition26.getMongoClientOptions();
        boolean boolean33 = mongoDBRiverDefinition26.isSkipInitialImport();
        java.util.Set<java.lang.String> strSet34 = mongoDBRiverDefinition26.getParentTypes();
        java.util.List<com.mongodb.ServerAddress> serverAddressList35 = mongoDBRiverDefinition26.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder16.mongoServers(serverAddressList35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder16.throttleSize((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.statisticsTypeName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.mongoCollection("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = builder47.build();
        java.lang.String str51 = mongoDBRiverDefinition50.getIncludeCollection();
        boolean boolean52 = mongoDBRiverDefinition50.isMongoSSLVerifyCertificate();
        java.lang.String str53 = mongoDBRiverDefinition50.getIndexName();
        java.lang.String str54 = mongoDBRiverDefinition50.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject55 = mongoDBRiverDefinition50.getMongoOplogFilter();
        java.lang.String str56 = mongoDBRiverDefinition50.getMongoDb();
        boolean boolean57 = mongoDBRiverDefinition50.isStoreStatistics();
        boolean boolean58 = mongoDBRiverDefinition50.isImportAllCollections();
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition50.getParentTypes();
        java.util.List<com.mongodb.ServerAddress> serverAddressList60 = mongoDBRiverDefinition50.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder38.mongoServers(serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder66.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder66.statisticsTypeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder66.includeCollection("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoAdminUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition82 = builder79.build();
        boolean boolean83 = mongoDBRiverDefinition82.isDisableIndexRefresh();
        boolean boolean84 = mongoDBRiverDefinition82.isDropCollection();
        java.lang.String str85 = mongoDBRiverDefinition82.getMongoAdminPassword();
        boolean boolean86 = mongoDBRiverDefinition82.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject87 = mongoDBRiverDefinition82.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder76.mongoCollectionFilter(basicDBObject87);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder61.mongoOplogFilter(basicDBObject87);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder89.importAllCollections(false);
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
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(basicDBObject31);
        org.junit.Assert.assertNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strSet34);
        org.junit.Assert.assertNotNull(serverAddressList35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(basicDBObject55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(strSet59);
        org.junit.Assert.assertNotNull(serverAddressList60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(basicDBObject87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder91);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
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
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = docScoreSearchScript0.unwrap(obj66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder72.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = builder72.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder72.throttleSize(100);
        java.lang.Object obj80 = docScoreSearchScript0.unwrap((java.lang.Object) builder79);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext81 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(obj80);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str11 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean13 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str14 = mongoDBRiverDefinition5.getTypeName();
        boolean boolean15 = mongoDBRiverDefinition5.isAdvancedTransformation();
        boolean boolean16 = mongoDBRiverDefinition5.isAdvancedTransformation();
        java.lang.String str17 = mongoDBRiverDefinition5.getRiverName();
        int int18 = mongoDBRiverDefinition5.getThrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoAdminUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.connectTimeout(27017);
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
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoAdminPassword("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoGridFS(true);
        java.lang.String[] strArray52 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.includeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder8.excludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.mongoCollection("disable_index_refresh.disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.connectTimeout((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder62.disableIndexRefresh(false);
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.riverName("secondary_read_preference");
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
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean12 = mongoDBRiverDefinition5.isStoreStatistics();
        boolean boolean13 = mongoDBRiverDefinition5.isImportAllCollections();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        boolean boolean15 = mongoDBRiverDefinition5.isSkipInitialImport();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.riverName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder40.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoLocalUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = builder62.build();
        java.lang.String str66 = mongoDBRiverDefinition65.getRiverIndexName();
        boolean boolean67 = mongoDBRiverDefinition65.isDisableIndexRefresh();
        boolean boolean68 = mongoDBRiverDefinition65.isStoreStatistics();
        java.lang.String str69 = mongoDBRiverDefinition65.getMongoLocalPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList70 = mongoDBRiverDefinition65.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder59.mongoServers(serverAddressList70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder40.mongoServers(serverAddressList70);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(serverAddressList70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.riverName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.advancedTransformation(false);
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory33 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings34 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder37.build();
        boolean boolean41 = mongoDBRiverDefinition40.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject42 = mongoDBRiverDefinition40.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings34, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.script.ExecutableScript executableScript44 = docScoreNativeScriptFactory33.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings45 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder27.mongoOplogFilter(basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings47 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings48 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings49 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder9.mongoCollectionFilter(basicDBObject42);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(executableScript44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.disableIndexRefresh(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminPassword("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.riverName("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isMongoUseSSL();
        boolean boolean7 = mongoDBRiverDefinition5.isAdvancedTransformation();
        java.lang.String str8 = mongoDBRiverDefinition5.getIncludeCollection();
        int int9 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str10 = mongoDBRiverDefinition5.getRiverIndexName();
        int int11 = mongoDBRiverDefinition5.getConnectTimeout();
        boolean boolean12 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition5.getInitialTimestamp();
        java.lang.String str14 = mongoDBRiverDefinition5.getMongoCollection();
        int int15 = mongoDBRiverDefinition5.getThrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        java.lang.String[] strArray6 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.includeFields((java.util.Set<java.lang.String>) strSet7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.connectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.riverIndexName("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.dropCollection(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.riverName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.socketTimeout((int) (short) -1);
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoClientOptions(mongoClientOptions13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        java.lang.String[] strArray21 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder15.includeFields((java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder15.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder15.typeName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder15.typeName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoCollection("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.riverIndexName("null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.riverIndexName("actions");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript50 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript50.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = builder56.build();
        java.lang.String str60 = mongoDBRiverDefinition59.getIncludeCollection();
        boolean boolean61 = mongoDBRiverDefinition59.isMongoSSLVerifyCertificate();
        java.lang.String str62 = mongoDBRiverDefinition59.getIndexName();
        java.lang.Object obj63 = docScoreSearchScript50.unwrap((java.lang.Object) mongoDBRiverDefinition59);
        boolean boolean64 = mongoDBRiverDefinition59.isStoreStatistics();
        int int65 = mongoDBRiverDefinition59.getConnectTimeout();
        java.lang.String str66 = mongoDBRiverDefinition59.getRiverIndexName();
        int int67 = mongoDBRiverDefinition59.getThrottleSize();
        java.util.List<com.mongodb.ServerAddress> serverAddressList68 = mongoDBRiverDefinition59.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder45.mongoServers(serverAddressList68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder32.mongoServers(serverAddressList68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder14.mongoServers(serverAddressList68);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder24);
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
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(serverAddressList68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.includeCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.riverIndexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.advancedTransformation(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions10 = mongoDBRiverDefinition5.getMongoClientOptions();
        boolean boolean11 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition5.getInitialTimestamp();
        java.lang.String str14 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str15 = mongoDBRiverDefinition5.getIncludeCollection();
        int int16 = mongoDBRiverDefinition5.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null." + "'", str12, "null.");
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(basicDBObject17);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        int int8 = mongoDBRiverDefinition5.getThrottleSize();
        int int9 = mongoDBRiverDefinition5.getSocketTimeout();
        java.lang.String str10 = mongoDBRiverDefinition5.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        java.lang.String str14 = mongoDBRiverDefinition5.getStatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null." + "'", str13, "null.");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.throttleSize((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.advancedTransformation(true);
        java.util.Set<java.lang.String> strSet13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.excludeFields(strSet13);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.throttleSize((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.includeCollection("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder16.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder16.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.riverName("password");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder23.parentTypes((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder13.includeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder67.build();
        boolean boolean71 = mongoDBRiverDefinition70.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject72 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject73 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        boolean boolean74 = mongoDBRiverDefinition70.isMongoGridFS();
        java.lang.String str75 = mongoDBRiverDefinition70.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject76 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder64.mongoOplogFilter(basicDBObject76);
        org.elasticsearch.river.RiverSettings riverSettings78 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject76);
        org.elasticsearch.common.settings.Settings settings79 = riverSettings78.globalSettings();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
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
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(basicDBObject72);
        org.junit.Assert.assertNotNull(basicDBObject73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(basicDBObject76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNull(settings79);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.riverName("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.riverName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoGridFS(true);
        java.lang.String[] strArray42 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder31.includeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder17.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder10.includeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder10.mongoLocalUser("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder10.mongoDb("local");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.typeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.statisticsTypeName("bulk_timeout.bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.scriptType("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.advancedTransformation(true);
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
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoClientOptions(mongoClientOptions13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.typeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.scriptType("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsTypeName("bulk_size");
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) "bulk_size");
        docScoreSearchScript0.setNextScore((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
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
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoGridFS(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder11.includeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder39.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoGridFS(true);
        java.lang.String[] strArray61 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder50.includeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder45.excludeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder38.excludeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder11.parentTypes((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder6.includeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder6.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder6.mongoLocalUser("admin");
        org.elasticsearch.common.settings.Settings settings73 = null;
        org.elasticsearch.common.settings.Settings settings74 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory75 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings76 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition82 = builder79.build();
        boolean boolean83 = mongoDBRiverDefinition82.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject84 = mongoDBRiverDefinition82.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings85 = new org.elasticsearch.river.RiverSettings(settings76, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject84);
        org.elasticsearch.script.ExecutableScript executableScript86 = docScoreNativeScriptFactory75.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject84);
        org.elasticsearch.river.RiverSettings riverSettings87 = new org.elasticsearch.river.RiverSettings(settings74, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject84);
        org.elasticsearch.river.RiverSettings riverSettings88 = new org.elasticsearch.river.RiverSettings(settings73, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder6.mongoOplogFilter(basicDBObject84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition90 = builder6.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList91 = mongoDBRiverDefinition90.getMongoServers();
        java.util.Set<java.lang.String> strSet92 = mongoDBRiverDefinition90.getIncludeFields();
        java.lang.String str93 = mongoDBRiverDefinition90.getScriptType();
        boolean boolean94 = mongoDBRiverDefinition90.isAdvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(basicDBObject84);
        org.junit.Assert.assertNotNull(executableScript86);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition90);
        org.junit.Assert.assertNotNull(serverAddressList91);
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition5.isDropCollection();
        boolean boolean9 = mongoDBRiverDefinition5.isDropCollection();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getIncludeFields();
        boolean boolean11 = mongoDBRiverDefinition5.isAdvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(true);
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
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str8 = mongoDBRiverDefinition5.getTypeName();
        java.lang.String str9 = mongoDBRiverDefinition5.getTypeName();
        boolean boolean10 = mongoDBRiverDefinition5.isAdvancedTransformation();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoDb();
        int int12 = mongoDBRiverDefinition5.getConnectTimeout();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition5.getMongoServers();
        java.lang.String str15 = mongoDBRiverDefinition5.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoAdminPassword();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str10 = mongoDBRiverDefinition5.getScript();
        boolean boolean11 = mongoDBRiverDefinition5.isAdvancedTransformation();
        int int12 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoCollection();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition5.getExcludeFields();
        java.lang.String str15 = mongoDBRiverDefinition5.getStatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.lang.String str10 = mongoDBRiverDefinition5.getScriptType();
        java.lang.String str11 = mongoDBRiverDefinition5.getRiverIndexName();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean13 = mongoDBRiverDefinition5.isDropCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition5.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongoDBRiverDefinition5.getMongoServers();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoLocalUser();
        boolean boolean10 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoDb();
        java.lang.String str12 = mongoDBRiverDefinition5.getRiverIndexName();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoCollection();
        int int14 = mongoDBRiverDefinition5.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoCollection();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoGridFS();
        java.lang.String str10 = mongoDBRiverDefinition5.getScript();
        boolean boolean11 = mongoDBRiverDefinition5.isMongoUseSSL();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null." + "'", str12, "null.");
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean12 = mongoDBRiverDefinition5.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoLocalPassword("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoLocalPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.throttleSize((-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        int int8 = mongoDBRiverDefinition5.getThrottleSize();
        int int9 = mongoDBRiverDefinition5.getSocketTimeout();
        java.lang.String str10 = mongoDBRiverDefinition5.getTypeName();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str12 = mongoDBRiverDefinition5.getRiverName();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoLocalPassword();
        int int14 = mongoDBRiverDefinition5.getSocketTimeout();
        boolean boolean15 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        com.mongodb.MongoClientOptions mongoClientOptions16 = mongoDBRiverDefinition5.getMongoClientOptions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(mongoClientOptions16);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoClientOptions(mongoClientOptions15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoGridFS(true);
        java.lang.String[] strArray41 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder30.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder58.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoGridFS(true);
        java.lang.String[] strArray80 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder69.includeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder64.excludeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder57.excludeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder30.parentTypes((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder25.includeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder18.parentTypes((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder88.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder88.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder88.mongoDb("");
        java.lang.Object obj95 = docScoreSearchScript0.unwrap((java.lang.Object) builder88);
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(obj95);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoGridFS(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder11.includeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder6.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = builder28.build();
        java.lang.String str32 = mongoDBRiverDefinition31.getStatisticsTypeName();
        java.lang.String str33 = mongoDBRiverDefinition31.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet34 = mongoDBRiverDefinition31.getParentTypes();
        boolean boolean35 = mongoDBRiverDefinition31.isMongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(strSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition5.getIncludeFields();
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        boolean boolean9 = mongoDBRiverDefinition5.isImportAllCollections();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getIncludeFields();
        boolean boolean11 = mongoDBRiverDefinition5.isImportAllCollections();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition5.getExcludeFields();
        java.lang.String str13 = mongoDBRiverDefinition5.getRiverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition5.getIncludeFields();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition5.getInitialTimestamp();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoLocalUser();
        boolean boolean11 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongoDBRiverDefinition5.getMongoServers();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition5.getParentTypes();
        java.lang.String str10 = mongoDBRiverDefinition5.getScriptType();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str12 = mongoDBRiverDefinition5.getRiverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.disableIndexRefresh(true);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = builder28.build();
        boolean boolean32 = mongoDBRiverDefinition31.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject33 = mongoDBRiverDefinition31.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings34 = new org.elasticsearch.river.RiverSettings(settings25, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder22.mongoCollectionFilter(basicDBObject33);
        com.mongodb.ServerAddress[] serverAddressArray38 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList39 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList39, serverAddressArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder22.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoGridFS(true);
        java.lang.String[] strArray57 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder46.includeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.storeStatistics(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(serverAddressArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder7.build();
        java.lang.String str9 = mongoDBRiverDefinition8.getScriptType();
        java.lang.String str10 = mongoDBRiverDefinition8.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition8.getIncludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.includeCollection("gridfs");
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder2.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder2.mongoAdminPassword("include_collection");
        com.mongodb.BasicDBObject basicDBObject16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder2.mongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.mongoDb("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
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
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext61 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminPassword();
        int int11 = mongoDBRiverDefinition5.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition5.getMongoOplogFilter();
        boolean boolean13 = mongoDBRiverDefinition5.isImportAllCollections();
        java.lang.String str14 = mongoDBRiverDefinition5.getMongoCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.indexName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.throttleSize(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.riverIndexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.dropCollection(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("hi!");
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoAdminPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.scriptType("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder22.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoGridFS(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder28.includeFields((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder56.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoGridFS(true);
        java.lang.String[] strArray78 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder67.includeFields((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder62.excludeFields((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder55.excludeFields((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder28.parentTypes((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition85 = builder84.build();
        java.util.Set<java.lang.String> strSet86 = mongoDBRiverDefinition85.getIncludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder22.excludeFields(strSet86);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition85);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNotNull(builder87);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoAdminUser("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.socketTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.riverName("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoAdminPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder14.includeCollection("exclude_fields");
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
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        java.lang.String[] strArray15 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder4.includeFields((java.util.Set<java.lang.String>) strSet16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.scriptType("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder4.mongoCollection("include_collection");
        org.bson.types.BSONTimestamp bSONTimestamp27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.initialTimestamp(bSONTimestamp27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder8.advancedTransformation(true);
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
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
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
        org.elasticsearch.common.settings.Settings settings68 = null;
        org.elasticsearch.common.settings.Settings settings69 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory70 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings71 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = builder74.build();
        boolean boolean78 = mongoDBRiverDefinition77.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject79 = mongoDBRiverDefinition77.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings80 = new org.elasticsearch.river.RiverSettings(settings71, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject79);
        org.elasticsearch.script.ExecutableScript executableScript81 = docScoreNativeScriptFactory70.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject79);
        org.elasticsearch.river.RiverSettings riverSettings82 = new org.elasticsearch.river.RiverSettings(settings69, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject79);
        org.elasticsearch.river.RiverSettings riverSettings83 = new org.elasticsearch.river.RiverSettings(settings68, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject79);
        org.elasticsearch.script.ScriptService scriptService84 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition85 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("import_all_collections", "disable_index_refresh", riverSettings83, scriptService84);
        java.lang.String str86 = mongoDBRiverDefinition85.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject87 = mongoDBRiverDefinition85.getMongoCollectionFilter();
        java.lang.Object obj88 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject87);
        docScoreSearchScript0.setNextScore(1.0f);
        org.apache.lucene.search.Scorer scorer91 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(basicDBObject79);
        org.junit.Assert.assertNotNull(executableScript81);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(basicDBObject87);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertEquals(obj88.toString(), "{ }");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "{ }");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "{ }");
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap(obj3);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoCollection();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoLocalPassword();
        int int13 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str14 = mongoDBRiverDefinition5.getStatisticsTypeName();
        java.lang.String str15 = mongoDBRiverDefinition5.getIndexName();
        int int16 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str17 = mongoDBRiverDefinition5.getMongoDb();
        java.lang.String str18 = mongoDBRiverDefinition5.getScriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.scriptType("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.indexName("flush_interval");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.mongoDb("local");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory14.newScript(strMap15);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory17 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder21.build();
        boolean boolean25 = mongoDBRiverDefinition24.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject26 = mongoDBRiverDefinition24.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings27 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.common.settings.Settings settings30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.mongoClientOptions(mongoClientOptions40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings57 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory58 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings59 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = builder62.build();
        boolean boolean66 = mongoDBRiverDefinition65.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject67 = mongoDBRiverDefinition65.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings68 = new org.elasticsearch.river.RiverSettings(settings59, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ExecutableScript executableScript69 = docScoreNativeScriptFactory58.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings70 = new org.elasticsearch.river.RiverSettings(settings57, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder52.mongoOplogFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder43.mongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings73 = new org.elasticsearch.river.RiverSettings(settings30, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ExecutableScript executableScript74 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder7.mongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings76 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings77 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings78 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ScriptService scriptService79 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition80 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ssl_verify_certificate", "user", riverSettings78, scriptService79);
        boolean boolean81 = mongoDBRiverDefinition80.isSkipInitialImport();
        int int82 = mongoDBRiverDefinition80.getThrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp83 = mongoDBRiverDefinition80.getInitialTimestamp();
        boolean boolean84 = mongoDBRiverDefinition80.isStoreStatistics();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(basicDBObject67);
        org.junit.Assert.assertNotNull(executableScript69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(executableScript74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoClientOptions(mongoClientOptions13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.typeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.scriptType("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsTypeName("bulk_size");
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) "bulk_size");
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder30.build();
        java.lang.String str34 = mongoDBRiverDefinition33.getRiverIndexName();
        java.lang.String str35 = mongoDBRiverDefinition33.getRiverName();
        java.lang.String str36 = mongoDBRiverDefinition33.getMongoDb();
        java.lang.String str37 = mongoDBRiverDefinition33.getTypeName();
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = builder42.build();
        java.lang.String str46 = mongoDBRiverDefinition45.getIncludeCollection();
        java.lang.String str47 = mongoDBRiverDefinition45.getMongoAdminPassword();
        java.lang.String str48 = mongoDBRiverDefinition45.getMongoDb();
        int int49 = mongoDBRiverDefinition45.getSocketTimeout();
        boolean boolean50 = mongoDBRiverDefinition45.isMongoSecondaryReadPreference();
        java.lang.String str51 = mongoDBRiverDefinition45.getScript();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        java.lang.String str53 = mongoDBRiverDefinition45.getMongoOplogNamespace();
        int int54 = mongoDBRiverDefinition45.getSocketTimeout();
        java.lang.String str55 = mongoDBRiverDefinition45.getMongoCollection();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition45);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(basicDBObject52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "null." + "'", str53, "null.");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoClientOptions(mongoClientOptions13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.typeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.scriptType("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsTypeName("bulk_size");
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) "bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder29.build();
        java.lang.String str33 = mongoDBRiverDefinition32.getRiverIndexName();
        boolean boolean34 = mongoDBRiverDefinition32.isDisableIndexRefresh();
        boolean boolean35 = mongoDBRiverDefinition32.isStoreStatistics();
        java.lang.String str36 = mongoDBRiverDefinition32.getMongoAdminUser();
        java.lang.String str37 = mongoDBRiverDefinition32.getScript();
        java.lang.String str38 = mongoDBRiverDefinition32.getScriptType();
        int int39 = mongoDBRiverDefinition32.getConnectTimeout();
        java.lang.String str40 = mongoDBRiverDefinition32.getScript();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp41 = mongoDBRiverDefinition32.getInitialTimestamp();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) wildcardTimestamp41);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript50 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj52 = docScoreSearchScript50.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.importAllCollections(false);
        java.lang.Object obj64 = docScoreSearchScript50.unwrap((java.lang.Object) builder63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder67.disableIndexRefresh(true);
        com.mongodb.MongoClientOptions mongoClientOptions72 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoClientOptions(mongoClientOptions72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.scriptType("advanced_transformation");
        java.lang.Object obj78 = docScoreSearchScript50.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) docScoreSearchScript50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = builder83.build();
        boolean boolean87 = mongoDBRiverDefinition86.isDisableIndexRefresh();
        boolean boolean88 = mongoDBRiverDefinition86.isDisableIndexRefresh();
        java.lang.String str89 = mongoDBRiverDefinition86.getMongoLocalUser();
        boolean boolean90 = mongoDBRiverDefinition86.isImportAllCollections();
        java.lang.String str91 = mongoDBRiverDefinition86.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject92 = mongoDBRiverDefinition86.getMongoOplogFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList93 = mongoDBRiverDefinition86.getMongoServers();
        java.lang.String str94 = mongoDBRiverDefinition86.getMongoLocalUser();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) mongoDBRiverDefinition86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(wildcardTimestamp41);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 10.0f + "'", obj52, 10.0f);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + "advanced_transformation" + "'", obj78, "advanced_transformation");
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNull(basicDBObject92);
        org.junit.Assert.assertNotNull(serverAddressList93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoDb("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.indexName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder15.build();
        java.lang.String str19 = mongoDBRiverDefinition18.getIncludeCollection();
        boolean boolean20 = mongoDBRiverDefinition18.isMongoSSLVerifyCertificate();
        java.lang.String str21 = mongoDBRiverDefinition18.getIndexName();
        java.lang.String str22 = mongoDBRiverDefinition18.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition18.getMongoOplogFilter();
        java.lang.String str24 = mongoDBRiverDefinition18.getMongoCollection();
        java.lang.String str25 = mongoDBRiverDefinition18.getMongoLocalPassword();
        java.lang.String str26 = mongoDBRiverDefinition18.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder12.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder12.mongoLocalPassword("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.socketTimeout((int) (short) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(basicDBObject23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoGridFS(true);
        java.lang.String[] strArray42 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder31.includeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder6.connectTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.connectTimeout((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.mongoAdminUser("script.script");
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str11 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean13 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str14 = mongoDBRiverDefinition5.getTypeName();
        java.lang.String str15 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        boolean boolean16 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str17 = mongoDBRiverDefinition5.getScript();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition5.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition5.getMongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null." + "'", str15, "null.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNull(basicDBObject19);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder7.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.includeCollection("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoLocalPassword("include_collection");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoCollection();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoGridFS();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminPassword();
        java.lang.String str11 = mongoDBRiverDefinition5.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
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
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.lang.String str15 = mongoDBRiverDefinition9.getStatisticsIndexName();
        java.lang.String str16 = mongoDBRiverDefinition9.getTypeName();
        boolean boolean17 = mongoDBRiverDefinition9.isMongoUseSSL();
        boolean boolean18 = mongoDBRiverDefinition9.isMongoGridFS();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str7 = mongoDBRiverDefinition5.getMongoAdminPassword();
        boolean boolean8 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str9 = mongoDBRiverDefinition5.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition5.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition5.getMongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNull(basicDBObject12);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoAdminUser();
        int int10 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoLocalUser();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoCollection();
        java.lang.String str13 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean14 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition5.getMongoCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder5.build();
        boolean boolean9 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean10 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean11 = mongoDBRiverDefinition8.isAdvancedTransformation();
        boolean boolean12 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition8.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition8.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings15 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings16 = riverSettings15.globalSettings();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = riverSettings15.settings();
        org.elasticsearch.river.RiverSettings riverSettings18 = new org.elasticsearch.river.RiverSettings(settings1, strMap17);
        org.elasticsearch.river.RiverSettings riverSettings19 = new org.elasticsearch.river.RiverSettings(settings0, strMap17);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNull(settings16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript4.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        java.lang.String str14 = mongoDBRiverDefinition13.getIncludeCollection();
        boolean boolean15 = mongoDBRiverDefinition13.isMongoSSLVerifyCertificate();
        java.lang.String str16 = mongoDBRiverDefinition13.getIndexName();
        java.lang.Object obj17 = docScoreSearchScript4.unwrap((java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript4.setNextScore((float) (byte) -1);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = docScoreSearchScript4.unwrap(obj20);
        docScoreSearchScript0.setNextVar("type", obj20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoLocalPassword("connect_timeout");
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.indexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.throttleSize(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoAdminPassword("host");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(obj21);
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
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getParentTypes();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition5.getExcludeFields();
        boolean boolean12 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition5.getExcludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition5.getParentTypes();
        java.lang.String str8 = mongoDBRiverDefinition5.getScriptType();
        boolean boolean9 = mongoDBRiverDefinition5.isDropCollection();
        boolean boolean10 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str11 = mongoDBRiverDefinition5.getRiverIndexName();
        java.lang.String str12 = mongoDBRiverDefinition5.getIndexName();
        boolean boolean13 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder3.build();
        java.lang.String str7 = mongoDBRiverDefinition6.getRiverIndexName();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition6.getIncludeFields();
        java.lang.String str10 = mongoDBRiverDefinition6.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition6.getMongoCollectionFilter();
        java.lang.String str12 = mongoDBRiverDefinition6.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition6.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = riverSettings14.settings();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.indexName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.mongoAdminPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.mongoCollection("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.dropCollection(true);
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
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str11 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean13 = mongoDBRiverDefinition5.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition5.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str16 = mongoDBRiverDefinition5.getStatisticsIndexName();
        java.lang.String str17 = mongoDBRiverDefinition5.getMongoLocalPassword();
        boolean boolean18 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions10 = mongoDBRiverDefinition5.getMongoClientOptions();
        boolean boolean11 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition5.getInitialTimestamp();
        java.lang.String str14 = mongoDBRiverDefinition5.getIndexName();
        boolean boolean15 = mongoDBRiverDefinition5.isMongoUseSSL();
        java.lang.String str16 = mongoDBRiverDefinition5.getStatisticsIndexName();
        boolean boolean17 = mongoDBRiverDefinition5.isMongoGridFS();
        int int18 = mongoDBRiverDefinition5.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null." + "'", str12, "null.");
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str8 = mongoDBRiverDefinition5.getStatisticsIndexName();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition5.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getIncludeFields();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition5.getIncludeFields();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = mongoDBRiverDefinition5.getInitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.riverName("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.riverName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoGridFS(true);
        java.lang.String[] strArray42 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder31.includeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder17.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder10.includeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder10.mongoLocalUser("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder10.indexName("concurrent_bulk_requests");
        java.util.List<com.mongodb.ServerAddress> serverAddressList53 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoServers(serverAddressList53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoAdminPassword("index");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str12 = mongoDBRiverDefinition5.getStatisticsTypeName();
        boolean boolean13 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str14 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null." + "'", str14, "null.");
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = builder17.build();
        java.lang.String str21 = mongoDBRiverDefinition20.getRiverIndexName();
        boolean boolean22 = mongoDBRiverDefinition20.isDisableIndexRefresh();
        boolean boolean23 = mongoDBRiverDefinition20.isStoreStatistics();
        java.lang.String str24 = mongoDBRiverDefinition20.getMongoAdminUser();
        java.lang.String str25 = mongoDBRiverDefinition20.getScript();
        java.lang.String str26 = mongoDBRiverDefinition20.getScriptType();
        int int27 = mongoDBRiverDefinition20.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition20.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.mongoOplogFilter(basicDBObject28);
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoClientOptions(mongoClientOptions30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoLocalUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.socketTimeout(100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.mongoDb("local");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        org.elasticsearch.script.ExecutableScript executableScript11 = docScoreNativeScriptFactory9.newScript(strMap10);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder16.build();
        boolean boolean20 = mongoDBRiverDefinition19.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings22 = new org.elasticsearch.river.RiverSettings(settings13, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.script.ExecutableScript executableScript23 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoClientOptions(mongoClientOptions35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder32.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings52 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory53 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings54 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = builder57.build();
        boolean boolean61 = mongoDBRiverDefinition60.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject62 = mongoDBRiverDefinition60.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings63 = new org.elasticsearch.river.RiverSettings(settings54, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        org.elasticsearch.script.ExecutableScript executableScript64 = docScoreNativeScriptFactory53.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        org.elasticsearch.river.RiverSettings riverSettings65 = new org.elasticsearch.river.RiverSettings(settings52, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder47.mongoOplogFilter(basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder38.mongoCollectionFilter(basicDBObject62);
        org.elasticsearch.river.RiverSettings riverSettings68 = new org.elasticsearch.river.RiverSettings(settings25, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        org.elasticsearch.script.ExecutableScript executableScript69 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder2.mongoCollectionFilter(basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder2.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder2.connectTimeout(100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(executableScript11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(executableScript23);
        org.junit.Assert.assertNotNull(executableScript24);
        org.junit.Assert.assertNotNull(builder28);
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
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(basicDBObject62);
        org.junit.Assert.assertNotNull(executableScript64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(executableScript69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder9.riverName("port");
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.mongoAdminUser("flush_interval");
        org.elasticsearch.common.settings.Settings settings36 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.disableIndexRefresh(true);
        org.elasticsearch.common.settings.Settings settings44 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = builder49.build();
        boolean boolean53 = mongoDBRiverDefinition52.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject54 = mongoDBRiverDefinition52.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings55 = new org.elasticsearch.river.RiverSettings(settings46, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.script.ExecutableScript executableScript56 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings57 = new org.elasticsearch.river.RiverSettings(settings44, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder43.mongoCollectionFilter(basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings59 = new org.elasticsearch.river.RiverSettings(settings36, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder31.mongoCollectionFilter(basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings61 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder19.mongoCollectionFilter(basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings63 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        java.lang.Class<?> wildcardClass64 = riverSettings63.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(basicDBObject54);
        org.junit.Assert.assertNotNull(executableScript56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.riverName("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoClientOptions(mongoClientOptions35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder32.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.typeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.riverIndexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoGridFS(true);
        java.lang.String[] strArray62 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder51.includeFields((java.util.Set<java.lang.String>) strSet63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder46.includeFields((java.util.Set<java.lang.String>) strSet63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder23.includeFields((java.util.Set<java.lang.String>) strSet63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder10.statisticsIndexName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder10.mongoDb("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder10.includeCollection("name");
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
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
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
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = docScoreSearchScript0.unwrap(obj66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition74 = builder71.build();
        java.lang.String str75 = mongoDBRiverDefinition74.getIncludeCollection();
        java.lang.String str76 = mongoDBRiverDefinition74.getMongoAdminPassword();
        boolean boolean77 = mongoDBRiverDefinition74.isMongoSSLVerifyCertificate();
        java.lang.String str78 = mongoDBRiverDefinition74.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject79 = mongoDBRiverDefinition74.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions80 = mongoDBRiverDefinition74.getMongoClientOptions();
        docScoreSearchScript0.setNextVar("import_all_collections.import_all_collections", (java.lang.Object) mongoClientOptions80);
        // The following exception was thrown during execution in test generation
        try {
            double double82 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(basicDBObject79);
        org.junit.Assert.assertNull(mongoClientOptions80);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoAdminPassword("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoGridFS(true);
        java.lang.String[] strArray52 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.includeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder8.excludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder58.storeStatistics(false);
        org.elasticsearch.common.settings.Settings settings65 = null;
        org.elasticsearch.common.settings.Settings settings66 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder67.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder67.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition79 = builder76.build();
        boolean boolean80 = mongoDBRiverDefinition79.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition79.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject82 = mongoDBRiverDefinition79.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder67.mongoCollectionFilter(basicDBObject82);
        org.elasticsearch.river.RiverSettings riverSettings84 = new org.elasticsearch.river.RiverSettings(settings66, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject82);
        org.elasticsearch.river.RiverSettings riverSettings85 = new org.elasticsearch.river.RiverSettings(settings65, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder58.mongoOplogFilter(basicDBObject82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder86.statisticsTypeName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder88.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder88.mongoSSLVerifyCertificate(true);
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(basicDBObject81);
        org.junit.Assert.assertNotNull(basicDBObject82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str11 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean13 = mongoDBRiverDefinition5.isDropCollection();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = mongoDBRiverDefinition5.getInitialTimestamp();
        java.lang.String str15 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str16 = mongoDBRiverDefinition5.getStatisticsTypeName();
        boolean boolean17 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        java.lang.String str18 = mongoDBRiverDefinition5.getMongoLocalUser();
        java.lang.String str19 = mongoDBRiverDefinition5.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        java.lang.String[] strArray6 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.includeFields((java.util.Set<java.lang.String>) strSet7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.importAllCollections(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.indexName("hi!");
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.storeStatistics(true);
        org.elasticsearch.common.settings.Settings settings30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder33.build();
        java.lang.String str37 = mongoDBRiverDefinition36.getRiverIndexName();
        boolean boolean38 = mongoDBRiverDefinition36.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet39 = mongoDBRiverDefinition36.getIncludeFields();
        java.lang.String str40 = mongoDBRiverDefinition36.getScript();
        com.mongodb.BasicDBObject basicDBObject41 = mongoDBRiverDefinition36.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings30, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder25.mongoCollectionFilter(basicDBObject41);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder17.mongoOplogFilter(basicDBObject41);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(strSet39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder15.build();
        boolean boolean19 = mongoDBRiverDefinition18.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings21 = new org.elasticsearch.river.RiverSettings(settings12, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.river.RiverSettings riverSettings23 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings9, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder8.mongoCollectionFilter(basicDBObject20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder8.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.riverIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.scriptType("flush_interval");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.statisticsIndexName("port");
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder18.build();
        java.lang.String str22 = mongoDBRiverDefinition21.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition21.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder15.mongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.RiverSettings riverSettings25 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.script.ScriptService scriptService26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("secondary_read_preference", "throttle_size", riverSettings25, scriptService26);
        boolean boolean28 = mongoDBRiverDefinition27.isSkipInitialImport();
        java.lang.String str29 = mongoDBRiverDefinition27.getTypeName();
        int int30 = mongoDBRiverDefinition27.getSocketTimeout();
        java.lang.String str31 = mongoDBRiverDefinition27.getStatisticsIndexName();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "secondary_read_preference" + "'", str29, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.throttleSize((int) (short) 10);
        com.mongodb.BasicDBObject basicDBObject13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoCollectionFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = builder17.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder17.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder17.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.throttleSize(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoGridFS(true);
        java.lang.String[] strArray66 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder55.includeFields((java.util.Set<java.lang.String>) strSet67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder50.excludeFields((java.util.Set<java.lang.String>) strSet67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder43.excludeFields((java.util.Set<java.lang.String>) strSet67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder26.includeFields((java.util.Set<java.lang.String>) strSet67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet67);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder67.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions76 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.mongoClientOptions(mongoClientOptions76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder73.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.throttleSize(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.scriptType("null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder83.dropCollection(false);
        docScoreSearchScript0.setNextVar("options", (java.lang.Object) builder83);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore(100.0f);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder13.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.riverName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder32.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoGridFS(true);
        java.lang.String[] strArray54 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder43.includeFields((java.util.Set<java.lang.String>) strSet55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder38.excludeFields((java.util.Set<java.lang.String>) strSet55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder20.parentTypes((java.util.Set<java.lang.String>) strSet55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder4.includeFields((java.util.Set<java.lang.String>) strSet55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.typeName("index");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.riverName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder2.scriptType("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.throttleSize(27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.scriptType("port");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder16.build();
        boolean boolean20 = mongoDBRiverDefinition19.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings22 = new org.elasticsearch.river.RiverSettings(settings13, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.script.ExecutableScript executableScript23 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings11, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder6.mongoOplogFilter(basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.scriptType("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoLocalPassword("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.advancedTransformation(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(executableScript23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder8.build();
        boolean boolean16 = mongoDBRiverDefinition15.isDisableIndexRefresh();
        java.lang.String str17 = mongoDBRiverDefinition15.getTypeName();
        java.lang.String str18 = mongoDBRiverDefinition15.getIndexName();
        boolean boolean19 = mongoDBRiverDefinition15.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disable_index_refresh" + "'", str17, "disable_index_refresh");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.scriptType("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.riverIndexName("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        org.bson.types.Binary binary21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.initialTimestamp(binary21);
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
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        boolean boolean24 = mongoDBRiverDefinition23.isMongoUseSSL();
        boolean boolean25 = mongoDBRiverDefinition23.isMongoGridFS();
        java.util.Set<java.lang.String> strSet26 = mongoDBRiverDefinition23.getIncludeFields();
        docScoreSearchScript0.setNextVar("import_all_collections.import_all_collections", (java.lang.Object) strSet26);
        docScoreSearchScript0.setNextScore((float) 10);
        docScoreSearchScript0.setNextScore((float) 27017);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory33 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = null;
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory33.newScript(strMap34);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory36 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder40.build();
        boolean boolean44 = mongoDBRiverDefinition43.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject45 = mongoDBRiverDefinition43.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings46 = new org.elasticsearch.river.RiverSettings(settings37, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        org.elasticsearch.script.ExecutableScript executableScript47 = docScoreNativeScriptFactory36.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        org.elasticsearch.script.ExecutableScript executableScript48 = docScoreNativeScriptFactory33.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        org.elasticsearch.common.settings.Settings settings49 = null;
        org.elasticsearch.common.settings.Settings settings50 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = builder53.build();
        boolean boolean57 = mongoDBRiverDefinition56.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject58 = mongoDBRiverDefinition56.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings59 = new org.elasticsearch.river.RiverSettings(settings50, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
        org.elasticsearch.river.RiverSettings riverSettings60 = new org.elasticsearch.river.RiverSettings(settings49, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
        org.elasticsearch.script.ExecutableScript executableScript61 = docScoreNativeScriptFactory33.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition67 = builder64.build();
        boolean boolean68 = mongoDBRiverDefinition67.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject69 = mongoDBRiverDefinition67.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript70 = docScoreNativeScriptFactory33.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject69);
        docScoreSearchScript0.setNextVar("bulk", (java.lang.Object) executableScript70);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(executableScript47);
        org.junit.Assert.assertNotNull(executableScript48);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(basicDBObject58);
        org.junit.Assert.assertNotNull(executableScript61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(basicDBObject69);
        org.junit.Assert.assertNotNull(executableScript70);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getParentTypes();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoAdminUser();
        boolean boolean12 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str13 = mongoDBRiverDefinition5.getScriptType();
        int int14 = mongoDBRiverDefinition5.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder5.build();
        boolean boolean9 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean10 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean11 = mongoDBRiverDefinition8.isMongoGridFS();
        boolean boolean12 = mongoDBRiverDefinition8.isDropCollection();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition8.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        org.elasticsearch.script.ScriptService scriptService15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "", riverSettings14, scriptService15);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.mongoDb("local");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory14.newScript(strMap15);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory17 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder21.build();
        boolean boolean25 = mongoDBRiverDefinition24.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject26 = mongoDBRiverDefinition24.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings27 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.common.settings.Settings settings30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.mongoClientOptions(mongoClientOptions40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings57 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory58 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings59 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = builder62.build();
        boolean boolean66 = mongoDBRiverDefinition65.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject67 = mongoDBRiverDefinition65.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings68 = new org.elasticsearch.river.RiverSettings(settings59, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ExecutableScript executableScript69 = docScoreNativeScriptFactory58.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings70 = new org.elasticsearch.river.RiverSettings(settings57, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder52.mongoOplogFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder43.mongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings73 = new org.elasticsearch.river.RiverSettings(settings30, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ExecutableScript executableScript74 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder7.mongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings76 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = riverSettings76.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap78 = riverSettings76.settings();
        org.elasticsearch.script.ScriptService scriptService79 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition80 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "index", riverSettings76, scriptService79);
        org.elasticsearch.script.ScriptService scriptService81 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition82 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("gridfs", "admin", riverSettings76, scriptService81);
        java.lang.String str83 = mongoDBRiverDefinition82.getStatisticsIndexName();
        java.lang.String str84 = mongoDBRiverDefinition82.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(basicDBObject67);
        org.junit.Assert.assertNotNull(executableScript69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(executableScript74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition80);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        java.lang.String[] strArray15 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder4.includeFields((java.util.Set<java.lang.String>) strSet16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder18.build();
        java.lang.String str22 = mongoDBRiverDefinition21.getScriptType();
        java.lang.String str23 = mongoDBRiverDefinition21.getMongoDb();
        int int24 = mongoDBRiverDefinition21.getConnectTimeout();
        java.lang.String str25 = mongoDBRiverDefinition21.getMongoAdminPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.disableIndexRefresh(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.scriptType("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.riverName("advanced_transformation.advanced_transformation");
        java.util.Set<java.lang.String> strSet23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.includeFields(strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.storeStatistics(false);
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
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.mongoLocalUser("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoAdminUser("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.mongoCollection("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder55.disableIndexRefresh(true);
        org.elasticsearch.common.settings.Settings settings60 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory61 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings62 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition68 = builder65.build();
        boolean boolean69 = mongoDBRiverDefinition68.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject70 = mongoDBRiverDefinition68.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings71 = new org.elasticsearch.river.RiverSettings(settings62, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.script.ExecutableScript executableScript72 = docScoreNativeScriptFactory61.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.river.RiverSettings riverSettings73 = new org.elasticsearch.river.RiverSettings(settings60, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder59.mongoCollectionFilter(basicDBObject70);
        com.mongodb.ServerAddress[] serverAddressArray75 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList76 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList76, serverAddressArray75);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder59.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.mongoGridFS(true);
        java.lang.String[] strArray94 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet95 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet95, strArray94);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder97 = builder83.includeFields((java.util.Set<java.lang.String>) strSet95);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder98 = builder78.excludeFields((java.util.Set<java.lang.String>) strSet95);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder99 = builder52.parentTypes((java.util.Set<java.lang.String>) strSet95);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(basicDBObject70);
        org.junit.Assert.assertNotNull(executableScript72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(serverAddressArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(builder98);
        org.junit.Assert.assertNotNull(builder99);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoCollection();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoLocalUser();
        boolean boolean14 = mongoDBRiverDefinition5.isSkipInitialImport();
        java.lang.String str15 = mongoDBRiverDefinition5.getScript();
        boolean boolean16 = mongoDBRiverDefinition5.isMongoUseSSL();
        int int17 = mongoDBRiverDefinition5.getThrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder27.build();
        java.lang.String str31 = mongoDBRiverDefinition30.getIncludeCollection();
        boolean boolean32 = mongoDBRiverDefinition30.isMongoSSLVerifyCertificate();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.String str34 = mongoDBRiverDefinition30.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition30.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions36 = mongoDBRiverDefinition30.getMongoClientOptions();
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) mongoClientOptions36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder40.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder40.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder40.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder40.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.dropCollection(false);
        com.mongodb.MongoClientOptions mongoClientOptions52 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoClientOptions(mongoClientOptions52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.throttleSize((int) (byte) -1);
        java.lang.Object obj58 = docScoreSearchScript0.unwrap((java.lang.Object) builder55);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext59 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(basicDBObject35);
        org.junit.Assert.assertNull(mongoClientOptions36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
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
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory26 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder30.build();
        boolean boolean34 = mongoDBRiverDefinition33.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings27, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings38 = new org.elasticsearch.river.RiverSettings(settings25, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings39 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.script.ScriptService scriptService40 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("import_all_collections", "disable_index_refresh", riverSettings39, scriptService40);
        boolean boolean42 = mongoDBRiverDefinition41.isImportAllCollections();
        java.util.Set<java.lang.String> strSet43 = mongoDBRiverDefinition41.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions44 = mongoDBRiverDefinition41.getMongoClientOptions();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoClientOptions44);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.throttleSize((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.mongoAdminPassword("script");
        org.elasticsearch.common.settings.Settings settings63 = null;
        org.elasticsearch.common.settings.Settings settings64 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory65 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings66 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder69.build();
        boolean boolean73 = mongoDBRiverDefinition72.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject74 = mongoDBRiverDefinition72.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings75 = new org.elasticsearch.river.RiverSettings(settings66, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
        org.elasticsearch.script.ExecutableScript executableScript76 = docScoreNativeScriptFactory65.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
        org.elasticsearch.river.RiverSettings riverSettings77 = new org.elasticsearch.river.RiverSettings(settings64, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
        org.elasticsearch.river.RiverSettings riverSettings78 = new org.elasticsearch.river.RiverSettings(settings63, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder62.mongoCollectionFilter(basicDBObject74);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "include_collection" + "'", obj20, "include_collection");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(strSet43);
        org.junit.Assert.assertNull(mongoClientOptions44);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(basicDBObject74);
        org.junit.Assert.assertNotNull(executableScript76);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
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
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoAdminPassword();
        java.lang.String str15 = mongoDBRiverDefinition9.getStatisticsIndexName();
        java.lang.String str16 = mongoDBRiverDefinition9.getTypeName();
        java.util.Set<java.lang.String> strSet17 = mongoDBRiverDefinition9.getIncludeFields();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strSet17);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        java.lang.String str7 = mongoDBRiverDefinition5.getRiverName();
        java.lang.String str8 = mongoDBRiverDefinition5.getScript();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        int int8 = mongoDBRiverDefinition5.getThrottleSize();
        int int9 = mongoDBRiverDefinition5.getSocketTimeout();
        java.lang.String str10 = mongoDBRiverDefinition5.getTypeName();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str13 = mongoDBRiverDefinition5.getStatisticsIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions14 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str15 = mongoDBRiverDefinition5.getMongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoGridFS(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder11.includeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder6.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = builder28.build();
        java.lang.String str32 = mongoDBRiverDefinition31.getStatisticsTypeName();
        java.lang.String str33 = mongoDBRiverDefinition31.getStatisticsIndexName();
        int int34 = mongoDBRiverDefinition31.getConnectTimeout();
        java.lang.String str35 = mongoDBRiverDefinition31.getStatisticsTypeName();
        int int36 = mongoDBRiverDefinition31.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoGridFS(true);
        java.lang.String[] strArray28 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder17.includeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.includeCollection("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoGridFS(true);
        java.lang.String[] strArray56 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder45.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder40.excludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder33.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet57);
        com.mongodb.MongoClientOptions mongoClientOptions63 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder10.mongoClientOptions(mongoClientOptions63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.scriptType("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition67 = builder66.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder66.disableIndexRefresh(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition67);
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        java.lang.String[] strArray6 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.includeFields((java.util.Set<java.lang.String>) strSet7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("disable_index_refresh.disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.mongoAdminUser("ssl_verify_certificate.ssl_verify_certificate");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminPassword();
        int int11 = mongoDBRiverDefinition5.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str13 = mongoDBRiverDefinition5.getScriptType();
        int int14 = mongoDBRiverDefinition5.getConnectTimeout();
        boolean boolean15 = mongoDBRiverDefinition5.isSkipInitialImport();
        int int16 = mongoDBRiverDefinition5.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoGridFS(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder11.includeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder6.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = builder28.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder28.mongoLocalUser("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.scriptType("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.includeCollection("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.statisticsIndexName("skip_initial_import");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.scriptType("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.typeName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.mongoAdminPassword("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder6.mongoSSLVerifyCertificate(true);
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
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.indexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder11.mongoLocalUser("concurrent_bulk_requests");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.typeName("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminPassword("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.typeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.riverName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder12.mongoLocalPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoGridFS(true);
        java.lang.String[] strArray38 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder27.includeFields((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder55.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder55.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoGridFS(true);
        java.lang.String[] strArray77 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder66.includeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder61.excludeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder54.excludeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder27.parentTypes((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder12.parentTypes((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder12.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder86.mongoAdminUser("flush_interval");
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder12.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder12.connectTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder12.script("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder12.riverName("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoUseSSL(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
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
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.includeCollection("hi!");
        com.mongodb.ServerAddress[] serverAddressArray54 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList55 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList55, serverAddressArray54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder51.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder51.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder51.typeName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder51.statisticsTypeName("disable_index_refresh.disable_index_refresh");
        com.mongodb.MongoClientOptions mongoClientOptions64 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoClientOptions(mongoClientOptions64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoGridFS(true);
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) builder67);
        // The following exception was thrown during execution in test generation
        try {
            float float69 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(serverAddressArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoLocalPassword("servers");
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder16.build();
        boolean boolean20 = mongoDBRiverDefinition19.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings22 = new org.elasticsearch.river.RiverSettings(settings13, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.script.ExecutableScript executableScript23 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings11, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings25 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder9.mongoCollectionFilter(basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings27 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.common.settings.Settings settings28 = riverSettings27.globalSettings();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = riverSettings27.settings();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(executableScript23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(settings28);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoUseSSL();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition5.getInitialTimestamp();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition5.getInitialTimestamp();
        boolean boolean10 = mongoDBRiverDefinition5.isMongoGridFS();
        java.lang.String str11 = mongoDBRiverDefinition5.getScript();
        boolean boolean12 = mongoDBRiverDefinition5.isMongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str7 = mongoDBRiverDefinition5.getMongoAdminPassword();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoDb();
        int int9 = mongoDBRiverDefinition5.getSocketTimeout();
        boolean boolean10 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        java.lang.String str11 = mongoDBRiverDefinition5.getScript();
        java.lang.String str12 = mongoDBRiverDefinition5.getScript();
        boolean boolean13 = mongoDBRiverDefinition5.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript3 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript3.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder9.build();
        java.lang.String str13 = mongoDBRiverDefinition12.getIncludeCollection();
        boolean boolean14 = mongoDBRiverDefinition12.isMongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition12.getIndexName();
        java.lang.Object obj16 = docScoreSearchScript3.unwrap((java.lang.Object) mongoDBRiverDefinition12);
        docScoreSearchScript3.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = builder22.build();
        java.lang.String str26 = mongoDBRiverDefinition25.getIncludeCollection();
        boolean boolean27 = mongoDBRiverDefinition25.isMongoSSLVerifyCertificate();
        java.lang.String str28 = mongoDBRiverDefinition25.getIndexName();
        java.lang.String str29 = mongoDBRiverDefinition25.getMongoDb();
        boolean boolean30 = mongoDBRiverDefinition25.isDisableIndexRefresh();
        java.lang.String str31 = mongoDBRiverDefinition25.getIndexName();
        java.lang.String str32 = mongoDBRiverDefinition25.getMongoLocalUser();
        java.lang.String str33 = mongoDBRiverDefinition25.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition25.getMongoOplogFilter();
        java.lang.String str35 = mongoDBRiverDefinition25.getMongoLocalUser();
        docScoreSearchScript3.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition25);
        com.mongodb.BasicDBObject basicDBObject37 = mongoDBRiverDefinition25.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings38 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = riverSettings38.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = riverSettings38.settings();
        org.elasticsearch.river.RiverSettings riverSettings41 = new org.elasticsearch.river.RiverSettings(settings1, strMap40);
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings0, strMap40);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = riverSettings42.settings();
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(basicDBObject34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap43);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        java.lang.String[] strArray6 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.includeFields((java.util.Set<java.lang.String>) strSet7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoAdminUser("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoLocalPassword("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.indexName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.mongoAdminPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.scriptType("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.importAllCollections(true);
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
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoLocalUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = mongoDBRiverDefinition5.getMongoServers();
        boolean boolean10 = mongoDBRiverDefinition5.isSkipInitialImport();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(serverAddressList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isMongoUseSSL();
        boolean boolean7 = mongoDBRiverDefinition5.isAdvancedTransformation();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoCollection();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoGridFS();
        java.lang.String str10 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str11 = mongoDBRiverDefinition5.getStatisticsIndexName();
        boolean boolean12 = mongoDBRiverDefinition5.isStoreStatistics();
        com.mongodb.MongoClientOptions mongoClientOptions13 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str14 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null." + "'", str14, "null.");
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getIncludeFields();
        boolean boolean11 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str12 = mongoDBRiverDefinition5.getRiverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.mongoLocalUser("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoAdminUser("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = builder48.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder48.statisticsIndexName("drop_collection");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder16.build();
        boolean boolean20 = mongoDBRiverDefinition19.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings22 = new org.elasticsearch.river.RiverSettings(settings13, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.script.ExecutableScript executableScript23 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings11, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder6.mongoOplogFilter(basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.throttleSize(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.riverName("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder29.throttleSize((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.indexName("credentials");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(executableScript23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.statisticsIndexName("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.mongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.mongoDb("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.disableIndexRefresh(false);
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
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.throttleSize(1);
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoClientOptions(mongoClientOptions15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.disableIndexRefresh(true);
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoClientOptions(mongoClientOptions24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = builder27.build();
        int int29 = mongoDBRiverDefinition28.getSocketTimeout();
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = mongoDBRiverDefinition28.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder16.mongoServers(serverAddressList30);
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
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(serverAddressList30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.dropCollection(false);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.indexName("import_all_collections.import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoAdminPassword("throttle_size");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoCollection();
        int int12 = mongoDBRiverDefinition5.getConnectTimeout();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str14 = mongoDBRiverDefinition5.getMongoLocalPassword();
        boolean boolean15 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        boolean boolean16 = mongoDBRiverDefinition5.isSkipInitialImport();
        java.lang.String str17 = mongoDBRiverDefinition5.getIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
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
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = docScoreSearchScript0.unwrap(obj66);
        org.apache.lucene.search.Scorer scorer68 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoGridFS(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder11.includeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder6.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder6.skipInitialImport(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getScript();
        boolean boolean11 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoOplogNamespace();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition9.getMongoOplogFilter();
        boolean boolean14 = mongoDBRiverDefinition9.isDropCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null." + "'", str12, "null.");
        org.junit.Assert.assertNull(basicDBObject13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoCollection();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoGridFS();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminPassword();
        boolean boolean11 = mongoDBRiverDefinition5.isMongoUseSSL();
        boolean boolean12 = mongoDBRiverDefinition5.isImportAllCollections();
        java.lang.String str13 = mongoDBRiverDefinition5.getTypeName();
        boolean boolean14 = mongoDBRiverDefinition5.isMongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str13 = mongoDBRiverDefinition9.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition9.getMongoOplogFilter();
        java.lang.String str15 = mongoDBRiverDefinition9.getMongoCollection();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings19 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = riverSettings19.settings();
        org.elasticsearch.river.RiverSettings riverSettings21 = new org.elasticsearch.river.RiverSettings(settings2, strMap20);
        org.elasticsearch.script.ScriptService scriptService22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("host.filter", "name", riverSettings21, scriptService22);
        boolean boolean24 = mongoDBRiverDefinition23.isMongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp25 = mongoDBRiverDefinition23.getInitialTimestamp();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardTimestamp25);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
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
        boolean boolean34 = mongoDBRiverDefinition22.isAdvancedTransformation();
        java.lang.String str35 = mongoDBRiverDefinition22.getMongoDb();
        boolean boolean36 = mongoDBRiverDefinition22.isMongoGridFS();
        boolean boolean37 = mongoDBRiverDefinition22.isAdvancedTransformation();
        boolean boolean38 = mongoDBRiverDefinition22.isSkipInitialImport();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(basicDBObject31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder15.build();
        boolean boolean19 = mongoDBRiverDefinition18.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder10.mongoOplogFilter(basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder10.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder10.mongoAdminUser("script");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.mongoAdminUser("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.connectTimeout(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.mongoCollection("user");
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
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoGridFS(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder11.includeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder6.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.riverName("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("");
        java.lang.String[] strArray41 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder35.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder34.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.advancedTransformation(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoLocalUser();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        int int11 = mongoDBRiverDefinition5.getThrottleSize();
        boolean boolean12 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str13 = mongoDBRiverDefinition5.getStatisticsTypeName();
        java.lang.String str14 = mongoDBRiverDefinition5.getStatisticsTypeName();
        int int15 = mongoDBRiverDefinition5.getSocketTimeout();
        boolean boolean16 = mongoDBRiverDefinition5.isSkipInitialImport();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition5.getMongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(basicDBObject17);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.riverIndexName("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoAdminUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.mongoSecondaryReadPreference(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.riverIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("");
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.lang.String str10 = mongoDBRiverDefinition5.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition5.getMongoServers();
        int int12 = mongoDBRiverDefinition5.getThrottleSize();
        boolean boolean13 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = mongoDBRiverDefinition5.getInitialTimestamp();
        boolean boolean15 = mongoDBRiverDefinition5.isAdvancedTransformation();
        java.lang.String str16 = mongoDBRiverDefinition5.getMongoAdminPassword();
        boolean boolean17 = mongoDBRiverDefinition5.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
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
        int int18 = mongoDBRiverDefinition10.getConnectTimeout();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition10.getParentTypes();
        java.lang.String str20 = mongoDBRiverDefinition10.getIndexName();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoLocalPassword("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("name");
        java.util.Set<java.lang.String> strSet11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.excludeFields(strSet11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        java.lang.String[] strArray6 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.includeFields((java.util.Set<java.lang.String>) strSet7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.connectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder15.build();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition18.getIncludeFields();
        int int20 = mongoDBRiverDefinition18.getThrottleSize();
        java.lang.String str21 = mongoDBRiverDefinition18.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition18.getMongoOplogFilter();
        java.lang.String str23 = mongoDBRiverDefinition18.getStatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1000 + "'", int20 == 1000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(basicDBObject22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
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
        java.lang.String str55 = mongoDBRiverDefinition47.getStatisticsIndexName();
        java.lang.String str56 = mongoDBRiverDefinition47.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(mongoClientOptions49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(wildcardTimestamp51);
        org.junit.Assert.assertNull(strSet52);
        org.junit.Assert.assertNotNull(serverAddressList53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        java.lang.String[] strArray14 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.includeFields((java.util.Set<java.lang.String>) strSet15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.storeStatistics(true);
        java.util.Set<java.lang.String> strSet22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.includeFields(strSet22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("credentials");
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) "credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.mongoClientOptions(mongoClientOptions37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoAdminPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoAdminPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.disableIndexRefresh(false);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) builder44);
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "credentials" + "'", obj26, "credentials");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.riverName("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.includeCollection("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder46.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition5.getParentTypes();
        boolean boolean8 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition5.getInitialTimestamp();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition5.getMongoClientOptions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(mongoClientOptions11);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition5.isAdvancedTransformation();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition5.getInitialTimestamp();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminPassword();
        boolean boolean11 = mongoDBRiverDefinition5.isDropCollection();
        int int12 = mongoDBRiverDefinition5.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str12 = mongoDBRiverDefinition5.getStatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition5.getMongoOplogFilter();
        int int14 = mongoDBRiverDefinition5.getThrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(basicDBObject13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory16 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        boolean boolean24 = mongoDBRiverDefinition23.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject25 = mongoDBRiverDefinition23.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory16.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings28 = new org.elasticsearch.river.RiverSettings(settings15, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.mongoOplogFilter(basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings31 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder4.build();
        boolean boolean8 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        boolean boolean9 = mongoDBRiverDefinition7.isDropCollection();
        java.lang.String str10 = mongoDBRiverDefinition7.getMongoAdminPassword();
        boolean boolean11 = mongoDBRiverDefinition7.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(basicDBObject12);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getParentTypes();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoAdminUser();
        boolean boolean12 = mongoDBRiverDefinition5.isStoreStatistics();
        boolean boolean13 = mongoDBRiverDefinition5.isMongoUseSSL();
        java.lang.String str14 = mongoDBRiverDefinition5.getScriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.statisticsIndexName("include_collection");
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.mongoClientOptions(mongoClientOptions26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.mongoClientOptions(mongoClientOptions46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.typeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder49.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.riverIndexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.mongoGridFS(true);
        java.lang.String[] strArray73 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder62.includeFields((java.util.Set<java.lang.String>) strSet74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder57.includeFields((java.util.Set<java.lang.String>) strSet74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder32.parentTypes((java.util.Set<java.lang.String>) strSet74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder21.parentTypes((java.util.Set<java.lang.String>) strSet74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder8.includeFields((java.util.Set<java.lang.String>) strSet74);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.riverName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder15.excludeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder6.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition39);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        int int8 = mongoDBRiverDefinition5.getThrottleSize();
        int int9 = mongoDBRiverDefinition5.getSocketTimeout();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        int int11 = mongoDBRiverDefinition5.getSocketTimeout();
        boolean boolean12 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        boolean boolean13 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition5.getIndexName();
        boolean boolean15 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.throttleSize((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.connectTimeout((int) (short) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.riverName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoGridFS(true);
        java.lang.String[] strArray42 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder31.includeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder17.excludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder8.includeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.socketTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.statisticsIndexName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.riverName("host.host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder50.connectTimeout((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory16 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        boolean boolean24 = mongoDBRiverDefinition23.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject25 = mongoDBRiverDefinition23.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory16.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings28 = new org.elasticsearch.river.RiverSettings(settings15, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings29 = new org.elasticsearch.river.RiverSettings(settings14, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder13.mongoCollectionFilter(basicDBObject25);
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder30.mongoSSLVerifyCertificate(true);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder64.dropCollection(false);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean11 = mongoDBRiverDefinition5.isMongoUseSSL();
        java.lang.String str12 = mongoDBRiverDefinition5.getRiverName();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        int int14 = mongoDBRiverDefinition5.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder3.build();
        boolean boolean7 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        int int9 = mongoDBRiverDefinition6.getThrottleSize();
        int int10 = mongoDBRiverDefinition6.getSocketTimeout();
        java.lang.String str11 = mongoDBRiverDefinition6.getTypeName();
        java.lang.String str12 = mongoDBRiverDefinition6.getMongoAdminUser();
        int int13 = mongoDBRiverDefinition6.getConnectTimeout();
        boolean boolean14 = mongoDBRiverDefinition6.isStoreStatistics();
        boolean boolean15 = mongoDBRiverDefinition6.isMongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition6.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = riverSettings17.settings();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.scriptType("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.statisticsIndexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder19.build();
        boolean boolean23 = mongoDBRiverDefinition22.isDisableIndexRefresh();
        boolean boolean24 = mongoDBRiverDefinition22.isDisableIndexRefresh();
        boolean boolean25 = mongoDBRiverDefinition22.isAdvancedTransformation();
        boolean boolean26 = mongoDBRiverDefinition22.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition22.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition22.getMongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongoDBRiverDefinition22.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder14.mongoServers(serverAddressList29);
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
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoCollection();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoGridFS();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminPassword();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoCollection();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition5.getExcludeFields();
        boolean boolean13 = mongoDBRiverDefinition5.isAdvancedTransformation();
        boolean boolean14 = mongoDBRiverDefinition5.isAdvancedTransformation();
        boolean boolean15 = mongoDBRiverDefinition5.isStoreStatistics();
        java.lang.String str16 = mongoDBRiverDefinition5.getIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions17 = mongoDBRiverDefinition5.getMongoClientOptions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(mongoClientOptions17);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str8 = mongoDBRiverDefinition5.getStatisticsIndexName();
        boolean boolean9 = mongoDBRiverDefinition5.isSkipInitialImport();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str11 = mongoDBRiverDefinition5.getTypeName();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition5.getExcludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = mongoDBRiverDefinition5.getMongoServers();
        boolean boolean10 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        java.lang.String str11 = mongoDBRiverDefinition5.getScriptType();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str13 = mongoDBRiverDefinition5.getScriptType();
        int int14 = mongoDBRiverDefinition5.getSocketTimeout();
        java.lang.String str15 = mongoDBRiverDefinition5.getRiverName();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition5.getMongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(serverAddressList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(basicDBObject16);
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.includeCollection("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.mongoAdminUser("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoDb("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoGridFS(true);
        java.lang.String[] strArray51 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder40.includeFields((java.util.Set<java.lang.String>) strSet52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder33.includeFields((java.util.Set<java.lang.String>) strSet52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder18.excludeFields((java.util.Set<java.lang.String>) strSet52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoCollection("ssl_verify_certificate.ssl_verify_certificate");
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        java.lang.String[] strArray6 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.includeFields((java.util.Set<java.lang.String>) strSet7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.connectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.riverIndexName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = builder22.build();
        java.lang.String str26 = mongoDBRiverDefinition25.getIncludeCollection();
        boolean boolean27 = mongoDBRiverDefinition25.isMongoSSLVerifyCertificate();
        java.lang.String str28 = mongoDBRiverDefinition25.getIndexName();
        java.lang.String str29 = mongoDBRiverDefinition25.getMongoDb();
        boolean boolean30 = mongoDBRiverDefinition25.isDisableIndexRefresh();
        java.lang.String str31 = mongoDBRiverDefinition25.getIndexName();
        java.lang.String str32 = mongoDBRiverDefinition25.getIncludeCollection();
        boolean boolean33 = mongoDBRiverDefinition25.isDropCollection();
        java.lang.String str34 = mongoDBRiverDefinition25.getTypeName();
        boolean boolean35 = mongoDBRiverDefinition25.isAdvancedTransformation();
        java.lang.String str36 = mongoDBRiverDefinition25.getTypeName();
        com.mongodb.BasicDBObject basicDBObject37 = mongoDBRiverDefinition25.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder17.mongoOplogFilter(basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.mongoDb("parent_types");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder8.build();
        boolean boolean12 = mongoDBRiverDefinition11.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory4.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        org.elasticsearch.script.ScriptService scriptService18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("import_all_collections", "disable_index_refresh", riverSettings17, scriptService18);
        java.lang.String str20 = mongoDBRiverDefinition19.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        boolean boolean22 = mongoDBRiverDefinition19.isMongoUseSSL();
        java.lang.String str23 = mongoDBRiverDefinition19.getRiverName();
        java.lang.String str24 = mongoDBRiverDefinition19.getIndexName();
        boolean boolean25 = mongoDBRiverDefinition19.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "import_all_collections" + "'", str23, "import_all_collections");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "import_all_collections" + "'", str24, "import_all_collections");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.riverName("actions");
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoClientOptions(mongoClientOptions17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.connectTimeout((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder16.dropCollection(false);
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
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.throttleSize(1);
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoClientOptions(mongoClientOptions15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.indexName("");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.common.settings.Settings settings21 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory22.newScript(strMap23);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder29.build();
        boolean boolean33 = mongoDBRiverDefinition32.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition32.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings35 = new org.elasticsearch.river.RiverSettings(settings26, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject34);
        org.elasticsearch.script.ExecutableScript executableScript36 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject34);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject34);
        org.elasticsearch.common.settings.Settings settings38 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder39.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = builder48.build();
        boolean boolean52 = mongoDBRiverDefinition51.isDisableIndexRefresh();
        java.lang.String str53 = mongoDBRiverDefinition51.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject54 = mongoDBRiverDefinition51.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder45.mongoCollectionFilter(basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings56 = new org.elasticsearch.river.RiverSettings(settings38, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.script.ExecutableScript executableScript57 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings21, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings59 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings60 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder14.mongoCollectionFilter(basicDBObject54);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(executableScript24);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(basicDBObject34);
        org.junit.Assert.assertNotNull(executableScript36);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(basicDBObject54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(executableScript57);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        java.lang.String[] strArray6 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.includeFields((java.util.Set<java.lang.String>) strSet7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder29.build();
        java.lang.String str33 = mongoDBRiverDefinition32.getRiverIndexName();
        boolean boolean34 = mongoDBRiverDefinition32.isDisableIndexRefresh();
        boolean boolean35 = mongoDBRiverDefinition32.isStoreStatistics();
        java.lang.String str36 = mongoDBRiverDefinition32.getMongoAdminUser();
        java.lang.String str37 = mongoDBRiverDefinition32.getScript();
        java.lang.String str38 = mongoDBRiverDefinition32.getScriptType();
        int int39 = mongoDBRiverDefinition32.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject40 = mongoDBRiverDefinition32.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder22.mongoOplogFilter(basicDBObject40);
        com.mongodb.MongoClientOptions mongoClientOptions42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoClientOptions(mongoClientOptions42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoLocalUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.disableIndexRefresh(true);
        org.elasticsearch.common.settings.Settings settings53 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory54 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings55 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = builder58.build();
        boolean boolean62 = mongoDBRiverDefinition61.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject63 = mongoDBRiverDefinition61.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings64 = new org.elasticsearch.river.RiverSettings(settings55, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject63);
        org.elasticsearch.script.ExecutableScript executableScript65 = docScoreNativeScriptFactory54.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject63);
        org.elasticsearch.river.RiverSettings riverSettings66 = new org.elasticsearch.river.RiverSettings(settings53, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder52.mongoCollectionFilter(basicDBObject63);
        com.mongodb.ServerAddress[] serverAddressArray68 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList69 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList69, serverAddressArray68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder52.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = builder74.build();
        java.lang.String str78 = mongoDBRiverDefinition77.getIncludeCollection();
        java.util.Set<java.lang.String> strSet79 = mongoDBRiverDefinition77.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList80 = mongoDBRiverDefinition77.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder71.mongoServers(serverAddressList80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder45.mongoServers(serverAddressList80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder9.mongoServers(serverAddressList80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder9.disableIndexRefresh(true);
        com.mongodb.MongoClientOptions mongoClientOptions86 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder85.mongoClientOptions(mongoClientOptions86);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(basicDBObject40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(basicDBObject63);
        org.junit.Assert.assertNotNull(executableScript65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(serverAddressArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(strSet79);
        org.junit.Assert.assertNotNull(serverAddressList80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
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
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext71 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("import_all_collections");
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoClientOptions(mongoClientOptions17);
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.mongoDb("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.throttleSize(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder27.build();
        boolean boolean31 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str32 = mongoDBRiverDefinition30.getIncludeCollection();
        java.lang.String str33 = mongoDBRiverDefinition30.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition30.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition30.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder18.mongoCollectionFilter(basicDBObject35);
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
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(basicDBObject34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoAdminPassword();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition5.getInitialTimestamp();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str11 = mongoDBRiverDefinition5.getTypeName();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition5.getExcludeFields();
        boolean boolean13 = mongoDBRiverDefinition5.isMongoGridFS();
        java.lang.String str14 = mongoDBRiverDefinition5.getStatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder67.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions76 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.mongoClientOptions(mongoClientOptions76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder73.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.throttleSize(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.scriptType("null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder83.dropCollection(false);
        docScoreSearchScript0.setNextVar("options", (java.lang.Object) builder83);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(100.0f);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoClientOptions(mongoClientOptions11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoLocalUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.riverName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder55.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder55.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoGridFS(true);
        java.lang.String[] strArray77 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder66.includeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder61.excludeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder52.excludeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder43.includeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder34.includeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder27.includeFields((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder12.includeFields((java.util.Set<java.lang.String>) strSet78);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder12.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder12.connectTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder12.script("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.disableIndexRefresh(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoUseSSL();
        boolean boolean8 = mongoDBRiverDefinition5.isMongoGridFS();
        boolean boolean9 = mongoDBRiverDefinition5.isDropCollection();
        boolean boolean10 = mongoDBRiverDefinition5.isDropCollection();
        boolean boolean11 = mongoDBRiverDefinition5.isMongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.mongoDb("local");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory14.newScript(strMap15);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory17 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder21.build();
        boolean boolean25 = mongoDBRiverDefinition24.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject26 = mongoDBRiverDefinition24.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings27 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.common.settings.Settings settings30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.mongoClientOptions(mongoClientOptions40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.includeCollection("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings57 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory58 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings59 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = builder62.build();
        boolean boolean66 = mongoDBRiverDefinition65.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject67 = mongoDBRiverDefinition65.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings68 = new org.elasticsearch.river.RiverSettings(settings59, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ExecutableScript executableScript69 = docScoreNativeScriptFactory58.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings70 = new org.elasticsearch.river.RiverSettings(settings57, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder52.mongoOplogFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder43.mongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings73 = new org.elasticsearch.river.RiverSettings(settings30, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ExecutableScript executableScript74 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder7.mongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings76 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings77 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.RiverSettings riverSettings78 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ScriptService scriptService79 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition80 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ssl_verify_certificate", "user", riverSettings78, scriptService79);
        boolean boolean81 = mongoDBRiverDefinition80.isSkipInitialImport();
        java.lang.String str82 = mongoDBRiverDefinition80.getRiverName();
        int int83 = mongoDBRiverDefinition80.getThrottleSize();
        java.lang.String str84 = mongoDBRiverDefinition80.getScript();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(basicDBObject67);
        org.junit.Assert.assertNotNull(executableScript69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(executableScript74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "ssl_verify_certificate" + "'", str82, "ssl_verify_certificate");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition5.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition5.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition5.getMongoServers();
        java.lang.String str14 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean15 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str16 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition5.getMongoServers();
        boolean boolean18 = mongoDBRiverDefinition5.isMongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder12.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.socketTimeout(27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoLocalPassword("name");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsIndexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        java.util.Set<java.lang.String> strSet15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.parentTypes(strSet15);
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
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoDb("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.script("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.connectTimeout(8);
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
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        org.elasticsearch.common.settings.Settings settings4 = null;
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
        java.lang.String str40 = mongoDBRiverDefinition27.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject41 = mongoDBRiverDefinition27.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.script.ScriptService scriptService43 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "user", riverSettings42, scriptService43);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = riverSettings42.settings();
        org.elasticsearch.script.ScriptService scriptService46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("user", "collection", riverSettings42, scriptService46);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(basicDBObject36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition47);
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
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
        docScoreSearchScript0.setNextScore((float) (-1));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        java.lang.String[] strArray15 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder4.includeFields((java.util.Set<java.lang.String>) strSet16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.includeCollection("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.riverName("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.scriptType("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.riverIndexName("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoAdminUser("bulk_timeout");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str7 = mongoDBRiverDefinition5.getMongoAdminPassword();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoDb();
        int int9 = mongoDBRiverDefinition5.getSocketTimeout();
        boolean boolean10 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        java.lang.String str11 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str12 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean13 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition5.getTypeName();
        java.lang.String str15 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str16 = mongoDBRiverDefinition5.getMongoLocalPassword();
        boolean boolean17 = mongoDBRiverDefinition5.isMongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoLocalUser("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.connectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.skipInitialImport(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
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
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = docScoreSearchScript0.unwrap(obj23);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder29.build();
        java.lang.String str33 = mongoDBRiverDefinition32.getIncludeCollection();
        boolean boolean34 = mongoDBRiverDefinition32.isMongoSSLVerifyCertificate();
        java.lang.String str35 = mongoDBRiverDefinition32.getIndexName();
        java.lang.String str36 = mongoDBRiverDefinition32.getMongoDb();
        java.lang.String str37 = mongoDBRiverDefinition32.getMongoAdminPassword();
        int int38 = mongoDBRiverDefinition32.getConnectTimeout();
        int int39 = mongoDBRiverDefinition32.getConnectTimeout();
        java.lang.String str40 = mongoDBRiverDefinition32.getMongoAdminUser();
        java.lang.String str41 = mongoDBRiverDefinition32.getStatisticsTypeName();
        boolean boolean42 = mongoDBRiverDefinition32.isAdvancedTransformation();
        int int43 = mongoDBRiverDefinition32.getThrottleSize();
        boolean boolean44 = mongoDBRiverDefinition32.isMongoSSLVerifyCertificate();
        java.lang.Object obj45 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition32);
        java.lang.String str46 = mongoDBRiverDefinition32.getMongoOplogNamespace();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "null." + "'", str46, "null.");
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoAdminPassword();
        boolean boolean9 = mongoDBRiverDefinition5.isImportAllCollections();
        boolean boolean10 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoAdminUser();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition5.getParentTypes();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoCollection();
        java.lang.String str9 = mongoDBRiverDefinition5.getStatisticsTypeName();
        boolean boolean10 = mongoDBRiverDefinition5.isSkipInitialImport();
        int int11 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str12 = mongoDBRiverDefinition5.getTypeName();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(basicDBObject13);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.scriptType("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.connectTimeout((int) (short) 100);
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.includeCollection("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.statisticsTypeName("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder33.build();
        java.lang.String str37 = mongoDBRiverDefinition36.getIncludeCollection();
        boolean boolean38 = mongoDBRiverDefinition36.isMongoSSLVerifyCertificate();
        java.lang.String str39 = mongoDBRiverDefinition36.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject40 = mongoDBRiverDefinition36.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder28.mongoOplogFilter(basicDBObject40);
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings15, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder14.mongoOplogFilter(basicDBObject40);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(basicDBObject40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        java.lang.String str7 = mongoDBRiverDefinition5.getMongoAdminPassword();
        java.lang.String str8 = mongoDBRiverDefinition5.getMongoDb();
        int int9 = mongoDBRiverDefinition5.getSocketTimeout();
        boolean boolean10 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        java.lang.String str11 = mongoDBRiverDefinition5.getScript();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoCollection();
        boolean boolean13 = mongoDBRiverDefinition5.isSkipInitialImport();
        boolean boolean14 = mongoDBRiverDefinition5.isAdvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.riverIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoLocalPassword("script.script");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.indexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.socketTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.statisticsIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.statisticsTypeName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.scriptType("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = builder21.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder29.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoGridFS(true);
        java.lang.String[] strArray51 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder40.includeFields((java.util.Set<java.lang.String>) strSet52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder35.excludeFields((java.util.Set<java.lang.String>) strSet52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder35.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder35.riverIndexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder35.script("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition67 = builder64.build();
        java.lang.String str68 = mongoDBRiverDefinition67.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions69 = mongoDBRiverDefinition67.getMongoClientOptions();
        boolean boolean70 = mongoDBRiverDefinition67.isDropCollection();
        java.lang.String str71 = mongoDBRiverDefinition67.getStatisticsIndexName();
        int int72 = mongoDBRiverDefinition67.getThrottleSize();
        java.util.List<com.mongodb.ServerAddress> serverAddressList73 = mongoDBRiverDefinition67.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder61.mongoServers(serverAddressList73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder21.mongoServers(serverAddressList73);
        com.mongodb.MongoClientOptions mongoClientOptions76 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder21.mongoClientOptions(mongoClientOptions76);
        org.elasticsearch.common.settings.Settings settings78 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition84 = builder81.build();
        boolean boolean85 = mongoDBRiverDefinition84.isDisableIndexRefresh();
        boolean boolean86 = mongoDBRiverDefinition84.isDropCollection();
        java.lang.String str87 = mongoDBRiverDefinition84.getMongoAdminPassword();
        boolean boolean88 = mongoDBRiverDefinition84.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject89 = mongoDBRiverDefinition84.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings90 = new org.elasticsearch.river.RiverSettings(settings78, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject89);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder77.mongoOplogFilter(basicDBObject89);
        org.elasticsearch.river.RiverSettings riverSettings92 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject89);
        org.elasticsearch.river.RiverSettings riverSettings93 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject89);
        org.elasticsearch.river.RiverSettings riverSettings94 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject89);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNull(mongoClientOptions69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(serverAddressList73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(basicDBObject89);
        org.junit.Assert.assertNotNull(builder91);
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        int int8 = mongoDBRiverDefinition5.getThrottleSize();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getExcludeFields();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = mongoDBRiverDefinition5.getInitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoCollection();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition5.getMongoLocalUser();
        boolean boolean14 = mongoDBRiverDefinition5.isMongoGridFS();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition5.getMongoClientOptions();
        int int16 = mongoDBRiverDefinition5.getSocketTimeout();
        java.lang.String str17 = mongoDBRiverDefinition5.getStatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        int int8 = mongoDBRiverDefinition5.getThrottleSize();
        int int9 = mongoDBRiverDefinition5.getSocketTimeout();
        java.lang.String str10 = mongoDBRiverDefinition5.getScript();
        int int11 = mongoDBRiverDefinition5.getConnectTimeout();
        boolean boolean12 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str14 = mongoDBRiverDefinition5.getMongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(basicDBObject13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder7.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.includeCollection("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder7.connectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.advancedTransformation(false);
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
        java.lang.String str31 = mongoDBRiverDefinition22.getStatisticsIndexName();
        int int32 = mongoDBRiverDefinition22.getConnectTimeout();
        boolean boolean33 = mongoDBRiverDefinition22.isAdvancedTransformation();
        boolean boolean34 = mongoDBRiverDefinition22.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList35 = mongoDBRiverDefinition22.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder12.mongoServers(serverAddressList35);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(serverAddressList35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoGridFS(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder24.includeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder43.build();
        java.lang.String str47 = mongoDBRiverDefinition46.getIncludeCollection();
        boolean boolean48 = mongoDBRiverDefinition46.isMongoSSLVerifyCertificate();
        java.lang.String str49 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str50 = mongoDBRiverDefinition46.getMongoDb();
        boolean boolean51 = mongoDBRiverDefinition46.isDisableIndexRefresh();
        java.lang.String str52 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str53 = mongoDBRiverDefinition46.getMongoAdminPassword();
        boolean boolean54 = mongoDBRiverDefinition46.isDropCollection();
        boolean boolean55 = mongoDBRiverDefinition46.isMongoGridFS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList56 = mongoDBRiverDefinition46.getMongoServers();
        boolean boolean57 = mongoDBRiverDefinition46.isSkipInitialImport();
        java.util.List<com.mongodb.ServerAddress> serverAddressList58 = mongoDBRiverDefinition46.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder40.mongoServers(serverAddressList58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder40.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder40.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.connectTimeout(27017);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serverAddressList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(serverAddressList58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition5.getIncludeFields();
        java.lang.String str9 = mongoDBRiverDefinition5.getScript();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        boolean boolean11 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(basicDBObject12);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder12.build();
        java.lang.String str16 = mongoDBRiverDefinition15.getIncludeCollection();
        java.lang.String str17 = mongoDBRiverDefinition15.getMongoAdminPassword();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition15.getMongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition15.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder2.mongoServers(serverAddressList20);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.statisticsIndexName("port");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder16.build();
        boolean boolean20 = mongoDBRiverDefinition19.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings22 = new org.elasticsearch.river.RiverSettings(settings13, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.script.ExecutableScript executableScript23 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings11, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder6.mongoOplogFilter(basicDBObject21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.disableIndexRefresh(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(executableScript23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.riverIndexName("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.script("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.statisticsTypeName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoAdminUser("bulk_size");
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
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoLocalPassword("servers");
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoClientOptions(mongoClientOptions31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.throttleSize(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder28.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("script");
        java.lang.Object obj43 = docScoreSearchScript0.unwrap((java.lang.Object) "script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoGridFS(true);
        java.lang.String[] strArray60 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder49.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.socketTimeout((int) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.mongoDb("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition68 = builder63.build();
        docScoreSearchScript0.setNextVar("bulk", (java.lang.Object) mongoDBRiverDefinition68);
        // The following exception was thrown during execution in test generation
        try {
            double double70 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "script" + "'", obj43, "script");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition68);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition5.getIncludeFields();
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition5.getMongoCollectionFilter();
        boolean boolean9 = mongoDBRiverDefinition5.isImportAllCollections();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition5.getIncludeFields();
        boolean boolean11 = mongoDBRiverDefinition5.isImportAllCollections();
        int int12 = mongoDBRiverDefinition5.getThrottleSize();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition5.getIncludeFields();
        boolean boolean14 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        boolean boolean15 = mongoDBRiverDefinition5.isStoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str11 = mongoDBRiverDefinition5.getMongoDb();
        com.mongodb.MongoClientOptions mongoClientOptions12 = mongoDBRiverDefinition5.getMongoClientOptions();
        boolean boolean13 = mongoDBRiverDefinition5.isMongoGridFS();
        java.lang.String str14 = mongoDBRiverDefinition5.getMongoLocalPassword();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition5.getIncludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strSet15);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        boolean boolean10 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        java.lang.String str11 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean13 = mongoDBRiverDefinition5.isDropCollection();
        java.lang.String str14 = mongoDBRiverDefinition5.getTypeName();
        java.lang.String str15 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        boolean boolean16 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        boolean boolean17 = mongoDBRiverDefinition5.isSkipInitialImport();
        java.lang.String str18 = mongoDBRiverDefinition5.getMongoCollection();
        int int19 = mongoDBRiverDefinition5.getSocketTimeout();
        boolean boolean20 = mongoDBRiverDefinition5.isAdvancedTransformation();
        java.lang.String str21 = mongoDBRiverDefinition5.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null." + "'", str15, "null.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.statisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.advancedTransformation(false);
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoClientOptions(mongoClientOptions17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.includeCollection("disable_index_refresh");
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
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
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
        java.lang.String str14 = mongoDBRiverDefinition9.getMongoAdminPassword();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition9.getInitialTimestamp();
        java.lang.String str16 = mongoDBRiverDefinition9.getIncludeCollection();
        java.lang.String str17 = mongoDBRiverDefinition9.getScript();
        boolean boolean18 = mongoDBRiverDefinition9.isStoreStatistics();
        java.lang.String str19 = mongoDBRiverDefinition9.getMongoDb();
        boolean boolean20 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        com.mongodb.MongoClientOptions mongoClientOptions21 = mongoDBRiverDefinition9.getMongoClientOptions();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(mongoClientOptions21);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("hi!");
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.statisticsTypeName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.connectTimeout((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.storeStatistics(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.socketTimeout((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.dropCollection(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoDb("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.indexName("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder15.build();
        java.lang.String str19 = mongoDBRiverDefinition18.getIncludeCollection();
        boolean boolean20 = mongoDBRiverDefinition18.isMongoSSLVerifyCertificate();
        java.lang.String str21 = mongoDBRiverDefinition18.getIndexName();
        java.lang.String str22 = mongoDBRiverDefinition18.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition18.getMongoOplogFilter();
        java.lang.String str24 = mongoDBRiverDefinition18.getMongoCollection();
        java.lang.String str25 = mongoDBRiverDefinition18.getMongoLocalPassword();
        java.lang.String str26 = mongoDBRiverDefinition18.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder12.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder12.riverIndexName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        java.lang.String[] strArray37 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder31.includeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder30.excludeFields((java.util.Set<java.lang.String>) strSet38);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(basicDBObject23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.script("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder14.build();
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
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder19.build();
        boolean boolean23 = mongoDBRiverDefinition22.isDisableIndexRefresh();
        java.lang.String str24 = mongoDBRiverDefinition22.getIncludeCollection();
        com.mongodb.BasicDBObject basicDBObject25 = mongoDBRiverDefinition22.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings16, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.common.settings.Settings settings27 = riverSettings26.globalSettings();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) settings27);
        docScoreSearchScript0.setNextScore((float) 1L);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0f + "'", obj2, 10.0f);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNull(settings27);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder2.build();
        java.lang.String str6 = mongoDBRiverDefinition5.getIncludeCollection();
        boolean boolean7 = mongoDBRiverDefinition5.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition5.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoDb();
        java.lang.String str10 = mongoDBRiverDefinition5.getMongoAdminPassword();
        boolean boolean11 = mongoDBRiverDefinition5.isSkipInitialImport();
        java.lang.String str12 = mongoDBRiverDefinition5.getMongoOplogNamespace();
        int int13 = mongoDBRiverDefinition5.getConnectTimeout();
        boolean boolean14 = mongoDBRiverDefinition5.isSkipInitialImport();
        boolean boolean15 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null." + "'", str12, "null.");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.includeCollection("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.statisticsTypeName("bulk_size");
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoClientOptions(mongoClientOptions13);
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
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
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
        boolean boolean34 = mongoDBRiverDefinition22.isAdvancedTransformation();
        java.lang.String str35 = mongoDBRiverDefinition22.getRiverName();
        boolean boolean36 = mongoDBRiverDefinition22.isMongoSSLVerifyCertificate();
        boolean boolean37 = mongoDBRiverDefinition22.isSkipInitialImport();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(basicDBObject31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }
}

