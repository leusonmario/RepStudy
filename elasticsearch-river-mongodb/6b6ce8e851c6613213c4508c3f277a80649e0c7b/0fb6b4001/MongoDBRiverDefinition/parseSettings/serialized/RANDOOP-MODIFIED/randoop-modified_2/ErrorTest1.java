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
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.mongoAdminPassword("");
        java.lang.String[] strArray46 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder42.excludeFields = strSet47;
        com.mongodb.BasicDBObject basicDBObject50 = builder42.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder34.mongoOplogFilter(basicDBObject50);
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) builder34);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double55 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        builder17.mongoLocalUser = "store_statistics";
        java.lang.Object obj21 = docScoreSearchScript0.unwrap((java.lang.Object) builder17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        java.lang.String str20 = mongoDBRiverDefinition19.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean21 = mongoDBRiverDefinition19.isDisableIndexRefresh();
        java.lang.String str22 = mongoDBRiverDefinition19.getUSER_FIELD();
        java.lang.String str23 = mongoDBRiverDefinition19.getNAME_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition19.getFLUSH_INTERVAL_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition19.getStatisticsTypeName();
        java.lang.String str26 = mongoDBRiverDefinition19.getPASSWORD_FIELD();
        boolean boolean27 = mongoDBRiverDefinition19.getadvancedTransformation();
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = mongoDBRiverDefinition19.mongoServers;
        java.lang.Object obj29 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj30 = docScoreSearchScript0.run();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long17 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj17 = docScoreSearchScript0.run();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.mongoAdminPassword("");
        java.lang.String[] strArray46 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder42.excludeFields = strSet47;
        com.mongodb.BasicDBObject basicDBObject50 = builder42.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder34.mongoOplogFilter(basicDBObject50);
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) builder34);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.socketTimeout((int) ' ');
        builder57.setscript("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.socketTimeout((int) (byte) 1);
        builder68.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder68);
        com.mongodb.BasicDBObject basicDBObject72 = mongoDBRiverDefinition71.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder61.mongoOplogFilter(basicDBObject72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject72);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder18.mongoAdminPassword("");
        java.lang.String[] strArray25 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder21.excludeFields = strSet26;
        builder21.mongoGridFS = true;
        boolean boolean31 = builder21.mongoSSLVerifyCertificate;
        int int32 = builder21.getsocketTimeout();
        boolean boolean33 = builder21.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder21.typeName("import_all_collections");
        docScoreSearchScript0.setNextVar("mongodb-1638820218408", (java.lang.Object) "import_all_collections");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double37 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript35.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str40 = builder39.gettypeName();
        builder39.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        java.lang.String str44 = builder39.statisticsTypeName;
        java.lang.Object obj45 = docScoreSearchScript35.unwrap((java.lang.Object) builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double48 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        builder8.setexcludeFields((java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder8.mongoUseSSL(false);
        java.lang.String str25 = builder24.getindexName();
        boolean boolean26 = builder24.getadvancedTransformation();
        builder24.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalUser("bulk_size");
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        docScoreSearchScript0.setNextScore(10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoAdminUser("disable_index_refresh");
        boolean boolean43 = builder40.getimportAllCollections();
        builder40.setmongoCollection("mongodb-1638820218387");
        builder40.mongoLocalPassword = "size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder40.mongoLocalUser("null.null");
        builder49.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        builder49.mongoLocalUser = "mongodb-1638820218387";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        java.lang.String str56 = mongoDBRiverDefinition55.mongoDb;
        boolean boolean57 = mongoDBRiverDefinition55.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.null", (java.lang.Object) boolean57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double59 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.mongoAdminPassword("");
        java.lang.String[] strArray46 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder42.excludeFields = strSet47;
        com.mongodb.BasicDBObject basicDBObject50 = builder42.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder34.mongoOplogFilter(basicDBObject50);
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) builder34);
        docScoreSearchScript0.setNextScore((float) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long57 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        boolean boolean19 = mongoDBRiverDefinition18.storeStatistics;
        boolean boolean20 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition18.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = mongoDBRiverDefinition18.initialTimestamp;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.mongoAdminPassword("");
        java.lang.String[] strArray43 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        builder39.excludeFields = strSet44;
        builder33.setexcludeFields((java.util.Set<java.lang.String>) strSet44);
        builder30.parentTypes = strSet44;
        int int49 = builder30.getconnectTimeout();
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) int49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        builder8.setexcludeFields((java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder8.mongoUseSSL(false);
        java.lang.String str25 = builder24.getindexName();
        boolean boolean26 = builder24.getadvancedTransformation();
        builder24.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalUser("bulk_size");
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        docScoreSearchScript0.setNextScore(10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoAdminUser("disable_index_refresh");
        boolean boolean43 = builder40.getimportAllCollections();
        builder40.setmongoCollection("mongodb-1638820218387");
        builder40.mongoLocalPassword = "size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder40.mongoLocalUser("null.null");
        builder49.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        builder49.mongoLocalUser = "mongodb-1638820218387";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        java.lang.String str56 = mongoDBRiverDefinition55.mongoDb;
        boolean boolean57 = mongoDBRiverDefinition55.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.null", (java.lang.Object) boolean57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float59 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        builder8.setexcludeFields((java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder8.mongoUseSSL(false);
        java.lang.String str25 = builder24.getindexName();
        boolean boolean26 = builder24.getadvancedTransformation();
        builder24.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalUser("bulk_size");
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(52);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        docScoreSearchScript0.setNextVar("size", (java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float26 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        docScoreSearchScript0.setNextVar("size", (java.lang.Object) builder23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        boolean boolean28 = mongoDBRiverDefinition27.storeStatistics;
        boolean boolean29 = mongoDBRiverDefinition27.isDisableIndexRefresh();
        java.lang.String str30 = mongoDBRiverDefinition27.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet31 = mongoDBRiverDefinition27.getIncludeFields();
        java.lang.String str32 = mongoDBRiverDefinition27.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str33 = mongoDBRiverDefinition27.includeCollection;
        java.lang.String str34 = mongoDBRiverDefinition27.getSIZE_FIELD();
        java.lang.String str35 = mongoDBRiverDefinition27.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str36 = mongoDBRiverDefinition27.getINCLUDE_COLLECTION_FIELD();
        boolean boolean37 = mongoDBRiverDefinition27.mongoSecondaryReadPreference;
        java.lang.String str38 = mongoDBRiverDefinition27.statisticsTypeName;
        com.mongodb.BasicDBObject basicDBObject39 = mongoDBRiverDefinition27.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject39);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str18 = builder17.gettypeName();
        builder17.setriverName("hi!");
        java.lang.String str21 = builder17.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        boolean boolean26 = mongoDBRiverDefinition25.storeStatistics;
        boolean boolean27 = mongoDBRiverDefinition25.isDisableIndexRefresh();
        java.lang.String str28 = mongoDBRiverDefinition25.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet29 = mongoDBRiverDefinition25.getIncludeFields();
        java.lang.String str30 = mongoDBRiverDefinition25.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str31 = mongoDBRiverDefinition25.includeCollection;
        java.lang.String str32 = mongoDBRiverDefinition25.getMongoAdminPassword();
        java.lang.String str33 = mongoDBRiverDefinition25.getDROP_COLLECTION_FIELD();
        java.lang.String str34 = mongoDBRiverDefinition25.mongoAdminPassword;
        java.lang.String str35 = mongoDBRiverDefinition25.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition25.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder23.mongoCollectionFilter(basicDBObject36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject36);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long21 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.gettypeName();
        builder5.setmongoDb("concurrent_bulk_requests");
        builder5.riverName = "throttle_size";
        builder5.connectTimeout = 'a';
        builder5.setsocketTimeout(27017);
        builder5.setmongoLocalUser("socket_timeout");
        builder5.mongoAdminUser = "";
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        java.lang.String str24 = mongoDBRiverDefinition23.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition23.getRiverName();
        java.lang.String str26 = mongoDBRiverDefinition23.mongoAdminPassword;
        java.lang.String str27 = mongoDBRiverDefinition23.getOPTIONS_FIELD();
        boolean boolean28 = mongoDBRiverDefinition23.isAdvancedTransformation();
        java.lang.String str29 = mongoDBRiverDefinition23.getCREDENTIALS_FIELD();
        java.lang.String str30 = mongoDBRiverDefinition23.getSCRIPT_TYPE_FIELD();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition23.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long23 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("credentials", "null.null");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        builder8.setexcludeFields((java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder8.mongoUseSSL(false);
        java.lang.String str25 = builder24.getindexName();
        boolean boolean26 = builder24.getadvancedTransformation();
        builder24.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalUser("bulk_size");
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float35 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.mongoAdminPassword("");
        java.lang.String[] strArray22 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder18.excludeFields = strSet23;
        builder12.setexcludeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder12.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        boolean boolean30 = builder28.dropCollection;
        boolean boolean31 = builder28.storeStatistics;
        java.util.Set<java.lang.String> strSet32 = builder28.excludeFields;
        builder7.setexcludeFields(strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.mongoAdminPassword("");
        java.lang.String[] strArray46 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder42.excludeFields = strSet47;
        builder36.setexcludeFields((java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder36.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.dropCollection(true);
        builder52.setsocketTimeout(27017);
        builder52.skipInitialImport = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder52.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet61 = builder52.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder7.excludeFields(strSet61);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) strSet61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long64 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.mongoAdminPassword("");
        java.lang.String[] strArray43 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        builder39.excludeFields = strSet44;
        builder33.setexcludeFields((java.util.Set<java.lang.String>) strSet44);
        builder30.parentTypes = strSet44;
        int int49 = builder30.getconnectTimeout();
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) int49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str55 = mongoDBRiverDefinition54.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean56 = mongoDBRiverDefinition54.isDisableIndexRefresh();
        java.lang.String str57 = mongoDBRiverDefinition54.getUSER_FIELD();
        java.lang.String str58 = mongoDBRiverDefinition54.getNAME_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition54.getFLUSH_INTERVAL_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition54.getStatisticsTypeName();
        java.lang.String str61 = mongoDBRiverDefinition54.getPASSWORD_FIELD();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) mongoDBRiverDefinition54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder63.mongoAdminPassword("");
        java.lang.String[] strArray70 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        builder66.excludeFields = strSet71;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp74 = builder66.initialTimestamp;
        boolean boolean75 = builder66.advancedTransformation;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter76 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings77 = serializedObjectSupporter76.deserializeObjectRiverSettings4();
        java.lang.String str78 = serializedObjectSupporter76.deserializeObjectString16();
        builder66.serializedObjectSupporter = serializedObjectSupporter76;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder66.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder66.mongoSecondaryReadPreference(false);
        builder66.setindexName("exclude_fields");
        java.lang.Object obj86 = docScoreSearchScript0.unwrap((java.lang.Object) builder66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double87 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str5 = builder4.gettypeName();
        builder4.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str9 = builder4.statisticsTypeName;
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) builder4);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.mongoAdminPassword("");
        java.lang.String[] strArray22 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder18.excludeFields = strSet23;
        builder12.setexcludeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder12.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        boolean boolean30 = builder28.dropCollection;
        boolean boolean31 = builder28.storeStatistics;
        java.util.Set<java.lang.String> strSet32 = builder28.excludeFields;
        builder7.setexcludeFields(strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.mongoAdminPassword("");
        java.lang.String[] strArray46 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder42.excludeFields = strSet47;
        builder36.setexcludeFields((java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder36.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.dropCollection(true);
        builder52.setsocketTimeout(27017);
        builder52.skipInitialImport = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder52.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet61 = builder52.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder7.excludeFields(strSet61);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) strSet61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double64 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        builder8.setexcludeFields((java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder8.mongoUseSSL(false);
        java.lang.String str25 = builder24.getindexName();
        boolean boolean26 = builder24.getadvancedTransformation();
        builder24.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalUser("bulk_size");
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        docScoreSearchScript0.setNextScore(10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoAdminUser("disable_index_refresh");
        boolean boolean43 = builder40.getimportAllCollections();
        builder40.setmongoCollection("mongodb-1638820218387");
        builder40.mongoLocalPassword = "size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder40.mongoLocalUser("null.null");
        builder49.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        builder49.mongoLocalUser = "mongodb-1638820218387";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        java.lang.String str56 = mongoDBRiverDefinition55.mongoDb;
        boolean boolean57 = mongoDBRiverDefinition55.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.null", (java.lang.Object) boolean57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder65.mongoAdminPassword("");
        java.lang.String[] strArray72 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        builder68.excludeFields = strSet73;
        builder62.setexcludeFields((java.util.Set<java.lang.String>) strSet73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder62.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder78.dropCollection(true);
        builder78.setsocketTimeout(27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder78.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.mongoSSLVerifyCertificate(true);
        docScoreSearchScript0.setNextVar("bulk", (java.lang.Object) builder84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long88 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str21 = mongoDBRiverDefinition20.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str22 = mongoDBRiverDefinition20.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = mongoDBRiverDefinition20.getMongoServers();
        boolean boolean24 = mongoDBRiverDefinition20.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject25 = mongoDBRiverDefinition20.getMongoCollectionFilter();
        java.lang.String str26 = mongoDBRiverDefinition20.getCONNECTION_TIMEOUT();
        java.lang.String str27 = mongoDBRiverDefinition20.getMongoCollection();
        java.lang.String str28 = mongoDBRiverDefinition20.getSTORE_STATISTICS_FIELD();
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) mongoDBRiverDefinition20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder35.mongoAdminPassword("");
        java.lang.String[] strArray42 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        builder38.excludeFields = strSet43;
        builder32.setexcludeFields((java.util.Set<java.lang.String>) strSet43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder32.mongoUseSSL(false);
        builder32.storeStatistics = false;
        boolean boolean51 = builder32.importAllCollections;
        builder32.settypeName("local");
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) builder32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = docScoreSearchScript0.run();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        builder8.setexcludeFields((java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder8.mongoUseSSL(false);
        java.lang.String str25 = builder24.getindexName();
        boolean boolean26 = builder24.getadvancedTransformation();
        builder24.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalUser("bulk_size");
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        docScoreSearchScript0.setNextScore(10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoAdminUser("disable_index_refresh");
        boolean boolean43 = builder40.getimportAllCollections();
        builder40.setmongoCollection("mongodb-1638820218387");
        builder40.mongoLocalPassword = "size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder40.mongoLocalUser("null.null");
        builder49.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        builder49.mongoLocalUser = "mongodb-1638820218387";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        java.lang.String str56 = mongoDBRiverDefinition55.mongoDb;
        boolean boolean57 = mongoDBRiverDefinition55.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.null", (java.lang.Object) boolean57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str60 = builder59.gettypeName();
        builder59.setmongoDb("concurrent_bulk_requests");
        builder59.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder59.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder59.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder69);
        boolean boolean71 = mongoDBRiverDefinition70.storeStatistics;
        boolean boolean72 = mongoDBRiverDefinition70.isDisableIndexRefresh();
        java.lang.String str73 = mongoDBRiverDefinition70.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition70.getIncludeFields();
        java.lang.String str75 = mongoDBRiverDefinition70.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str76 = mongoDBRiverDefinition70.includeCollection;
        java.lang.String str77 = mongoDBRiverDefinition70.getMongoAdminPassword();
        java.lang.String str78 = mongoDBRiverDefinition70.getDROP_COLLECTION_FIELD();
        java.lang.String str79 = mongoDBRiverDefinition70.mongoAdminPassword;
        java.lang.String str80 = mongoDBRiverDefinition70.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition70.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder68.mongoOplogFilter(basicDBObject81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition83 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder82);
        java.lang.String str84 = mongoDBRiverDefinition83.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        com.mongodb.BasicDBObject basicDBObject85 = mongoDBRiverDefinition83.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject85);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        boolean boolean19 = mongoDBRiverDefinition18.storeStatistics;
        boolean boolean20 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition18.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = mongoDBRiverDefinition18.initialTimestamp;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject32 = builder31.getmongoCollectionFilter();
        boolean boolean33 = builder31.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) builder31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double36 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter18 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings19 = serializedObjectSupporter18.deserializeObjectRiverSettings4();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings21 = serializedObjectSupporter18.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings22 = serializedObjectSupporter18.deserializeObjectRiverSettings3();
        java.lang.String str23 = serializedObjectSupporter18.deserializeObjectString18();
        java.lang.String str24 = serializedObjectSupporter18.deserializeObjectString9();
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) serializedObjectSupporter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double26 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj17 = docScoreSearchScript0.run();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj29 = docScoreSearchScript0.run();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long19 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.mongoAdminPassword("");
        java.lang.String[] strArray43 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        builder39.excludeFields = strSet44;
        builder33.setexcludeFields((java.util.Set<java.lang.String>) strSet44);
        builder30.parentTypes = strSet44;
        int int49 = builder30.getconnectTimeout();
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) int49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str55 = mongoDBRiverDefinition54.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean56 = mongoDBRiverDefinition54.isDisableIndexRefresh();
        java.lang.String str57 = mongoDBRiverDefinition54.getUSER_FIELD();
        java.lang.String str58 = mongoDBRiverDefinition54.getNAME_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition54.getFLUSH_INTERVAL_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition54.getStatisticsTypeName();
        java.lang.String str61 = mongoDBRiverDefinition54.getPASSWORD_FIELD();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) mongoDBRiverDefinition54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj63 = docScoreSearchScript0.run();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float21 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        boolean boolean19 = mongoDBRiverDefinition18.storeStatistics;
        boolean boolean20 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition18.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = mongoDBRiverDefinition18.initialTimestamp;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject32 = builder31.getmongoCollectionFilter();
        boolean boolean33 = builder31.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) builder31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj36 = docScoreSearchScript0.run();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }
}

