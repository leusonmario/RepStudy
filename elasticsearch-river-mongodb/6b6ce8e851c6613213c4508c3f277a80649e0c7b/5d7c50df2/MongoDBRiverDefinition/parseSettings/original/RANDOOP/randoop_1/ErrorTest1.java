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
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float33 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("ssl");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.mongoLocalUser("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder36.mongoLocalPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder36.throttleSize((int) '4');
        java.lang.Object obj47 = docScoreSearchScript0.unwrap((java.lang.Object) builder46);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript49 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj51 = docScoreSearchScript49.unwrap((java.lang.Object) 100L);
        docScoreSearchScript49.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder54.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder54.build();
        java.lang.Boolean boolean64 = mongoDBRiverDefinition63.isMongos();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition63.getExcludeFields();
        boolean boolean66 = mongoDBRiverDefinition63.isStoreStatistics();
        boolean boolean67 = mongoDBRiverDefinition63.isMongoSecondaryReadPreference();
        int int68 = mongoDBRiverDefinition63.getConnectTimeout();
        java.lang.Object obj69 = docScoreSearchScript49.unwrap((java.lang.Object) mongoDBRiverDefinition63);
        docScoreSearchScript0.setNextVar("script.disable_dynamic", (java.lang.Object) docScoreSearchScript49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float71 = docScoreSearchScript49.runAsFloat();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder9.build();
        java.lang.Boolean boolean19 = mongoDBRiverDefinition18.isMongos();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition18.getExcludeFields();
        int int21 = mongoDBRiverDefinition18.getSocketTimeout();
        java.lang.String str22 = mongoDBRiverDefinition18.getStatisticsIndexName();
        java.lang.String str23 = mongoDBRiverDefinition18.getScript();
        java.lang.String str24 = mongoDBRiverDefinition18.getIncludeCollection();
        boolean boolean25 = mongoDBRiverDefinition18.isDropCollection();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) boolean25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float27 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoUseSSL(true);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj58 = docScoreSearchScript0.run();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long34 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition62.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition62.getMongoOplogFilter();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoDb();
        java.lang.Object obj68 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long69 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder21.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.indexName("");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray46 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList47 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList47, serverAddressArray46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.includeCollection("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.advancedTransformation(false);
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) builder55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long57 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder21.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.indexName("");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder35);
        docScoreSearchScript0.setNextScore((float) 8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoAdminPassword("");
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) builder53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float55 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("filter");
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float29 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder23.build();
        int int33 = mongoDBRiverDefinition32.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition32.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder41.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder41.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = builder41.build();
        int int51 = mongoDBRiverDefinition50.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition50.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder38.mongoCollectionFilter(basicDBObject52);
        org.elasticsearch.script.ExecutableScript executableScript54 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder60.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder60.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition69 = builder60.build();
        int int70 = mongoDBRiverDefinition69.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject71 = mongoDBRiverDefinition69.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder57.mongoCollectionFilter(basicDBObject71);
        org.elasticsearch.script.ExecutableScript executableScript73 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject71);
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) basicDBObject71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float75 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long25 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.script("ssl");
        java.lang.String[] strArray50 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder15.excludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder15.indexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder15.riverName("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoSSLVerifyCertificate(false);
        java.lang.Object obj67 = docScoreSearchScript0.unwrap((java.lang.Object) builder66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.mongoLocalUser("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoSSLVerifyCertificate(true);
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) builder50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        int int63 = mongoDBRiverDefinition62.getSocketTimeout();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.lang.String str65 = mongoDBRiverDefinition62.getIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions66 = mongoDBRiverDefinition62.getMongoClientOptions();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoLocalPassword();
        java.lang.String str68 = mongoDBRiverDefinition62.getRiverName();
        java.lang.String str69 = mongoDBRiverDefinition62.getScript();
        java.lang.String str70 = mongoDBRiverDefinition62.getMongoLocalUser();
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) mongoDBRiverDefinition62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long72 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = builder44.build();
        java.lang.Boolean boolean54 = mongoDBRiverDefinition53.isMongos();
        java.util.Set<java.lang.String> strSet55 = mongoDBRiverDefinition53.getExcludeFields();
        boolean boolean56 = mongoDBRiverDefinition53.isStoreStatistics();
        java.util.Set<java.lang.String> strSet57 = mongoDBRiverDefinition53.getExcludeFields();
        java.lang.String str58 = mongoDBRiverDefinition53.getStatisticsIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions59 = mongoDBRiverDefinition53.getMongoClientOptions();
        boolean boolean60 = mongoDBRiverDefinition53.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition53.getMongoServers();
        com.mongodb.BasicDBObject basicDBObject62 = mongoDBRiverDefinition53.getMongoCollectionFilter();
        docScoreSearchScript21.setNextVar("actions", (java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double64 = docScoreSearchScript21.runAsDouble();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder42.mongoAdminPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder42.includeCollection("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder42.indexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder42.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder55.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder55.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder55.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = builder55.build();
        java.lang.Boolean boolean65 = mongoDBRiverDefinition64.isMongos();
        boolean boolean66 = mongoDBRiverDefinition64.isStoreStatistics();
        boolean boolean67 = mongoDBRiverDefinition64.isMongoGridFS();
        int int68 = mongoDBRiverDefinition64.getSocketTimeout();
        boolean boolean69 = mongoDBRiverDefinition64.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject70 = mongoDBRiverDefinition64.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder42.mongoCollectionFilter(basicDBObject70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoAdminPassword("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoLocalUser("null.null");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.statisticsTypeName("host");
        java.lang.Object obj80 = docScoreSearchScript0.unwrap((java.lang.Object) builder77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript39 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj41 = docScoreSearchScript39.unwrap((java.lang.Object) 100L);
        docScoreSearchScript39.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        int int56 = mongoDBRiverDefinition55.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition55.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        docScoreSearchScript39.setNextVar("type", (java.lang.Object) basicDBObject57);
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        boolean boolean73 = mongoDBRiverDefinition70.isMongoGridFS();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition70.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject75 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet76 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.Set<java.lang.String> strSet77 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList78 = mongoDBRiverDefinition70.getMongoServers();
        java.lang.String str79 = mongoDBRiverDefinition70.getIndexName();
        java.lang.String str80 = mongoDBRiverDefinition70.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript82 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) executableScript82);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(30000);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.script("ssl");
        java.lang.String[] strArray64 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder40.excludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder20.parentTypes((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder7.includeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.includeCollection("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder70.scriptType("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder70.scriptType("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.mongoUseSSL(false);
        java.lang.Object obj79 = docScoreSearchScript0.unwrap((java.lang.Object) builder78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj80 = docScoreSearchScript0.run();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder42.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder42.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = builder42.build();
        int int52 = mongoDBRiverDefinition51.getSocketTimeout();
        java.lang.String str53 = mongoDBRiverDefinition51.getStatisticsIndexName();
        java.lang.Boolean boolean54 = mongoDBRiverDefinition51.isMongos();
        boolean boolean55 = mongoDBRiverDefinition51.isMongoSecondaryReadPreference();
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) boolean55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder13.build();
        int int23 = mongoDBRiverDefinition22.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition22.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder10.mongoCollectionFilter(basicDBObject24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder10.mongoDb("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.statisticsIndexName("local");
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.script("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder59.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder65.riverName("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder65.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.riverName("host");
        java.lang.Object obj74 = docScoreSearchScript0.unwrap((java.lang.Object) builder73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj75 = docScoreSearchScript0.run();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields.exclude_fields", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long25 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "exclude_fields.exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder21.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.indexName("");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray46 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList47 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList47, serverAddressArray46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.includeCollection("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.advancedTransformation(false);
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) builder55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.script("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.mongoLocalPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder41.importAllCollections(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory48 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder49.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder49.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition58 = builder49.build();
        java.lang.Boolean boolean59 = mongoDBRiverDefinition58.isMongos();
        boolean boolean60 = mongoDBRiverDefinition58.isStoreStatistics();
        boolean boolean61 = mongoDBRiverDefinition58.isMongoGridFS();
        int int62 = mongoDBRiverDefinition58.getSocketTimeout();
        boolean boolean63 = mongoDBRiverDefinition58.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition58.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript65 = docScoreNativeScriptFactory48.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder47.mongoOplogFilter(basicDBObject64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("ssl");
        java.lang.String[] strArray60 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder16.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder3.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder3.mongoLocalPassword("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder3.mongoCollection("bulk_size");
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder3);
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder75.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder75.mongoAdminPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder75.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder75.mongoLocalUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder85.mongoAdminPassword("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder87.riverIndexName("admin");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder25.connectTimeout((int) (short) 0);
        java.lang.Object obj32 = docScoreSearchScript0.unwrap((java.lang.Object) builder31);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long37 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder21.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.indexName("");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder35);
        docScoreSearchScript0.setNextScore((float) 8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoAdminPassword("");
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) builder53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = docScoreSearchScript0.run();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = docScoreSearchScript0.run();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(32);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db.db", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder13.build();
        int int23 = mongoDBRiverDefinition22.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition22.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder10.mongoCollectionFilter(basicDBObject24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder10.mongoDb("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.statisticsIndexName("local");
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder24.build();
        boolean boolean28 = mongoDBRiverDefinition27.isMongoUseSSL();
        java.lang.String str29 = mongoDBRiverDefinition27.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder31.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder31.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder31.build();
        int int41 = mongoDBRiverDefinition40.getSocketTimeout();
        java.lang.String str42 = mongoDBRiverDefinition40.getStatisticsIndexName();
        java.lang.Boolean boolean43 = mongoDBRiverDefinition40.isMongos();
        com.mongodb.BasicDBObject basicDBObject44 = mongoDBRiverDefinition40.getMongoCollectionFilter();
        boolean boolean45 = mongoDBRiverDefinition40.isMongoSSLVerifyCertificate();
        com.mongodb.BasicDBObject basicDBObject46 = mongoDBRiverDefinition40.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject46);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("ssl");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.mongoLocalUser("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder36.mongoLocalPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder36.throttleSize((int) '4');
        java.lang.Object obj47 = docScoreSearchScript0.unwrap((java.lang.Object) builder46);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript49 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj51 = docScoreSearchScript49.unwrap((java.lang.Object) 100L);
        docScoreSearchScript49.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder54.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder54.build();
        java.lang.Boolean boolean64 = mongoDBRiverDefinition63.isMongos();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition63.getExcludeFields();
        boolean boolean66 = mongoDBRiverDefinition63.isStoreStatistics();
        boolean boolean67 = mongoDBRiverDefinition63.isMongoSecondaryReadPreference();
        int int68 = mongoDBRiverDefinition63.getConnectTimeout();
        java.lang.Object obj69 = docScoreSearchScript49.unwrap((java.lang.Object) mongoDBRiverDefinition63);
        docScoreSearchScript0.setNextVar("script.disable_dynamic", (java.lang.Object) docScoreSearchScript49);
        docScoreSearchScript49.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long73 = docScoreSearchScript49.runAsLong();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj25 = docScoreSearchScript0.run();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder38.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder38.build();
        java.lang.Boolean boolean48 = mongoDBRiverDefinition47.isMongos();
        java.lang.String str49 = mongoDBRiverDefinition47.getStatisticsIndexName();
        boolean boolean50 = mongoDBRiverDefinition47.isMongoGridFS();
        java.util.Set<java.lang.String> strSet51 = mongoDBRiverDefinition47.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet53 = mongoDBRiverDefinition47.getIncludeFields();
        java.util.Set<java.lang.String> strSet54 = mongoDBRiverDefinition47.getIncludeFields();
        boolean boolean55 = mongoDBRiverDefinition47.isMongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet56 = mongoDBRiverDefinition47.getParentTypes();
        java.lang.String str57 = mongoDBRiverDefinition47.getStatisticsTypeName();
        java.lang.String str58 = mongoDBRiverDefinition47.getRiverName();
        boolean boolean59 = mongoDBRiverDefinition47.isMongoUseSSL();
        boolean boolean60 = mongoDBRiverDefinition47.isMongoSecondaryReadPreference();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition47.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList62 = mongoDBRiverDefinition47.getMongoServers();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) serverAddressList62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double64 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("filter");
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) builder23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray37 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList38 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList38, serverAddressArray37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder32.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder29.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList38);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = builder44.build();
        int int54 = mongoDBRiverDefinition53.getSocketTimeout();
        java.lang.String str55 = mongoDBRiverDefinition53.getStatisticsIndexName();
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj57 = docScoreSearchScript0.run();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoLocalPassword("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.statisticsTypeName("collection");
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) builder19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float21 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.mongoLocalUser("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoSSLVerifyCertificate(true);
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) builder50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        int int63 = mongoDBRiverDefinition62.getSocketTimeout();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.lang.String str65 = mongoDBRiverDefinition62.getIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions66 = mongoDBRiverDefinition62.getMongoClientOptions();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoLocalPassword();
        java.lang.String str68 = mongoDBRiverDefinition62.getRiverName();
        java.lang.String str69 = mongoDBRiverDefinition62.getScript();
        java.lang.String str70 = mongoDBRiverDefinition62.getMongoLocalUser();
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) mongoDBRiverDefinition62);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj74 = docScoreSearchScript0.run();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        java.lang.Object obj35 = docScoreSearchScript0.unwrap((java.lang.Object) "import_all_collections");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double36 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("ssl");
        java.lang.String[] strArray60 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder16.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder3.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder3.mongoLocalPassword("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder3.mongoCollection("bulk_size");
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder3);
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder75.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder75.mongoAdminPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder75.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder75.mongoLocalUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder85.mongoAdminPassword("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder87.riverIndexName("admin");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder89);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double93 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.script("ssl");
        java.lang.String[] strArray50 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder15.excludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder15.indexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder15.riverName("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoSSLVerifyCertificate(false);
        java.lang.Object obj67 = docScoreSearchScript0.unwrap((java.lang.Object) builder66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder68.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder68.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder68.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder78.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder78.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder82.importAllCollections(false);
        java.lang.Object obj85 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float86 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        int int17 = mongoDBRiverDefinition14.getSocketTimeout();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoUseSSL();
        boolean boolean19 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        boolean boolean20 = mongoDBRiverDefinition14.isAdvancedTransformation();
        boolean boolean21 = mongoDBRiverDefinition14.isAdvancedTransformation();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray35 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList36 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList36, serverAddressArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder27.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.connectTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.isMongos((java.lang.Boolean) false);
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double45 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(60000);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        int int17 = mongoDBRiverDefinition14.getSocketTimeout();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoUseSSL();
        boolean boolean19 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        boolean boolean20 = mongoDBRiverDefinition14.isAdvancedTransformation();
        boolean boolean21 = mongoDBRiverDefinition14.isAdvancedTransformation();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray35 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList36 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList36, serverAddressArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder27.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.connectTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.isMongos((java.lang.Boolean) false);
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj25 = docScoreSearchScript0.run();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript39 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj41 = docScoreSearchScript39.unwrap((java.lang.Object) 100L);
        docScoreSearchScript39.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        int int56 = mongoDBRiverDefinition55.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition55.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        docScoreSearchScript39.setNextVar("type", (java.lang.Object) basicDBObject57);
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        boolean boolean73 = mongoDBRiverDefinition70.isMongoGridFS();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition70.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject75 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet76 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.Set<java.lang.String> strSet77 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList78 = mongoDBRiverDefinition70.getMongoServers();
        java.lang.String str79 = mongoDBRiverDefinition70.getIndexName();
        java.lang.String str80 = mongoDBRiverDefinition70.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript82 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) executableScript82);
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript39 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj41 = docScoreSearchScript39.unwrap((java.lang.Object) 100L);
        docScoreSearchScript39.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        int int56 = mongoDBRiverDefinition55.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition55.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        docScoreSearchScript39.setNextVar("type", (java.lang.Object) basicDBObject57);
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        boolean boolean73 = mongoDBRiverDefinition70.isMongoGridFS();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition70.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject75 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet76 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.Set<java.lang.String> strSet77 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList78 = mongoDBRiverDefinition70.getMongoServers();
        java.lang.String str79 = mongoDBRiverDefinition70.getIndexName();
        java.lang.String str80 = mongoDBRiverDefinition70.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript82 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) executableScript82);
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("ssl");
        java.lang.String[] strArray60 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder16.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder3.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder3.mongoLocalPassword("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder3.mongoCollection("bulk_size");
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder3);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double74 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db.db", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.statisticsTypeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = builder28.build();
        java.lang.Boolean boolean38 = mongoDBRiverDefinition37.isMongos();
        boolean boolean39 = mongoDBRiverDefinition37.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.getParentTypes();
        java.util.List<com.mongodb.ServerAddress> serverAddressList41 = mongoDBRiverDefinition37.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder25.mongoServers(serverAddressList41);
        java.lang.Object obj43 = docScoreSearchScript0.unwrap((java.lang.Object) builder25);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float46 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double55 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder24.build();
        java.lang.Boolean boolean34 = mongoDBRiverDefinition33.isMongos();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition33.getExcludeFields();
        boolean boolean36 = mongoDBRiverDefinition33.isStoreStatistics();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition33.getExcludeFields();
        java.lang.String str38 = mongoDBRiverDefinition33.getStatisticsIndexName();
        java.lang.String str39 = mongoDBRiverDefinition33.getIncludeCollection();
        java.lang.String str40 = mongoDBRiverDefinition33.getIncludeCollection();
        boolean boolean41 = mongoDBRiverDefinition33.isMongoSecondaryReadPreference();
        java.lang.String str42 = mongoDBRiverDefinition33.getRiverName();
        java.lang.String str43 = mongoDBRiverDefinition33.getMongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields.exclude_fields", (java.lang.Object) mongoDBRiverDefinition33);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder47.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder47.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.statisticsTypeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoAdminPassword("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.includeCollection("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder71.build();
        com.mongodb.BasicDBObject basicDBObject73 = mongoDBRiverDefinition72.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject73);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder23.build();
        int int33 = mongoDBRiverDefinition32.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition32.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder41.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder41.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = builder41.build();
        int int51 = mongoDBRiverDefinition50.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition50.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder38.mongoCollectionFilter(basicDBObject52);
        org.elasticsearch.script.ExecutableScript executableScript54 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder60.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder60.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition69 = builder60.build();
        int int70 = mongoDBRiverDefinition69.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject71 = mongoDBRiverDefinition69.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder57.mongoCollectionFilter(basicDBObject71);
        org.elasticsearch.script.ExecutableScript executableScript73 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject71);
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) basicDBObject71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj75 = docScoreSearchScript0.run();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder24.build();
        java.lang.Boolean boolean34 = mongoDBRiverDefinition33.isMongos();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition33.getExcludeFields();
        boolean boolean36 = mongoDBRiverDefinition33.isStoreStatistics();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition33.getExcludeFields();
        java.lang.String str38 = mongoDBRiverDefinition33.getStatisticsIndexName();
        java.lang.String str39 = mongoDBRiverDefinition33.getIncludeCollection();
        java.lang.String str40 = mongoDBRiverDefinition33.getIncludeCollection();
        boolean boolean41 = mongoDBRiverDefinition33.isMongoSecondaryReadPreference();
        java.lang.String str42 = mongoDBRiverDefinition33.getRiverName();
        java.lang.String str43 = mongoDBRiverDefinition33.getMongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields.exclude_fields", (java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        java.lang.Boolean boolean56 = mongoDBRiverDefinition55.isMongos();
        java.util.Set<java.lang.String> strSet57 = mongoDBRiverDefinition55.getExcludeFields();
        boolean boolean58 = mongoDBRiverDefinition55.isStoreStatistics();
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition55.getExcludeFields();
        java.lang.String str60 = mongoDBRiverDefinition55.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet61 = mongoDBRiverDefinition55.getExcludeFields();
        java.lang.Boolean boolean62 = mongoDBRiverDefinition55.isMongos();
        boolean boolean63 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        java.lang.String str64 = mongoDBRiverDefinition55.getMongoCollection();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition55.getParentTypes();
        java.lang.String str66 = mongoDBRiverDefinition55.getStatisticsTypeName();
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder68.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray73 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList74 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList74, serverAddressArray73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder68.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder68.indexName("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder68.mongoAdminUser("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder68.mongoDb("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder68.typeName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder68.mongoLocalPassword("");
        java.lang.Object obj87 = docScoreSearchScript0.unwrap((java.lang.Object) builder68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long88 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        boolean boolean17 = mongoDBRiverDefinition14.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        int int19 = mongoDBRiverDefinition14.getConnectTimeout();
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.statisticsTypeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.throttleSize(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.script("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.connectTimeout(8);
        java.lang.Object obj36 = docScoreSearchScript0.unwrap((java.lang.Object) builder31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.mongoAdminPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder38.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder38.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder38.statisticsIndexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder38.riverName("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.riverIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder52.isMongos((java.lang.Boolean) false);
        docScoreSearchScript0.setNextVar("store_statistics", (java.lang.Object) builder52);
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double62 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder24.build();
        java.lang.Boolean boolean34 = mongoDBRiverDefinition33.isMongos();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition33.getExcludeFields();
        boolean boolean36 = mongoDBRiverDefinition33.isStoreStatistics();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition33.getExcludeFields();
        java.lang.String str38 = mongoDBRiverDefinition33.getStatisticsIndexName();
        java.lang.String str39 = mongoDBRiverDefinition33.getIncludeCollection();
        java.lang.String str40 = mongoDBRiverDefinition33.getIncludeCollection();
        boolean boolean41 = mongoDBRiverDefinition33.isMongoSecondaryReadPreference();
        java.lang.String str42 = mongoDBRiverDefinition33.getRiverName();
        java.lang.String str43 = mongoDBRiverDefinition33.getMongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields.exclude_fields", (java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        java.lang.Boolean boolean56 = mongoDBRiverDefinition55.isMongos();
        java.util.Set<java.lang.String> strSet57 = mongoDBRiverDefinition55.getExcludeFields();
        boolean boolean58 = mongoDBRiverDefinition55.isStoreStatistics();
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition55.getExcludeFields();
        java.lang.String str60 = mongoDBRiverDefinition55.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet61 = mongoDBRiverDefinition55.getExcludeFields();
        java.lang.Boolean boolean62 = mongoDBRiverDefinition55.isMongos();
        boolean boolean63 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        java.lang.String str64 = mongoDBRiverDefinition55.getMongoCollection();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition55.getParentTypes();
        java.lang.String str66 = mongoDBRiverDefinition55.getStatisticsTypeName();
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder68.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray73 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList74 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList74, serverAddressArray73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder68.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder68.indexName("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder68.mongoAdminUser("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder68.mongoDb("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder68.typeName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder68.mongoLocalPassword("");
        java.lang.Object obj87 = docScoreSearchScript0.unwrap((java.lang.Object) builder68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float88 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition62.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition62.getMongoOplogFilter();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoDb();
        java.lang.Object obj68 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition62);
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long73 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.script", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder29.socketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("bulk_timeout");
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) builder37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder39.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder39.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.indexName("port");
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) "port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        java.lang.String str64 = mongoDBRiverDefinition62.getStatisticsIndexName();
        boolean boolean65 = mongoDBRiverDefinition62.isMongoGridFS();
        java.util.Set<java.lang.String> strSet66 = mongoDBRiverDefinition62.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject67 = mongoDBRiverDefinition62.getMongoCollectionFilter();
        int int68 = mongoDBRiverDefinition62.getThrottleSize();
        com.mongodb.BasicDBObject basicDBObject69 = mongoDBRiverDefinition62.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject69);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float39 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("filter");
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) builder23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray37 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList38 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList38, serverAddressArray37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder32.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder29.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList38);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) builder29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("connect_timeout");
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) builder27);
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("filter");
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((-1.0f));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.mongoCollection("index");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long41 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db.db", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double43 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder24.build();
        boolean boolean28 = mongoDBRiverDefinition27.isMongoUseSSL();
        java.lang.String str29 = mongoDBRiverDefinition27.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj37 = docScoreSearchScript35.unwrap((java.lang.Object) 100L);
        docScoreSearchScript35.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder40.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder40.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder40.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.mongoLocalPassword("filter");
        java.lang.Object obj59 = docScoreSearchScript35.unwrap((java.lang.Object) builder58);
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) builder58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder62.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.scriptType("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder74.includeCollection("user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long82 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript39 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj41 = docScoreSearchScript39.unwrap((java.lang.Object) 100L);
        docScoreSearchScript39.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        int int56 = mongoDBRiverDefinition55.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition55.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        docScoreSearchScript39.setNextVar("type", (java.lang.Object) basicDBObject57);
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        boolean boolean73 = mongoDBRiverDefinition70.isMongoGridFS();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition70.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject75 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet76 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.Set<java.lang.String> strSet77 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList78 = mongoDBRiverDefinition70.getMongoServers();
        java.lang.String str79 = mongoDBRiverDefinition70.getIndexName();
        java.lang.String str80 = mongoDBRiverDefinition70.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript82 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) executableScript82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double84 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.script("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoSSLVerifyCertificate(true);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float38 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder37.build();
        java.lang.Boolean boolean47 = mongoDBRiverDefinition46.isMongos();
        boolean boolean48 = mongoDBRiverDefinition46.isStoreStatistics();
        java.lang.Boolean boolean49 = mongoDBRiverDefinition46.isMongos();
        java.lang.String str50 = mongoDBRiverDefinition46.getIncludeCollection();
        boolean boolean51 = mongoDBRiverDefinition46.isMongoUseSSL();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long53 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        int int17 = mongoDBRiverDefinition14.getSocketTimeout();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoUseSSL();
        boolean boolean19 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        boolean boolean20 = mongoDBRiverDefinition14.isAdvancedTransformation();
        boolean boolean21 = mongoDBRiverDefinition14.isAdvancedTransformation();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray35 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList36 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList36, serverAddressArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder27.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.connectTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.isMongos((java.lang.Boolean) false);
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long45 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.socketTimeout((int) (short) 100);
        java.lang.Object obj52 = docScoreSearchScript21.unwrap((java.lang.Object) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long53 = docScoreSearchScript21.runAsLong();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long35 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder37.build();
        boolean boolean41 = mongoDBRiverDefinition40.isMongoUseSSL();
        java.lang.String str42 = mongoDBRiverDefinition40.getIndexName();
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) mongoDBRiverDefinition40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float41 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj39 = docScoreSearchScript0.run();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.statisticsTypeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder47.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder47.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = builder47.build();
        java.lang.Boolean boolean57 = mongoDBRiverDefinition56.isMongos();
        boolean boolean58 = mongoDBRiverDefinition56.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition56.getParentTypes();
        java.util.List<com.mongodb.ServerAddress> serverAddressList60 = mongoDBRiverDefinition56.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder44.mongoServers(serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder33.mongoServers(serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder33.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.riverIndexName("servers");
        java.lang.Object obj67 = docScoreSearchScript0.unwrap((java.lang.Object) builder66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long25 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((-1.0f));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder28.typeName("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder39.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder39.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder39.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder39.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder39.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder39.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder56.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder56.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = builder56.build();
        int int66 = mongoDBRiverDefinition65.getSocketTimeout();
        java.lang.String str67 = mongoDBRiverDefinition65.getMongoOplogNamespace();
        java.lang.String str68 = mongoDBRiverDefinition65.getStatisticsIndexName();
        java.lang.String str69 = mongoDBRiverDefinition65.getStatisticsIndexName();
        boolean boolean70 = mongoDBRiverDefinition65.isMongoGridFS();
        java.lang.String str71 = mongoDBRiverDefinition65.getMongoLocalPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList72 = mongoDBRiverDefinition65.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder39.mongoServers(serverAddressList72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder28.mongoServers(serverAddressList72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder28.advancedTransformation(true);
        java.lang.Object obj77 = docScoreSearchScript0.unwrap((java.lang.Object) builder76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long78 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long39 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float28 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) 100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder12.build();
        int int22 = mongoDBRiverDefinition21.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition21.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder9.mongoCollectionFilter(basicDBObject23);
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(60000);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition62.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition62.getMongoOplogFilter();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoDb();
        java.lang.Object obj68 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition62);
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float73 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float42 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("connect_timeout");
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) builder27);
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double33 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoUseSSL(true);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder63.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder63.build();
        int int73 = mongoDBRiverDefinition72.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject74 = mongoDBRiverDefinition72.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder60.mongoCollectionFilter(basicDBObject74);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory76 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder77.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder77.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder77.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = builder77.build();
        int int87 = mongoDBRiverDefinition86.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject88 = mongoDBRiverDefinition86.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript89 = docScoreNativeScriptFactory76.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder60.mongoOplogFilter(basicDBObject88);
        java.lang.Object obj91 = docScoreSearchScript0.unwrap((java.lang.Object) builder60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj92 = docScoreSearchScript0.run();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.script("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder59.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder65.riverName("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder65.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.riverName("host");
        java.lang.Object obj74 = docScoreSearchScript0.unwrap((java.lang.Object) builder73);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float77 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.script("ssl");
        java.lang.String[] strArray47 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.typeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder51.mongoLocalPassword("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoSecondaryReadPreference(false);
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float61 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double39 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoLocalPassword("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.statisticsTypeName("collection");
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) builder19);
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder43.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.skipInitialImport(false);
        java.lang.Object obj60 = docScoreSearchScript21.unwrap((java.lang.Object) false);
        docScoreSearchScript21.setNextScore((float) '4');
        docScoreSearchScript21.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float65 = docScoreSearchScript21.runAsFloat();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) 100.0f);
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.mongoAdminPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder38.includeCollection("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder38.socketTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder38.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.statisticsTypeName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.throttleSize(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder50.includeCollection("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder50.typeName("collection");
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) builder58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj60 = docScoreSearchScript0.run();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder43.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.skipInitialImport(false);
        java.lang.Object obj60 = docScoreSearchScript21.unwrap((java.lang.Object) false);
        docScoreSearchScript21.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj63 = docScoreSearchScript21.run();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj42 = docScoreSearchScript0.run();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder24.build();
        java.lang.Boolean boolean34 = mongoDBRiverDefinition33.isMongos();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition33.getExcludeFields();
        boolean boolean36 = mongoDBRiverDefinition33.isStoreStatistics();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition33.getExcludeFields();
        java.lang.String str38 = mongoDBRiverDefinition33.getStatisticsIndexName();
        java.lang.String str39 = mongoDBRiverDefinition33.getIncludeCollection();
        java.lang.String str40 = mongoDBRiverDefinition33.getIncludeCollection();
        boolean boolean41 = mongoDBRiverDefinition33.isMongoSecondaryReadPreference();
        java.lang.String str42 = mongoDBRiverDefinition33.getRiverName();
        java.lang.String str43 = mongoDBRiverDefinition33.getMongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields.exclude_fields", (java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        java.lang.Boolean boolean56 = mongoDBRiverDefinition55.isMongos();
        java.util.Set<java.lang.String> strSet57 = mongoDBRiverDefinition55.getExcludeFields();
        boolean boolean58 = mongoDBRiverDefinition55.isStoreStatistics();
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition55.getExcludeFields();
        java.lang.String str60 = mongoDBRiverDefinition55.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet61 = mongoDBRiverDefinition55.getExcludeFields();
        java.lang.Boolean boolean62 = mongoDBRiverDefinition55.isMongos();
        boolean boolean63 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        java.lang.String str64 = mongoDBRiverDefinition55.getMongoCollection();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition55.getParentTypes();
        java.lang.String str66 = mongoDBRiverDefinition55.getStatisticsTypeName();
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj68 = docScoreSearchScript0.run();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("filter");
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double27 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder24.build();
        java.lang.Boolean boolean34 = mongoDBRiverDefinition33.isMongos();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition33.getExcludeFields();
        boolean boolean36 = mongoDBRiverDefinition33.isStoreStatistics();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition33.getExcludeFields();
        java.lang.String str38 = mongoDBRiverDefinition33.getStatisticsIndexName();
        java.lang.String str39 = mongoDBRiverDefinition33.getIncludeCollection();
        java.lang.String str40 = mongoDBRiverDefinition33.getIncludeCollection();
        boolean boolean41 = mongoDBRiverDefinition33.isMongoSecondaryReadPreference();
        java.lang.String str42 = mongoDBRiverDefinition33.getRiverName();
        java.lang.String str43 = mongoDBRiverDefinition33.getMongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields.exclude_fields", (java.lang.Object) mongoDBRiverDefinition33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(30000);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder43.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.skipInitialImport(false);
        java.lang.Object obj60 = docScoreSearchScript21.unwrap((java.lang.Object) false);
        docScoreSearchScript21.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long63 = docScoreSearchScript21.runAsLong();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder33.build();
        java.lang.String str35 = mongoDBRiverDefinition34.getMongoOplogNamespace();
        boolean boolean36 = mongoDBRiverDefinition34.isAdvancedTransformation();
        java.lang.String str37 = mongoDBRiverDefinition34.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = mongoDBRiverDefinition34.getMongoServers();
        java.lang.String str39 = mongoDBRiverDefinition34.getScript();
        java.lang.String str40 = mongoDBRiverDefinition34.getMongoCollection();
        boolean boolean41 = mongoDBRiverDefinition34.isMongoGridFS();
        docScoreSearchScript0.setNextVar("bulk", (java.lang.Object) mongoDBRiverDefinition34);
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double45 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript36 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj38 = docScoreSearchScript36.unwrap((java.lang.Object) 100L);
        docScoreSearchScript36.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory42 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder43.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = builder43.build();
        int int53 = mongoDBRiverDefinition52.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject54 = mongoDBRiverDefinition52.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript55 = docScoreNativeScriptFactory42.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        docScoreSearchScript36.setNextVar("type", (java.lang.Object) basicDBObject54);
        java.lang.Object obj58 = docScoreSearchScript36.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextVar("initial_timestamp", (java.lang.Object) "advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray66 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList67 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList67, serverAddressArray66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.includeCollection("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder69.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition74 = builder73.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder73.scriptType("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder73.connectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder78.statisticsTypeName("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder80.mongoSSLVerifyCertificate(true);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float84 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float17 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        docScoreSearchScript0.setNextScore((float) 10);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float57 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.script", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder9.build();
        java.lang.Boolean boolean19 = mongoDBRiverDefinition18.isMongos();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition18.getExcludeFields();
        int int21 = mongoDBRiverDefinition18.getSocketTimeout();
        java.lang.String str22 = mongoDBRiverDefinition18.getStatisticsIndexName();
        java.lang.String str23 = mongoDBRiverDefinition18.getScript();
        java.lang.String str24 = mongoDBRiverDefinition18.getIncludeCollection();
        boolean boolean25 = mongoDBRiverDefinition18.isDropCollection();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) boolean25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long27 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        int int17 = mongoDBRiverDefinition14.getSocketTimeout();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoUseSSL();
        boolean boolean19 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        boolean boolean20 = mongoDBRiverDefinition14.isAdvancedTransformation();
        boolean boolean21 = mongoDBRiverDefinition14.isAdvancedTransformation();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript0.setNextScore((-1.0f));
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder26.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder26.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = builder26.build();
        int int36 = mongoDBRiverDefinition35.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject37 = mongoDBRiverDefinition35.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder47.build();
        java.lang.String str49 = mongoDBRiverDefinition48.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition48.getIncludeFields();
        boolean boolean51 = mongoDBRiverDefinition48.isMongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition48.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript53 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "db.db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long53 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder24.build();
        java.lang.Boolean boolean34 = mongoDBRiverDefinition33.isMongos();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition33.getExcludeFields();
        boolean boolean36 = mongoDBRiverDefinition33.isStoreStatistics();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition33.getExcludeFields();
        java.lang.String str38 = mongoDBRiverDefinition33.getStatisticsIndexName();
        java.lang.String str39 = mongoDBRiverDefinition33.getIncludeCollection();
        java.lang.String str40 = mongoDBRiverDefinition33.getIncludeCollection();
        boolean boolean41 = mongoDBRiverDefinition33.isMongoSecondaryReadPreference();
        java.lang.String str42 = mongoDBRiverDefinition33.getRiverName();
        java.lang.String str43 = mongoDBRiverDefinition33.getMongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields.exclude_fields", (java.lang.Object) mongoDBRiverDefinition33);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(30000);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.script", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition62.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition62.getMongoOplogFilter();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoDb();
        java.lang.Object obj68 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition62);
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder73.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder73.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition82 = builder73.build();
        java.lang.Boolean boolean83 = mongoDBRiverDefinition82.isMongos();
        java.lang.String str84 = mongoDBRiverDefinition82.getStatisticsIndexName();
        boolean boolean85 = mongoDBRiverDefinition82.isMongoGridFS();
        java.util.Set<java.lang.String> strSet86 = mongoDBRiverDefinition82.getExcludeFields();
        boolean boolean87 = mongoDBRiverDefinition82.isSkipInitialImport();
        boolean boolean88 = mongoDBRiverDefinition82.isMongoUseSSL();
        boolean boolean89 = mongoDBRiverDefinition82.isMongoUseSSL();
        java.lang.Object obj90 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder21.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.indexName("");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder41.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder41.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder41.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.skipInitialImport(true);
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) builder53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long55 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder13.build();
        int int23 = mongoDBRiverDefinition22.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition22.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder10.mongoCollectionFilter(basicDBObject24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder10.mongoDb("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.statisticsIndexName("local");
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) "local");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float31 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj37 = docScoreSearchScript0.run();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout.connect_timeout", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition62.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition62.getMongoOplogFilter();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoDb();
        java.lang.Object obj68 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition62);
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder73.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder73.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition82 = builder73.build();
        java.lang.Boolean boolean83 = mongoDBRiverDefinition82.isMongos();
        java.lang.String str84 = mongoDBRiverDefinition82.getStatisticsIndexName();
        boolean boolean85 = mongoDBRiverDefinition82.isMongoGridFS();
        java.util.Set<java.lang.String> strSet86 = mongoDBRiverDefinition82.getExcludeFields();
        boolean boolean87 = mongoDBRiverDefinition82.isSkipInitialImport();
        boolean boolean88 = mongoDBRiverDefinition82.isMongoUseSSL();
        boolean boolean89 = mongoDBRiverDefinition82.isMongoUseSSL();
        java.lang.Object obj90 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((-1.0f));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder28.typeName("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder39.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder39.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder39.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder39.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder39.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder39.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder56.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder56.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = builder56.build();
        int int66 = mongoDBRiverDefinition65.getSocketTimeout();
        java.lang.String str67 = mongoDBRiverDefinition65.getMongoOplogNamespace();
        java.lang.String str68 = mongoDBRiverDefinition65.getStatisticsIndexName();
        java.lang.String str69 = mongoDBRiverDefinition65.getStatisticsIndexName();
        boolean boolean70 = mongoDBRiverDefinition65.isMongoGridFS();
        java.lang.String str71 = mongoDBRiverDefinition65.getMongoLocalPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList72 = mongoDBRiverDefinition65.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder39.mongoServers(serverAddressList72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder28.mongoServers(serverAddressList72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder28.advancedTransformation(true);
        java.lang.Object obj77 = docScoreSearchScript0.unwrap((java.lang.Object) builder76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(30000);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        java.util.Set<java.lang.String> strSet64 = mongoDBRiverDefinition62.getExcludeFields();
        int int65 = mongoDBRiverDefinition62.getSocketTimeout();
        java.lang.String str66 = mongoDBRiverDefinition62.getStatisticsIndexName();
        boolean boolean67 = mongoDBRiverDefinition62.isStoreStatistics();
        java.util.Set<java.lang.String> strSet68 = mongoDBRiverDefinition62.getExcludeFields();
        java.lang.Object obj69 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long70 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.util.Set<java.lang.String> strSet28 = mongoDBRiverDefinition26.getExcludeFields();
        boolean boolean29 = mongoDBRiverDefinition26.isStoreStatistics();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        java.lang.String str31 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean32 = mongoDBRiverDefinition26.isMongoUseSSL();
        boolean boolean33 = mongoDBRiverDefinition26.isStoreStatistics();
        java.lang.String str34 = mongoDBRiverDefinition26.getRiverName();
        com.mongodb.MongoClientOptions mongoClientOptions35 = mongoDBRiverDefinition26.getMongoClientOptions();
        java.lang.Object obj36 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder37.build();
        java.lang.Boolean boolean47 = mongoDBRiverDefinition46.isMongos();
        boolean boolean48 = mongoDBRiverDefinition46.isStoreStatistics();
        boolean boolean49 = mongoDBRiverDefinition46.isMongoGridFS();
        int int50 = mongoDBRiverDefinition46.getSocketTimeout();
        java.lang.String str51 = mongoDBRiverDefinition46.getScript();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition46.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript39 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj41 = docScoreSearchScript39.unwrap((java.lang.Object) 100L);
        docScoreSearchScript39.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        int int56 = mongoDBRiverDefinition55.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition55.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        docScoreSearchScript39.setNextVar("type", (java.lang.Object) basicDBObject57);
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        boolean boolean73 = mongoDBRiverDefinition70.isMongoGridFS();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition70.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject75 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet76 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.Set<java.lang.String> strSet77 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList78 = mongoDBRiverDefinition70.getMongoServers();
        java.lang.String str79 = mongoDBRiverDefinition70.getIndexName();
        java.lang.String str80 = mongoDBRiverDefinition70.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript82 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) executableScript82);
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double86 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.script("ssl");
        java.lang.String[] strArray64 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder40.excludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder20.parentTypes((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder7.includeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.includeCollection("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder70.scriptType("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder70.scriptType("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.mongoUseSSL(false);
        java.lang.Object obj79 = docScoreSearchScript0.unwrap((java.lang.Object) builder78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder80.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder80.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder80.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder80.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition89 = builder80.build();
        java.lang.Boolean boolean90 = mongoDBRiverDefinition89.isMongos();
        boolean boolean91 = mongoDBRiverDefinition89.isStoreStatistics();
        com.mongodb.BasicDBObject basicDBObject92 = mongoDBRiverDefinition89.getMongoOplogFilter();
        com.mongodb.BasicDBObject basicDBObject93 = mongoDBRiverDefinition89.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject93);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = builder44.build();
        java.lang.Boolean boolean54 = mongoDBRiverDefinition53.isMongos();
        java.util.Set<java.lang.String> strSet55 = mongoDBRiverDefinition53.getExcludeFields();
        boolean boolean56 = mongoDBRiverDefinition53.isStoreStatistics();
        java.util.Set<java.lang.String> strSet57 = mongoDBRiverDefinition53.getExcludeFields();
        java.lang.String str58 = mongoDBRiverDefinition53.getStatisticsIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions59 = mongoDBRiverDefinition53.getMongoClientOptions();
        boolean boolean60 = mongoDBRiverDefinition53.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition53.getMongoServers();
        com.mongodb.BasicDBObject basicDBObject62 = mongoDBRiverDefinition53.getMongoCollectionFilter();
        docScoreSearchScript21.setNextVar("actions", (java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float64 = docScoreSearchScript21.runAsFloat();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder37.build();
        java.lang.Boolean boolean47 = mongoDBRiverDefinition46.isMongos();
        boolean boolean48 = mongoDBRiverDefinition46.isStoreStatistics();
        boolean boolean49 = mongoDBRiverDefinition46.isMongoGridFS();
        int int50 = mongoDBRiverDefinition46.getSocketTimeout();
        boolean boolean51 = mongoDBRiverDefinition46.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition46.getMongoCollectionFilter();
        com.mongodb.MongoClientOptions mongoClientOptions53 = mongoDBRiverDefinition46.getMongoClientOptions();
        boolean boolean54 = mongoDBRiverDefinition46.isDisableIndexRefresh();
        int int55 = mongoDBRiverDefinition46.getThrottleSize();
        java.lang.String str56 = mongoDBRiverDefinition46.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition46.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder19.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = builder19.build();
        java.lang.Boolean boolean29 = mongoDBRiverDefinition28.isMongos();
        java.lang.String str30 = mongoDBRiverDefinition28.getStatisticsIndexName();
        boolean boolean31 = mongoDBRiverDefinition28.isMongoGridFS();
        java.lang.String str32 = mongoDBRiverDefinition28.getScriptType();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition28.getExcludeFields();
        int int34 = mongoDBRiverDefinition28.getThrottleSize();
        docScoreSearchScript0.setNextVar("socket_timeout", (java.lang.Object) int34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.socketTimeout((int) (short) 100);
        java.lang.Object obj52 = docScoreSearchScript21.unwrap((java.lang.Object) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript21.setNextDocId(8);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition62.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition62.getMongoOplogFilter();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoDb();
        java.lang.Object obj68 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition62);
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("ssl");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.mongoLocalUser("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder36.mongoLocalPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder36.throttleSize((int) '4');
        java.lang.Object obj47 = docScoreSearchScript0.unwrap((java.lang.Object) builder46);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript49 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj51 = docScoreSearchScript49.unwrap((java.lang.Object) 100L);
        docScoreSearchScript49.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder54.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder54.build();
        java.lang.Boolean boolean64 = mongoDBRiverDefinition63.isMongos();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition63.getExcludeFields();
        boolean boolean66 = mongoDBRiverDefinition63.isStoreStatistics();
        boolean boolean67 = mongoDBRiverDefinition63.isMongoSecondaryReadPreference();
        int int68 = mongoDBRiverDefinition63.getConnectTimeout();
        java.lang.Object obj69 = docScoreSearchScript49.unwrap((java.lang.Object) mongoDBRiverDefinition63);
        docScoreSearchScript0.setNextVar("script.disable_dynamic", (java.lang.Object) docScoreSearchScript49);
        docScoreSearchScript49.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder74.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder78.script("ssl");
        com.mongodb.ServerAddress[] serverAddressArray81 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList82 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList82, serverAddressArray81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder78.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder84.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder84.throttleSize((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder84.advancedTransformation(true);
        docScoreSearchScript49.setNextVar("bulk_timeout", (java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double94 = docScoreSearchScript49.runAsDouble();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("ssl");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.mongoLocalUser("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder36.mongoLocalPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder36.throttleSize((int) '4');
        java.lang.Object obj47 = docScoreSearchScript0.unwrap((java.lang.Object) builder46);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript49 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj51 = docScoreSearchScript49.unwrap((java.lang.Object) 100L);
        docScoreSearchScript49.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder54.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder54.build();
        java.lang.Boolean boolean64 = mongoDBRiverDefinition63.isMongos();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition63.getExcludeFields();
        boolean boolean66 = mongoDBRiverDefinition63.isStoreStatistics();
        boolean boolean67 = mongoDBRiverDefinition63.isMongoSecondaryReadPreference();
        int int68 = mongoDBRiverDefinition63.getConnectTimeout();
        java.lang.Object obj69 = docScoreSearchScript49.unwrap((java.lang.Object) mongoDBRiverDefinition63);
        docScoreSearchScript0.setNextVar("script.disable_dynamic", (java.lang.Object) docScoreSearchScript49);
        docScoreSearchScript49.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder74.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder78.script("ssl");
        com.mongodb.ServerAddress[] serverAddressArray81 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList82 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList82, serverAddressArray81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder78.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder84.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder84.throttleSize((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder84.advancedTransformation(true);
        docScoreSearchScript49.setNextVar("bulk_timeout", (java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript49.setNextDocId((int) ' ');
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = builder44.build();
        java.lang.Boolean boolean54 = mongoDBRiverDefinition53.isMongos();
        boolean boolean55 = mongoDBRiverDefinition53.isStoreStatistics();
        boolean boolean56 = mongoDBRiverDefinition53.isMongoGridFS();
        boolean boolean57 = mongoDBRiverDefinition53.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet58 = mongoDBRiverDefinition53.getExcludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList59 = mongoDBRiverDefinition53.getMongoServers();
        boolean boolean60 = mongoDBRiverDefinition53.isMongoSecondaryReadPreference();
        int int61 = mongoDBRiverDefinition53.getConnectTimeout();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp62 = mongoDBRiverDefinition53.getInitialTimestamp();
        docScoreSearchScript0.setNextVar("size", (java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float64 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder43.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.skipInitialImport(false);
        java.lang.Object obj60 = docScoreSearchScript21.unwrap((java.lang.Object) false);
        docScoreSearchScript21.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript21.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float39 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local.local", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder26.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder26.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = builder26.build();
        int int36 = mongoDBRiverDefinition35.getSocketTimeout();
        boolean boolean37 = mongoDBRiverDefinition35.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet38 = mongoDBRiverDefinition35.getParentTypes();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp39 = mongoDBRiverDefinition35.getInitialTimestamp();
        java.lang.String str40 = mongoDBRiverDefinition35.getMongoCollection();
        java.util.Set<java.lang.String> strSet41 = mongoDBRiverDefinition35.getParentTypes();
        java.lang.String str42 = mongoDBRiverDefinition35.getMongoOplogNamespace();
        java.lang.String str43 = mongoDBRiverDefinition35.getMongoAdminUser();
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long45 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder9.build();
        java.lang.Boolean boolean19 = mongoDBRiverDefinition18.isMongos();
        boolean boolean20 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition18.getParentTypes();
        java.util.List<com.mongodb.ServerAddress> serverAddressList22 = mongoDBRiverDefinition18.getMongoServers();
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition18.getIncludeFields();
        java.lang.String str24 = mongoDBRiverDefinition18.getScriptType();
        int int25 = mongoDBRiverDefinition18.getConnectTimeout();
        java.lang.String str26 = mongoDBRiverDefinition18.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder38.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder38.build();
        java.lang.Boolean boolean48 = mongoDBRiverDefinition47.isMongos();
        java.lang.String str49 = mongoDBRiverDefinition47.getStatisticsIndexName();
        boolean boolean50 = mongoDBRiverDefinition47.isMongoGridFS();
        java.util.Set<java.lang.String> strSet51 = mongoDBRiverDefinition47.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet53 = mongoDBRiverDefinition47.getIncludeFields();
        java.util.Set<java.lang.String> strSet54 = mongoDBRiverDefinition47.getIncludeFields();
        boolean boolean55 = mongoDBRiverDefinition47.isMongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet56 = mongoDBRiverDefinition47.getParentTypes();
        java.lang.String str57 = mongoDBRiverDefinition47.getStatisticsTypeName();
        java.lang.String str58 = mongoDBRiverDefinition47.getRiverName();
        boolean boolean59 = mongoDBRiverDefinition47.isMongoUseSSL();
        boolean boolean60 = mongoDBRiverDefinition47.isMongoSecondaryReadPreference();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition47.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList62 = mongoDBRiverDefinition47.getMongoServers();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) serverAddressList62);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder67.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder67.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder67.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition76 = builder67.build();
        java.lang.Boolean boolean77 = mongoDBRiverDefinition76.isMongos();
        boolean boolean78 = mongoDBRiverDefinition76.isStoreStatistics();
        boolean boolean79 = mongoDBRiverDefinition76.isMongoGridFS();
        java.lang.String str80 = mongoDBRiverDefinition76.getIncludeCollection();
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) mongoDBRiverDefinition76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double82 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "exclude_fields.exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder33.build();
        java.lang.String str35 = mongoDBRiverDefinition34.getMongoOplogNamespace();
        boolean boolean36 = mongoDBRiverDefinition34.isAdvancedTransformation();
        java.lang.String str37 = mongoDBRiverDefinition34.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = mongoDBRiverDefinition34.getMongoServers();
        java.lang.String str39 = mongoDBRiverDefinition34.getScript();
        java.lang.String str40 = mongoDBRiverDefinition34.getMongoCollection();
        boolean boolean41 = mongoDBRiverDefinition34.isMongoGridFS();
        docScoreSearchScript0.setNextVar("bulk", (java.lang.Object) mongoDBRiverDefinition34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float43 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type.script_type", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder29.socketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("bulk_timeout");
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) builder37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder39.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder39.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.indexName("port");
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) "port");
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder43.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.skipInitialImport(false);
        java.lang.Object obj60 = docScoreSearchScript21.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float61 = docScoreSearchScript21.runAsFloat();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long35 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        int int17 = mongoDBRiverDefinition14.getSocketTimeout();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoUseSSL();
        boolean boolean19 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        boolean boolean20 = mongoDBRiverDefinition14.isAdvancedTransformation();
        boolean boolean21 = mongoDBRiverDefinition14.isAdvancedTransformation();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("ssl");
        java.lang.String[] strArray60 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder16.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder3.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder3.mongoLocalPassword("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder3.mongoCollection("bulk_size");
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder3);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float74 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder37.build();
        boolean boolean41 = mongoDBRiverDefinition40.isMongoUseSSL();
        java.lang.String str42 = mongoDBRiverDefinition40.getIndexName();
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) mongoDBRiverDefinition40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj37 = docScoreSearchScript35.unwrap((java.lang.Object) 100L);
        docScoreSearchScript35.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder40.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder40.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder40.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.mongoLocalPassword("filter");
        java.lang.Object obj59 = docScoreSearchScript35.unwrap((java.lang.Object) builder58);
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) builder58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        int int72 = mongoDBRiverDefinition70.getConnectTimeout();
        java.lang.String str73 = mongoDBRiverDefinition70.getMongoDb();
        int int74 = mongoDBRiverDefinition70.getSocketTimeout();
        java.lang.Object obj75 = docScoreSearchScript0.unwrap((java.lang.Object) int74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder76.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder76.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder76.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition85 = builder76.build();
        java.lang.Boolean boolean86 = mongoDBRiverDefinition85.isMongos();
        java.util.Set<java.lang.String> strSet87 = mongoDBRiverDefinition85.getExcludeFields();
        boolean boolean88 = mongoDBRiverDefinition85.isStoreStatistics();
        java.util.Set<java.lang.String> strSet89 = mongoDBRiverDefinition85.getExcludeFields();
        boolean boolean90 = mongoDBRiverDefinition85.isStoreStatistics();
        java.lang.String str91 = mongoDBRiverDefinition85.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList92 = mongoDBRiverDefinition85.getMongoServers();
        java.lang.Object obj93 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray35 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList36 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList36, serverAddressArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.script("ssl");
        java.lang.String[] strArray87 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet88 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet88, strArray87);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder63.excludeFields((java.util.Set<java.lang.String>) strSet88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder52.excludeFields((java.util.Set<java.lang.String>) strSet88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder43.parentTypes((java.util.Set<java.lang.String>) strSet88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder93 = builder30.includeFields((java.util.Set<java.lang.String>) strSet88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder29.includeFields((java.util.Set<java.lang.String>) strSet88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder95 = builder20.includeFields((java.util.Set<java.lang.String>) strSet88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder97 = builder95.socketTimeout(8);
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) builder97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj99 = docScoreSearchScript0.run();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.mongoLocalUser("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoSSLVerifyCertificate(true);
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) builder50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float52 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long28 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local.local", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.script("ssl");
        java.lang.String[] strArray47 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.typeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder51.mongoLocalPassword("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoSecondaryReadPreference(false);
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder65.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.typeName("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder71.build();
        java.lang.Object obj73 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder21.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.indexName("");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder41.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder41.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder41.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.skipInitialImport(true);
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) builder53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos.is_mongos", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((-1.0f));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.script("ssl");
        java.lang.String[] strArray71 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder47.excludeFields((java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder36.indexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder36.riverName("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder36.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder81.dropCollection(false);
        java.lang.Object obj86 = docScoreSearchScript0.unwrap((java.lang.Object) builder85);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder88.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder90.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition93 = builder90.build();
        boolean boolean94 = mongoDBRiverDefinition93.isMongoSecondaryReadPreference();
        boolean boolean95 = mongoDBRiverDefinition93.isMongoSSLVerifyCertificate();
        docScoreSearchScript0.setNextVar("gridfs", (java.lang.Object) mongoDBRiverDefinition93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj97 = docScoreSearchScript0.run();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields.exclude_fields", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder17.build();
        java.lang.Boolean boolean27 = mongoDBRiverDefinition26.isMongos();
        java.lang.String str28 = mongoDBRiverDefinition26.getStatisticsIndexName();
        boolean boolean29 = mongoDBRiverDefinition26.isMongoGridFS();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition26.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet32 = mongoDBRiverDefinition26.getIncludeFields();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition26.getIncludeFields();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition26);
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.script("ssl");
        java.lang.String[] strArray80 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder56.excludeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder45.excludeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder45.mongoCollection("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder86.mongoAdminPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder88.mongoGridFS(true);
        java.lang.Object obj91 = docScoreSearchScript0.unwrap((java.lang.Object) builder88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder34.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = builder34.build();
        java.lang.Boolean boolean44 = mongoDBRiverDefinition43.isMongos();
        boolean boolean45 = mongoDBRiverDefinition43.isStoreStatistics();
        boolean boolean46 = mongoDBRiverDefinition43.isMongoGridFS();
        boolean boolean47 = mongoDBRiverDefinition43.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition43.getExcludeFields();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition43.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition43.getMongoLocalUser();
        boolean boolean51 = mongoDBRiverDefinition43.isDropCollection();
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) boolean51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder53.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder53.build();
        java.lang.Boolean boolean63 = mongoDBRiverDefinition62.isMongos();
        boolean boolean64 = mongoDBRiverDefinition62.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition62.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition62.getMongoOplogFilter();
        java.lang.String str67 = mongoDBRiverDefinition62.getMongoDb();
        java.lang.Object obj68 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition62);
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float73 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        boolean boolean16 = mongoDBRiverDefinition14.isStoreStatistics();
        boolean boolean17 = mongoDBRiverDefinition14.isMongoGridFS();
        java.lang.String str18 = mongoDBRiverDefinition14.getIndexName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = mongoDBRiverDefinition14.getMongoServers();
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj23 = docScoreSearchScript0.run();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields.exclude_fields", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoUseSSL(true);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder63.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder63.build();
        int int73 = mongoDBRiverDefinition72.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject74 = mongoDBRiverDefinition72.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder60.mongoCollectionFilter(basicDBObject74);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory76 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder77.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder77.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder77.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = builder77.build();
        int int87 = mongoDBRiverDefinition86.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject88 = mongoDBRiverDefinition86.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript89 = docScoreNativeScriptFactory76.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder60.mongoOplogFilter(basicDBObject88);
        java.lang.Object obj91 = docScoreSearchScript0.unwrap((java.lang.Object) builder60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long92 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("ssl");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.mongoLocalUser("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder36.mongoLocalPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder36.throttleSize((int) '4');
        java.lang.Object obj47 = docScoreSearchScript0.unwrap((java.lang.Object) builder46);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript49 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj51 = docScoreSearchScript49.unwrap((java.lang.Object) 100L);
        docScoreSearchScript49.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder54.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder54.build();
        java.lang.Boolean boolean64 = mongoDBRiverDefinition63.isMongos();
        java.util.Set<java.lang.String> strSet65 = mongoDBRiverDefinition63.getExcludeFields();
        boolean boolean66 = mongoDBRiverDefinition63.isStoreStatistics();
        boolean boolean67 = mongoDBRiverDefinition63.isMongoSecondaryReadPreference();
        int int68 = mongoDBRiverDefinition63.getConnectTimeout();
        java.lang.Object obj69 = docScoreSearchScript49.unwrap((java.lang.Object) mongoDBRiverDefinition63);
        docScoreSearchScript0.setNextVar("script.disable_dynamic", (java.lang.Object) docScoreSearchScript49);
        docScoreSearchScript49.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double73 = docScoreSearchScript49.runAsDouble();
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj25 = docScoreSearchScript0.run();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder31.build();
        java.lang.String str33 = mongoDBRiverDefinition32.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet34 = mongoDBRiverDefinition32.getIncludeFields();
        boolean boolean35 = mongoDBRiverDefinition32.isImportAllCollections();
        java.lang.String str36 = mongoDBRiverDefinition32.getRiverIndexName();
        java.lang.String str37 = mongoDBRiverDefinition32.getMongoLocalPassword();
        boolean boolean38 = mongoDBRiverDefinition32.isImportAllCollections();
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) boolean38);
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double42 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float33 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.script("ssl");
        java.lang.String[] strArray64 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder40.excludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder20.parentTypes((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder7.includeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.includeCollection("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder70.scriptType("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder70.scriptType("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.mongoUseSSL(false);
        java.lang.Object obj79 = docScoreSearchScript0.unwrap((java.lang.Object) builder78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long80 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder1.disableIndexRefresh(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.common.ParseField parseField15 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) parseField15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj17 = docScoreSearchScript0.run();
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double31 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoAdminPassword("");
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder19.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = builder19.build();
        java.lang.Boolean boolean29 = mongoDBRiverDefinition28.isMongos();
        java.lang.String str30 = mongoDBRiverDefinition28.getStatisticsIndexName();
        boolean boolean31 = mongoDBRiverDefinition28.isMongoGridFS();
        java.lang.String str32 = mongoDBRiverDefinition28.getScriptType();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition28.getExcludeFields();
        int int34 = mongoDBRiverDefinition28.getThrottleSize();
        docScoreSearchScript0.setNextVar("socket_timeout", (java.lang.Object) int34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float36 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript39 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj41 = docScoreSearchScript39.unwrap((java.lang.Object) 100L);
        docScoreSearchScript39.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        int int56 = mongoDBRiverDefinition55.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition55.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        docScoreSearchScript39.setNextVar("type", (java.lang.Object) basicDBObject57);
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        boolean boolean73 = mongoDBRiverDefinition70.isMongoGridFS();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition70.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject75 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet76 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.Set<java.lang.String> strSet77 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList78 = mongoDBRiverDefinition70.getMongoServers();
        java.lang.String str79 = mongoDBRiverDefinition70.getIndexName();
        java.lang.String str80 = mongoDBRiverDefinition70.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript82 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) executableScript82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long84 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder21.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder21.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.indexName("");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder35);
        docScoreSearchScript0.setNextScore((float) 8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = builder44.build();
        int int54 = mongoDBRiverDefinition53.getSocketTimeout();
        java.lang.String str55 = mongoDBRiverDefinition53.getStatisticsIndexName();
        com.mongodb.BasicDBObject basicDBObject56 = mongoDBRiverDefinition53.getMongoCollectionFilter();
        docScoreSearchScript0.setNextVar("name", (java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float58 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type.type", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoAdminPassword("");
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder50.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder50.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder50.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.mongoLocalUser("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.mongoLocalUser("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.skipInitialImport(false);
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) builder64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long68 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder33.build();
        java.lang.String str35 = mongoDBRiverDefinition34.getMongoOplogNamespace();
        boolean boolean36 = mongoDBRiverDefinition34.isAdvancedTransformation();
        java.lang.String str37 = mongoDBRiverDefinition34.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = mongoDBRiverDefinition34.getMongoServers();
        java.lang.String str39 = mongoDBRiverDefinition34.getScript();
        java.lang.String str40 = mongoDBRiverDefinition34.getMongoCollection();
        boolean boolean41 = mongoDBRiverDefinition34.isMongoGridFS();
        docScoreSearchScript0.setNextVar("bulk", (java.lang.Object) mongoDBRiverDefinition34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double43 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float44 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        int int17 = mongoDBRiverDefinition14.getSocketTimeout();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoUseSSL();
        boolean boolean19 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        boolean boolean20 = mongoDBRiverDefinition14.isAdvancedTransformation();
        boolean boolean21 = mongoDBRiverDefinition14.isAdvancedTransformation();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray28 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList29 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList29, serverAddressArray28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.includeCollection("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder31.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.statisticsIndexName("drop_collection");
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) builder37);
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double43 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type.script_type", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder25.connectTimeout((int) (short) 0);
        java.lang.Object obj32 = docScoreSearchScript0.unwrap((java.lang.Object) builder31);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) 100.0f);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj9 = docScoreSearchScript0.run();
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript36 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj38 = docScoreSearchScript36.unwrap((java.lang.Object) 100L);
        docScoreSearchScript36.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory42 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder43.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = builder43.build();
        int int53 = mongoDBRiverDefinition52.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject54 = mongoDBRiverDefinition52.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript55 = docScoreNativeScriptFactory42.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        docScoreSearchScript36.setNextVar("type", (java.lang.Object) basicDBObject54);
        java.lang.Object obj58 = docScoreSearchScript36.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextVar("initial_timestamp", (java.lang.Object) "advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray66 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList67 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList67, serverAddressArray66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.includeCollection("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder69.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition74 = builder73.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder73.scriptType("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder73.connectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder78.statisticsTypeName("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder80.mongoSSLVerifyCertificate(true);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double84 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj37 = docScoreSearchScript35.unwrap((java.lang.Object) 100L);
        docScoreSearchScript35.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder40.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder40.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder40.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.mongoLocalPassword("filter");
        java.lang.Object obj59 = docScoreSearchScript35.unwrap((java.lang.Object) builder58);
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) builder58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        int int72 = mongoDBRiverDefinition70.getConnectTimeout();
        java.lang.String str73 = mongoDBRiverDefinition70.getMongoDb();
        int int74 = mongoDBRiverDefinition70.getSocketTimeout();
        java.lang.Object obj75 = docScoreSearchScript0.unwrap((java.lang.Object) int74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder76.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder76.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder76.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition85 = builder76.build();
        java.lang.Boolean boolean86 = mongoDBRiverDefinition85.isMongos();
        java.util.Set<java.lang.String> strSet87 = mongoDBRiverDefinition85.getExcludeFields();
        boolean boolean88 = mongoDBRiverDefinition85.isStoreStatistics();
        java.util.Set<java.lang.String> strSet89 = mongoDBRiverDefinition85.getExcludeFields();
        boolean boolean90 = mongoDBRiverDefinition85.isStoreStatistics();
        java.lang.String str91 = mongoDBRiverDefinition85.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList92 = mongoDBRiverDefinition85.getMongoServers();
        java.lang.Object obj93 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj94 = docScoreSearchScript0.run();
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) 100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder12.build();
        int int22 = mongoDBRiverDefinition21.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition21.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder9.mongoCollectionFilter(basicDBObject23);
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) builder9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double26 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj37 = docScoreSearchScript35.unwrap((java.lang.Object) 100L);
        docScoreSearchScript35.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder40.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder40.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder40.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.mongoLocalPassword("filter");
        java.lang.Object obj59 = docScoreSearchScript35.unwrap((java.lang.Object) builder58);
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) builder58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder62.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.scriptType("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder74.includeCollection("user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "user");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        boolean boolean17 = mongoDBRiverDefinition14.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        int int19 = mongoDBRiverDefinition14.getConnectTimeout();
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.statisticsTypeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.throttleSize(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.script("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.connectTimeout(8);
        java.lang.Object obj36 = docScoreSearchScript0.unwrap((java.lang.Object) builder31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder37.build();
        java.lang.Boolean boolean47 = mongoDBRiverDefinition46.isMongos();
        java.lang.String str48 = mongoDBRiverDefinition46.getStatisticsIndexName();
        boolean boolean49 = mongoDBRiverDefinition46.isMongoGridFS();
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition46.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition46.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet52 = mongoDBRiverDefinition46.getIncludeFields();
        java.util.Set<java.lang.String> strSet53 = mongoDBRiverDefinition46.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList54 = mongoDBRiverDefinition46.getMongoServers();
        java.lang.String str55 = mongoDBRiverDefinition46.getIndexName();
        boolean boolean56 = mongoDBRiverDefinition46.isImportAllCollections();
        int int57 = mongoDBRiverDefinition46.getThrottleSize();
        java.lang.Object obj58 = docScoreSearchScript0.unwrap((java.lang.Object) int57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(60000);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("ssl");
        java.lang.String[] strArray60 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder16.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder3.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder3.mongoLocalPassword("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder3.mongoCollection("bulk_size");
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder3);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long74 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("filter");
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float29 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoAdminPassword("");
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long49 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder24.build();
        boolean boolean28 = mongoDBRiverDefinition27.isMongoUseSSL();
        java.lang.String str29 = mongoDBRiverDefinition27.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj31 = docScoreSearchScript0.run();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.indexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.socketTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoAdminPassword("");
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(60000);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder44.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder44.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoUseSSL(true);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder63.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder63.build();
        int int73 = mongoDBRiverDefinition72.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject74 = mongoDBRiverDefinition72.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder60.mongoCollectionFilter(basicDBObject74);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory76 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder77.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder77.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder77.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = builder77.build();
        int int87 = mongoDBRiverDefinition86.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject88 = mongoDBRiverDefinition86.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript89 = docScoreNativeScriptFactory76.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject88);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder60.mongoOplogFilter(basicDBObject88);
        java.lang.Object obj91 = docScoreSearchScript0.unwrap((java.lang.Object) builder60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double92 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("ssl");
        java.lang.String[] strArray60 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder16.parentTypes((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder3.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder3.mongoLocalPassword("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder3.mongoCollection("bulk_size");
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder3);
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder75.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder75.mongoAdminPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder75.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder75.mongoLocalUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder85.mongoAdminPassword("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder87.riverIndexName("admin");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.statisticsTypeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.script("ssl");
        java.lang.String[] strArray52 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder28.excludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder17.excludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = builder56.build();
        java.lang.String str58 = mongoDBRiverDefinition57.getIndexName();
        boolean boolean59 = mongoDBRiverDefinition57.isMongoSSLVerifyCertificate();
        java.lang.String str60 = mongoDBRiverDefinition57.getIndexName();
        java.lang.Object obj61 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long62 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("filter");
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.script("ssl");
        java.lang.String[] strArray50 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder15.excludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder15.indexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder15.riverName("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoSSLVerifyCertificate(false);
        java.lang.Object obj67 = docScoreSearchScript0.unwrap((java.lang.Object) builder66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript40 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField41 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj42 = docScoreSearchScript40.unwrap((java.lang.Object) parseField41);
        docScoreSearchScript0.setNextVar("socket_timeout", (java.lang.Object) docScoreSearchScript40);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript44 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField45 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj46 = docScoreSearchScript44.unwrap((java.lang.Object) parseField45);
        docScoreSearchScript44.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder49.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder49.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition58 = builder49.build();
        java.lang.Boolean boolean59 = mongoDBRiverDefinition58.isMongos();
        boolean boolean60 = mongoDBRiverDefinition58.isStoreStatistics();
        boolean boolean61 = mongoDBRiverDefinition58.isMongoGridFS();
        java.lang.String str62 = mongoDBRiverDefinition58.getIndexName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList63 = mongoDBRiverDefinition58.getMongoServers();
        java.lang.Object obj64 = docScoreSearchScript44.unwrap((java.lang.Object) mongoDBRiverDefinition58);
        boolean boolean65 = mongoDBRiverDefinition58.isSkipInitialImport();
        boolean boolean66 = mongoDBRiverDefinition58.isDropCollection();
        java.lang.Object obj67 = docScoreSearchScript40.unwrap((java.lang.Object) mongoDBRiverDefinition58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double68 = docScoreSearchScript40.runAsDouble();
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "null.secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type.script_type", "is_mongos.is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        java.lang.Boolean boolean17 = mongoDBRiverDefinition16.isMongos();
        boolean boolean18 = mongoDBRiverDefinition16.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition16.getParentTypes();
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition16.getMongoServers();
        int int21 = mongoDBRiverDefinition16.getSocketTimeout();
        java.lang.String str22 = mongoDBRiverDefinition16.getScript();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder21.build();
        int int31 = mongoDBRiverDefinition30.getSocketTimeout();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition30.getIndexName();
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj37 = docScoreSearchScript35.unwrap((java.lang.Object) 100L);
        docScoreSearchScript35.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder40.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder40.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder40.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder40.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.mongoLocalPassword("filter");
        java.lang.Object obj59 = docScoreSearchScript35.unwrap((java.lang.Object) builder58);
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) builder58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder62.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.scriptType("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder74.includeCollection("user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "user");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float80 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "throttle_size.throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.scriptType("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.importAllCollections(false);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoAdminPassword("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.throttleSize((int) (short) -1);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) (short) -1);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.statisticsTypeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder47.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder47.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = builder47.build();
        java.lang.Boolean boolean57 = mongoDBRiverDefinition56.isMongos();
        boolean boolean58 = mongoDBRiverDefinition56.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition56.getParentTypes();
        java.util.List<com.mongodb.ServerAddress> serverAddressList60 = mongoDBRiverDefinition56.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder44.mongoServers(serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder33.mongoServers(serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder33.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.riverIndexName("servers");
        java.lang.Object obj67 = docScoreSearchScript0.unwrap((java.lang.Object) builder66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.socketTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.mongoLocalPassword("filter");
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.statisticsIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.mongoLocalUser("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.script("ssl");
        java.lang.String[] strArray73 = new java.lang.String[] { "host", "size", "gridfs", "db", "servers", "servers", "script_type", "local", "servers", "servers", "drop_collection", "credentials", "script_type", "is_mongos", "bulk_timeout", "port", "concurrent_bulk_requests", "store_statistics", "size", "script_type", "", "store_statistics", "bulk_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder49.excludeFields((java.util.Set<java.lang.String>) strSet74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder38.excludeFields((java.util.Set<java.lang.String>) strSet74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder38.indexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder38.riverName("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder38.socketTimeout(8);
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj85 = docScoreSearchScript0.run();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        int int17 = mongoDBRiverDefinition14.getSocketTimeout();
        boolean boolean18 = mongoDBRiverDefinition14.isMongoUseSSL();
        boolean boolean19 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        boolean boolean20 = mongoDBRiverDefinition14.isAdvancedTransformation();
        boolean boolean21 = mongoDBRiverDefinition14.isAdvancedTransformation();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray35 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList36 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList36, serverAddressArray35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder27.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.connectTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.isMongos((java.lang.Boolean) false);
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder43);
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.ParseField parseField1 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) parseField1);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition14.isMongos();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        boolean boolean17 = mongoDBRiverDefinition14.isStoreStatistics();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition14.getExcludeFields();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition14.getExcludeFields();
        java.lang.String str20 = mongoDBRiverDefinition14.getMongoLocalUser();
        java.lang.Object obj21 = docScoreSearchScript0.unwrap((java.lang.Object) str20);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float24 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.statisticsIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder31.build();
        java.lang.String str33 = mongoDBRiverDefinition32.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet34 = mongoDBRiverDefinition32.getIncludeFields();
        boolean boolean35 = mongoDBRiverDefinition32.isImportAllCollections();
        java.lang.String str36 = mongoDBRiverDefinition32.getRiverIndexName();
        java.lang.String str37 = mongoDBRiverDefinition32.getMongoLocalPassword();
        boolean boolean38 = mongoDBRiverDefinition32.isImportAllCollections();
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) boolean38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long40 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.riverIndexName("secondary_read_preference");
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long27 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.statisticsTypeName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = builder28.build();
        java.lang.Boolean boolean38 = mongoDBRiverDefinition37.isMongos();
        boolean boolean39 = mongoDBRiverDefinition37.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.getParentTypes();
        java.util.List<com.mongodb.ServerAddress> serverAddressList41 = mongoDBRiverDefinition37.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder25.mongoServers(serverAddressList41);
        java.lang.Object obj43 = docScoreSearchScript0.unwrap((java.lang.Object) builder25);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long48 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("connect_timeout");
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) builder27);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.connectTimeout((int) '4');
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) builder37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double43 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "collection.collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder25.connectTimeout((int) (short) 0);
        java.lang.Object obj32 = docScoreSearchScript0.unwrap((java.lang.Object) builder31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.mongoLocalPassword("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.mongoAdminPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder33.includeCollection("script.disable_dynamic");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder33.indexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder33.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        java.lang.Boolean boolean56 = mongoDBRiverDefinition55.isMongos();
        boolean boolean57 = mongoDBRiverDefinition55.isStoreStatistics();
        boolean boolean58 = mongoDBRiverDefinition55.isMongoGridFS();
        int int59 = mongoDBRiverDefinition55.getSocketTimeout();
        boolean boolean60 = mongoDBRiverDefinition55.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject61 = mongoDBRiverDefinition55.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder33.mongoCollectionFilter(basicDBObject61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.scriptType("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder62.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.statisticsIndexName("");
        java.lang.Object obj69 = docScoreSearchScript0.unwrap((java.lang.Object) builder68);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double72 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder7.build();
        int int17 = mongoDBRiverDefinition16.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject18);
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (-1));
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.throttleSize((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoLocalPassword("import_all_collections");
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList34);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript39 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj41 = docScoreSearchScript39.unwrap((java.lang.Object) 100L);
        docScoreSearchScript39.setNextScore((float) 1000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder46.build();
        int int56 = mongoDBRiverDefinition55.getSocketTimeout();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition55.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        docScoreSearchScript39.setNextVar("type", (java.lang.Object) basicDBObject57);
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder61.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = builder61.build();
        java.lang.Boolean boolean71 = mongoDBRiverDefinition70.isMongos();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        boolean boolean73 = mongoDBRiverDefinition70.isMongoGridFS();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition70.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject75 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet76 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.Set<java.lang.String> strSet77 = mongoDBRiverDefinition70.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList78 = mongoDBRiverDefinition70.getMongoServers();
        java.lang.String str79 = mongoDBRiverDefinition70.getIndexName();
        java.lang.String str80 = mongoDBRiverDefinition70.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript82 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) executableScript82);
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long88 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 100L);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder6.build();
        java.lang.Boolean boolean16 = mongoDBRiverDefinition15.isMongos();
        boolean boolean17 = mongoDBRiverDefinition15.isStoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition15.isMongoGridFS();
        boolean boolean19 = mongoDBRiverDefinition15.isMongoUseSSL();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) boolean19);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript21 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj23 = docScoreSearchScript21.unwrap((java.lang.Object) 100L);
        docScoreSearchScript21.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder27.build();
        java.lang.Boolean boolean37 = mongoDBRiverDefinition36.isMongos();
        boolean boolean38 = mongoDBRiverDefinition36.isStoreStatistics();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoGridFS();
        boolean boolean40 = mongoDBRiverDefinition36.isMongoUseSSL();
        docScoreSearchScript21.setNextVar("db", (java.lang.Object) boolean40);
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder43.socketTimeout(60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.skipInitialImport(false);
        java.lang.Object obj60 = docScoreSearchScript21.unwrap((java.lang.Object) false);
        docScoreSearchScript21.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double63 = docScoreSearchScript21.runAsDouble();
    }
}

