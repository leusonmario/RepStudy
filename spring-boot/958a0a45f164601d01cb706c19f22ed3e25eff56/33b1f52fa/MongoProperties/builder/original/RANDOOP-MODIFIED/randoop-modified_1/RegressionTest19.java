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
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        com.mongodb.MongoClientOptions mongoClientOptions4 = builder2.build();
        int int5 = mongoClientOptions4.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder6 = com.mongodb.MongoClientOptions.builder(mongoClientOptions4);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties7.setDatabase("hi!");
        mongoProperties7.setDatabase("hi!");
        java.lang.String str12 = mongoProperties7.getGridFsDatabase();
        mongoProperties7.setDatabase("");
        java.lang.String str15 = mongoProperties7.getUri();
        java.lang.String str16 = mongoProperties7.getAuthenticationDatabase();
        mongoProperties7.setAuthenticationDatabase("test");
        mongoProperties7.setDatabase("hi!");
        java.lang.String str21 = mongoProperties7.getGridFsDatabase();
        boolean boolean22 = mongoClientOptions4.equals((java.lang.Object) mongoProperties7);
        mongoProperties7.setHost("hi!");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(mongoClientOptions4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9502");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getConnectionsPerHost();
        boolean boolean6 = mongoClientOptions3.isSocketKeepAlive();
        boolean boolean7 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatFrequency(5);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        com.mongodb.MongoClientOptions.Builder builder22 = builder19.minHeartbeatFrequency(5);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        int int27 = mongoClientOptions26.getSocketTimeout();
        boolean boolean28 = mongoClientOptions26.isSocketKeepAlive();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder22.socketFactory(socketFactory29);
        com.mongodb.MongoClientOptions.Builder builder31 = builder14.socketFactory(socketFactory29);
        boolean boolean32 = mongoClientOptions3.equals((java.lang.Object) builder31);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        int int37 = mongoClientOptions36.getConnectionsPerHost();
        boolean boolean38 = mongoClientOptions36.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference39 = mongoClientOptions36.getReadPreference();
        boolean boolean40 = mongoClientOptions36.isSslInvalidHostNameAllowed();
        com.mongodb.ReadPreference readPreference41 = mongoClientOptions36.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder42 = builder31.readPreference(readPreference41);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder42.build();
        int int44 = mongoClientOptions43.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(readPreference39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(readPreference41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9503");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        boolean boolean7 = mongoClientOptions3.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectTimeout(15);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        int int15 = mongoClientOptions14.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern16 = mongoClientOptions14.getReadConcern();
        com.mongodb.ReadPreference readPreference17 = mongoClientOptions14.getReadPreference();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions14.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder19 = builder10.writeConcern(writeConcern18);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        int int24 = mongoClientOptions23.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern25 = mongoClientOptions23.getReadConcern();
        int int26 = mongoClientOptions23.getMinConnectionsPerHost();
        int int27 = mongoClientOptions23.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        com.mongodb.DBEncoderFactory dBEncoderFactory29 = mongoClientOptions23.getDbEncoderFactory();
        int int30 = mongoClientOptions23.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory31 = mongoClientOptions23.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder19.dbDecoderFactory(dBDecoderFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder19.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertNotNull(readConcern16);
        org.junit.Assert.assertNotNull(readPreference17);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10000 + "'", int24 == 10000);
        org.junit.Assert.assertNotNull(readConcern25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 120000 + "'", int27 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9504");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str8 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.setDatabase("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getConnectionsPerHost();
        int int17 = mongoClientOptions15.getHeartbeatSocketTimeout();
        boolean boolean19 = mongoClientOptions15.equals((java.lang.Object) 500);
        int int20 = mongoClientOptions15.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.maxConnectionIdleTime(1);
        boolean boolean30 = mongoClientOptions15.equals((java.lang.Object) builder29);
        int int31 = mongoClientOptions15.getConnectionsPerHost();
        com.mongodb.DBEncoderFactory dBEncoderFactory32 = mongoClientOptions15.getDbEncoderFactory();
        org.springframework.core.env.Environment environment33 = null;
        com.mongodb.MongoClient mongoClient34 = mongoProperties0.createMongoClient(mongoClientOptions15, environment33);
        int int35 = mongoClientOptions15.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory32);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000 + "'", int35 == 120000);
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9505");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.connectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.maxWaitTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getConnectionsPerHost();
        int int15 = mongoClientOptions13.getHeartbeatSocketTimeout();
        java.lang.String str16 = mongoClientOptions13.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions13.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder18 = builder5.writeConcern(writeConcern17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder5.sslEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9506");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("hi!");
        mongoProperties0.setPort((java.lang.Integer) 5);
        java.lang.String str12 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties13.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties13.createMongoClient(mongoClientOptions16, environment17);
        java.lang.String str19 = mongoProperties13.getMongoClientDatabase();
        java.lang.String str20 = mongoProperties13.getGridFsDatabase();
        java.lang.Integer int21 = mongoProperties13.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties22.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        org.springframework.core.env.Environment environment26 = null;
        com.mongodb.MongoClient mongoClient27 = mongoProperties22.createMongoClient(mongoClientOptions25, environment26);
        java.lang.String str28 = mongoProperties22.getMongoClientDatabase();
        mongoProperties22.setHost("hi!");
        char[] charArray37 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties22.setPassword(charArray37);
        mongoProperties13.setPassword(charArray37);
        mongoProperties0.setPassword(charArray37);
        java.lang.String str41 = mongoProperties0.getDatabase();
        mongoProperties0.setHost("test");
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9507");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getLocalThreshold();
        int int5 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int7 = mongoClientOptions3.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int9 = mongoClientOptions3.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9508");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatSocketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.description("");
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        boolean boolean22 = mongoClientOptions21.isAlwaysUseMBeans();
        int int23 = mongoClientOptions21.getMinConnectionsPerHost();
        int int24 = mongoClientOptions21.getLocalThreshold();
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
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9509");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        int int5 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatFrequency(1);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.threadsAllowedToBlockForConnectionMultiplier(10);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        int int21 = mongoClientOptions20.getHeartbeatFrequency();
        int int22 = mongoClientOptions20.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean23 = mongoClientOptions20.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder24 = com.mongodb.MongoClientOptions.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory25 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder26 = builder8.socketFactory(socketFactory25);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(socketFactory25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9510");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        java.lang.String str6 = mongoClientOptions3.getRequiredReplicaSetName();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions3.getWriteConcern();
        int int10 = mongoClientOptions3.getLocalThreshold();
        int int11 = mongoClientOptions3.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9511");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        java.lang.String str6 = mongoClientOptions3.getRequiredReplicaSetName();
        org.bson.codecs.configuration.CodecRegistry codecRegistry7 = mongoClientOptions3.getCodecRegistry();
        int int8 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int9 = mongoClientOptions3.getConnectionsPerHost();
        int int10 = mongoClientOptions3.getConnectTimeout();
        int int11 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean12 = mongoClientOptions3.isCursorFinalizerEnabled();
        int int13 = mongoClientOptions3.getConnectTimeout();
        boolean boolean14 = mongoClientOptions3.isSslEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(codecRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9512");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.connectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minHeartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern17 = mongoClientOptions15.getReadConcern();
        int int18 = mongoClientOptions15.getMinConnectionsPerHost();
        boolean boolean19 = mongoClientOptions15.isSslInvalidHostNameAllowed();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions15.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder21 = builder9.dbDecoderFactory(dBDecoderFactory20);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(readConcern17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9513");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setHost("hi!");
        char[] charArray15 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties0.setPassword(charArray15);
        char[] charArray17 = mongoProperties0.getPassword();
        mongoProperties0.setHost("");
        java.lang.Integer int20 = mongoProperties0.getPort();
        java.lang.String str21 = mongoProperties0.getUsername();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9514");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.maxConnectionLifeTime((int) '4');
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.description("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.socketTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.requiredReplicaSetName("mongodb://localhost/test");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.connectionsPerHost((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectionPerHost must be > 0");
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
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9515");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("hi!");
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        java.lang.Integer int11 = mongoProperties0.getPort();
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setAuthenticationDatabase("hi!");
        mongoProperties0.setHost("");
        mongoProperties0.setUsername("test");
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9516");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        boolean boolean17 = mongoClientOptions16.isSslEnabled();
        int int18 = mongoClientOptions16.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions16.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = builder12.dbEncoderFactory(dBEncoderFactory19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder27.build();
        int int29 = mongoClientOptions28.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory30 = mongoClientOptions28.getDbDecoderFactory();
        int int31 = mongoClientOptions28.getLocalThreshold();
        int int32 = mongoClientOptions28.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
        com.mongodb.DBDecoderFactory dBDecoderFactory34 = mongoClientOptions28.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder35 = builder24.dbDecoderFactory(dBDecoderFactory34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder24.description("test");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9517");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        java.lang.Integer int8 = mongoProperties0.getPort();
        char[] charArray9 = mongoProperties0.getPassword();
        mongoProperties0.setHost("hi!");
        java.lang.Integer int12 = mongoProperties0.getPort();
        mongoProperties0.setHost("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties15.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties15.createMongoClient(mongoClientOptions18, environment19);
        java.lang.String str21 = mongoProperties15.getMongoClientDatabase();
        mongoProperties15.setHost("hi!");
        char[] charArray30 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties15.setPassword(charArray30);
        mongoProperties0.setPassword(charArray30);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties33.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.springframework.core.env.Environment environment37 = null;
        com.mongodb.MongoClient mongoClient38 = mongoProperties33.createMongoClient(mongoClientOptions36, environment37);
        java.lang.String str39 = mongoProperties33.getMongoClientDatabase();
        java.lang.String str40 = mongoProperties33.getGridFsDatabase();
        java.lang.Integer int41 = mongoProperties33.getPort();
        char[] charArray42 = mongoProperties33.getPassword();
        mongoProperties33.setHost("hi!");
        java.lang.Integer int45 = mongoProperties33.getPort();
        mongoProperties33.setHost("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties48 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties48.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        org.springframework.core.env.Environment environment52 = null;
        com.mongodb.MongoClient mongoClient53 = mongoProperties48.createMongoClient(mongoClientOptions51, environment52);
        java.lang.String str54 = mongoProperties48.getMongoClientDatabase();
        mongoProperties48.setHost("hi!");
        char[] charArray63 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties48.setPassword(charArray63);
        mongoProperties33.setPassword(charArray63);
        mongoProperties0.setPassword(charArray63);
        mongoProperties0.setHost("");
        mongoProperties0.clearPassword();
        char[] charArray70 = mongoProperties0.getPassword();
        java.lang.String str71 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(mongoClient38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNull(charArray42);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(mongoClient53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9518");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setHost("hi!");
        char[] charArray15 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties0.setPassword(charArray15);
        char[] charArray17 = mongoProperties0.getPassword();
        java.lang.String str18 = mongoProperties0.getGridFsDatabase();
        java.lang.Integer int19 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties20.setUsername("");
        mongoProperties20.setHost("hi!");
        char[] charArray25 = mongoProperties20.getPassword();
        mongoProperties20.setHost("");
        java.lang.String str28 = mongoProperties20.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties29.setUsername("");
        mongoProperties29.setHost("hi!");
        char[] charArray34 = mongoProperties29.getPassword();
        java.lang.String str35 = mongoProperties29.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties36.setUsername("");
        char[] charArray39 = mongoProperties36.getPassword();
        java.lang.String str40 = mongoProperties36.getUri();
        java.lang.String str41 = mongoProperties36.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties42.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions45 = null;
        org.springframework.core.env.Environment environment46 = null;
        com.mongodb.MongoClient mongoClient47 = mongoProperties42.createMongoClient(mongoClientOptions45, environment46);
        java.lang.String str48 = mongoProperties42.getMongoClientDatabase();
        mongoProperties42.setHost("hi!");
        char[] charArray57 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties42.setPassword(charArray57);
        char[] charArray59 = mongoProperties42.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties60 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties60.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions63 = null;
        org.springframework.core.env.Environment environment64 = null;
        com.mongodb.MongoClient mongoClient65 = mongoProperties60.createMongoClient(mongoClientOptions63, environment64);
        java.lang.String str66 = mongoProperties60.getMongoClientDatabase();
        mongoProperties60.setHost("hi!");
        char[] charArray75 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties60.setPassword(charArray75);
        char[] charArray77 = mongoProperties60.getPassword();
        mongoProperties60.setHost("");
        char[] charArray80 = mongoProperties60.getPassword();
        mongoProperties42.setPassword(charArray80);
        mongoProperties36.setPassword(charArray80);
        mongoProperties29.setPassword(charArray80);
        mongoProperties20.setPassword(charArray80);
        mongoProperties0.setPassword(charArray80);
        java.lang.String str86 = mongoProperties0.getHost();
        mongoProperties0.setHost("hi!");
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "test" + "'", str28, "test");
        org.junit.Assert.assertNull(charArray34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(charArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "mongodb://localhost/test" + "'", str40, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(mongoClient47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(mongoClient65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9519");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setHost("hi!");
        char[] charArray15 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties0.setPassword(charArray15);
        char[] charArray17 = mongoProperties0.getPassword();
        java.lang.String str18 = mongoProperties0.getGridFsDatabase();
        char[] charArray19 = mongoProperties0.getPassword();
        java.lang.String str20 = mongoProperties0.getUri();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9520");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setHost("hi!");
        char[] charArray15 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties0.setPassword(charArray15);
        char[] charArray17 = mongoProperties0.getPassword();
        mongoProperties0.setHost("");
        mongoProperties0.setDatabase("mongodb://localhost/test");
        java.lang.String str22 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setGridFsDatabase("hi!");
        java.lang.Class<?> wildcardClass25 = mongoProperties0.getClass();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9521");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        java.lang.String str3 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass4 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str5 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str6 = mongoProperties0.getUsername();
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9522");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        mongoProperties0.setAuthenticationDatabase("hi!");
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getSocketTimeout();
        boolean boolean13 = mongoClientOptions11.isAlwaysUseMBeans();
        org.springframework.core.env.Environment environment14 = null;
        com.mongodb.MongoClient mongoClient15 = mongoProperties0.createMongoClient(mongoClientOptions11, environment14);
        java.lang.Integer int16 = mongoProperties0.getPort();
        mongoProperties0.setUri("hi!");
        java.lang.Integer int19 = mongoProperties0.getPort();
        java.lang.String str20 = mongoProperties0.getGridFsDatabase();
        java.lang.String str21 = mongoProperties0.getUsername();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(mongoClient15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9523");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        boolean boolean6 = mongoClientOptions3.isSocketKeepAlive();
        java.lang.String str7 = mongoClientOptions3.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketTimeout((-1));
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.minHeartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.sslEnabled(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9524");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getSocketTimeout();
        int int5 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions3.getCodecRegistry();
        int int7 = mongoClientOptions3.getSocketTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry8 = mongoClientOptions3.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getHeartbeatFrequency();
        int int15 = mongoClientOptions13.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions13);
        int int17 = mongoClientOptions13.getSocketTimeout();
        int int18 = mongoClientOptions13.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions13);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions13);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions13);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        boolean boolean33 = mongoClientOptions32.isSslEnabled();
        int int34 = mongoClientOptions32.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory35 = mongoClientOptions32.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = builder28.dbEncoderFactory(dBEncoderFactory35);
        com.mongodb.MongoClientOptions.Builder builder38 = builder28.heartbeatConnectTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder40 = builder28.connectionsPerHost((int) (short) 1);
        boolean boolean41 = mongoClientOptions13.equals((java.lang.Object) builder40);
        boolean boolean42 = mongoClientOptions3.equals((java.lang.Object) builder40);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(codecRegistry8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120000 + "'", int18 == 120000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9525");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        int int5 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.connectTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        int int19 = mongoClientOptions18.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern20 = mongoClientOptions18.getReadConcern();
        boolean boolean21 = mongoClientOptions18.isCursorFinalizerEnabled();
        com.mongodb.DBEncoderFactory dBEncoderFactory22 = mongoClientOptions18.getDbEncoderFactory();
        int int23 = mongoClientOptions18.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        com.mongodb.ReadPreference readPreference25 = mongoClientOptions18.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder26 = builder14.readPreference(readPreference25);
        com.mongodb.MongoClientOptions.Builder builder28 = builder14.minHeartbeatFrequency(120000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertNotNull(readConcern20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dBEncoderFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(readPreference25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9526");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        com.mongodb.DBDecoderFactory dBDecoderFactory4 = mongoClientOptions3.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.DBEncoderFactory dBEncoderFactory6 = mongoClientOptions3.getDbEncoderFactory();
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(dBDecoderFactory4);
        org.junit.Assert.assertNotNull(dBEncoderFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9527");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        java.lang.Integer int8 = mongoProperties0.getPort();
        java.lang.String str9 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass10 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties11.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.springframework.core.env.Environment environment15 = null;
        com.mongodb.MongoClient mongoClient16 = mongoProperties11.createMongoClient(mongoClientOptions14, environment15);
        java.lang.String str17 = mongoProperties11.getMongoClientDatabase();
        mongoProperties11.setHost("hi!");
        char[] charArray26 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties11.setPassword(charArray26);
        char[] charArray28 = mongoProperties11.getPassword();
        mongoProperties11.setHost("");
        char[] charArray31 = mongoProperties11.getPassword();
        mongoProperties0.setPassword(charArray31);
        mongoProperties0.setDatabase("hi!");
        java.lang.Class<?> wildcardClass35 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setPort((java.lang.Integer) 27017);
        java.lang.String str38 = mongoProperties0.getUri();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9528");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions3.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder7 = com.mongodb.MongoClientOptions.builder(mongoClientOptions3);
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions3.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        org.bson.codecs.configuration.CodecRegistry codecRegistry12 = mongoClientOptions3.getCodecRegistry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertNotNull(codecRegistry12);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9529");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        int int5 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9530");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatSocketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        int int17 = mongoClientOptions16.getConnectionsPerHost();
        int int18 = mongoClientOptions16.getHeartbeatSocketTimeout();
        boolean boolean20 = mongoClientOptions16.equals((java.lang.Object) 500);
        int int21 = mongoClientOptions16.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.maxConnectionIdleTime(1);
        boolean boolean31 = mongoClientOptions16.equals((java.lang.Object) builder30);
        int int32 = mongoClientOptions16.getConnectionsPerHost();
        com.mongodb.DBEncoderFactory dBEncoderFactory33 = mongoClientOptions16.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder34 = builder12.dbEncoderFactory(dBEncoderFactory33);
        com.mongodb.MongoClientOptions.Builder builder36 = builder12.maxConnectionIdleTime(100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9531");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        boolean boolean11 = mongoClientOptions10.isSslEnabled();
        int int12 = mongoClientOptions10.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions10.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.dbEncoderFactory(dBEncoderFactory13);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        int int19 = mongoClientOptions18.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern20 = mongoClientOptions18.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder21 = builder6.readConcern(readConcern20);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder24.build();
        int int26 = mongoClientOptions25.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern27 = mongoClientOptions25.getReadConcern();
        com.mongodb.ReadPreference readPreference28 = mongoClientOptions25.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder29 = builder21.readPreference(readPreference28);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.maxConnectionLifeTime(0);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minHeartbeatFrequency(100);
        com.mongodb.MongoClientOptions.Builder builder37 = builder33.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minHeartbeatFrequency((int) ' ');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertNotNull(readConcern20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertNotNull(readConcern27);
        org.junit.Assert.assertNotNull(readPreference28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9532");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.connectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minHeartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions11.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry14 = mongoClientOptions11.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder15 = builder5.codecRegistry(codecRegistry14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketTimeout(15);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minHeartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.socketTimeout((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatConnectTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.sslEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(codecRegistry14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9533");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.connectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minHeartbeatFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions11.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry14 = mongoClientOptions11.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder15 = builder5.codecRegistry(codecRegistry14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketTimeout(15);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMinHeartbeatFrequency();
        int int20 = mongoClientOptions18.getMaxConnectionIdleTime();
        int int21 = mongoClientOptions18.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(codecRegistry14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9534");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str8 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        java.lang.String str10 = mongoProperties0.getUsername();
        java.lang.String str11 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        java.lang.Integer int13 = mongoProperties0.getPort();
        java.lang.String str14 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str15 = mongoProperties0.getUri();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9535");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        int int5 = mongoClientOptions3.getConnectTimeout();
        int int6 = mongoClientOptions3.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.build();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder7.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10000 + "'", int5 == 10000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9536");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        int int7 = mongoClientOptions3.getMaxWaitTime();
        int int8 = mongoClientOptions3.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList10 = mongoClientOptions3.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int12 = mongoClientOptions3.getConnectionsPerHost();
        boolean boolean13 = mongoClientOptions3.isSslEnabled();
        int int14 = mongoClientOptions3.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10000 + "'", int8 == 10000);
        org.junit.Assert.assertNotNull(commandListenerList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9537");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        boolean boolean6 = mongoClientOptions3.isCursorFinalizerEnabled();
        boolean boolean7 = mongoClientOptions3.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder(mongoClientOptions3);
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions3.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions13.getConnectionsPerHost();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions13.getSocketFactory();
        boolean boolean17 = mongoClientOptions13.isSocketKeepAlive();
        boolean boolean18 = mongoClientOptions3.equals((java.lang.Object) mongoClientOptions13);
        int int19 = mongoClientOptions3.getMaxConnectionIdleTime();
        java.lang.String str20 = mongoClientOptions3.getDescription();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions3.getDbDecoderFactory();
        boolean boolean22 = mongoClientOptions3.isSslEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9538");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getSocketTimeout();
        java.lang.String str5 = mongoClientOptions3.getDescription();
        int int6 = mongoClientOptions3.getMinHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern7 = mongoClientOptions3.getReadConcern();
        int int8 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.Class<?> wildcardClass9 = mongoClientOptions3.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 500 + "'", int6 == 500);
        org.junit.Assert.assertNotNull(readConcern7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9539");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions3.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatSocketTimeout(10000);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions13.getDbDecoderFactory();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions13.getWriteConcern();
        boolean boolean17 = mongoClientOptions13.isSslInvalidHostNameAllowed();
        com.mongodb.DBEncoderFactory dBEncoderFactory18 = mongoClientOptions13.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder19 = builder7.dbEncoderFactory(dBEncoderFactory18);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.sslEnabled(true);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder19.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9540");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        java.lang.String str6 = mongoClientOptions3.getRequiredReplicaSetName();
        org.bson.codecs.configuration.CodecRegistry codecRegistry7 = mongoClientOptions3.getCodecRegistry();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        boolean boolean9 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference10 = mongoClientOptions3.getReadPreference();
        int int11 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int13 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(codecRegistry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(readPreference10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9541");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.serverSelectionTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getConnectionsPerHost();
        int int13 = mongoClientOptions11.getHeartbeatSocketTimeout();
        java.lang.String str14 = mongoClientOptions11.getRequiredReplicaSetName();
        boolean boolean15 = mongoClientOptions11.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions11);
        int int17 = mongoClientOptions11.getHeartbeatConnectTimeout();
        javax.net.SocketFactory socketFactory18 = mongoClientOptions11.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder19 = builder6.socketFactory(socketFactory18);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.localThreshold(52);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(socketFactory18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test9542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9542");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        boolean boolean6 = mongoClientOptions3.isCursorFinalizerEnabled();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions3.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory9 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertNotNull(socketFactory9);
    }

    @Test
    public void test9543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9543");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        com.mongodb.ReadConcern readConcern7 = mongoClientOptions3.getReadConcern();
        org.bson.codecs.configuration.CodecRegistry codecRegistry8 = mongoClientOptions3.getCodecRegistry();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions3.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int11 = mongoClientOptions3.getLocalThreshold();
        int int12 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertNotNull(readConcern7);
        org.junit.Assert.assertNotNull(codecRegistry8);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 500 + "'", int12 == 500);
    }

    @Test
    public void test9544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9544");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder13 = builder12.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test9545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9545");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setUsername("");
        mongoProperties0.setHost("hi!");
        char[] charArray5 = mongoProperties0.getPassword();
        mongoProperties0.setHost("");
        mongoProperties0.setDatabase("");
        mongoProperties0.clearPassword();
        mongoProperties0.setUri("hi!");
        mongoProperties0.setHost("test");
        java.lang.String str15 = mongoProperties0.getHost();
        java.lang.String str16 = mongoProperties0.getUri();
        mongoProperties0.setHost("");
        java.lang.String str19 = mongoProperties0.getHost();
        java.lang.String str20 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "test" + "'", str15, "test");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test9546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9546");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions3.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder7 = com.mongodb.MongoClientOptions.builder(mongoClientOptions3);
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions3.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        java.lang.Class<?> wildcardClass11 = mongoClientOptions3.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test9547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9547");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.setHost("hi!");
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test9548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9548");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        boolean boolean6 = mongoClientOptions3.isCursorFinalizerEnabled();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int9 = mongoClientOptions3.getMinConnectionsPerHost();
        int int10 = mongoClientOptions3.getServerSelectionTimeout();
        boolean boolean11 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30000 + "'", int10 == 30000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test9549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9549");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        com.mongodb.WriteConcern writeConcern6 = mongoClientOptions3.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList7 = mongoClientOptions3.getCommandListeners();
        boolean boolean8 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        boolean boolean9 = mongoClientOptions3.isSocketKeepAlive();
        com.mongodb.ReadConcern readConcern10 = mongoClientOptions3.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertNotNull(writeConcern6);
        org.junit.Assert.assertNotNull(commandListenerList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(readConcern10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test9550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9550");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("hi!");
        mongoProperties0.setPort((java.lang.Integer) 5);
        java.lang.String str12 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        boolean boolean17 = mongoClientOptions16.isSslEnabled();
        int int18 = mongoClientOptions16.getHeartbeatSocketTimeout();
        int int19 = mongoClientOptions16.getMinHeartbeatFrequency();
        int int20 = mongoClientOptions16.getMaxWaitTime();
        int int21 = mongoClientOptions16.getServerSelectionTimeout();
        org.springframework.core.env.Environment environment22 = null;
        com.mongodb.MongoClient mongoClient23 = mongoProperties0.createMongoClient(mongoClientOptions16, environment22);
        boolean boolean24 = mongoClientOptions16.isSslInvalidHostNameAllowed();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList25 = mongoClientOptions16.getCommandListeners();
        int int26 = mongoClientOptions16.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.ReadConcern readConcern27 = mongoClientOptions16.getReadConcern();
        boolean boolean28 = mongoClientOptions16.isCursorFinalizerEnabled();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions16.getSocketFactory();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30000 + "'", int21 == 30000);
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(commandListenerList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(readConcern27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(socketFactory29);
    }

    @Test
    public void test9551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9551");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getSocketTimeout();
        boolean boolean5 = mongoClientOptions3.isSocketKeepAlive();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        org.bson.codecs.configuration.CodecRegistry codecRegistry7 = mongoClientOptions3.getCodecRegistry();
        java.lang.String str8 = mongoClientOptions3.getDescription();
        int int9 = mongoClientOptions3.getHeartbeatSocketTimeout();
        boolean boolean10 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        boolean boolean11 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertNotNull(codecRegistry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test9552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9552");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionIdleTime((int) (byte) 1);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder17 = builder12.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatConnectTimeout(15);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.heartbeatConnectTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.description("test");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.localThreshold((int) '#');
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder40 = builder34.threadsAllowedToBlockForConnectionMultiplier(100);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder43.build();
        int int45 = mongoClientOptions44.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern46 = mongoClientOptions44.getReadConcern();
        com.mongodb.ReadPreference readPreference47 = mongoClientOptions44.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder48 = builder34.readPreference(readPreference47);
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder52.build();
        org.bson.codecs.configuration.CodecRegistry codecRegistry54 = mongoClientOptions53.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder55 = builder27.codecRegistry(codecRegistry54);
        com.mongodb.MongoClientOptions.Builder builder56 = builder27.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
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
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10000 + "'", int45 == 10000);
        org.junit.Assert.assertNotNull(readConcern46);
        org.junit.Assert.assertNotNull(readPreference47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertNotNull(codecRegistry54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test9553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9553");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        com.mongodb.ReadPreference readPreference7 = mongoClientOptions3.getReadPreference();
        boolean boolean8 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        int int9 = mongoClientOptions3.getMaxConnectionIdleTime();
        javax.net.SocketFactory socketFactory10 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(readPreference7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(socketFactory10);
    }

    @Test
    public void test9554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9554");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        com.mongodb.ReadConcern readConcern7 = mongoClientOptions3.getReadConcern();
        java.lang.String str8 = mongoClientOptions3.getDescription();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions3.getDbDecoderFactory();
        int int10 = mongoClientOptions3.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertNotNull(readConcern7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test9555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9555");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.serverSelectionTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        int int19 = mongoClientOptions18.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern20 = mongoClientOptions18.getReadConcern();
        int int21 = mongoClientOptions18.getMinConnectionsPerHost();
        boolean boolean22 = mongoClientOptions18.isSslInvalidHostNameAllowed();
        com.mongodb.DBEncoderFactory dBEncoderFactory23 = mongoClientOptions18.getDbEncoderFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions18.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder8.dbEncoderFactory(dBEncoderFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder28.build();
        int int30 = mongoClientOptions29.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern31 = mongoClientOptions29.getReadConcern();
        int int32 = mongoClientOptions29.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern33 = mongoClientOptions29.getWriteConcern();
        com.mongodb.DBDecoderFactory dBDecoderFactory34 = mongoClientOptions29.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder35 = builder25.dbDecoderFactory(dBDecoderFactory34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder25.serverSelectionTimeout(32);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertNotNull(readConcern20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory23);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertNotNull(readConcern31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(writeConcern33);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test9556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9556");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getConnectionsPerHost();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        boolean boolean8 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        boolean boolean9 = mongoClientOptions3.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.connectTimeout(20000);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketTimeout(30000);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxConnectionLifeTime(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test9557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9557");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        boolean boolean6 = mongoClientOptions3.isCursorFinalizerEnabled();
        com.mongodb.DBEncoderFactory dBEncoderFactory7 = mongoClientOptions3.getDbEncoderFactory();
        int int8 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxConnectionIdleTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold(10000);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.maxConnectionIdleTime((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dBEncoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10000 + "'", int8 == 10000);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test9558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9558");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        boolean boolean18 = mongoClientOptions17.isSslEnabled();
        int int19 = mongoClientOptions17.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory20 = mongoClientOptions17.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder21 = builder13.dbEncoderFactory(dBEncoderFactory20);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder24.build();
        int int26 = mongoClientOptions25.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern27 = mongoClientOptions25.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder28 = builder13.readConcern(readConcern27);
        com.mongodb.MongoClientOptions.Builder builder29 = builder2.readConcern(readConcern27);
        com.mongodb.MongoClientOptions.Builder builder31 = builder2.maxConnectionIdleTime(1);
        com.mongodb.MongoClientOptions.Builder builder33 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.threadsAllowedToBlockForConnectionMultiplier(20000);
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder38.build();
        int int40 = mongoClientOptions39.getHeartbeatFrequency();
        int int41 = mongoClientOptions39.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions39);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder48 = builder44.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder50 = builder44.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder44.build();
        int int52 = mongoClientOptions51.getConnectTimeout();
        javax.net.SocketFactory socketFactory53 = mongoClientOptions51.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder54 = builder33.socketFactory(socketFactory53);
        com.mongodb.MongoClientOptions.Builder builder56 = builder33.heartbeatSocketTimeout((int) (short) -1);
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder61.build();
        int int63 = mongoClientOptions62.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern64 = mongoClientOptions62.getReadConcern();
        int int65 = mongoClientOptions62.getMinConnectionsPerHost();
        boolean boolean66 = mongoClientOptions62.isSslInvalidHostNameAllowed();
        com.mongodb.DBEncoderFactory dBEncoderFactory67 = mongoClientOptions62.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder68 = builder56.dbEncoderFactory(dBEncoderFactory67);
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.connectTimeout(1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertNotNull(readConcern27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10000 + "'", int40 == 10000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10000 + "'", int52 == 10000);
        org.junit.Assert.assertNotNull(socketFactory53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10000 + "'", int63 == 10000);
        org.junit.Assert.assertNotNull(readConcern64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
    }

    @Test
    public void test9559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9559");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str8 = mongoProperties0.getDatabase();
        java.lang.String str9 = mongoProperties0.getUri();
        mongoProperties0.clearPassword();
        mongoProperties0.setHost("mongodb://localhost/test");
        mongoProperties0.setAuthenticationDatabase("");
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
    }

    @Test
    public void test9560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9560");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        mongoProperties0.setAuthenticationDatabase("hi!");
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getSocketTimeout();
        boolean boolean13 = mongoClientOptions11.isAlwaysUseMBeans();
        org.springframework.core.env.Environment environment14 = null;
        com.mongodb.MongoClient mongoClient15 = mongoProperties0.createMongoClient(mongoClientOptions11, environment14);
        java.lang.String str16 = mongoProperties0.getDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.setUsername("hi!");
        char[] charArray20 = mongoProperties0.getPassword();
        java.lang.String str21 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setGridFsDatabase("hi!");
        java.lang.String str24 = mongoProperties0.getDatabase();
        java.lang.String str25 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUri("");
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(mongoClient15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test9561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9561");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minHeartbeatFrequency((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.requiredReplicaSetName("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.sslInvalidHostNameAllowed(true);
        com.mongodb.WriteConcern writeConcern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder14.writeConcern(writeConcern17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: writeConcern can not be null");
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
    public void test9562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9562");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        int int5 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatSocketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.maxConnectionIdleTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        int int37 = mongoClientOptions36.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern38 = mongoClientOptions36.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder39 = builder32.readConcern(readConcern38);
        com.mongodb.MongoClientOptions.Builder builder40 = builder23.readConcern(readConcern38);
        com.mongodb.MongoClientOptions.Builder builder41 = builder8.readConcern(readConcern38);
        com.mongodb.MongoClientOptions.Builder builder43 = builder8.threadsAllowedToBlockForConnectionMultiplier((int) '#');
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.maxConnectionLifeTime(5);
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder48.build();
        int int50 = mongoClientOptions49.getConnectionsPerHost();
        int int51 = mongoClientOptions49.getHeartbeatSocketTimeout();
        java.lang.String str52 = mongoClientOptions49.getRequiredReplicaSetName();
        org.bson.codecs.configuration.CodecRegistry codecRegistry53 = mongoClientOptions49.getCodecRegistry();
        int int54 = mongoClientOptions49.getHeartbeatConnectTimeout();
        int int55 = mongoClientOptions49.getConnectionsPerHost();
        java.lang.String str56 = mongoClientOptions49.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory57 = mongoClientOptions49.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory58 = mongoClientOptions49.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder43.dbEncoderFactory(dBEncoderFactory58);
        com.mongodb.MongoClientOptions.Builder builder60 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions63 = builder62.build();
        int int64 = mongoClientOptions63.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory65 = mongoClientOptions63.getDbDecoderFactory();
        com.mongodb.ReadConcern readConcern66 = mongoClientOptions63.getReadConcern();
        int int67 = mongoClientOptions63.getMaxConnectionIdleTime();
        int int68 = mongoClientOptions63.getConnectionsPerHost();
        com.mongodb.DBDecoderFactory dBDecoderFactory69 = mongoClientOptions63.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder70 = builder43.dbDecoderFactory(dBDecoderFactory69);
        com.mongodb.event.CommandListener commandListener71 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder72 = builder70.addCommandListener(commandListener71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
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
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10000 + "'", int37 == 10000);
        org.junit.Assert.assertNotNull(readConcern38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(codecRegistry53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20000 + "'", int54 == 20000);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(socketFactory57);
        org.junit.Assert.assertNotNull(dBEncoderFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClientOptions63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10000 + "'", int64 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory65);
        org.junit.Assert.assertNotNull(readConcern66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertNotNull(dBDecoderFactory69);
        org.junit.Assert.assertNotNull(builder70);
    }

    @Test
    public void test9563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9563");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        java.lang.Integer int8 = mongoProperties0.getPort();
        java.lang.String str9 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass10 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties11.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.springframework.core.env.Environment environment15 = null;
        com.mongodb.MongoClient mongoClient16 = mongoProperties11.createMongoClient(mongoClientOptions14, environment15);
        java.lang.String str17 = mongoProperties11.getMongoClientDatabase();
        mongoProperties11.setHost("hi!");
        char[] charArray26 = new char[] { 'a', '4', '#', ' ', ' ', ' ' };
        mongoProperties11.setPassword(charArray26);
        char[] charArray28 = mongoProperties11.getPassword();
        mongoProperties11.setHost("");
        char[] charArray31 = mongoProperties11.getPassword();
        mongoProperties0.setPassword(charArray31);
        java.lang.Integer int33 = mongoProperties0.getPort();
        mongoProperties0.setUri("");
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str38 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a4#   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a4#   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, 4, #,  ,  ,  ]");
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test9564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9564");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        java.lang.Integer int8 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        boolean boolean14 = mongoClientOptions12.isCursorFinalizerEnabled();
        java.lang.String str15 = mongoClientOptions12.getDescription();
        org.springframework.core.env.Environment environment16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties0.createMongoClient(mongoClientOptions12, environment16);
        int int18 = mongoClientOptions12.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder(mongoClientOptions12);
        int int20 = mongoClientOptions12.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10000 + "'", int18 == 10000);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test9565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9565");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        int int7 = mongoClientOptions3.getMaxWaitTime();
        boolean boolean8 = mongoClientOptions3.isSslEnabled();
        int int9 = mongoClientOptions3.getConnectionsPerHost();
        boolean boolean10 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference11 = mongoClientOptions3.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory12 = mongoClientOptions3.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions3.getSocketFactory();
        int int14 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(readPreference11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertNotNull(socketFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test9566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9566");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.maxConnectionLifeTime((int) '4');
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.heartbeatConnectTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        int int19 = mongoClientOptions18.getConnectionsPerHost();
        int int20 = mongoClientOptions18.getHeartbeatSocketTimeout();
        java.lang.String str21 = mongoClientOptions18.getRequiredReplicaSetName();
        org.bson.codecs.configuration.CodecRegistry codecRegistry22 = mongoClientOptions18.getCodecRegistry();
        int int23 = mongoClientOptions18.getHeartbeatConnectTimeout();
        int int24 = mongoClientOptions18.getConnectionsPerHost();
        int int25 = mongoClientOptions18.getConnectTimeout();
        int int26 = mongoClientOptions18.getMinHeartbeatFrequency();
        com.mongodb.DBEncoderFactory dBEncoderFactory27 = mongoClientOptions18.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder14.dbEncoderFactory(dBEncoderFactory27);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatFrequency((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(codecRegistry22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 500 + "'", int26 == 500);
        org.junit.Assert.assertNotNull(dBEncoderFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test9567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9567");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        boolean boolean4 = mongoClientOptions3.isSslEnabled();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int6 = mongoClientOptions3.getMinHeartbeatFrequency();
        int int7 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int8 = mongoClientOptions3.getHeartbeatSocketTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions3.getDbDecoderFactory();
        int int10 = mongoClientOptions3.getSocketTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry11 = mongoClientOptions3.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int13 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        int int14 = mongoClientOptions3.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 500 + "'", int6 == 500);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(codecRegistry11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
    }

    @Test
    public void test9568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9568");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        javax.net.SocketFactory socketFactory5 = mongoClientOptions3.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        boolean boolean7 = mongoClientOptions3.isSslEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(socketFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test9569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9569");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getLocalThreshold();
        int int5 = mongoClientOptions3.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.heartbeatSocketTimeout((-1));
        boolean boolean19 = mongoClientOptions3.equals((java.lang.Object) builder14);
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions3.getDbDecoderFactory();
        boolean boolean21 = mongoClientOptions3.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test9570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9570");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setHost("hi!");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUsername("hi!");
        java.lang.String str13 = mongoProperties0.getUri();
        java.lang.String str14 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test9571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9571");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getConnectTimeout();
        int int7 = mongoClientOptions3.getMaxWaitTime();
        java.lang.String str8 = mongoClientOptions3.getDescription();
        int int9 = mongoClientOptions3.getMinHeartbeatFrequency();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList10 = mongoClientOptions3.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        int int18 = mongoClientOptions17.getHeartbeatFrequency();
        int int19 = mongoClientOptions17.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions17);
        com.mongodb.WriteConcern writeConcern21 = mongoClientOptions17.getWriteConcern();
        boolean boolean22 = mongoClientOptions17.isAlwaysUseMBeans();
        com.mongodb.DBEncoderFactory dBEncoderFactory23 = mongoClientOptions17.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder24 = builder11.dbEncoderFactory(dBEncoderFactory23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNotNull(commandListenerList10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10000 + "'", int18 == 10000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(writeConcern21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test9572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9572");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern5 = mongoClientOptions3.getReadConcern();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        int int7 = mongoClientOptions3.getMaxWaitTime();
        int int8 = mongoClientOptions3.getMaxConnectionIdleTime();
        boolean boolean9 = mongoClientOptions3.isCursorFinalizerEnabled();
        boolean boolean10 = mongoClientOptions3.isAlwaysUseMBeans();
        boolean boolean11 = mongoClientOptions3.isCursorFinalizerEnabled();
        boolean boolean12 = mongoClientOptions3.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(readConcern5);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test9573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9573");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("hi!");
        mongoProperties0.setPort((java.lang.Integer) 5);
        java.lang.String str12 = mongoProperties0.getUri();
        mongoProperties0.setPort((java.lang.Integer) 1);
        java.lang.String str15 = mongoProperties0.getUri();
        char[] charArray16 = mongoProperties0.getPassword();
        java.lang.String str17 = mongoProperties0.getUri();
        mongoProperties0.setAuthenticationDatabase("test");
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
    }

    @Test
    public void test9574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9574");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        boolean boolean4 = mongoClientOptions3.isSslEnabled();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int6 = mongoClientOptions3.getMinHeartbeatFrequency();
        int int7 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        boolean boolean9 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxWaitTime(5);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.connectTimeout(20000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 500 + "'", int6 == 500);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test9575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9575");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        java.lang.String str6 = mongoClientOptions3.getRequiredReplicaSetName();
        java.lang.String str7 = mongoClientOptions3.getDescription();
        boolean boolean8 = mongoClientOptions3.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder13 = builder12.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test9576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9576");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.connectTimeout((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.maxConnectionLifeTime(30000);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        int int23 = mongoClientOptions22.getConnectionsPerHost();
        int int24 = mongoClientOptions22.getHeartbeatSocketTimeout();
        java.lang.String str25 = mongoClientOptions22.getRequiredReplicaSetName();
        org.bson.codecs.configuration.CodecRegistry codecRegistry26 = mongoClientOptions22.getCodecRegistry();
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions22.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder28 = builder18.writeConcern(writeConcern27);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder35 = builder31.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxConnectionIdleTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.maxConnectionIdleTime((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder56 = builder52.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder63 = builder59.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder67 = builder63.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder68 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions71 = builder70.build();
        int int72 = mongoClientOptions71.getConnectionsPerHost();
        int int73 = mongoClientOptions71.getHeartbeatSocketTimeout();
        java.lang.String str74 = mongoClientOptions71.getRequiredReplicaSetName();
        boolean boolean75 = mongoClientOptions71.isAlwaysUseMBeans();
        com.mongodb.DBEncoderFactory dBEncoderFactory76 = mongoClientOptions71.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder77 = builder63.dbEncoderFactory(dBEncoderFactory76);
        com.mongodb.MongoClientOptions.Builder builder78 = builder52.dbEncoderFactory(dBEncoderFactory76);
        com.mongodb.MongoClientOptions.Builder builder79 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder81 = builder79.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions82 = builder81.build();
        int int83 = mongoClientOptions82.getHeartbeatFrequency();
        int int84 = mongoClientOptions82.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder85 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions82);
        com.mongodb.MongoClientOptions.Builder builder87 = builder85.heartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder89 = builder87.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder91 = builder87.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder93 = builder87.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions94 = builder87.build();
        int int95 = mongoClientOptions94.getConnectTimeout();
        javax.net.SocketFactory socketFactory96 = mongoClientOptions94.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder97 = builder78.socketFactory(socketFactory96);
        com.mongodb.MongoClientOptions.Builder builder98 = builder45.socketFactory(socketFactory96);
        com.mongodb.MongoClientOptions.Builder builder99 = builder28.socketFactory(socketFactory96);
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
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(codecRegistry26);
        org.junit.Assert.assertNotNull(writeConcern27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoClientOptions71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoClientOptions82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10000 + "'", int83 == 10000);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 5 + "'", int84 == 5);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(mongoClientOptions94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 10000 + "'", int95 == 10000);
        org.junit.Assert.assertNotNull(socketFactory96);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(builder98);
        org.junit.Assert.assertNotNull(builder99);
    }

    @Test
    public void test9577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9577");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        int int14 = mongoClientOptions12.getConnectionsPerHost();
        int int15 = mongoClientOptions12.getHeartbeatConnectTimeout();
        int int16 = mongoClientOptions12.getMaxConnectionIdleTime();
        int int17 = mongoClientOptions12.getMaxConnectionIdleTime();
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions12.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder19 = builder4.readPreference(readPreference18);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test9578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9578");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.connectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.localThreshold(0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder0.serverSelectionTimeout((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder0.maxWaitTime((int) ' ');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.springframework.core.env.Environment environment16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties12.createMongoClient(mongoClientOptions15, environment16);
        mongoProperties12.setAuthenticationDatabase("hi!");
        java.lang.String str20 = mongoProperties12.getGridFsDatabase();
        mongoProperties12.clearPassword();
        mongoProperties12.setGridFsDatabase("mongodb://localhost/test");
        java.lang.String str24 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder27.build();
        int int29 = mongoClientOptions28.getConnectionsPerHost();
        int int30 = mongoClientOptions28.getHeartbeatSocketTimeout();
        boolean boolean32 = mongoClientOptions28.equals((java.lang.Object) 500);
        boolean boolean33 = mongoClientOptions28.isAlwaysUseMBeans();
        int int34 = mongoClientOptions28.getServerSelectionTimeout();
        javax.net.SocketFactory socketFactory35 = mongoClientOptions28.getSocketFactory();
        org.springframework.core.env.Environment environment36 = null;
        com.mongodb.MongoClient mongoClient37 = mongoProperties12.createMongoClient(mongoClientOptions28, environment36);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder44 = builder40.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder50 = builder46.heartbeatSocketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder50.build();
        int int54 = mongoClientOptions53.getHeartbeatSocketTimeout();
        int int55 = mongoClientOptions53.getConnectTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry56 = mongoClientOptions53.getCodecRegistry();
        org.springframework.core.env.Environment environment57 = null;
        com.mongodb.MongoClient mongoClient58 = mongoProperties12.createMongoClient(mongoClientOptions53, environment57);
        int int59 = mongoClientOptions53.getConnectionsPerHost();
        com.mongodb.ReadPreference readPreference60 = mongoClientOptions53.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder61 = builder11.readPreference(readPreference60);
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.heartbeatSocketTimeout((-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb://localhost/test" + "'", str24, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 30000 + "'", int34 == 30000);
        org.junit.Assert.assertNotNull(socketFactory35);
        org.junit.Assert.assertNotNull(mongoClient37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10000 + "'", int55 == 10000);
        org.junit.Assert.assertNotNull(codecRegistry56);
        org.junit.Assert.assertNotNull(mongoClient58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(readPreference60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test9579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9579");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatSocketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionIdleTime((int) (byte) 1);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder16 = com.mongodb.MongoClientOptions.builder(mongoClientOptions15);
        int int17 = mongoClientOptions15.getConnectionsPerHost();
        int int18 = mongoClientOptions15.getServerSelectionTimeout();
        int int19 = mongoClientOptions15.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30000 + "'", int18 == 30000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120000 + "'", int19 == 120000);
    }

    @Test
    public void test9580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9580");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getSocketTimeout();
        int int5 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions3.getCodecRegistry();
        int int7 = mongoClientOptions3.getSocketTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry8 = mongoClientOptions3.getCodecRegistry();
        int int9 = mongoClientOptions3.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(500);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(codecRegistry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test9581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9581");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketTimeout((int) (byte) -1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("mongodb://localhost/test");
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        java.lang.String str12 = mongoClientOptions11.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
    }

    @Test
    public void test9582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9582");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.maxWaitTime(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test9583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9583");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getConnectionsPerHost();
        boolean boolean6 = mongoClientOptions3.isSocketKeepAlive();
        boolean boolean7 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatFrequency(5);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        com.mongodb.MongoClientOptions.Builder builder22 = builder19.minHeartbeatFrequency(5);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        int int27 = mongoClientOptions26.getSocketTimeout();
        boolean boolean28 = mongoClientOptions26.isSocketKeepAlive();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder22.socketFactory(socketFactory29);
        com.mongodb.MongoClientOptions.Builder builder31 = builder14.socketFactory(socketFactory29);
        boolean boolean32 = mongoClientOptions3.equals((java.lang.Object) builder31);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        int int37 = mongoClientOptions36.getConnectionsPerHost();
        boolean boolean38 = mongoClientOptions36.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference39 = mongoClientOptions36.getReadPreference();
        boolean boolean40 = mongoClientOptions36.isSslInvalidHostNameAllowed();
        com.mongodb.ReadPreference readPreference41 = mongoClientOptions36.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder42 = builder31.readPreference(readPreference41);
        com.mongodb.MongoClientOptions.Builder builder44 = builder31.heartbeatSocketTimeout((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder45.build();
        com.mongodb.MongoClientOptions.Builder builder50 = builder45.connectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder54 = builder50.maxWaitTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder59 = builder55.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder62 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions65 = builder64.build();
        boolean boolean66 = mongoClientOptions65.isSslEnabled();
        int int67 = mongoClientOptions65.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory68 = mongoClientOptions65.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder69 = builder61.dbEncoderFactory(dBEncoderFactory68);
        com.mongodb.MongoClientOptions.Builder builder70 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder72 = builder70.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions73 = builder72.build();
        int int74 = mongoClientOptions73.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern75 = mongoClientOptions73.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder76 = builder61.readConcern(readConcern75);
        com.mongodb.MongoClientOptions.Builder builder77 = builder54.readConcern(readConcern75);
        com.mongodb.MongoClientOptions.Builder builder78 = builder44.readConcern(readConcern75);
        com.mongodb.MongoClientOptions.Builder builder80 = builder78.connectTimeout(52);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(readPreference39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(readPreference41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoClientOptions65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClientOptions73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 10000 + "'", int74 == 10000);
        org.junit.Assert.assertNotNull(readConcern75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
    }

    @Test
    public void test9584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9584");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.build();
        int int9 = mongoClientOptions8.getSocketTimeout();
        boolean boolean10 = mongoClientOptions8.isAlwaysUseMBeans();
        int int11 = mongoClientOptions8.getThreadsAllowedToBlockForConnectionMultiplier();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions8.getCommandListeners();
        boolean boolean13 = mongoClientOptions3.equals((java.lang.Object) mongoClientOptions8);
        com.mongodb.DBDecoderFactory dBDecoderFactory14 = mongoClientOptions3.getDbDecoderFactory();
        int int15 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int16 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        int int24 = mongoClientOptions23.getHeartbeatFrequency();
        int int25 = mongoClientOptions23.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.heartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.heartbeatConnectTimeout((-1));
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        com.mongodb.DBDecoderFactory dBDecoderFactory43 = mongoClientOptions42.getDbDecoderFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory44 = mongoClientOptions42.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder36.dbEncoderFactory(dBEncoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder48.build();
        int int50 = mongoClientOptions49.getHeartbeatFrequency();
        int int51 = mongoClientOptions49.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions49);
        int int53 = mongoClientOptions49.getMaxConnectionIdleTime();
        com.mongodb.ReadConcern readConcern54 = mongoClientOptions49.getReadConcern();
        com.mongodb.ReadPreference readPreference55 = mongoClientOptions49.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder56 = builder36.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder58 = builder36.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder60 = builder36.heartbeatConnectTimeout(10);
        com.mongodb.MongoClientOptions.Builder builder61 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions64 = builder63.build();
        int int65 = mongoClientOptions64.getHeartbeatFrequency();
        int int66 = mongoClientOptions64.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder67 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions64);
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.heartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder73 = builder69.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder75 = builder73.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder77 = builder73.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder79 = builder73.heartbeatConnectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder80 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder82 = builder80.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions83 = builder82.build();
        int int84 = mongoClientOptions83.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory85 = mongoClientOptions83.getDbDecoderFactory();
        int int86 = mongoClientOptions83.getLocalThreshold();
        com.mongodb.ReadPreference readPreference87 = mongoClientOptions83.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder88 = builder73.readPreference(readPreference87);
        com.mongodb.MongoClientOptions.Builder builder89 = builder60.readPreference(readPreference87);
        com.mongodb.MongoClientOptions.Builder builder90 = builder19.readPreference(readPreference87);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dBDecoderFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 120000 + "'", int16 == 120000);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10000 + "'", int24 == 10000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertNotNull(dBDecoderFactory43);
        org.junit.Assert.assertNotNull(dBEncoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10000 + "'", int50 == 10000);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(readConcern54);
        org.junit.Assert.assertNotNull(readPreference55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(mongoClientOptions64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(mongoClientOptions83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10000 + "'", int84 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 15 + "'", int86 == 15);
        org.junit.Assert.assertNotNull(readPreference87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test9585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9585");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        int int13 = mongoClientOptions12.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory14 = mongoClientOptions12.getDbDecoderFactory();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions12.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.writeConcern(writeConcern15);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxConnectionIdleTime(500);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        int int23 = mongoClientOptions22.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory24 = mongoClientOptions22.getDbDecoderFactory();
        com.mongodb.WriteConcern writeConcern25 = mongoClientOptions22.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList26 = mongoClientOptions22.getCommandListeners();
        boolean boolean27 = mongoClientOptions22.isSslInvalidHostNameAllowed();
        boolean boolean28 = mongoClientOptions22.isSocketKeepAlive();
        com.mongodb.ReadConcern readConcern29 = mongoClientOptions22.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder30 = builder18.readConcern(readConcern29);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory14);
        org.junit.Assert.assertNotNull(writeConcern15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory24);
        org.junit.Assert.assertNotNull(writeConcern25);
        org.junit.Assert.assertNotNull(commandListenerList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(readConcern29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test9586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9586");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("hi!");
        mongoProperties0.setPort((java.lang.Integer) 5);
        java.lang.String str12 = mongoProperties0.getHost();
        mongoProperties0.setHost("");
        java.lang.String str15 = mongoProperties0.getHost();
        java.lang.String str16 = mongoProperties0.getGridFsDatabase();
        java.lang.String str17 = mongoProperties0.getDatabase();
        java.lang.String str18 = mongoProperties0.getHost();
        java.lang.String str19 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str20 = mongoProperties0.getHost();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test9587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9587");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList6 = mongoClientOptions3.getCommandListeners();
        int int7 = mongoClientOptions3.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        boolean boolean10 = mongoClientOptions9.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(commandListenerList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test9588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9588");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        boolean boolean5 = mongoClientOptions3.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        boolean boolean7 = mongoClientOptions3.isSslInvalidHostNameAllowed();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions3.getReadPreference();
        int int9 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int10 = mongoClientOptions3.getServerSelectionTimeout();
        int int11 = mongoClientOptions3.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30000 + "'", int10 == 30000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test9589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9589");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList7 = mongoClientOptions3.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int9 = mongoClientOptions3.getHeartbeatConnectTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry10 = mongoClientOptions3.getCodecRegistry();
        boolean boolean11 = mongoClientOptions3.isSslEnabled();
        boolean boolean12 = mongoClientOptions3.isAlwaysUseMBeans();
        boolean boolean13 = mongoClientOptions3.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(commandListenerList7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(codecRegistry10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9590");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int5 = mongoClientOptions3.getConnectionsPerHost();
        int int6 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int8 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions3.getMinHeartbeatFrequency();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList10 = mongoClientOptions3.getCommandListeners();
        int int11 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int12 = mongoClientOptions3.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNotNull(commandListenerList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test9591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9591");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("hi!");
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str11 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setGridFsDatabase("test");
        mongoProperties0.setUsername("mongodb://localhost/test");
        java.lang.String str18 = mongoProperties0.getHost();
        mongoProperties0.setHost("hi!");
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test9592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9592");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        int int4 = mongoClientOptions3.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatSocketTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.maxConnectionIdleTime(120000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test9593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9593");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder2.build();
        boolean boolean4 = mongoClientOptions3.isSslEnabled();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int6 = mongoClientOptions3.getMinHeartbeatFrequency();
        int int7 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern13 = mongoClientOptions11.getReadConcern();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions11.getReadPreference();
        com.mongodb.ReadConcern readConcern15 = mongoClientOptions11.getReadConcern();
        boolean boolean16 = mongoClientOptions3.equals((java.lang.Object) mongoClientOptions11);
        int int17 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions3);
        int int19 = mongoClientOptions3.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList20 = mongoClientOptions3.getCommandListeners();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 500 + "'", int6 == 500);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10000 + "'", int12 == 10000);
        org.junit.Assert.assertNotNull(readConcern13);
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(readConcern15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 120000 + "'", int17 == 120000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(commandListenerList20);
    }

    @Test
    public void test9594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9594");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.heartbeatSocketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }
}

