import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test9001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9001");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.Integer int5 = mongoProperties0.getPort();
        java.lang.String str6 = mongoProperties0.getUri();
        java.lang.String str7 = mongoProperties0.getHost();
        mongoProperties0.setAuthenticationDatabase("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test9002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9002");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder1 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minConnectionsPerHost(27017);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(15);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.acceptableLatencyDifference(15);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.connectionsPerHost(120000);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.maxConnectionIdleTime(5);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder23.build();
        int int25 = mongoClientOptions24.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean26 = mongoClientOptions24.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory27 = mongoClientOptions24.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder28.build();
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference31 = mongoClientOptions29.getReadPreference();
        boolean boolean32 = mongoClientOptions24.equals((java.lang.Object) readPreference31);
        javax.net.SocketFactory socketFactory33 = mongoClientOptions24.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder34 = builder14.socketFactory(socketFactory33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder9.socketFactory(socketFactory33);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.description("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory27);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(readPreference31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(socketFactory33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test9003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9003");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.connectionsPerHost(27017);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.connectionsPerHost(500);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatConnectTimeout(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties17.setHost("hi!");
        mongoProperties17.setUri("");
        char[] charArray24 = new char[] { 'a', '#' };
        mongoProperties17.setPassword(charArray24);
        char[] charArray31 = new char[] { '#', ' ', ' ', 'a', ' ' };
        mongoProperties17.setPassword(charArray31);
        java.lang.String str33 = mongoProperties17.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder34.build();
        int int36 = mongoClientOptions35.getMaxConnectionLifeTime();
        boolean boolean37 = mongoClientOptions35.isCursorFinalizerEnabled();
        boolean boolean38 = mongoClientOptions35.isAlwaysUseMBeans();
        boolean boolean39 = mongoClientOptions35.isAutoConnectRetry();
        boolean boolean40 = mongoClientOptions35.isAutoConnectRetry();
        org.springframework.core.env.Environment environment41 = null;
        com.mongodb.MongoClient mongoClient42 = mongoProperties17.createMongoClient(mongoClientOptions35, environment41);
        long long43 = mongoClientOptions35.getMaxAutoConnectRetryTime();
        boolean boolean44 = mongoClientOptions35.isAlwaysUseMBeans();
        int int45 = mongoClientOptions35.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern46 = mongoClientOptions35.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder47 = builder16.writeConcern(writeConcern46);
        com.mongodb.MongoClientOptions.Builder builder49 = builder16.maxConnectionIdleTime((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a, #]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[\000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(mongoClient42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
        org.junit.Assert.assertNotNull(writeConcern46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test9004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9004");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatThreadCount();
        int int3 = mongoClientOptions1.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference4 = mongoClientOptions1.getReadPreference();
        int int5 = mongoClientOptions1.getHeartbeatSocketTimeout();
        boolean boolean6 = mongoClientOptions1.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.build();
        boolean boolean9 = mongoClientOptions8.isAutoConnectRetry();
        boolean boolean10 = mongoClientOptions1.equals((java.lang.Object) mongoClientOptions8);
        int int11 = mongoClientOptions8.getHeartbeatSocketTimeout();
        boolean boolean12 = mongoClientOptions8.isAlwaysUseMBeans();
        long long13 = mongoClientOptions8.getMaxAutoConnectRetryTime();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions8.getReadPreference();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(readPreference4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(readPreference14);
    }

    @Test
    public void test9005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9005");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.connectTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.socketTimeout(0);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.build();
        int int9 = mongoClientOptions8.getSocketTimeout();
        int int10 = mongoClientOptions8.getConnectionsPerHost();
        int int11 = mongoClientOptions8.getConnectTimeout();
        int int12 = mongoClientOptions8.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test9006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9006");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatThreadCount();
        int int3 = mongoClientOptions1.getHeartbeatSocketTimeout();
        int int4 = mongoClientOptions1.getLocalThreshold();
        int int5 = mongoClientOptions1.getHeartbeatFrequency();
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        java.lang.String str7 = mongoClientOptions1.getDescription();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions1.getReadPreference();
        int int9 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int10 = mongoClientOptions1.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
    }

    @Test
    public void test9007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9007");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference((int) 'a');
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        int int23 = mongoClientOptions22.getHeartbeatThreadCount();
        int int24 = mongoClientOptions22.getHeartbeatSocketTimeout();
        int int25 = mongoClientOptions22.getMaxWaitTime();
        int int26 = mongoClientOptions22.getHeartbeatConnectTimeout();
        javax.net.SocketFactory socketFactory27 = mongoClientOptions22.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder20.socketFactory(socketFactory27);
        com.mongodb.MongoClientOptions.Builder builder29 = builder8.socketFactory(socketFactory27);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.heartbeatFrequency((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 120000 + "'", int25 == 120000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20000 + "'", int26 == 20000);
        org.junit.Assert.assertNotNull(socketFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test9008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9008");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder4.build();
        int int6 = mongoClientOptions5.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean7 = mongoClientOptions5.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions5.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions10.getReadPreference();
        boolean boolean13 = mongoClientOptions5.equals((java.lang.Object) readPreference12);
        boolean boolean14 = mongoClientOptions5.isSocketKeepAlive();
        int int15 = mongoClientOptions5.getHeartbeatFrequency();
        java.lang.String str16 = mongoClientOptions5.toString();
        boolean boolean17 = mongoClientOptions5.isAutoConnectRetry();
        int int18 = mongoClientOptions5.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5000 + "'", int15 == 5000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test9009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9009");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.acceptableLatencyDifference((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.maxAutoConnectRetryTime((long) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.heartbeatThreadCount((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.connectionsPerHost(27017);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.socketTimeout((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder18.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.maxConnectionIdleTime(0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties27.setHost("hi!");
        java.lang.String str30 = mongoProperties27.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        com.mongodb.MongoClient mongoClient32 = mongoProperties27.createMongoClient(mongoClientOptions31);
        mongoProperties27.setAuthenticationDatabase("");
        char[] charArray41 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties27.setPassword(charArray41);
        mongoProperties27.setDatabase("");
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder45.build();
        org.springframework.core.env.Environment environment47 = null;
        com.mongodb.MongoClient mongoClient48 = mongoProperties27.createMongoClient(mongoClientOptions46, environment47);
        com.mongodb.DBDecoderFactory dBDecoderFactory49 = mongoClientOptions46.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder50 = builder24.dbDecoderFactory(dBDecoderFactory49);
        com.mongodb.MongoClientOptions.Builder builder52 = builder24.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder54 = builder24.threadsAllowedToBlockForConnectionMultiplier(500);
        com.mongodb.MongoClientOptions.Builder builder56 = builder24.socketTimeout(500);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions58 = builder57.build();
        boolean boolean59 = mongoClientOptions58.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties60 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties60.setHost("hi!");
        java.lang.String str63 = mongoProperties60.getDatabase();
        java.lang.String str64 = mongoProperties60.getUri();
        java.lang.Integer int65 = mongoProperties60.getPort();
        java.lang.String str66 = mongoProperties60.getHost();
        mongoProperties60.setUsername("");
        boolean boolean69 = mongoClientOptions58.equals((java.lang.Object) mongoProperties60);
        java.lang.String str70 = mongoClientOptions58.toString();
        int int71 = mongoClientOptions58.getMaxWaitTime();
        java.lang.String str72 = mongoClientOptions58.getRequiredReplicaSetName();
        com.mongodb.DBDecoderFactory dBDecoderFactory73 = mongoClientOptions58.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder74 = builder24.dbDecoderFactory(dBDecoderFactory73);
        com.mongodb.MongoClientOptions.Builder builder75 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions76 = builder75.build();
        int int77 = mongoClientOptions76.getHeartbeatThreadCount();
        int int78 = mongoClientOptions76.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference79 = mongoClientOptions76.getReadPreference();
        com.mongodb.WriteConcern writeConcern80 = mongoClientOptions76.getWriteConcern();
        boolean boolean81 = mongoClientOptions76.isAlwaysUseMBeans();
        com.mongodb.WriteConcern writeConcern82 = mongoClientOptions76.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder83 = builder24.writeConcern(writeConcern82);
        com.mongodb.MongoClientOptions.Builder builder84 = builder9.writeConcern(writeConcern82);
        com.mongodb.MongoClientOptions.Builder builder86 = builder9.maxAutoConnectRetryTime((long) 15);
        com.mongodb.MongoClientOptions.Builder builder88 = builder9.acceptableLatencyDifference(100);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(mongoClient32);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(mongoClient48);
        org.junit.Assert.assertNotNull(dBDecoderFactory49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "mongodb://localhost/test" + "'", str64, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 120000 + "'", int71 == 120000);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(dBDecoderFactory73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(mongoClientOptions76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 20000 + "'", int78 == 20000);
        org.junit.Assert.assertNotNull(readPreference79);
        org.junit.Assert.assertNotNull(writeConcern80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(writeConcern82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test9010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9010");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minHeartbeatFrequency((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder16 = builder13.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder18 = builder13.heartbeatConnectRetryFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        int int21 = mongoClientOptions20.getHeartbeatThreadCount();
        int int22 = mongoClientOptions20.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions20.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder24 = builder13.readPreference(readPreference23);
        com.mongodb.MongoClientOptions.Builder builder26 = builder13.acceptableLatencyDifference(100);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.heartbeatThreadCount(15);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder44 = builder40.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder49 = builder45.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder56.build();
        int int58 = mongoClientOptions57.getHeartbeatThreadCount();
        int int59 = mongoClientOptions57.getHeartbeatSocketTimeout();
        int int60 = mongoClientOptions57.getHeartbeatThreadCount();
        long long61 = mongoClientOptions57.getMaxAutoConnectRetryTime();
        javax.net.SocketFactory socketFactory62 = mongoClientOptions57.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder63 = builder55.socketFactory(socketFactory62);
        com.mongodb.MongoClientOptions.Builder builder64 = builder40.socketFactory(socketFactory62);
        com.mongodb.MongoClientOptions.Builder builder65 = builder35.socketFactory(socketFactory62);
        com.mongodb.MongoClientOptions.Builder builder66 = builder28.socketFactory(socketFactory62);
        com.mongodb.MongoClientOptions.Builder builder67 = builder10.socketFactory(socketFactory62);
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.maxAutoConnectRetryTime((long) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(readPreference23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
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
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 20000 + "'", int59 == 20000);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(socketFactory62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test9011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9011");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(10000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference(27017);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        int int15 = mongoClientOptions14.getHeartbeatThreadCount();
        int int16 = mongoClientOptions14.getHeartbeatSocketTimeout();
        int int17 = mongoClientOptions14.getLocalThreshold();
        int int18 = mongoClientOptions14.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference19 = mongoClientOptions14.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions14.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder21 = builder10.dbDecoderFactory(dBDecoderFactory20);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.threadsAllowedToBlockForConnectionMultiplier(100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5000 + "'", int18 == 5000);
        org.junit.Assert.assertNotNull(readPreference19);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test9012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9012");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        com.mongodb.DBEncoderFactory dBEncoderFactory3 = mongoClientOptions1.getDbEncoderFactory();
        java.lang.String str4 = mongoClientOptions1.getDescription();
        java.lang.String str5 = mongoClientOptions1.toString();
        int int6 = mongoClientOptions1.getHeartbeatFrequency();
        int int7 = mongoClientOptions1.getConnectTimeout();
        java.lang.String str8 = mongoClientOptions1.toString();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dBEncoderFactory3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5000 + "'", int6 == 5000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
    }

    @Test
    public void test9013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9013");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatThreadCount();
        int int3 = mongoClientOptions1.getHeartbeatSocketTimeout();
        int int4 = mongoClientOptions1.getHeartbeatThreadCount();
        int int5 = mongoClientOptions1.getMinHeartbeatFrequency();
        int int6 = mongoClientOptions1.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference7 = mongoClientOptions1.getReadPreference();
        int int8 = mongoClientOptions1.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        boolean boolean11 = mongoClientOptions10.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.setHost("hi!");
        java.lang.String str15 = mongoProperties12.getDatabase();
        java.lang.String str16 = mongoProperties12.getUri();
        java.lang.Integer int17 = mongoProperties12.getPort();
        java.lang.String str18 = mongoProperties12.getHost();
        mongoProperties12.setUsername("");
        boolean boolean21 = mongoClientOptions10.equals((java.lang.Object) mongoProperties12);
        long long22 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        boolean boolean23 = mongoClientOptions10.isAutoConnectRetry();
        boolean boolean24 = mongoClientOptions1.equals((java.lang.Object) boolean23);
        int int25 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions1.getWriteConcern();
        int int27 = mongoClientOptions1.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertNotNull(readPreference7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertNotNull(writeConcern26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 500 + "'", int27 == 500);
    }

    @Test
    public void test9014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9014");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.connectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.maxWaitTime((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        int int24 = mongoClientOptions23.getHeartbeatThreadCount();
        int int25 = mongoClientOptions23.getHeartbeatSocketTimeout();
        int int26 = mongoClientOptions23.getHeartbeatThreadCount();
        int int27 = mongoClientOptions23.getMinHeartbeatFrequency();
        int int28 = mongoClientOptions23.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference29 = mongoClientOptions23.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder30 = builder21.readPreference(readPreference29);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        int int33 = mongoClientOptions32.getHeartbeatThreadCount();
        int int34 = mongoClientOptions32.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference35 = mongoClientOptions32.getReadPreference();
        int int36 = mongoClientOptions32.getAcceptableLatencyDifference();
        java.lang.String str37 = mongoClientOptions32.getDescription();
        int int38 = mongoClientOptions32.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern39 = mongoClientOptions32.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder40 = builder30.writeConcern(writeConcern39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder16.writeConcern(writeConcern39);
        com.mongodb.MongoClientOptions.Builder builder43 = builder16.heartbeatThreadCount(15);
        com.mongodb.MongoClientOptions.Builder builder45 = builder16.threadsAllowedToBlockForConnectionMultiplier((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder49 = builder45.heartbeatThreadCount(500);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder49.build();
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
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 500 + "'", int27 == 500);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 120000 + "'", int28 == 120000);
        org.junit.Assert.assertNotNull(readPreference29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertNotNull(readPreference35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(writeConcern39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
    }

    @Test
    public void test9015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9015");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getMaxConnectionLifeTime();
        boolean boolean3 = mongoClientOptions1.isAutoConnectRetry();
        boolean boolean4 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference5 = mongoClientOptions1.getReadPreference();
        com.mongodb.DBEncoderFactory dBEncoderFactory6 = mongoClientOptions1.getDbEncoderFactory();
        com.mongodb.WriteConcern writeConcern7 = mongoClientOptions1.getWriteConcern();
        com.mongodb.WriteConcern writeConcern8 = mongoClientOptions1.getWriteConcern();
        java.lang.String str9 = mongoClientOptions1.toString();
        int int10 = mongoClientOptions1.getSocketTimeout();
        boolean boolean11 = mongoClientOptions1.isAlwaysUseMBeans();
        int int12 = mongoClientOptions1.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(readPreference5);
        org.junit.Assert.assertNotNull(dBEncoderFactory6);
        org.junit.Assert.assertNotNull(writeConcern7);
        org.junit.Assert.assertNotNull(writeConcern8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test9016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9016");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions4);
        mongoProperties0.setPort((java.lang.Integer) 120000);
        mongoProperties0.setUsername("mongodb://localhost/test");
        mongoProperties0.setUri("");
        mongoProperties0.setAuthenticationDatabase("test");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(mongoClient5);
    }

    @Test
    public void test9017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9017");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder4.build();
        int int6 = mongoClientOptions5.getThreadsAllowedToBlockForConnectionMultiplier();
        int int7 = mongoClientOptions5.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions5.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        boolean boolean12 = mongoClientOptions10.isAutoConnectRetry();
        boolean boolean13 = mongoClientOptions10.isSocketKeepAlive();
        int int14 = mongoClientOptions10.getMaxConnectionLifeTime();
        boolean boolean15 = mongoClientOptions10.isAutoConnectRetry();
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions10.getReadPreference();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions10.getWriteConcern();
        boolean boolean18 = mongoClientOptions5.equals((java.lang.Object) mongoClientOptions10);
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions5.getDbDecoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
    }

    @Test
    public void test9018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9018");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(15);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.acceptableLatencyDifference(15);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.minConnectionsPerHost((int) '4');
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.heartbeatConnectTimeout(120000);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder35 = builder31.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.heartbeatFrequency(120000);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder41 = builder37.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder48 = builder44.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.heartbeatFrequency(120000);
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder51.build();
        int int53 = mongoClientOptions52.getHeartbeatThreadCount();
        int int54 = mongoClientOptions52.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference55 = mongoClientOptions52.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder56 = builder50.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder57 = builder37.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder58 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder64 = builder60.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.heartbeatFrequency(120000);
        com.mongodb.MongoClientOptions.Builder builder67 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions68 = builder67.build();
        int int69 = mongoClientOptions68.getHeartbeatThreadCount();
        int int70 = mongoClientOptions68.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference71 = mongoClientOptions68.getReadPreference();
        com.mongodb.ReadPreference readPreference72 = mongoClientOptions68.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder73 = builder66.readPreference(readPreference72);
        com.mongodb.MongoClientOptions.Builder builder74 = builder57.readPreference(readPreference72);
        com.mongodb.MongoClientOptions.Builder builder75 = builder28.readPreference(readPreference72);
        com.mongodb.MongoClientOptions.Builder builder76 = builder17.readPreference(readPreference72);
        com.mongodb.MongoClientOptions.Builder builder77 = builder8.readPreference(readPreference72);
        com.mongodb.MongoClientOptions.Builder builder78 = builder77.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder80 = builder78.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder82 = builder78.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder84 = builder82.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder86 = builder82.maxConnectionIdleTime(52);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20000 + "'", int54 == 20000);
        org.junit.Assert.assertNotNull(readPreference55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoClientOptions68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 20000 + "'", int70 == 20000);
        org.junit.Assert.assertNotNull(readPreference71);
        org.junit.Assert.assertNotNull(readPreference72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test9019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9019");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        java.lang.Class<?> wildcardClass4 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str6 = mongoProperties0.getDatabase();
        java.lang.Integer int7 = mongoProperties0.getPort();
        mongoProperties0.setGridFsDatabase("test");
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        java.lang.String str12 = mongoProperties0.getUri();
        mongoProperties0.setUri("hi!");
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str17 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray18 = mongoProperties0.getPassword();
        java.lang.String str19 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
    }

    @Test
    public void test9020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9020");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatThreadCount();
        int int8 = mongoClientOptions6.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions6.getHeartbeatThreadCount();
        int int10 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int11 = mongoClientOptions6.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions6.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder13 = builder4.readPreference(readPreference12);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getHeartbeatThreadCount();
        int int17 = mongoClientOptions15.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions15.getReadPreference();
        int int19 = mongoClientOptions15.getAcceptableLatencyDifference();
        java.lang.String str20 = mongoClientOptions15.getDescription();
        int int21 = mongoClientOptions15.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions15.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder23 = builder13.writeConcern(writeConcern22);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        int int37 = mongoClientOptions36.getHeartbeatThreadCount();
        int int38 = mongoClientOptions36.getHeartbeatSocketTimeout();
        int int39 = mongoClientOptions36.getHeartbeatThreadCount();
        long long40 = mongoClientOptions36.getMaxAutoConnectRetryTime();
        javax.net.SocketFactory socketFactory41 = mongoClientOptions36.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder42 = builder34.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder43 = builder23.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder45 = builder23.heartbeatSocketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder46 = builder23.legacyDefaults();
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder46.build();
        com.mongodb.MongoClientOptions.Builder builder49 = builder46.maxConnectionLifeTime(0);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.connectTimeout(32);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 120000 + "'", int11 == 120000);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(writeConcern22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(socketFactory41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test9021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9021");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getMaxConnectionLifeTime();
        boolean boolean3 = mongoClientOptions1.isAutoConnectRetry();
        boolean boolean4 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference5 = mongoClientOptions1.getReadPreference();
        com.mongodb.DBEncoderFactory dBEncoderFactory6 = mongoClientOptions1.getDbEncoderFactory();
        int int7 = mongoClientOptions1.getLocalThreshold();
        int int8 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions1.getMinHeartbeatFrequency();
        java.lang.String str10 = mongoClientOptions1.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions1.getSocketFactory();
        boolean boolean12 = mongoClientOptions1.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties13.setHost("hi!");
        java.lang.String str16 = mongoProperties13.getUsername();
        java.lang.Class<?> wildcardClass17 = mongoProperties13.getFieldNamingStrategy();
        java.lang.String str18 = mongoProperties13.getAuthenticationDatabase();
        java.lang.String str19 = mongoProperties13.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder20.build();
        int int22 = mongoClientOptions21.getMaxConnectionLifeTime();
        boolean boolean23 = mongoClientOptions21.isCursorFinalizerEnabled();
        boolean boolean24 = mongoClientOptions21.isAlwaysUseMBeans();
        int int25 = mongoClientOptions21.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClient mongoClient26 = mongoProperties13.createMongoClient(mongoClientOptions21);
        javax.net.SocketFactory socketFactory27 = mongoClientOptions21.getSocketFactory();
        com.mongodb.WriteConcern writeConcern28 = mongoClientOptions21.getWriteConcern();
        java.lang.String str29 = mongoClientOptions21.getDescription();
        com.mongodb.DBEncoderFactory dBEncoderFactory30 = mongoClientOptions21.getDbEncoderFactory();
        int int31 = mongoClientOptions21.getMinConnectionsPerHost();
        boolean boolean32 = mongoClientOptions1.equals((java.lang.Object) mongoClientOptions21);
        java.lang.String str33 = mongoClientOptions21.getRequiredReplicaSetName();
        int int34 = mongoClientOptions21.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(readPreference5);
        org.junit.Assert.assertNotNull(dBEncoderFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "test" + "'", str19, "test");
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 500 + "'", int25 == 500);
        org.junit.Assert.assertNotNull(mongoClient26);
        org.junit.Assert.assertNotNull(socketFactory27);
        org.junit.Assert.assertNotNull(writeConcern28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(dBEncoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 500 + "'", int34 == 500);
    }

    @Test
    public void test9022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9022");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatThreadCount();
        int int3 = mongoClientOptions1.getHeartbeatSocketTimeout();
        int int4 = mongoClientOptions1.getHeartbeatThreadCount();
        int int5 = mongoClientOptions1.getMinHeartbeatFrequency();
        int int6 = mongoClientOptions1.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference7 = mongoClientOptions1.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxConnectionIdleTime(0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties19.setHost("hi!");
        java.lang.String str22 = mongoProperties19.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties19.createMongoClient(mongoClientOptions23);
        mongoProperties19.setAuthenticationDatabase("");
        char[] charArray33 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties19.setPassword(charArray33);
        mongoProperties19.setDatabase("");
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder37.build();
        org.springframework.core.env.Environment environment39 = null;
        com.mongodb.MongoClient mongoClient40 = mongoProperties19.createMongoClient(mongoClientOptions38, environment39);
        com.mongodb.DBDecoderFactory dBDecoderFactory41 = mongoClientOptions38.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder42 = builder16.dbDecoderFactory(dBDecoderFactory41);
        com.mongodb.MongoClientOptions.Builder builder44 = builder16.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder46 = builder16.threadsAllowedToBlockForConnectionMultiplier(500);
        com.mongodb.MongoClientOptions.Builder builder48 = builder16.socketTimeout(500);
        com.mongodb.MongoClientOptions.Builder builder50 = builder16.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder54 = builder53.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.connectTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder58 = builder54.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions65 = builder64.build();
        int int66 = mongoClientOptions65.getHeartbeatThreadCount();
        int int67 = mongoClientOptions65.getHeartbeatSocketTimeout();
        int int68 = mongoClientOptions65.getHeartbeatThreadCount();
        int int69 = mongoClientOptions65.getMinHeartbeatFrequency();
        int int70 = mongoClientOptions65.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference71 = mongoClientOptions65.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder72 = builder63.readPreference(readPreference71);
        com.mongodb.MongoClientOptions.Builder builder73 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions74 = builder73.build();
        int int75 = mongoClientOptions74.getHeartbeatThreadCount();
        int int76 = mongoClientOptions74.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference77 = mongoClientOptions74.getReadPreference();
        int int78 = mongoClientOptions74.getAcceptableLatencyDifference();
        java.lang.String str79 = mongoClientOptions74.getDescription();
        int int80 = mongoClientOptions74.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern81 = mongoClientOptions74.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder82 = builder72.writeConcern(writeConcern81);
        com.mongodb.MongoClientOptions.Builder builder83 = builder54.writeConcern(writeConcern81);
        com.mongodb.MongoClientOptions.Builder builder84 = builder16.writeConcern(writeConcern81);
        com.mongodb.MongoClientOptions.Builder builder86 = builder84.requiredReplicaSetName("hi!");
        boolean boolean87 = mongoClientOptions1.equals((java.lang.Object) builder84);
        int int88 = mongoClientOptions1.getConnectTimeout();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertNotNull(readPreference7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertNotNull(mongoClient40);
        org.junit.Assert.assertNotNull(dBDecoderFactory41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(mongoClientOptions65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 20000 + "'", int67 == 20000);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 500 + "'", int69 == 500);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 120000 + "'", int70 == 120000);
        org.junit.Assert.assertNotNull(readPreference71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClientOptions74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 20000 + "'", int76 == 20000);
        org.junit.Assert.assertNotNull(readPreference77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 15 + "'", int78 == 15);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(writeConcern81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10000 + "'", int88 == 10000);
    }

    @Test
    public void test9023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9023");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getDatabase();
        mongoProperties0.setUsername("mongodb://localhost/test");
        mongoProperties0.setGridFsDatabase("");
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getHeartbeatThreadCount();
        int int13 = mongoClientOptions11.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions11.getReadPreference();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions11.getWriteConcern();
        boolean boolean16 = mongoClientOptions11.isAlwaysUseMBeans();
        com.mongodb.MongoClient mongoClient17 = mongoProperties0.createMongoClient(mongoClientOptions11);
        int int18 = mongoClientOptions11.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder27 = builder21.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder29 = builder21.connectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.threadsAllowedToBlockForConnectionMultiplier(32);
        boolean boolean32 = mongoClientOptions11.equals((java.lang.Object) builder31);
        int int33 = mongoClientOptions11.getMinConnectionsPerHost();
        javax.net.SocketFactory socketFactory34 = mongoClientOptions11.getSocketFactory();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(writeConcern15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(socketFactory34);
    }

    @Test
    public void test9024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9024");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9025");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        int int37 = mongoClientOptions36.getHeartbeatThreadCount();
        int int38 = mongoClientOptions36.getHeartbeatSocketTimeout();
        int int39 = mongoClientOptions36.getHeartbeatThreadCount();
        long long40 = mongoClientOptions36.getMaxAutoConnectRetryTime();
        javax.net.SocketFactory socketFactory41 = mongoClientOptions36.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder42 = builder34.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder43 = builder19.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder44 = builder14.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder45 = builder7.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.heartbeatConnectTimeout((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.threadsAllowedToBlockForConnectionMultiplier(10000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder51 = builder49.connectTimeout((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(socketFactory41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test9026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9026");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder1 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder3 = builder1.maxWaitTime((int) ' ');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties4.setHost("hi!");
        java.lang.String str7 = mongoProperties4.getUsername();
        java.lang.Class<?> wildcardClass8 = mongoProperties4.getFieldNamingStrategy();
        java.lang.String str9 = mongoProperties4.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties4.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        boolean boolean14 = mongoClientOptions12.isAutoConnectRetry();
        boolean boolean15 = mongoClientOptions12.isSocketKeepAlive();
        com.mongodb.MongoClient mongoClient16 = mongoProperties4.createMongoClient(mongoClientOptions12);
        boolean boolean17 = mongoClientOptions12.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory18 = mongoClientOptions12.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder19 = builder3.dbEncoderFactory(dBEncoderFactory18);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        int int27 = mongoClientOptions26.getHeartbeatThreadCount();
        int int28 = mongoClientOptions26.getHeartbeatSocketTimeout();
        int int29 = mongoClientOptions26.getHeartbeatThreadCount();
        int int30 = mongoClientOptions26.getMinHeartbeatFrequency();
        int int31 = mongoClientOptions26.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference32 = mongoClientOptions26.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder33 = builder24.readPreference(readPreference32);
        com.mongodb.MongoClientOptions.Builder builder35 = builder24.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder37 = builder24.maxConnectionLifeTime(20000);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder38.build();
        int int40 = mongoClientOptions39.getMaxConnectionLifeTime();
        boolean boolean41 = mongoClientOptions39.isCursorFinalizerEnabled();
        boolean boolean42 = mongoClientOptions39.isAlwaysUseMBeans();
        int int43 = mongoClientOptions39.getMaxWaitTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory44 = mongoClientOptions39.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder37.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder19.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder48 = builder19.heartbeatSocketTimeout(0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder50 = builder19.heartbeatConnectRetryFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 120000 + "'", int31 == 120000);
        org.junit.Assert.assertNotNull(readPreference32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 120000 + "'", int43 == 120000);
        org.junit.Assert.assertNotNull(dBDecoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test9027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9027");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getMaxConnectionLifeTime();
        boolean boolean3 = mongoClientOptions1.isAutoConnectRetry();
        int int4 = mongoClientOptions1.getAcceptableLatencyDifference();
        long long5 = mongoClientOptions1.getMaxAutoConnectRetryTime();
        java.lang.String str6 = mongoClientOptions1.getDescription();
        int int7 = mongoClientOptions1.getHeartbeatFrequency();
        int int8 = mongoClientOptions1.getConnectTimeout();
        boolean boolean9 = mongoClientOptions1.isAlwaysUseMBeans();
        int int10 = mongoClientOptions1.getHeartbeatFrequency();
        boolean boolean11 = mongoClientOptions1.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5000 + "'", int7 == 5000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10000 + "'", int8 == 10000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test9028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9028");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        java.lang.Class<?> wildcardClass4 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.String str6 = mongoProperties0.getDatabase();
        mongoProperties0.setUsername("");
        mongoProperties0.setAuthenticationDatabase("test");
        java.lang.String str11 = mongoProperties0.getUri();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.setHost("hi!");
        mongoProperties12.setUri("");
        char[] charArray19 = new char[] { 'a', '#' };
        mongoProperties12.setPassword(charArray19);
        char[] charArray26 = new char[] { '#', ' ', ' ', 'a', ' ' };
        mongoProperties12.setPassword(charArray26);
        java.lang.String str28 = mongoProperties12.getUsername();
        mongoProperties12.setUri("");
        char[] charArray31 = mongoProperties12.getPassword();
        mongoProperties0.setPassword(charArray31);
        java.lang.String str33 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#  a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#  a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#,  ,  , a,  ]");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "#  a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "#  a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#,  ,  , a,  ]");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test9029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9029");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.heartbeatConnectRetryFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxWaitTime((int) '4');
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.heartbeatConnectRetryFrequency((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder13.connectionsPerHost((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test9030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9030");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(10000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxWaitTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(20000);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.heartbeatThreadCount((int) (short) 1);
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
    public void test9031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9031");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.connectTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder11 = builder3.heartbeatFrequency(15);
        com.mongodb.MongoClientOptions.Builder builder13 = builder3.maxWaitTime(10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder3.requiredReplicaSetName("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.connectTimeout(10000);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.acceptableLatencyDifference(27017);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder29.build();
        int int31 = mongoClientOptions30.getHeartbeatThreadCount();
        int int32 = mongoClientOptions30.getHeartbeatSocketTimeout();
        int int33 = mongoClientOptions30.getLocalThreshold();
        int int34 = mongoClientOptions30.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference35 = mongoClientOptions30.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory36 = mongoClientOptions30.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder37 = builder26.dbDecoderFactory(dBDecoderFactory36);
        com.mongodb.MongoClientOptions.Builder builder38 = builder3.dbDecoderFactory(dBDecoderFactory36);
        com.mongodb.MongoClientOptions.Builder builder40 = builder3.acceptableLatencyDifference(100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5000 + "'", int34 == 5000);
        org.junit.Assert.assertNotNull(readPreference35);
        org.junit.Assert.assertNotNull(dBDecoderFactory36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test9032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9032");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatConnectRetryFrequency((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.heartbeatFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.description("");
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder28.build();
        int int30 = mongoClientOptions29.getHeartbeatThreadCount();
        int int31 = mongoClientOptions29.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference32 = mongoClientOptions29.getReadPreference();
        int int33 = mongoClientOptions29.getHeartbeatConnectTimeout();
        boolean boolean34 = mongoClientOptions29.isAutoConnectRetry();
        int int35 = mongoClientOptions29.getHeartbeatFrequency();
        int int36 = mongoClientOptions29.getConnectionsPerHost();
        boolean boolean37 = mongoClientOptions29.isAlwaysUseMBeans();
        int int38 = mongoClientOptions29.getConnectionsPerHost();
        com.mongodb.DBDecoderFactory dBDecoderFactory39 = mongoClientOptions29.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder27.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder16.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder42.build();
        com.mongodb.MongoClientOptions.Builder builder45 = builder42.maxWaitTime(15);
        com.mongodb.MongoClientOptions.Builder builder47 = builder42.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder49 = builder42.connectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.localThreshold(10);
        com.mongodb.MongoClientOptions.Builder builder53 = builder49.description("test");
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.connectionsPerHost(35);
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder56.build();
        int int58 = mongoClientOptions57.getHeartbeatThreadCount();
        int int59 = mongoClientOptions57.getHeartbeatSocketTimeout();
        int int60 = mongoClientOptions57.getLocalThreshold();
        int int61 = mongoClientOptions57.getHeartbeatFrequency();
        boolean boolean62 = mongoClientOptions57.isSocketKeepAlive();
        int int63 = mongoClientOptions57.getHeartbeatConnectTimeout();
        int int64 = mongoClientOptions57.getMinHeartbeatFrequency();
        int int65 = mongoClientOptions57.getMaxConnectionIdleTime();
        int int66 = mongoClientOptions57.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory67 = mongoClientOptions57.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder68 = builder53.dbEncoderFactory(dBEncoderFactory67);
        com.mongodb.MongoClientOptions.Builder builder69 = builder16.dbEncoderFactory(dBEncoderFactory67);
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.localThreshold(32);
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
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(readPreference32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5000 + "'", int35 == 5000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 20000 + "'", int59 == 20000);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 15 + "'", int60 == 15);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5000 + "'", int61 == 5000);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 20000 + "'", int63 == 20000);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 500 + "'", int64 == 500);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 120000 + "'", int66 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test9033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9033");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(10000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatSocketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.alwaysUseMBeans(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test9034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9034");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.connectTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getHeartbeatThreadCount();
        int int12 = mongoClientOptions10.getHeartbeatSocketTimeout();
        int int13 = mongoClientOptions10.getLocalThreshold();
        int int14 = mongoClientOptions10.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        com.mongodb.MongoClientOptions.Builder builder18 = builder15.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder20 = builder15.heartbeatConnectRetryFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatConnectRetryFrequency((int) (byte) 100);
        boolean boolean25 = mongoClientOptions10.equals((java.lang.Object) builder24);
        boolean boolean26 = mongoClientOptions10.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory27 = mongoClientOptions10.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder8.dbDecoderFactory(dBDecoderFactory27);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5000 + "'", int14 == 5000);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test9035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9035");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxWaitTime(0);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder15 = builder12.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder12.heartbeatConnectRetryFrequency(1);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder12.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
    }

    @Test
    public void test9036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9036");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.Integer int5 = mongoProperties0.getPort();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str8 = mongoProperties0.getUri();
        mongoProperties0.setUri("");
        java.lang.Class<?> wildcardClass11 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass11);
    }

    @Test
    public void test9037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9037");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getDatabase();
        mongoProperties0.setUsername("mongodb://localhost/test");
        mongoProperties0.setGridFsDatabase("");
        mongoProperties0.setUri("hi!");
        java.lang.String str11 = mongoProperties0.getUri();
        java.lang.String str12 = mongoProperties0.getHost();
        java.lang.String str13 = mongoProperties0.getGridFsDatabase();
        java.lang.Integer int14 = mongoProperties0.getPort();
        mongoProperties0.setUri("");
        java.lang.String str17 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder23 = builder18.heartbeatConnectRetryFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.description("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions28.getSocketFactory();
        boolean boolean30 = mongoClientOptions28.isCursorFinalizerEnabled();
        int int31 = mongoClientOptions28.getHeartbeatConnectTimeout();
        long long32 = mongoClientOptions28.getMaxAutoConnectRetryTime();
        org.springframework.core.env.Environment environment33 = null;
        com.mongodb.MongoClient mongoClient34 = mongoProperties0.createMongoClient(mongoClientOptions28, environment33);
        java.lang.String str35 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "mongodb://localhost/test" + "'", str35, "mongodb://localhost/test");
    }

    @Test
    public void test9038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9038");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatThreadCount();
        int int3 = mongoClientOptions1.getHeartbeatSocketTimeout();
        int int4 = mongoClientOptions1.getHeartbeatThreadCount();
        java.lang.String str5 = mongoClientOptions1.toString();
        com.mongodb.WriteConcern writeConcern6 = mongoClientOptions1.getWriteConcern();
        int int7 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions1.getReadPreference();
        javax.net.SocketFactory socketFactory9 = mongoClientOptions1.getSocketFactory();
        java.lang.String str10 = mongoClientOptions1.getDescription();
        int int11 = mongoClientOptions1.getMaxConnectionIdleTime();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.setHost("hi!");
        java.lang.String str15 = mongoProperties12.getUsername();
        java.lang.Class<?> wildcardClass16 = mongoProperties12.getFieldNamingStrategy();
        java.lang.String str17 = mongoProperties12.getAuthenticationDatabase();
        java.lang.String str18 = mongoProperties12.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        boolean boolean22 = mongoClientOptions20.isAutoConnectRetry();
        boolean boolean23 = mongoClientOptions20.isSocketKeepAlive();
        com.mongodb.MongoClient mongoClient24 = mongoProperties12.createMongoClient(mongoClientOptions20);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties25.setHost("hi!");
        java.lang.String str28 = mongoProperties25.getUsername();
        java.lang.Class<?> wildcardClass29 = mongoProperties25.getFieldNamingStrategy();
        char[] charArray30 = mongoProperties25.getPassword();
        java.lang.Class<?> wildcardClass31 = mongoProperties25.getFieldNamingStrategy();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        int int34 = mongoClientOptions33.getHeartbeatThreadCount();
        int int35 = mongoClientOptions33.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference36 = mongoClientOptions33.getReadPreference();
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions33.getReadPreference();
        org.springframework.core.env.Environment environment38 = null;
        com.mongodb.MongoClient mongoClient39 = mongoProperties25.createMongoClient(mongoClientOptions33, environment38);
        com.mongodb.MongoClient mongoClient40 = mongoProperties12.createMongoClient(mongoClientOptions33);
        long long41 = mongoClientOptions33.getMaxAutoConnectRetryTime();
        boolean boolean42 = mongoClientOptions1.equals((java.lang.Object) mongoClientOptions33);
        int int43 = mongoClientOptions33.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(writeConcern6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertNotNull(readPreference36);
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(mongoClient40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
    }

    @Test
    public void test9039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9039");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setUri("");
        char[] charArray7 = new char[] { 'a', '#' };
        mongoProperties0.setPassword(charArray7);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.setHost("hi!");
        java.lang.String str12 = mongoProperties9.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        com.mongodb.MongoClient mongoClient14 = mongoProperties9.createMongoClient(mongoClientOptions13);
        mongoProperties9.setAuthenticationDatabase("");
        char[] charArray23 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties9.setPassword(charArray23);
        mongoProperties0.setPassword(charArray23);
        mongoProperties0.setAuthenticationDatabase("");
        mongoProperties0.setDatabase("");
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.build();
        int int32 = mongoClientOptions31.getMaxConnectionLifeTime();
        boolean boolean33 = mongoClientOptions31.isCursorFinalizerEnabled();
        boolean boolean34 = mongoClientOptions31.isAlwaysUseMBeans();
        int int35 = mongoClientOptions31.getMaxWaitTime();
        java.lang.String str36 = mongoClientOptions31.getRequiredReplicaSetName();
        int int37 = mongoClientOptions31.getHeartbeatConnectRetryFrequency();
        org.springframework.core.env.Environment environment38 = null;
        com.mongodb.MongoClient mongoClient39 = mongoProperties0.createMongoClient(mongoClientOptions31, environment38);
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        char[] charArray42 = mongoProperties0.getPassword();
        java.lang.String str43 = mongoProperties0.getUri();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(mongoClient14);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000 + "'", int35 == 120000);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 500 + "'", int37 == 500);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test9040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9040");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties3.setHost("hi!");
        java.lang.String str6 = mongoProperties3.getDatabase();
        java.lang.String str7 = mongoProperties3.getUri();
        java.lang.Integer int8 = mongoProperties3.getPort();
        java.lang.String str9 = mongoProperties3.getHost();
        mongoProperties3.setUsername("");
        boolean boolean12 = mongoClientOptions1.equals((java.lang.Object) mongoProperties3);
        long long13 = mongoClientOptions1.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getHeartbeatThreadCount();
        int int17 = mongoClientOptions15.getHeartbeatSocketTimeout();
        int int18 = mongoClientOptions15.getLocalThreshold();
        int int19 = mongoClientOptions15.getHeartbeatFrequency();
        boolean boolean20 = mongoClientOptions1.equals((java.lang.Object) mongoClientOptions15);
        javax.net.SocketFactory socketFactory21 = mongoClientOptions1.getSocketFactory();
        int int22 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.socketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder33 = builder27.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1);
        boolean boolean36 = mongoClientOptions1.equals((java.lang.Object) 1);
        int int37 = mongoClientOptions1.getMaxConnectionIdleTime();
        boolean boolean38 = mongoClientOptions1.isAlwaysUseMBeans();
        int int39 = mongoClientOptions1.getHeartbeatSocketTimeout();
        java.lang.Class<?> wildcardClass40 = mongoClientOptions1.getClass();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5000 + "'", int19 == 5000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(socketFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20000 + "'", int39 == 20000);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test9041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9041");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder1 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minConnectionsPerHost(27017);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(120000);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(32);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatFrequency(120000);
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder27.build();
        int int29 = mongoClientOptions28.getHeartbeatThreadCount();
        int int30 = mongoClientOptions28.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference31 = mongoClientOptions28.getReadPreference();
        com.mongodb.ReadPreference readPreference32 = mongoClientOptions28.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder33 = builder26.readPreference(readPreference32);
        com.mongodb.MongoClientOptions.Builder builder35 = builder26.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder37 = builder26.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder37.build();
        com.mongodb.MongoClientOptions.Builder builder40 = builder37.connectTimeout((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder49 = builder45.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder50 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder50.build();
        int int52 = mongoClientOptions51.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference53 = mongoClientOptions51.getReadPreference();
        com.mongodb.DBEncoderFactory dBEncoderFactory54 = mongoClientOptions51.getDbEncoderFactory();
        java.lang.String str55 = mongoClientOptions51.getDescription();
        com.mongodb.DBDecoderFactory dBDecoderFactory56 = mongoClientOptions51.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder57 = builder45.dbDecoderFactory(dBDecoderFactory56);
        com.mongodb.MongoClientOptions.Builder builder58 = builder40.dbDecoderFactory(dBDecoderFactory56);
        com.mongodb.MongoClientOptions.Builder builder59 = builder17.dbDecoderFactory(dBDecoderFactory56);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertNotNull(readPreference31);
        org.junit.Assert.assertNotNull(readPreference32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(readPreference53);
        org.junit.Assert.assertNotNull(dBEncoderFactory54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(dBDecoderFactory56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test9042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9042");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.acceptableLatencyDifference((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.socketTimeout((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatFrequency((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
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
    }

    @Test
    public void test9043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9043");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions4);
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getMaxConnectionLifeTime();
        boolean boolean9 = mongoClientOptions7.isCursorFinalizerEnabled();
        boolean boolean10 = mongoClientOptions7.isAlwaysUseMBeans();
        boolean boolean11 = mongoClientOptions7.isAutoConnectRetry();
        org.springframework.core.env.Environment environment12 = null;
        com.mongodb.MongoClient mongoClient13 = mongoProperties0.createMongoClient(mongoClientOptions7, environment12);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.heartbeatFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.requiredReplicaSetName("");
        boolean boolean21 = mongoClientOptions7.equals((java.lang.Object) "");
        int int22 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int23 = mongoClientOptions7.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference24 = mongoClientOptions7.getReadPreference();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mongoClient13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 500 + "'", int22 == 500);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 120000 + "'", int23 == 120000);
        org.junit.Assert.assertNotNull(readPreference24);
    }

    @Test
    public void test9044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9044");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.description("");
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.maxConnectionLifeTime(0);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.requiredReplicaSetName("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxAutoConnectRetryTime((long) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime(500);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test9045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9045");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.Integer int5 = mongoProperties0.getPort();
        java.lang.String str6 = mongoProperties0.getHost();
        mongoProperties0.setUsername("");
        java.lang.Integer int9 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        boolean boolean12 = mongoClientOptions11.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties13.setHost("hi!");
        java.lang.String str16 = mongoProperties13.getDatabase();
        java.lang.String str17 = mongoProperties13.getUri();
        java.lang.Integer int18 = mongoProperties13.getPort();
        java.lang.String str19 = mongoProperties13.getHost();
        mongoProperties13.setUsername("");
        boolean boolean22 = mongoClientOptions11.equals((java.lang.Object) mongoProperties13);
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties0.createMongoClient(mongoClientOptions11, environment23);
        int int25 = mongoClientOptions11.getMaxConnectionIdleTime();
        int int26 = mongoClientOptions11.getConnectTimeout();
        javax.net.SocketFactory socketFactory27 = mongoClientOptions11.getSocketFactory();
        java.lang.String str28 = mongoClientOptions11.toString();
        boolean boolean29 = mongoClientOptions11.isAlwaysUseMBeans();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertNotNull(socketFactory27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test9046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9046");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatThreadCount();
        int int8 = mongoClientOptions6.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions6.getLocalThreshold();
        int int10 = mongoClientOptions6.getHeartbeatFrequency();
        int int11 = mongoClientOptions6.getMaxConnectionIdleTime();
        com.mongodb.MongoClient mongoClient12 = mongoProperties0.createMongoClient(mongoClientOptions6);
        java.lang.String str13 = mongoClientOptions6.getDescription();
        java.lang.String str14 = mongoClientOptions6.getRequiredReplicaSetName();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties15.setHost("hi!");
        java.lang.String str18 = mongoProperties15.getUsername();
        java.lang.Class<?> wildcardClass19 = mongoProperties15.getFieldNamingStrategy();
        java.lang.String str20 = mongoProperties15.getDatabase();
        mongoProperties15.setUsername("mongodb://localhost/test");
        java.lang.String str23 = mongoProperties15.getMongoClientDatabase();
        boolean boolean24 = mongoClientOptions6.equals((java.lang.Object) mongoProperties15);
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions6.getDbDecoderFactory();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mongoClient12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "test" + "'", str23, "test");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
    }

    @Test
    public void test9047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9047");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions4);
        mongoProperties0.setAuthenticationDatabase("");
        char[] charArray14 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties0.setPassword(charArray14);
        mongoProperties0.setDatabase("");
        mongoProperties0.setAuthenticationDatabase("");
        mongoProperties0.clearPassword();
        java.lang.String str21 = mongoProperties0.getUsername();
        java.lang.String str22 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test9048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9048");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getMaxConnectionLifeTime();
        boolean boolean3 = mongoClientOptions1.isAutoConnectRetry();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions1.getConnectionsPerHost();
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
    }

    @Test
    public void test9049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9049");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getHeartbeatThreadCount();
        int int12 = mongoClientOptions10.getHeartbeatSocketTimeout();
        int int13 = mongoClientOptions10.getMaxWaitTime();
        int int14 = mongoClientOptions10.getHeartbeatConnectTimeout();
        javax.net.SocketFactory socketFactory15 = mongoClientOptions10.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.socketFactory(socketFactory15);
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        boolean boolean22 = mongoClientOptions20.isAutoConnectRetry();
        boolean boolean23 = mongoClientOptions20.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference24 = mongoClientOptions20.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder25 = builder18.readPreference(readPreference24);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.acceptableLatencyDifference((int) ' ');
        java.lang.Class<?> wildcardClass28 = builder25.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120000 + "'", int13 == 120000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertNotNull(socketFactory15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(readPreference24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test9050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9050");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatFrequency(120000);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getHeartbeatThreadCount();
        int int12 = mongoClientOptions10.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference13 = mongoClientOptions10.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.readPreference(readPreference13);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.heartbeatSocketTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.heartbeatFrequency(120000);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder31 = builder25.minHeartbeatFrequency(5000);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(15);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder43.build();
        boolean boolean45 = mongoClientOptions44.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties46.setHost("hi!");
        java.lang.String str49 = mongoProperties46.getDatabase();
        java.lang.String str50 = mongoProperties46.getUri();
        java.lang.Integer int51 = mongoProperties46.getPort();
        java.lang.String str52 = mongoProperties46.getHost();
        mongoProperties46.setUsername("");
        boolean boolean55 = mongoClientOptions44.equals((java.lang.Object) mongoProperties46);
        java.lang.String str56 = mongoClientOptions44.toString();
        com.mongodb.DBEncoderFactory dBEncoderFactory57 = mongoClientOptions44.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder58 = builder42.dbEncoderFactory(dBEncoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder59 = builder31.dbEncoderFactory(dBEncoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder60 = builder16.dbEncoderFactory(dBEncoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder61 = builder16.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNotNull(readPreference13);
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
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "mongodb://localhost/test" + "'", str50, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test9051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9051");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.heartbeatConnectRetryFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatConnectRetryFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatFrequency(10000);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatSocketTimeout(0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test9052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9052");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        java.lang.String str4 = mongoProperties0.getUri();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties5.setHost("hi!");
        java.lang.String str8 = mongoProperties5.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        com.mongodb.MongoClient mongoClient10 = mongoProperties5.createMongoClient(mongoClientOptions9);
        mongoProperties5.setAuthenticationDatabase("");
        java.lang.String str13 = mongoProperties5.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.setHost("hi!");
        java.lang.String str17 = mongoProperties14.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties14.createMongoClient(mongoClientOptions18);
        mongoProperties14.setAuthenticationDatabase("");
        char[] charArray28 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties14.setPassword(charArray28);
        mongoProperties14.setDatabase("");
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        int int34 = mongoClientOptions33.getHeartbeatThreadCount();
        int int35 = mongoClientOptions33.getHeartbeatSocketTimeout();
        int int36 = mongoClientOptions33.getLocalThreshold();
        int int37 = mongoClientOptions33.getHeartbeatFrequency();
        boolean boolean38 = mongoClientOptions33.isSocketKeepAlive();
        org.springframework.core.env.Environment environment39 = null;
        com.mongodb.MongoClient mongoClient40 = mongoProperties14.createMongoClient(mongoClientOptions33, environment39);
        mongoProperties14.setHost("mongodb://localhost/test");
        mongoProperties14.setPort((java.lang.Integer) 15);
        char[] charArray45 = mongoProperties14.getPassword();
        mongoProperties5.setPassword(charArray45);
        mongoProperties0.setPassword(charArray45);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder48.build();
        int int50 = mongoClientOptions49.getHeartbeatThreadCount();
        int int51 = mongoClientOptions49.getHeartbeatSocketTimeout();
        int int52 = mongoClientOptions49.getMaxWaitTime();
        long long53 = mongoClientOptions49.getMaxAutoConnectRetryTime();
        int int54 = mongoClientOptions49.getMaxConnectionLifeTime();
        java.lang.String str55 = mongoClientOptions49.getDescription();
        int int56 = mongoClientOptions49.getConnectionsPerHost();
        int int57 = mongoClientOptions49.getMinHeartbeatFrequency();
        org.springframework.core.env.Environment environment58 = null;
        com.mongodb.MongoClient mongoClient59 = mongoProperties0.createMongoClient(mongoClientOptions49, environment58);
        int int60 = mongoClientOptions49.getHeartbeatSocketTimeout();
        int int61 = mongoClientOptions49.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.ReadPreference readPreference62 = mongoClientOptions49.getReadPreference();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(mongoClient10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5000 + "'", int37 == 5000);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(mongoClient40);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20000 + "'", int51 == 20000);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 120000 + "'", int52 == 120000);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 500 + "'", int57 == 500);
        org.junit.Assert.assertNotNull(mongoClient59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 20000 + "'", int60 == 20000);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertNotNull(readPreference62);
    }

    @Test
    public void test9053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9053");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        java.lang.Class<?> wildcardClass4 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setGridFsDatabase("hi!");
        char[] charArray8 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.setHost("hi!");
        java.lang.String str12 = mongoProperties9.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        com.mongodb.MongoClient mongoClient14 = mongoProperties9.createMongoClient(mongoClientOptions13);
        mongoProperties9.setAuthenticationDatabase("");
        char[] charArray23 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties9.setPassword(charArray23);
        mongoProperties9.setDatabase("");
        java.lang.Integer int27 = mongoProperties9.getPort();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder28.build();
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        boolean boolean31 = mongoClientOptions29.isAutoConnectRetry();
        boolean boolean32 = mongoClientOptions29.isAlwaysUseMBeans();
        org.springframework.core.env.Environment environment33 = null;
        com.mongodb.MongoClient mongoClient34 = mongoProperties9.createMongoClient(mongoClientOptions29, environment33);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        int int37 = mongoClientOptions36.getHeartbeatThreadCount();
        int int38 = mongoClientOptions36.getHeartbeatSocketTimeout();
        int int39 = mongoClientOptions36.getMaxWaitTime();
        long long40 = mongoClientOptions36.getMaxAutoConnectRetryTime();
        int int41 = mongoClientOptions36.getMaxConnectionLifeTime();
        int int42 = mongoClientOptions36.getHeartbeatFrequency();
        int int43 = mongoClientOptions36.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean44 = mongoClientOptions36.isAlwaysUseMBeans();
        int int45 = mongoClientOptions36.getConnectionsPerHost();
        boolean boolean46 = mongoClientOptions36.isCursorFinalizerEnabled();
        org.springframework.core.env.Environment environment47 = null;
        com.mongodb.MongoClient mongoClient48 = mongoProperties9.createMongoClient(mongoClientOptions36, environment47);
        org.springframework.core.env.Environment environment49 = null;
        com.mongodb.MongoClient mongoClient50 = mongoProperties0.createMongoClient(mongoClientOptions36, environment49);
        mongoProperties0.setUsername("test");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(mongoClient14);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 120000 + "'", int39 == 120000);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5000 + "'", int42 == 5000);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(mongoClient48);
        org.junit.Assert.assertNotNull(mongoClient50);
    }

    @Test
    public void test9054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9054");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory4 = mongoClientOptions1.getDbDecoderFactory();
        boolean boolean5 = mongoClientOptions1.isAlwaysUseMBeans();
        int int6 = mongoClientOptions1.getHeartbeatFrequency();
        int int7 = mongoClientOptions1.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5000 + "'", int6 == 5000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test9055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9055");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference3 = mongoClientOptions1.getReadPreference();
        com.mongodb.DBEncoderFactory dBEncoderFactory4 = mongoClientOptions1.getDbEncoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions1.getDbDecoderFactory();
        int int6 = mongoClientOptions1.getHeartbeatThreadCount();
        int int7 = mongoClientOptions1.getMaxConnectionLifeTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions1.getDbEncoderFactory();
        int int9 = mongoClientOptions1.getMaxWaitTime();
        int int10 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions1.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(readPreference3);
        org.junit.Assert.assertNotNull(dBEncoderFactory4);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test9056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9056");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.socketTimeout(5000);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxConnectionIdleTime((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.acceptableLatencyDifference(35);
        com.mongodb.MongoClientOptions.Builder builder13 = builder7.maxConnectionLifeTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder15 = builder7.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder17 = builder7.maxWaitTime(35);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test9057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9057");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions4);
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str8 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.setHost("hi!");
        java.lang.String str12 = mongoProperties9.getDatabase();
        java.lang.String str13 = mongoProperties9.getUri();
        java.lang.Integer int14 = mongoProperties9.getPort();
        java.lang.String str15 = mongoProperties9.getHost();
        mongoProperties9.setUsername("");
        java.lang.String str18 = mongoProperties9.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties19.setHost("hi!");
        java.lang.String str22 = mongoProperties19.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties19.createMongoClient(mongoClientOptions23);
        mongoProperties19.setAuthenticationDatabase("");
        char[] charArray33 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties19.setPassword(charArray33);
        mongoProperties19.setDatabase("");
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder37.build();
        org.springframework.core.env.Environment environment39 = null;
        com.mongodb.MongoClient mongoClient40 = mongoProperties19.createMongoClient(mongoClientOptions38, environment39);
        boolean boolean41 = mongoClientOptions38.isSocketKeepAlive();
        com.mongodb.MongoClient mongoClient42 = mongoProperties9.createMongoClient(mongoClientOptions38);
        long long43 = mongoClientOptions38.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClient mongoClient44 = mongoProperties0.createMongoClient(mongoClientOptions38);
        boolean boolean45 = mongoClientOptions38.isAutoConnectRetry();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertNotNull(mongoClient40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(mongoClient42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(mongoClient44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test9058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9058");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatThreadCount();
        int int3 = mongoClientOptions1.getHeartbeatSocketTimeout();
        int int4 = mongoClientOptions1.getLocalThreshold();
        int int5 = mongoClientOptions1.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions1.getReadPreference();
        int int7 = mongoClientOptions1.getAcceptableLatencyDifference();
        int int8 = mongoClientOptions1.getHeartbeatThreadCount();
        boolean boolean9 = mongoClientOptions1.isAlwaysUseMBeans();
        int int10 = mongoClientOptions1.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test9059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9059");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(10000);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        boolean boolean12 = mongoClientOptions10.isAutoConnectRetry();
        int int13 = mongoClientOptions10.getAcceptableLatencyDifference();
        long long14 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        java.lang.String str15 = mongoClientOptions10.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions10.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder17 = builder6.writeConcern(writeConcern16);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatConnectRetryFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.maxConnectionIdleTime((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test9060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9060");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getMaxConnectionLifeTime();
        boolean boolean3 = mongoClientOptions1.isCursorFinalizerEnabled();
        boolean boolean4 = mongoClientOptions1.isAlwaysUseMBeans();
        int int5 = mongoClientOptions1.getMaxWaitTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory6 = mongoClientOptions1.getDbDecoderFactory();
        int int7 = mongoClientOptions1.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder15 = builder14.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder43.build();
        int int45 = mongoClientOptions44.getHeartbeatThreadCount();
        int int46 = mongoClientOptions44.getHeartbeatSocketTimeout();
        int int47 = mongoClientOptions44.getHeartbeatThreadCount();
        long long48 = mongoClientOptions44.getMaxAutoConnectRetryTime();
        javax.net.SocketFactory socketFactory49 = mongoClientOptions44.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder50 = builder42.socketFactory(socketFactory49);
        com.mongodb.MongoClientOptions.Builder builder51 = builder27.socketFactory(socketFactory49);
        com.mongodb.MongoClientOptions.Builder builder52 = builder22.socketFactory(socketFactory49);
        com.mongodb.MongoClientOptions.Builder builder53 = builder15.socketFactory(socketFactory49);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.heartbeatSocketTimeout((int) (short) 10);
        boolean boolean56 = mongoClientOptions1.equals((java.lang.Object) (short) 10);
        int int57 = mongoClientOptions1.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern58 = mongoClientOptions1.getWriteConcern();
        boolean boolean59 = mongoClientOptions1.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertNotNull(dBDecoderFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5000 + "'", int7 == 5000);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20000 + "'", int46 == 20000);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(socketFactory49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 500 + "'", int57 == 500);
        org.junit.Assert.assertNotNull(writeConcern58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test9061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9061");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setGridFsDatabase("test");
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions4 = builder3.build();
        boolean boolean5 = mongoClientOptions4.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties6.setHost("hi!");
        java.lang.String str9 = mongoProperties6.getDatabase();
        java.lang.String str10 = mongoProperties6.getUri();
        java.lang.Integer int11 = mongoProperties6.getPort();
        java.lang.String str12 = mongoProperties6.getHost();
        mongoProperties6.setUsername("");
        boolean boolean15 = mongoClientOptions4.equals((java.lang.Object) mongoProperties6);
        java.lang.String str16 = mongoProperties6.getGridFsDatabase();
        mongoProperties6.setUri("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties19.setHost("hi!");
        mongoProperties19.setUri("");
        char[] charArray26 = new char[] { 'a', '#' };
        mongoProperties19.setPassword(charArray26);
        char[] charArray28 = mongoProperties19.getPassword();
        mongoProperties6.setPassword(charArray28);
        mongoProperties0.setPassword(charArray28);
        java.lang.String str31 = mongoProperties0.getUri();
        java.lang.String str32 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(mongoClientOptions4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, #]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, #]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test9062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9062");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(15);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.minHeartbeatFrequency(52);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatConnectTimeout((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.maxWaitTime(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test9063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9063");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getMaxConnectionLifeTime();
        boolean boolean3 = mongoClientOptions1.isAutoConnectRetry();
        boolean boolean4 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference5 = mongoClientOptions1.getReadPreference();
        int int6 = mongoClientOptions1.getConnectionsPerHost();
        int int7 = mongoClientOptions1.getSocketTimeout();
        int int8 = mongoClientOptions1.getAcceptableLatencyDifference();
        int int9 = mongoClientOptions1.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern10 = mongoClientOptions1.getWriteConcern();
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(readPreference5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(writeConcern10);
    }

    @Test
    public void test9064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9064");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder15 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder12.heartbeatConnectRetryFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        int int20 = mongoClientOptions19.getHeartbeatThreadCount();
        int int21 = mongoClientOptions19.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference22 = mongoClientOptions19.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder23 = builder12.readPreference(readPreference22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder12.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatFrequency(15);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder38 = builder32.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.threadsAllowedToBlockForConnectionMultiplier((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder44 = builder40.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder45.build();
        int int47 = mongoClientOptions46.getHeartbeatThreadCount();
        int int48 = mongoClientOptions46.getHeartbeatSocketTimeout();
        int int49 = mongoClientOptions46.getMaxWaitTime();
        long long50 = mongoClientOptions46.getMaxAutoConnectRetryTime();
        int int51 = mongoClientOptions46.getMaxConnectionLifeTime();
        java.lang.String str52 = mongoClientOptions46.getDescription();
        javax.net.SocketFactory socketFactory53 = mongoClientOptions46.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder54 = builder40.socketFactory(socketFactory53);
        com.mongodb.MongoClientOptions.Builder builder56 = builder40.heartbeatConnectRetryFrequency(500);
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.localThreshold(10000);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.threadsAllowedToBlockForConnectionMultiplier(10);
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.maxWaitTime(100);
        com.mongodb.MongoClientOptions.Builder builder63 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions64 = builder63.build();
        int int65 = mongoClientOptions64.getHeartbeatThreadCount();
        int int66 = mongoClientOptions64.getHeartbeatSocketTimeout();
        int int67 = mongoClientOptions64.getLocalThreshold();
        int int68 = mongoClientOptions64.getHeartbeatFrequency();
        boolean boolean69 = mongoClientOptions64.isSocketKeepAlive();
        int int70 = mongoClientOptions64.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder71 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions72 = builder71.build();
        int int73 = mongoClientOptions72.getHeartbeatThreadCount();
        int int74 = mongoClientOptions72.getHeartbeatSocketTimeout();
        int int75 = mongoClientOptions72.getMaxWaitTime();
        long long76 = mongoClientOptions72.getMaxAutoConnectRetryTime();
        int int77 = mongoClientOptions72.getMaxConnectionLifeTime();
        java.lang.String str78 = mongoClientOptions72.getDescription();
        int int79 = mongoClientOptions72.getConnectionsPerHost();
        int int80 = mongoClientOptions72.getMinHeartbeatFrequency();
        boolean boolean81 = mongoClientOptions64.equals((java.lang.Object) mongoClientOptions72);
        java.lang.String str82 = mongoClientOptions72.getDescription();
        com.mongodb.WriteConcern writeConcern83 = mongoClientOptions72.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder84 = builder62.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder85 = builder27.writeConcern(writeConcern83);
        boolean boolean86 = mongoClientOptions11.equals((java.lang.Object) builder27);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertNotNull(readPreference22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20000 + "'", int48 == 20000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 120000 + "'", int49 == 120000);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(socketFactory53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClientOptions64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 20000 + "'", int66 == 20000);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 15 + "'", int67 == 15);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 5000 + "'", int68 == 5000);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 20000 + "'", int70 == 20000);
        org.junit.Assert.assertNotNull(mongoClientOptions72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 20000 + "'", int74 == 20000);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 120000 + "'", int75 == 120000);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 500 + "'", int80 == 500);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(writeConcern83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test9065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9065");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder1 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder3 = builder1.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.heartbeatFrequency((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder11 = builder3.requiredReplicaSetName("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatConnectRetryFrequency(500);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test9066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9066");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions4);
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getMaxConnectionLifeTime();
        boolean boolean9 = mongoClientOptions7.isCursorFinalizerEnabled();
        boolean boolean10 = mongoClientOptions7.isAlwaysUseMBeans();
        boolean boolean11 = mongoClientOptions7.isAutoConnectRetry();
        org.springframework.core.env.Environment environment12 = null;
        com.mongodb.MongoClient mongoClient13 = mongoProperties0.createMongoClient(mongoClientOptions7, environment12);
        int int14 = mongoClientOptions7.getConnectTimeout();
        int int15 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int16 = mongoClientOptions7.getSocketTimeout();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mongoClient13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test9067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9067");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.Integer int5 = mongoProperties0.getPort();
        java.lang.String str6 = mongoProperties0.getHost();
        mongoProperties0.setUri("test");
        mongoProperties0.clearPassword();
        char[] charArray10 = mongoProperties0.getPassword();
        mongoProperties0.setHost("test");
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str15 = mongoProperties0.getUri();
        mongoProperties0.setGridFsDatabase("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "test" + "'", str15, "test");
    }

    @Test
    public void test9068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9068");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getDatabase();
        mongoProperties0.setUsername("mongodb://localhost/test");
        mongoProperties0.setGridFsDatabase("");
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getHeartbeatThreadCount();
        int int13 = mongoClientOptions11.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions11.getReadPreference();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions11.getWriteConcern();
        boolean boolean16 = mongoClientOptions11.isAlwaysUseMBeans();
        com.mongodb.MongoClient mongoClient17 = mongoProperties0.createMongoClient(mongoClientOptions11);
        java.lang.String str18 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setAuthenticationDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties21.setHost("hi!");
        java.lang.String str24 = mongoProperties21.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        com.mongodb.MongoClient mongoClient26 = mongoProperties21.createMongoClient(mongoClientOptions25);
        mongoProperties21.clearPassword();
        char[] charArray34 = new char[] { '4', '4', '4', 'a', '#', '#' };
        mongoProperties21.setPassword(charArray34);
        mongoProperties0.setPassword(charArray34);
        java.lang.String str37 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(writeConcern15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(mongoClient26);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "444a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "444a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4, 4, 4, a, #, #]");
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test9069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9069");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.Integer int5 = mongoProperties0.getPort();
        java.lang.String str6 = mongoProperties0.getHost();
        mongoProperties0.setUsername("");
        java.lang.String str9 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("hi!");
        java.lang.Class<?> wildcardClass12 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties13.setHost("hi!");
        java.lang.String str16 = mongoProperties13.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties13.createMongoClient(mongoClientOptions17);
        mongoProperties13.setAuthenticationDatabase("");
        char[] charArray27 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties13.setPassword(charArray27);
        mongoProperties13.setDatabase("");
        java.lang.Class<?> wildcardClass31 = mongoProperties13.getFieldNamingStrategy();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        int int34 = mongoClientOptions33.getMaxConnectionLifeTime();
        boolean boolean35 = mongoClientOptions33.isAutoConnectRetry();
        int int36 = mongoClientOptions33.getAcceptableLatencyDifference();
        long long37 = mongoClientOptions33.getMaxAutoConnectRetryTime();
        int int38 = mongoClientOptions33.getLocalThreshold();
        com.mongodb.MongoClient mongoClient39 = mongoProperties13.createMongoClient(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder44.build();
        int int46 = mongoClientOptions45.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean47 = mongoClientOptions45.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory48 = mongoClientOptions45.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder49.build();
        int int51 = mongoClientOptions50.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference52 = mongoClientOptions50.getReadPreference();
        boolean boolean53 = mongoClientOptions45.equals((java.lang.Object) readPreference52);
        com.mongodb.DBDecoderFactory dBDecoderFactory54 = mongoClientOptions45.getDbDecoderFactory();
        com.mongodb.MongoClient mongoClient55 = mongoProperties13.createMongoClient(mongoClientOptions45);
        mongoProperties13.setPort((java.lang.Integer) 32);
        char[] charArray58 = mongoProperties13.getPassword();
        mongoProperties0.setPassword(charArray58);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory48);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(readPreference52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory54);
        org.junit.Assert.assertNotNull(mongoClient55);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[\000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test9070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9070");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatThreadCount();
        int int8 = mongoClientOptions6.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions6.getHeartbeatThreadCount();
        int int10 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int11 = mongoClientOptions6.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions6.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder13 = builder4.readPreference(readPreference12);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getHeartbeatThreadCount();
        int int17 = mongoClientOptions15.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions15.getReadPreference();
        int int19 = mongoClientOptions15.getAcceptableLatencyDifference();
        java.lang.String str20 = mongoClientOptions15.getDescription();
        int int21 = mongoClientOptions15.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions15.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder23 = builder13.writeConcern(writeConcern22);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        int int37 = mongoClientOptions36.getHeartbeatThreadCount();
        int int38 = mongoClientOptions36.getHeartbeatSocketTimeout();
        int int39 = mongoClientOptions36.getHeartbeatThreadCount();
        long long40 = mongoClientOptions36.getMaxAutoConnectRetryTime();
        javax.net.SocketFactory socketFactory41 = mongoClientOptions36.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder42 = builder34.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder43 = builder23.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder45 = builder23.heartbeatSocketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder46 = builder23.legacyDefaults();
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder46.build();
        com.mongodb.MongoClientOptions.Builder builder49 = builder46.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder51 = builder46.connectionsPerHost(100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 120000 + "'", int11 == 120000);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(writeConcern22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(socketFactory41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test9071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9071");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.Integer int5 = mongoProperties0.getPort();
        java.lang.String str6 = mongoProperties0.getHost();
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUsername("hi!");
        java.lang.String str12 = mongoProperties0.getDatabase();
        mongoProperties0.clearPassword();
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.clearPassword();
        mongoProperties0.setHost("test");
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        int int20 = mongoClientOptions19.getHeartbeatThreadCount();
        int int21 = mongoClientOptions19.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference22 = mongoClientOptions19.getReadPreference();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions19.getWriteConcern();
        boolean boolean24 = mongoClientOptions19.isAlwaysUseMBeans();
        com.mongodb.WriteConcern writeConcern25 = mongoClientOptions19.getWriteConcern();
        java.lang.Object obj26 = null;
        boolean boolean27 = mongoClientOptions19.equals(obj26);
        int int28 = mongoClientOptions19.getHeartbeatFrequency();
        org.springframework.core.env.Environment environment29 = null;
        com.mongodb.MongoClient mongoClient30 = mongoProperties0.createMongoClient(mongoClientOptions19, environment29);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        int int33 = mongoClientOptions32.getHeartbeatThreadCount();
        int int34 = mongoClientOptions32.getHeartbeatSocketTimeout();
        int int35 = mongoClientOptions32.getLocalThreshold();
        int int36 = mongoClientOptions32.getHeartbeatFrequency();
        int int37 = mongoClientOptions32.getConnectionsPerHost();
        int int38 = mongoClientOptions32.getLocalThreshold();
        java.lang.String str39 = mongoClientOptions32.getDescription();
        org.springframework.core.env.Environment environment40 = null;
        com.mongodb.MongoClient mongoClient41 = mongoProperties0.createMongoClient(mongoClientOptions32, environment40);
        mongoProperties0.clearPassword();
        java.lang.Integer int43 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("test");
        mongoProperties0.setDatabase("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertNotNull(readPreference22);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(writeConcern25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5000 + "'", int28 == 5000);
        org.junit.Assert.assertNotNull(mongoClient30);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5000 + "'", int36 == 5000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(mongoClient41);
        org.junit.Assert.assertNull(int43);
    }

    @Test
    public void test9072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9072");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder27.build();
        int int29 = mongoClientOptions28.getHeartbeatThreadCount();
        int int30 = mongoClientOptions28.getHeartbeatSocketTimeout();
        int int31 = mongoClientOptions28.getHeartbeatThreadCount();
        long long32 = mongoClientOptions28.getMaxAutoConnectRetryTime();
        javax.net.SocketFactory socketFactory33 = mongoClientOptions28.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder34 = builder26.socketFactory(socketFactory33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder11.socketFactory(socketFactory33);
        com.mongodb.MongoClientOptions.Builder builder36 = builder6.socketFactory(socketFactory33);
        com.mongodb.MongoClientOptions.Builder builder38 = builder6.description("test");
        com.mongodb.MongoClientOptions.Builder builder40 = builder6.minConnectionsPerHost(20000);
        com.mongodb.MongoClientOptions.Builder builder42 = builder6.heartbeatConnectTimeout((int) (short) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(socketFactory33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test9073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9073");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatSocketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        boolean boolean14 = mongoClientOptions12.isAutoConnectRetry();
        boolean boolean15 = mongoClientOptions12.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions12.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder17 = builder8.readPreference(readPreference16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        boolean boolean21 = mongoClientOptions19.isAutoConnectRetry();
        boolean boolean22 = mongoClientOptions19.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions19.getReadPreference();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions19.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder8.dbEncoderFactory(dBEncoderFactory24);
        com.mongodb.MongoClientOptions.Builder builder27 = builder8.connectionsPerHost((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder29 = builder8.heartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder31 = builder8.heartbeatConnectTimeout(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(readPreference23);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test9074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9074");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.String str4 = mongoProperties0.getDatabase();
        mongoProperties0.setUsername("mongodb://localhost/test");
        mongoProperties0.setGridFsDatabase("");
        mongoProperties0.setUsername("mongodb://localhost/test");
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.setGridFsDatabase("test");
        mongoProperties0.setAuthenticationDatabase("test");
        mongoProperties0.setUri("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test9075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9075");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties3.setHost("hi!");
        java.lang.String str6 = mongoProperties3.getDatabase();
        java.lang.String str7 = mongoProperties3.getUri();
        java.lang.Integer int8 = mongoProperties3.getPort();
        java.lang.String str9 = mongoProperties3.getHost();
        mongoProperties3.setUsername("");
        boolean boolean12 = mongoClientOptions1.equals((java.lang.Object) mongoProperties3);
        java.lang.String str13 = mongoProperties3.getUri();
        mongoProperties3.setPort((java.lang.Integer) 20000);
        char[] charArray16 = mongoProperties3.getPassword();
        mongoProperties3.setPort((java.lang.Integer) 1);
        java.lang.String str19 = mongoProperties3.getDatabase();
        java.lang.String str20 = mongoProperties3.getHost();
        java.lang.String str21 = mongoProperties3.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties22.setHost("hi!");
        java.lang.String str25 = mongoProperties22.getDatabase();
        java.lang.String str26 = mongoProperties22.getDatabase();
        mongoProperties22.setUsername("mongodb://localhost/test");
        mongoProperties22.setGridFsDatabase("");
        java.lang.String str31 = mongoProperties22.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        int int34 = mongoClientOptions33.getMaxConnectionLifeTime();
        boolean boolean35 = mongoClientOptions33.isCursorFinalizerEnabled();
        boolean boolean36 = mongoClientOptions33.isAlwaysUseMBeans();
        java.lang.String str37 = mongoClientOptions33.getDescription();
        org.springframework.core.env.Environment environment38 = null;
        com.mongodb.MongoClient mongoClient39 = mongoProperties22.createMongoClient(mongoClientOptions33, environment38);
        int int40 = mongoClientOptions33.getMaxWaitTime();
        long long41 = mongoClientOptions33.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClient mongoClient42 = mongoProperties3.createMongoClient(mongoClientOptions33);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 120000 + "'", int40 == 120000);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(mongoClient42);
    }

    @Test
    public void test9076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9076");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatThreadCount();
        int int3 = mongoClientOptions1.getHeartbeatSocketTimeout();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        long long5 = mongoClientOptions1.getMaxAutoConnectRetryTime();
        int int6 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int7 = mongoClientOptions1.getHeartbeatFrequency();
        int int8 = mongoClientOptions1.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        boolean boolean11 = mongoClientOptions10.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.setHost("hi!");
        java.lang.String str15 = mongoProperties12.getDatabase();
        java.lang.String str16 = mongoProperties12.getUri();
        java.lang.Integer int17 = mongoProperties12.getPort();
        java.lang.String str18 = mongoProperties12.getHost();
        mongoProperties12.setUsername("");
        boolean boolean21 = mongoClientOptions10.equals((java.lang.Object) mongoProperties12);
        java.lang.String str22 = mongoProperties12.getUri();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties23.setHost("hi!");
        java.lang.String str26 = mongoProperties23.getDatabase();
        java.lang.String str27 = mongoProperties23.getUri();
        java.lang.Integer int28 = mongoProperties23.getPort();
        java.lang.String str29 = mongoProperties23.getHost();
        mongoProperties23.setAuthenticationDatabase("");
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        int int34 = mongoClientOptions33.getHeartbeatThreadCount();
        int int35 = mongoClientOptions33.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference36 = mongoClientOptions33.getReadPreference();
        int int37 = mongoClientOptions33.getAcceptableLatencyDifference();
        java.lang.String str38 = mongoClientOptions33.getDescription();
        int int39 = mongoClientOptions33.getSocketTimeout();
        org.springframework.core.env.Environment environment40 = null;
        com.mongodb.MongoClient mongoClient41 = mongoProperties23.createMongoClient(mongoClientOptions33, environment40);
        int int42 = mongoClientOptions33.getMaxConnectionIdleTime();
        com.mongodb.MongoClient mongoClient43 = mongoProperties12.createMongoClient(mongoClientOptions33);
        java.lang.String str44 = mongoProperties12.getGridFsDatabase();
        mongoProperties12.setPort((java.lang.Integer) (-1));
        mongoProperties12.setUsername("");
        boolean boolean49 = mongoClientOptions1.equals((java.lang.Object) mongoProperties12);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties50.setHost("hi!");
        java.lang.String str53 = mongoProperties50.getUsername();
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        com.mongodb.MongoClient mongoClient55 = mongoProperties50.createMongoClient(mongoClientOptions54);
        mongoProperties50.setAuthenticationDatabase("");
        char[] charArray64 = new char[] { 'a', 'a', '#', ' ', '#', ' ' };
        mongoProperties50.setPassword(charArray64);
        mongoProperties50.setDatabase("");
        mongoProperties50.setAuthenticationDatabase("");
        mongoProperties50.clearPassword();
        java.lang.Integer int71 = mongoProperties50.getPort();
        mongoProperties50.setPort((java.lang.Integer) 0);
        char[] charArray74 = mongoProperties50.getPassword();
        mongoProperties12.setPassword(charArray74);
        com.mongodb.MongoClientOptions.Builder builder76 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions77 = builder76.build();
        boolean boolean78 = mongoClientOptions77.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties79 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties79.setHost("hi!");
        java.lang.String str82 = mongoProperties79.getDatabase();
        java.lang.String str83 = mongoProperties79.getUri();
        java.lang.Integer int84 = mongoProperties79.getPort();
        java.lang.String str85 = mongoProperties79.getHost();
        mongoProperties79.setUsername("");
        boolean boolean88 = mongoClientOptions77.equals((java.lang.Object) mongoProperties79);
        java.lang.String str89 = mongoClientOptions77.toString();
        int int90 = mongoClientOptions77.getMaxWaitTime();
        java.lang.String str91 = mongoClientOptions77.getRequiredReplicaSetName();
        com.mongodb.DBDecoderFactory dBDecoderFactory92 = mongoClientOptions77.getDbDecoderFactory();
        int int93 = mongoClientOptions77.getHeartbeatSocketTimeout();
        int int94 = mongoClientOptions77.getConnectionsPerHost();
        int int95 = mongoClientOptions77.getConnectionsPerHost();
        int int96 = mongoClientOptions77.getSocketTimeout();
        int int97 = mongoClientOptions77.getSocketTimeout();
        com.mongodb.MongoClient mongoClient98 = mongoProperties12.createMongoClient(mongoClientOptions77);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5000 + "'", int7 == 5000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongodb://localhost/test" + "'", str27, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertNotNull(readPreference36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(mongoClient41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(mongoClient43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(mongoClient55);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(int71);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(mongoClientOptions77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "mongodb://localhost/test" + "'", str83, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 120000 + "'", int90 == 120000);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNotNull(dBDecoderFactory92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 20000 + "'", int93 == 20000);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 100 + "'", int94 == 100);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 100 + "'", int95 == 100);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(mongoClient98);
    }
}

