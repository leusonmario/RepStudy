import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.uri;
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "110100";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties0.uri;
        mongoProperties0.authenticationDatabase = "111010100110000";
        mongoProperties0.setDatabase("1000111100001101000110000000000");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        int int2 = java.lang.Integer.rotateRight(580061184, (-905969664));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 580061184 + "'", int2 == 580061184);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        mongoProperties0.host = "1200000000";
        char[] charArray8 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray16 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties9.password = charArray16;
        java.lang.Class<java.lang.Integer> intClass18 = java.lang.Integer.TYPE;
        mongoProperties9.fieldNamingStrategy = intClass18;
        java.lang.String str20 = mongoProperties9.username;
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties9.builder(mongoClientOptions21);
        java.lang.Class<?> wildcardClass23 = mongoProperties9.getFieldNamingStrategy();
        mongoProperties9.setUsername("12");
        mongoProperties9.setHost("5");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray35 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties28.password = charArray35;
        java.lang.Class<java.lang.Integer> intClass37 = java.lang.Integer.TYPE;
        mongoProperties28.fieldNamingStrategy = intClass37;
        java.lang.String str39 = mongoProperties28.username;
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties28.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions mongoClientOptions42 = null;
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties28.builder(mongoClientOptions42);
        boolean boolean44 = mongoProperties28.hasCustomCredentials();
        java.lang.String str45 = mongoProperties28.gridFsDatabase;
        char[] charArray46 = mongoProperties28.password;
        mongoProperties9.setPassword(charArray46);
        mongoProperties9.port = 947912712;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        org.springframework.core.env.Environment environment52 = null;
        com.mongodb.MongoClient mongoClient53 = mongoProperties50.createMongoClient(mongoClientOptions51, environment52);
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder57 = builder54.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder57.build();
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties50.builder(mongoClientOptions60);
        int int62 = mongoClientOptions60.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList63 = mongoClientOptions60.getCommandListeners();
        int int64 = mongoClientOptions60.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory65 = mongoClientOptions60.getDbDecoderFactory();
        int int66 = mongoClientOptions60.getThreadsAllowedToBlockForConnectionMultiplier();
        int int67 = mongoClientOptions60.getHeartbeatSocketTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry68 = mongoClientOptions60.getCodecRegistry();
        boolean boolean69 = mongoClientOptions60.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties9.builder(mongoClientOptions60);
        org.springframework.core.env.Environment environment71 = null;
        com.mongodb.MongoClient mongoClient72 = mongoProperties0.createMongoClient(mongoClientOptions60, environment71);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 15 + "'", int62 == 15);
        org.junit.Assert.assertNotNull(commandListenerList63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 15 + "'", int64 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 20000 + "'", int67 == 20000);
        org.junit.Assert.assertNotNull(codecRegistry68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoClient72);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int14 = mongoClientOptions10.getHeartbeatFrequency();
        int int15 = mongoClientOptions10.getLocalThreshold();
        java.lang.String str16 = mongoClientOptions10.getRequiredReplicaSetName();
        int int17 = mongoClientOptions10.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder20 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder20.build();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatConnectTimeout((int) (byte) -1);
        com.mongodb.MongoClientOptions.Builder builder30 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.build();
        boolean boolean32 = mongoClientOptions31.isCursorFinalizerEnabled();
        int int33 = mongoClientOptions31.getHeartbeatConnectTimeout();
        boolean boolean34 = mongoClientOptions31.isSslEnabled();
        com.mongodb.WriteConcern writeConcern35 = mongoClientOptions31.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder36 = builder29.writeConcern(writeConcern35);
        com.mongodb.MongoClientOptions.Builder builder37 = builder19.writeConcern(writeConcern35);
        com.mongodb.MongoClientOptions.Builder builder39 = builder19.description("212746274");
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(writeConcern35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties17.createMongoClient(mongoClientOptions18, environment19);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder21.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties17.builder(mongoClientOptions27);
        int int29 = mongoClientOptions27.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions27);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties33.createMongoClient(mongoClientOptions34, environment35);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder40 = builder37.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties33.builder(mongoClientOptions43);
        int int45 = mongoClientOptions43.getLocalThreshold();
        int int46 = mongoClientOptions43.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory47 = mongoClientOptions43.getDbEncoderFactory();
        com.mongodb.ReadConcern readConcern48 = mongoClientOptions43.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder49 = builder32.readConcern(readConcern48);
        com.mongodb.MongoClientOptions.Builder builder51 = builder32.heartbeatConnectTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.requiredReplicaSetName("100000010");
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.connectionsPerHost(8000);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory47);
        org.junit.Assert.assertNotNull(readConcern48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("6000200000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 6000200000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList2 = mongoClientOptions1.getCommandListeners();
        javax.net.SocketFactory socketFactory3 = mongoClientOptions1.getSocketFactory();
        int int4 = mongoClientOptions1.getServerSelectionTimeout();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        boolean boolean6 = mongoClientOptions1.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(commandListenerList2);
        org.junit.Assert.assertNotNull(socketFactory3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30000 + "'", int4 == 30000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        int int2 = java.lang.Integer.divideUnsigned(16790035, 74052091);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions10.getCommandListeners();
        java.lang.String str13 = mongoClientOptions10.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory14 = mongoClientOptions10.getDbEncoderFactory();
        int int15 = mongoClientOptions10.getServerSelectionTimeout();
        com.mongodb.ReadConcern readConcern16 = mongoClientOptions10.getReadConcern();
        int int17 = mongoClientOptions10.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int19 = mongoClientOptions10.getServerSelectionTimeout();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties21.createMongoClient(mongoClientOptions22, environment23);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties21.builder(mongoClientOptions31);
        int int33 = mongoClientOptions31.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions31);
        int int35 = mongoClientOptions31.getHeartbeatConnectTimeout();
        int int36 = mongoClientOptions31.getServerSelectionTimeout();
        int int37 = mongoClientOptions31.getSocketTimeout();
        com.mongodb.ReadConcern readConcern38 = mongoClientOptions31.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder39 = builder20.readConcern(readConcern38);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dBEncoderFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertNotNull(readConcern16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30000 + "'", int19 == 30000);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 30000 + "'", int36 == 30000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(readConcern38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions6.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions6);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions6.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions6.getDbEncoderFactory();
        int int12 = mongoClientOptions6.getMinHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference13 = mongoClientOptions6.getReadPreference();
        int int14 = mongoClientOptions6.getMaxWaitTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 500 + "'", int12 == 500);
        org.junit.Assert.assertNotNull(readPreference13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions10.getCommandListeners();
        int int13 = mongoClientOptions10.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.ReadConcern readConcern15 = mongoClientOptions10.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int17 = mongoClientOptions10.getServerSelectionTimeout();
        int int18 = mongoClientOptions10.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.description("");
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder27 = builder21.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder28 = builder21.legacyDefaults();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str30 = mongoProperties29.database;
        mongoProperties29.setHost("mongodb://localhost/test");
        java.lang.String str33 = mongoProperties29.getHost();
        com.mongodb.MongoClientOptions.Builder builder34 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder34.build();
        int int36 = mongoClientOptions35.getHeartbeatConnectTimeout();
        int int37 = mongoClientOptions35.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties29.builder(mongoClientOptions35);
        javax.net.SocketFactory socketFactory39 = mongoClientOptions35.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory40 = mongoClientOptions35.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = builder21.dbEncoderFactory(dBEncoderFactory40);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.connectionsPerHost(30000);
        boolean boolean44 = mongoClientOptions10.equals((java.lang.Object) builder43);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList45 = mongoClientOptions10.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int47 = mongoClientOptions10.getConnectTimeout();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(readConcern15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30000 + "'", int17 == 30000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "mongodb://localhost/test" + "'", str33, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(socketFactory39);
        org.junit.Assert.assertNotNull(dBEncoderFactory40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(commandListenerList45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10000 + "'", int47 == 10000);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str8 = mongoProperties0.getDatabase();
        mongoProperties0.clearPassword();
        java.lang.String str10 = mongoProperties0.database;
        mongoProperties0.username = "200";
        mongoProperties0.uri = "5000000";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        int int1 = java.lang.Integer.parseInt("34816");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34816 + "'", int1 == 34816);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str14 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int16 = mongoClientOptions10.getLocalThreshold();
        int int17 = mongoClientOptions10.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        java.lang.Integer int11 = mongoProperties0.getPort();
        java.lang.String str12 = mongoProperties0.getDatabase();
        org.springframework.core.env.Environment environment13 = null;
        int int14 = mongoProperties0.determinePort(environment13);
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties0.builder(mongoClientOptions15);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions10.getCommandListeners();
        java.lang.String str13 = mongoClientOptions10.getRequiredReplicaSetName();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.ReadPreference readPreference15 = mongoClientOptions10.getReadPreference();
        int int16 = mongoClientOptions10.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(readPreference15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("12");
        java.lang.String str17 = mongoProperties0.username;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray25 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties18.password = charArray25;
        java.lang.Class<java.lang.Integer> intClass27 = java.lang.Integer.TYPE;
        mongoProperties18.fieldNamingStrategy = intClass27;
        java.lang.String str29 = mongoProperties18.username;
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties18.builder(mongoClientOptions30);
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties18.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties18.builder(mongoClientOptions34);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str37 = mongoProperties36.database;
        java.lang.String str38 = mongoProperties36.authenticationDatabase;
        java.lang.Integer int39 = mongoProperties36.port;
        java.lang.Class<java.lang.Integer> intClass40 = java.lang.Integer.TYPE;
        mongoProperties36.fieldNamingStrategy = intClass40;
        mongoProperties18.fieldNamingStrategy = intClass40;
        mongoProperties0.fieldNamingStrategy = intClass40;
        java.lang.Class<?> wildcardClass44 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.authenticationDatabase = "10001000100010100000000100000000";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "12" + "'", str17, "12");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNotNull(intClass40);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("23575");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 23575");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        mongoProperties0.setHost("141");
        java.lang.String str8 = mongoProperties0.host;
        java.lang.String str9 = mongoProperties0.authenticationDatabase;
        boolean boolean10 = mongoProperties0.hasCustomAddress();
        mongoProperties0.username = "3";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.database;
        mongoProperties13.setHost("mongodb://localhost/test");
        java.lang.String str17 = mongoProperties13.getUri();
        int int18 = mongoProperties13.getDEFAULT_PORT();
        java.lang.String str19 = mongoProperties13.gridFsDatabase;
        java.lang.String str20 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder21 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        int int23 = mongoClientOptions22.getHeartbeatConnectTimeout();
        int int24 = mongoClientOptions22.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry25 = mongoClientOptions22.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions22);
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties13.builder(mongoClientOptions22);
        mongoProperties13.setUsername("10");
        char[] charArray30 = mongoProperties13.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int32 = mongoProperties31.port;
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties31.builder(mongoClientOptions33);
        mongoProperties31.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray44 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties37.password = charArray44;
        java.lang.String str46 = mongoProperties37.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str48 = mongoProperties47.database;
        java.lang.String str49 = mongoProperties47.authenticationDatabase;
        java.lang.Integer int50 = mongoProperties47.port;
        java.lang.Class<java.lang.Integer> intClass51 = java.lang.Integer.TYPE;
        mongoProperties47.fieldNamingStrategy = intClass51;
        mongoProperties37.setFieldNamingStrategy(intClass51);
        mongoProperties31.fieldNamingStrategy = intClass51;
        mongoProperties13.setFieldNamingStrategy(intClass51);
        int int56 = mongoProperties13.getDEFAULT_PORT();
        mongoProperties13.host = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions60 = null;
        org.springframework.core.env.Environment environment61 = null;
        com.mongodb.MongoClient mongoClient62 = mongoProperties59.createMongoClient(mongoClientOptions60, environment61);
        com.mongodb.MongoClientOptions.Builder builder63 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder66 = builder63.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions69 = builder66.build();
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties59.builder(mongoClientOptions69);
        int int71 = mongoClientOptions69.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder72 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions69);
        int int73 = mongoClientOptions69.getConnectTimeout();
        int int74 = mongoClientOptions69.getMinConnectionsPerHost();
        int int75 = mongoClientOptions69.getMaxWaitTime();
        int int76 = mongoClientOptions69.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder77 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder78 = mongoProperties13.builder(mongoClientOptions69);
        com.mongodb.ReadConcern readConcern79 = mongoClientOptions69.getReadConcern();
        org.springframework.core.env.Environment environment80 = null;
        com.mongodb.MongoClient mongoClient81 = mongoProperties0.createMongoClient(mongoClientOptions69, environment80);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "141" + "'", str8, "141");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(codecRegistry25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(intClass51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 27017 + "'", int56 == 27017);
        org.junit.Assert.assertNotNull(mongoClient62);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClientOptions69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10000 + "'", int73 == 10000);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 120000 + "'", int75 == 120000);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 15 + "'", int76 == 15);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(readConcern79);
        org.junit.Assert.assertNotNull(mongoClient81);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.springframework.core.env.Environment environment7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties5.createMongoClient(mongoClientOptions6, environment7);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties5.builder(mongoClientOptions15);
        int int17 = mongoClientOptions15.getLocalThreshold();
        int int18 = mongoClientOptions15.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        org.bson.codecs.configuration.CodecRegistry codecRegistry21 = mongoClientOptions20.getCodecRegistry();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList22 = mongoClientOptions20.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.sslEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertNotNull(codecRegistry21);
        org.junit.Assert.assertNotNull(commandListenerList22);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.getUri();
        int int13 = mongoProperties0.getDEFAULT_PORT();
        boolean boolean14 = mongoProperties0.hasCustomCredentials();
        java.lang.String str15 = mongoProperties0.getHost();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray13 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties6.password = charArray13;
        java.lang.String str15 = mongoProperties6.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.database;
        java.lang.String str18 = mongoProperties16.authenticationDatabase;
        java.lang.Integer int19 = mongoProperties16.port;
        java.lang.Class<java.lang.Integer> intClass20 = java.lang.Integer.TYPE;
        mongoProperties16.fieldNamingStrategy = intClass20;
        mongoProperties6.setFieldNamingStrategy(intClass20);
        mongoProperties0.fieldNamingStrategy = intClass20;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int25 = mongoProperties24.port;
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties24.builder(mongoClientOptions26);
        mongoProperties24.port = 1;
        java.lang.String str30 = mongoProperties24.getMongoClientDatabase();
        org.springframework.core.env.Environment environment31 = null;
        int int32 = mongoProperties24.determinePort(environment31);
        com.mongodb.MongoClientOptions.Builder builder33 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties24.builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions34);
        java.lang.String str38 = mongoProperties0.uri;
        mongoProperties0.database = "1";
        com.mongodb.MongoClientOptions.Builder builder41 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder41.build();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions42);
        int int44 = mongoClientOptions42.getMaxConnectionLifeTime();
        int int45 = mongoClientOptions42.getMaxConnectionLifeTime();
        int int46 = mongoClientOptions42.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions42);
        boolean boolean48 = mongoClientOptions42.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties0.builder(mongoClientOptions42);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray57 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties50.password = charArray57;
        java.lang.Class<java.lang.Integer> intClass59 = java.lang.Integer.TYPE;
        mongoProperties50.fieldNamingStrategy = intClass59;
        java.lang.String str61 = mongoProperties50.username;
        com.mongodb.MongoClientOptions mongoClientOptions62 = null;
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties50.builder(mongoClientOptions62);
        com.mongodb.MongoClientOptions mongoClientOptions64 = null;
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties50.builder(mongoClientOptions64);
        mongoProperties50.setUsername("34");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties68 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions69 = null;
        org.springframework.core.env.Environment environment70 = null;
        com.mongodb.MongoClient mongoClient71 = mongoProperties68.createMongoClient(mongoClientOptions69, environment70);
        com.mongodb.MongoClientOptions.Builder builder72 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder74 = builder72.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder75 = builder72.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder77 = builder75.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions78 = builder75.build();
        com.mongodb.MongoClientOptions.Builder builder79 = mongoProperties68.builder(mongoClientOptions78);
        com.mongodb.DBDecoderFactory dBDecoderFactory80 = mongoClientOptions78.getDbDecoderFactory();
        int int81 = mongoClientOptions78.getSocketTimeout();
        int int82 = mongoClientOptions78.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder83 = mongoProperties50.builder(mongoClientOptions78);
        char[] charArray84 = mongoProperties50.getPassword();
        mongoProperties50.gridFsDatabase = "16";
        char[] charArray87 = mongoProperties50.getPassword();
        mongoProperties0.setPassword(charArray87);
        com.mongodb.MongoClientOptions.Builder builder89 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions90 = builder89.build();
        boolean boolean91 = mongoClientOptions90.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList92 = mongoClientOptions90.getCommandListeners();
        boolean boolean93 = mongoClientOptions90.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder94 = com.mongodb.MongoClientOptions.builder(mongoClientOptions90);
        com.mongodb.MongoClientOptions.Builder builder95 = mongoProperties0.builder(mongoClientOptions90);
        com.mongodb.MongoClientOptions.Builder builder97 = builder95.requiredReplicaSetName("");
        com.mongodb.event.CommandListener commandListener98 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder99 = builder97.addCommandListener(commandListener98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(intClass20);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "test" + "'", str30, "test");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 500 + "'", int46 == 500);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(mongoClient71);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(mongoClientOptions78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(dBDecoderFactory80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 15 + "'", int82 == 15);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(mongoClientOptions90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(commandListenerList92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder97);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        int int1 = java.lang.Integer.highestOneBit(25402);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16384 + "'", int1 == 16384);
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        int int1 = java.lang.Integer.numberOfLeadingZeros(407004);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.database;
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.authenticationDatabase = "10";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.database;
        java.lang.String str10 = mongoProperties8.authenticationDatabase;
        java.lang.Integer int11 = mongoProperties8.port;
        java.lang.Class<java.lang.Integer> intClass12 = java.lang.Integer.TYPE;
        mongoProperties8.fieldNamingStrategy = intClass12;
        mongoProperties0.fieldNamingStrategy = intClass12;
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        int int17 = mongoClientOptions16.getHeartbeatConnectTimeout();
        int int18 = mongoClientOptions16.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions16);
        com.mongodb.ReadPreference readPreference20 = mongoClientOptions16.getReadPreference();
        int int21 = mongoClientOptions16.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions16);
        java.lang.Class<?> wildcardClass23 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(intClass12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(readPreference20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions14.getHeartbeatConnectTimeout();
        boolean boolean17 = mongoClientOptions14.isSslEnabled();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions14.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder19 = builder10.writeConcern(writeConcern18);
        com.mongodb.MongoClientOptions.Builder builder21 = builder10.maxWaitTime(212746240);
        com.mongodb.MongoClientOptions.Builder builder23 = builder10.serverSelectionTimeout(42949672);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        java.lang.String str10 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.springframework.core.env.Environment environment13 = null;
        com.mongodb.MongoClient mongoClient14 = mongoProperties11.createMongoClient(mongoClientOptions12, environment13);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder15.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties11.builder(mongoClientOptions21);
        int int23 = mongoClientOptions21.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        java.lang.String str25 = mongoClientOptions21.getDescription();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        org.springframework.core.env.Environment environment27 = null;
        com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions21, environment27);
        mongoProperties0.clearPassword();
        java.lang.String str30 = mongoProperties0.uri;
        java.lang.String str31 = mongoProperties0.host;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(mongoClient14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "mongodb://localhost/test" + "'", str30, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        java.lang.String str15 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str16 = mongoProperties0.uri;
        char[] charArray17 = mongoProperties0.password;
        java.lang.String str18 = mongoProperties0.authenticationDatabase;
        java.lang.String str19 = mongoProperties0.getUri();
        mongoProperties0.setDatabase("9");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "test" + "'", str15, "test");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList3 = mongoClientOptions1.getCommandListeners();
        boolean boolean4 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern5 = mongoClientOptions1.getWriteConcern();
        boolean boolean6 = mongoClientOptions1.isSslEnabled();
        int int7 = mongoClientOptions1.getLocalThreshold();
        int int8 = mongoClientOptions1.getMaxWaitTime();
        int int9 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(commandListenerList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(writeConcern5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 120000 + "'", int8 == 120000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder12 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions13);
        int int15 = mongoClientOptions13.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions13.getMaxConnectionLifeTime();
        int int17 = mongoClientOptions13.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions13);
        javax.net.SocketFactory socketFactory19 = mongoClientOptions13.getSocketFactory();
        int int20 = mongoClientOptions13.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern21 = mongoClientOptions13.getWriteConcern();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(socketFactory19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(writeConcern21);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.clearPassword();
        java.lang.Class<?> wildcardClass3 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUri("-1916216192");
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.port = 0;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        int int1 = java.lang.Integer.parseUnsignedInt("11");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray18 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties11.password = charArray18;
        java.lang.String str20 = mongoProperties11.database;
        java.lang.String str21 = mongoProperties11.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.springframework.core.env.Environment environment24 = null;
        com.mongodb.MongoClient mongoClient25 = mongoProperties22.createMongoClient(mongoClientOptions23, environment24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder29 = builder26.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties22.builder(mongoClientOptions32);
        int int34 = mongoClientOptions32.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        java.lang.String str36 = mongoClientOptions32.getDescription();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        org.springframework.core.env.Environment environment38 = null;
        com.mongodb.MongoClient mongoClient39 = mongoProperties11.createMongoClient(mongoClientOptions32, environment38);
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties0.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder40.build();
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        boolean boolean12 = mongoClientOptions11.isCursorFinalizerEnabled();
        int int13 = mongoClientOptions11.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern14 = mongoClientOptions11.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.writeConcern(writeConcern14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.sslInvalidHostNameAllowed(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(writeConcern14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        int int1 = java.lang.Integer.reverseBytes(29360128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49153 + "'", int1 == 49153);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList8 = mongoClientOptions1.getCommandListeners();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(commandListenerList8);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        int int2 = java.lang.Integer.rotateLeft(120000, 268452645);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3840000 + "'", int2 == 3840000);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        java.lang.String str17 = mongoClientOptions16.getDescription();
        int int18 = mongoClientOptions16.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions16.getWriteConcern();
        boolean boolean20 = mongoClientOptions16.isAlwaysUseMBeans();
        com.mongodb.DBEncoderFactory dBEncoderFactory21 = mongoClientOptions16.getDbEncoderFactory();
        javax.net.SocketFactory socketFactory22 = mongoClientOptions16.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = builder9.socketFactory(socketFactory22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.localThreshold(16790035);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.sslEnabled(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        org.springframework.core.env.Environment environment30 = null;
        com.mongodb.MongoClient mongoClient31 = mongoProperties28.createMongoClient(mongoClientOptions29, environment30);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder35 = builder32.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties28.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.maxConnectionLifeTime(167772160);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder46 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder46.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList48 = mongoClientOptions47.getCommandListeners();
        javax.net.SocketFactory socketFactory49 = mongoClientOptions47.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder50 = builder41.socketFactory(socketFactory49);
        com.mongodb.MongoClientOptions.Builder builder51 = builder27.socketFactory(socketFactory49);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(writeConcern19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory21);
        org.junit.Assert.assertNotNull(socketFactory22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClient31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(commandListenerList48);
        org.junit.Assert.assertNotNull(socketFactory49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("2348810336", 80000004);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 80000004 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        int int11 = mongoProperties0.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.database;
        mongoProperties12.setHost("mongodb://localhost/test");
        java.lang.String str16 = mongoProperties12.getUri();
        int int17 = mongoProperties12.getDEFAULT_PORT();
        java.lang.String str18 = mongoProperties12.gridFsDatabase;
        java.lang.String str19 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder20 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder20.build();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties12.builder(mongoClientOptions21);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray31 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties24.password = charArray31;
        mongoProperties24.database = "";
        boolean boolean35 = mongoProperties24.hasCustomAddress();
        java.lang.String str36 = mongoProperties24.authenticationDatabase;
        java.lang.Class<java.lang.Integer> intClass37 = java.lang.Integer.TYPE;
        mongoProperties24.setFieldNamingStrategy(intClass37);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.database;
        java.lang.String str41 = mongoProperties39.authenticationDatabase;
        java.lang.Class<?> wildcardClass42 = mongoProperties39.fieldNamingStrategy;
        mongoProperties39.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions45 = null;
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties39.builder(mongoClientOptions45);
        com.mongodb.MongoClientOptions mongoClientOptions47 = null;
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties39.builder(mongoClientOptions47);
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder52 = builder49.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions55 = builder52.build();
        java.lang.String str56 = mongoClientOptions55.getDescription();
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties39.builder(mongoClientOptions55);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties58 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions59 = null;
        org.springframework.core.env.Environment environment60 = null;
        com.mongodb.MongoClient mongoClient61 = mongoProperties58.createMongoClient(mongoClientOptions59, environment60);
        com.mongodb.MongoClientOptions.Builder builder62 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder65 = builder62.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions68 = builder65.build();
        com.mongodb.MongoClientOptions.Builder builder69 = mongoProperties58.builder(mongoClientOptions68);
        int int70 = mongoClientOptions68.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList71 = mongoClientOptions68.getCommandListeners();
        int int72 = mongoClientOptions68.getLocalThreshold();
        int int73 = mongoClientOptions68.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder74 = mongoProperties39.builder(mongoClientOptions68);
        com.mongodb.MongoClientOptions.Builder builder75 = mongoProperties24.builder(mongoClientOptions68);
        java.lang.String str76 = mongoProperties24.getHost();
        char[] charArray77 = mongoProperties24.password;
        boolean boolean78 = mongoClientOptions21.equals((java.lang.Object) charArray77);
        mongoProperties0.password = charArray77;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27017 + "'", int17 == 27017);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(intClass37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(mongoClientOptions55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(mongoClient61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoClientOptions68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 15 + "'", int70 == 15);
        org.junit.Assert.assertNotNull(commandListenerList71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 15 + "'", int72 == 15);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMinHeartbeatFrequency();
        boolean boolean8 = mongoClientOptions6.isSocketKeepAlive();
        boolean boolean9 = mongoClientOptions6.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int11 = mongoClientOptions6.getServerSelectionTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30000 + "'", int11 == 30000);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        int int1 = java.lang.Integer.numberOfTrailingZeros(11000000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        int int1 = java.lang.Integer.numberOfLeadingZeros(355);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxWaitTime((int) '4');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.legacyDefaults();
        com.mongodb.event.CommandListener commandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder11 = builder6.addCommandListener(commandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.getDatabase();
        mongoProperties0.database = "a";
        char[] charArray12 = mongoProperties0.password;
        java.lang.String str13 = mongoProperties0.username;
        mongoProperties0.setPort((java.lang.Integer) 104);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray23 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties16.password = charArray23;
        java.lang.Class<java.lang.Integer> intClass25 = java.lang.Integer.TYPE;
        mongoProperties16.fieldNamingStrategy = intClass25;
        java.lang.String str27 = mongoProperties16.username;
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties16.builder(mongoClientOptions28);
        java.lang.Class<?> wildcardClass30 = mongoProperties16.getFieldNamingStrategy();
        mongoProperties16.setUsername("12");
        mongoProperties16.setHost("5");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.springframework.core.env.Environment environment37 = null;
        com.mongodb.MongoClient mongoClient38 = mongoProperties35.createMongoClient(mongoClientOptions36, environment37);
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder42 = builder39.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.build();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties35.builder(mongoClientOptions45);
        int int47 = mongoClientOptions45.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions45);
        java.lang.String str49 = mongoClientOptions45.getDescription();
        com.mongodb.MongoClientOptions.Builder builder50 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions45);
        java.lang.String str51 = mongoClientOptions45.getDescription();
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions45);
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties16.builder(mongoClientOptions45);
        org.springframework.core.env.Environment environment54 = null;
        com.mongodb.MongoClient mongoClient55 = mongoProperties0.createMongoClient(mongoClientOptions45, environment54);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(mongoClient38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClient55);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getUri();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties8.authenticationDatabase = "12";
        boolean boolean11 = mongoProperties8.hasCustomAddress();
        mongoProperties8.setUri("");
        int int14 = mongoProperties8.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int16 = mongoProperties15.port;
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties15.builder(mongoClientOptions17);
        mongoProperties15.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray28 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties21.password = charArray28;
        java.lang.String str30 = mongoProperties21.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str32 = mongoProperties31.database;
        java.lang.String str33 = mongoProperties31.authenticationDatabase;
        java.lang.Integer int34 = mongoProperties31.port;
        java.lang.Class<java.lang.Integer> intClass35 = java.lang.Integer.TYPE;
        mongoProperties31.fieldNamingStrategy = intClass35;
        mongoProperties21.setFieldNamingStrategy(intClass35);
        mongoProperties15.fieldNamingStrategy = intClass35;
        mongoProperties8.fieldNamingStrategy = intClass35;
        mongoProperties0.fieldNamingStrategy = intClass35;
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.description("");
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder47 = builder43.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder49 = builder43.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder50 = builder43.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder52 = builder43.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.connectTimeout(1024);
        com.mongodb.MongoClientOptions.Builder builder56 = builder52.minConnectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder57 = builder52.legacyDefaults();
        com.mongodb.MongoClientOptions mongoClientOptions58 = builder52.build();
        org.springframework.core.env.Environment environment59 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient60 = mongoProperties0.createMongoClient(mongoClientOptions58, environment59);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoException; message: host and port should be specified in host:port format");
        } catch (com.mongodb.MongoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(intClass35);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(mongoClientOptions58);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("1110000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1110000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        java.lang.Integer int9 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray17 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties10.password = charArray17;
        java.lang.Class<java.lang.Integer> intClass19 = java.lang.Integer.TYPE;
        mongoProperties10.fieldNamingStrategy = intClass19;
        java.lang.String str21 = mongoProperties10.username;
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties10.builder(mongoClientOptions22);
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties10.builder(mongoClientOptions24);
        java.lang.Class<?> wildcardClass26 = mongoProperties10.fieldNamingStrategy;
        java.lang.String str27 = mongoProperties10.getAuthenticationDatabase();
        mongoProperties10.clearPassword();
        char[] charArray29 = mongoProperties10.password;
        mongoProperties0.password = charArray29;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray38 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties31.password = charArray38;
        java.lang.String str40 = mongoProperties31.database;
        java.lang.String str41 = mongoProperties31.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        org.springframework.core.env.Environment environment44 = null;
        com.mongodb.MongoClient mongoClient45 = mongoProperties42.createMongoClient(mongoClientOptions43, environment44);
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder49 = builder46.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder49.build();
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties42.builder(mongoClientOptions52);
        int int54 = mongoClientOptions52.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions52);
        java.lang.String str56 = mongoClientOptions52.getDescription();
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions52);
        org.springframework.core.env.Environment environment58 = null;
        com.mongodb.MongoClient mongoClient59 = mongoProperties31.createMongoClient(mongoClientOptions52, environment58);
        boolean boolean60 = mongoClientOptions52.isSslInvalidHostNameAllowed();
        java.lang.String str61 = mongoClientOptions52.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory62 = mongoClientOptions52.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties0.builder(mongoClientOptions52);
        com.mongodb.DBEncoderFactory dBEncoderFactory64 = mongoClientOptions52.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(mongoClient45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(mongoClient59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(dBEncoderFactory62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(dBEncoderFactory64);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.uri;
        java.lang.String str3 = mongoProperties0.getHost();
        mongoProperties0.uri = "20000058";
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        java.lang.String str8 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb://localhost/test" + "'", str2, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20000058" + "'", str8, "20000058");
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        int int2 = java.lang.Integer.compare(220000000, 1011010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.uri;
        java.lang.String str3 = mongoProperties0.getHost();
        mongoProperties0.uri = "20000058";
        mongoProperties0.host = "";
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties0.determinePort(environment8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb://localhost/test" + "'", str2, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        int int2 = java.lang.Integer.divideUnsigned(8192, 167);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int9 = mongoClientOptions6.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        long long1 = java.lang.Integer.toUnsignedLong(947912705);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 947912705L + "'", long1 == 947912705L);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getLocalThreshold();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions1.getSocketFactory();
        org.bson.codecs.configuration.CodecRegistry codecRegistry9 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions1.getDbEncoderFactory();
        int int11 = mongoClientOptions1.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList13 = mongoClientOptions1.getCommandListeners();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(codecRegistry9);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(commandListenerList13);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setUsername("34");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.springframework.core.env.Environment environment20 = null;
        com.mongodb.MongoClient mongoClient21 = mongoProperties18.createMongoClient(mongoClientOptions19, environment20);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder25 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties18.builder(mongoClientOptions28);
        com.mongodb.DBDecoderFactory dBDecoderFactory30 = mongoClientOptions28.getDbDecoderFactory();
        int int31 = mongoClientOptions28.getSocketTimeout();
        int int32 = mongoClientOptions28.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder35 = com.mongodb.MongoClientOptions.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.threadsAllowedToBlockForConnectionMultiplier((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        java.lang.String str11 = mongoProperties0.getHost();
        mongoProperties0.authenticationDatabase = "1024";
        com.mongodb.MongoClientOptions.Builder builder14 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        boolean boolean19 = mongoClientOptions15.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        int int21 = mongoClientOptions15.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions15);
        mongoProperties0.database = "1000010100110100011101100";
        int int25 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120000 + "'", int21 == 120000);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 27017 + "'", int25 == 27017);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions14.getHeartbeatConnectTimeout();
        boolean boolean17 = mongoClientOptions14.isSslEnabled();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions14, environment18);
        java.lang.String str20 = mongoProperties0.gridFsDatabase;
        java.lang.String str21 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions6.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions6);
        java.lang.String str10 = mongoClientOptions6.getRequiredReplicaSetName();
        org.bson.codecs.configuration.CodecRegistry codecRegistry11 = mongoClientOptions6.getCodecRegistry();
        java.lang.String str12 = mongoClientOptions6.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.description("637534208");
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxWaitTime((-645266971));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(codecRegistry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.springframework.core.env.Environment environment16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties14.createMongoClient(mongoClientOptions15, environment16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties14.builder(mongoClientOptions24);
        int int26 = mongoClientOptions24.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        java.lang.String str28 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        java.lang.String str30 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        boolean boolean32 = mongoClientOptions24.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder33 = com.mongodb.MongoClientOptions.builder(mongoClientOptions24);
        org.springframework.core.env.Environment environment34 = null;
        com.mongodb.MongoClient mongoClient35 = mongoProperties0.createMongoClient(mongoClientOptions24, environment34);
        mongoProperties0.setDatabase("215");
        java.lang.String str38 = mongoProperties0.username;
        mongoProperties0.gridFsDatabase = "8000";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        mongoProperties0.database = "97";
        java.lang.String str19 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties20.authenticationDatabase = "12";
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.springframework.core.env.Environment environment24 = null;
        com.mongodb.MongoClient mongoClient25 = mongoProperties20.createMongoClient(mongoClientOptions23, environment24);
        org.springframework.core.env.Environment environment26 = null;
        int int27 = mongoProperties20.determinePort(environment26);
        boolean boolean28 = mongoProperties20.hasCustomAddress();
        java.lang.Integer int29 = mongoProperties20.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray37 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties30.password = charArray37;
        java.lang.Class<java.lang.Integer> intClass39 = java.lang.Integer.TYPE;
        mongoProperties30.fieldNamingStrategy = intClass39;
        java.lang.String str41 = mongoProperties30.username;
        com.mongodb.MongoClientOptions mongoClientOptions42 = null;
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties30.builder(mongoClientOptions42);
        com.mongodb.MongoClientOptions mongoClientOptions44 = null;
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties30.builder(mongoClientOptions44);
        java.lang.Class<?> wildcardClass46 = mongoProperties30.fieldNamingStrategy;
        java.lang.String str47 = mongoProperties30.getAuthenticationDatabase();
        mongoProperties30.clearPassword();
        char[] charArray49 = mongoProperties30.password;
        mongoProperties20.password = charArray49;
        mongoProperties0.setPassword(charArray49);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27017 + "'", int27 == 27017);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.uri;
        java.lang.String str6 = mongoProperties0.getDatabase();
        java.lang.Integer int7 = mongoProperties0.port;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str14 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str16 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str19 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.description("");
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.description("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder32 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        boolean boolean34 = mongoClientOptions33.isCursorFinalizerEnabled();
        int int35 = mongoClientOptions33.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern36 = mongoClientOptions33.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder37 = builder31.writeConcern(writeConcern36);
        com.mongodb.MongoClientOptions.Builder builder38 = builder22.writeConcern(writeConcern36);
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.description("");
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder47 = builder41.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder51 = builder48.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder57 = builder53.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder58 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions59 = builder58.build();
        boolean boolean60 = mongoClientOptions59.isCursorFinalizerEnabled();
        int int61 = mongoClientOptions59.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern62 = mongoClientOptions59.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder63 = builder57.writeConcern(writeConcern62);
        com.mongodb.MongoClientOptions.Builder builder64 = builder47.writeConcern(writeConcern62);
        com.mongodb.MongoClientOptions.Builder builder65 = builder22.writeConcern(writeConcern62);
        boolean boolean66 = mongoClientOptions10.equals((java.lang.Object) builder65);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties67 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray74 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties67.password = charArray74;
        java.lang.Class<java.lang.Integer> intClass76 = java.lang.Integer.TYPE;
        mongoProperties67.fieldNamingStrategy = intClass76;
        java.lang.String str78 = mongoProperties67.username;
        com.mongodb.MongoClientOptions mongoClientOptions79 = null;
        com.mongodb.MongoClientOptions.Builder builder80 = mongoProperties67.builder(mongoClientOptions79);
        com.mongodb.MongoClientOptions mongoClientOptions81 = null;
        com.mongodb.MongoClientOptions.Builder builder82 = mongoProperties67.builder(mongoClientOptions81);
        mongoProperties67.setUsername("34");
        java.lang.String str85 = mongoProperties67.gridFsDatabase;
        java.lang.Integer int86 = mongoProperties67.getPort();
        com.mongodb.MongoClientOptions.Builder builder87 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions88 = builder87.build();
        com.mongodb.MongoClientOptions.Builder builder89 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions88);
        int int90 = mongoClientOptions88.getMaxConnectionLifeTime();
        int int91 = mongoClientOptions88.getMaxConnectionLifeTime();
        int int92 = mongoClientOptions88.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder93 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions88);
        org.springframework.core.env.Environment environment94 = null;
        com.mongodb.MongoClient mongoClient95 = mongoProperties67.createMongoClient(mongoClientOptions88, environment94);
        com.mongodb.DBEncoderFactory dBEncoderFactory96 = mongoClientOptions88.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder97 = builder65.dbEncoderFactory(dBEncoderFactory96);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertNotNull(writeConcern36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoClientOptions59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20000 + "'", int61 == 20000);
        org.junit.Assert.assertNotNull(writeConcern62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass76);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(int86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(mongoClientOptions88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 500 + "'", int92 == 500);
        org.junit.Assert.assertNotNull(mongoClient95);
        org.junit.Assert.assertNotNull(dBEncoderFactory96);
        org.junit.Assert.assertNotNull(builder97);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.port = 100;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int8 = mongoProperties7.port;
        mongoProperties7.setUri("hi!");
        char[] charArray11 = mongoProperties7.getPassword();
        int int12 = mongoProperties7.getDEFAULT_PORT();
        boolean boolean13 = mongoProperties7.hasCustomCredentials();
        java.lang.String str14 = mongoProperties7.uri;
        mongoProperties7.setUri("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray24 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties17.password = charArray24;
        java.lang.Class<java.lang.Integer> intClass26 = java.lang.Integer.TYPE;
        mongoProperties17.fieldNamingStrategy = intClass26;
        java.lang.String str28 = mongoProperties17.username;
        mongoProperties17.authenticationDatabase = "-1";
        mongoProperties17.setUsername("");
        java.lang.String str33 = mongoProperties17.username;
        mongoProperties17.setPort((java.lang.Integer) 15);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray43 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties36.password = charArray43;
        mongoProperties36.database = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray54 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties47.password = charArray54;
        java.lang.String str56 = mongoProperties47.database;
        java.lang.String str57 = mongoProperties47.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties58 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions59 = null;
        org.springframework.core.env.Environment environment60 = null;
        com.mongodb.MongoClient mongoClient61 = mongoProperties58.createMongoClient(mongoClientOptions59, environment60);
        com.mongodb.MongoClientOptions.Builder builder62 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder65 = builder62.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions68 = builder65.build();
        com.mongodb.MongoClientOptions.Builder builder69 = mongoProperties58.builder(mongoClientOptions68);
        int int70 = mongoClientOptions68.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder71 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions68);
        java.lang.String str72 = mongoClientOptions68.getDescription();
        com.mongodb.MongoClientOptions.Builder builder73 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions68);
        org.springframework.core.env.Environment environment74 = null;
        com.mongodb.MongoClient mongoClient75 = mongoProperties47.createMongoClient(mongoClientOptions68, environment74);
        com.mongodb.MongoClientOptions.Builder builder76 = mongoProperties36.builder(mongoClientOptions68);
        com.mongodb.MongoClientOptions mongoClientOptions77 = builder76.build();
        int int78 = mongoClientOptions77.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder79 = mongoProperties17.builder(mongoClientOptions77);
        boolean boolean80 = mongoClientOptions77.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder81 = mongoProperties7.builder(mongoClientOptions77);
        com.mongodb.DBEncoderFactory dBEncoderFactory82 = mongoClientOptions77.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder83 = mongoProperties0.builder(mongoClientOptions77);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(mongoClient61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoClientOptions68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(mongoClient75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoClientOptions77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 120000 + "'", int78 == 120000);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(dBEncoderFactory82);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern3 = mongoClientOptions1.getWriteConcern();
        int int4 = mongoClientOptions1.getHeartbeatFrequency();
        boolean boolean5 = mongoClientOptions1.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertNotNull(writeConcern3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10000 + "'", int4 == 10000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.DBDecoderFactory dBDecoderFactory12 = mongoClientOptions10.getDbDecoderFactory();
        int int13 = mongoClientOptions10.getSocketTimeout();
        int int14 = mongoClientOptions10.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        int int16 = mongoClientOptions10.getServerSelectionTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int18 = mongoClientOptions10.getConnectTimeout();
        com.mongodb.ReadPreference readPreference19 = mongoClientOptions10.getReadPreference();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30000 + "'", int16 == 30000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10000 + "'", int18 == 10000);
        org.junit.Assert.assertNotNull(readPreference19);
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str8 = mongoProperties0.getDatabase();
        java.lang.String str9 = mongoProperties0.getDatabase();
        char[] charArray10 = null;
        mongoProperties0.setPassword(charArray10);
        mongoProperties0.setUsername("2");
        char[] charArray14 = mongoProperties0.getPassword();
        mongoProperties0.setGridFsDatabase("101010000110000100000000");
        com.mongodb.MongoClientOptions.Builder builder17 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        boolean boolean19 = mongoClientOptions18.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions18.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern21 = mongoClientOptions18.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList22 = mongoClientOptions18.getCommandListeners();
        int int23 = mongoClientOptions18.getMaxConnectionIdleTime();
        com.mongodb.ReadConcern readConcern24 = mongoClientOptions18.getReadConcern();
        int int25 = mongoClientOptions18.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder26 = com.mongodb.MongoClientOptions.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions18);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertNotNull(writeConcern21);
        org.junit.Assert.assertNotNull(commandListenerList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(readConcern24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions6.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions6.getMaxWaitTime();
        int int10 = mongoClientOptions6.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        com.mongodb.ReadConcern readConcern12 = mongoClientOptions6.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder13 = builder2.readConcern(readConcern12);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.connectionsPerHost(215);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.heartbeatFrequency(177);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(readConcern12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder7 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.build();
        int int9 = mongoClientOptions8.getHeartbeatConnectTimeout();
        int int10 = mongoClientOptions8.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions8);
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions8.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder13 = builder6.readPreference(readPreference12);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.localThreshold((int) (short) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties21.createMongoClient(mongoClientOptions22, environment23);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties21.builder(mongoClientOptions31);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList33 = mongoClientOptions31.getCommandListeners();
        java.lang.String str34 = mongoClientOptions31.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory35 = mongoClientOptions31.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = builder16.dbEncoderFactory(dBEncoderFactory35);
        com.mongodb.MongoClientOptions.Builder builder37 = builder6.dbEncoderFactory(dBEncoderFactory35);
        com.mongodb.MongoClientOptions.Builder builder38 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder38.build();
        int int40 = mongoClientOptions39.getHeartbeatConnectTimeout();
        int int41 = mongoClientOptions39.getMaxConnectionIdleTime();
        int int42 = mongoClientOptions39.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions39);
        org.bson.codecs.configuration.CodecRegistry codecRegistry44 = mongoClientOptions39.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder45 = builder37.codecRegistry(codecRegistry44);
        com.mongodb.MongoClientOptions.Builder builder47 = builder37.sslEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(commandListenerList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dBEncoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15 + "'", int42 == 15);
        org.junit.Assert.assertNotNull(codecRegistry44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray13 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties6.password = charArray13;
        java.lang.String str15 = mongoProperties6.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.database;
        java.lang.String str18 = mongoProperties16.authenticationDatabase;
        java.lang.Integer int19 = mongoProperties16.port;
        java.lang.Class<java.lang.Integer> intClass20 = java.lang.Integer.TYPE;
        mongoProperties16.fieldNamingStrategy = intClass20;
        mongoProperties6.setFieldNamingStrategy(intClass20);
        mongoProperties0.fieldNamingStrategy = intClass20;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int25 = mongoProperties24.port;
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties24.builder(mongoClientOptions26);
        mongoProperties24.port = 1;
        java.lang.String str30 = mongoProperties24.getMongoClientDatabase();
        org.springframework.core.env.Environment environment31 = null;
        int int32 = mongoProperties24.determinePort(environment31);
        com.mongodb.MongoClientOptions.Builder builder33 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties24.builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions34);
        boolean boolean38 = mongoClientOptions34.isSocketKeepAlive();
        int int39 = mongoClientOptions34.getMaxWaitTime();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(intClass20);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "test" + "'", str30, "test");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 120000 + "'", int39 == 120000);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.springframework.core.env.Environment environment10 = null;
        com.mongodb.MongoClient mongoClient11 = mongoProperties8.createMongoClient(mongoClientOptions9, environment10);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder15 = builder12.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties8.builder(mongoClientOptions18);
        int int20 = mongoClientOptions18.getLocalThreshold();
        int int21 = mongoClientOptions18.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        com.mongodb.DBDecoderFactory dBDecoderFactory24 = mongoClientOptions18.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties0.builder(mongoClientOptions18);
        int int26 = mongoClientOptions18.getConnectionsPerHost();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("79ea8d74");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"79ea8d74\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        java.lang.String str1 = java.lang.Integer.toBinaryString(67108864);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000000000000000000000000" + "'", str1, "100000000000000000000000000");
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("12");
        java.lang.Class<?> wildcardClass17 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str18 = mongoProperties0.uri;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getConnectTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int9 = mongoProperties8.port;
        mongoProperties8.setAuthenticationDatabase("");
        java.lang.Integer int12 = mongoProperties8.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray20 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties13.password = charArray20;
        mongoProperties8.setPassword(charArray20);
        mongoProperties8.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.springframework.core.env.Environment environment27 = null;
        com.mongodb.MongoClient mongoClient28 = mongoProperties25.createMongoClient(mongoClientOptions26, environment27);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder32 = builder29.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties25.builder(mongoClientOptions35);
        int int37 = mongoClientOptions35.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties8.builder(mongoClientOptions35);
        int int39 = mongoClientOptions35.getConnectionsPerHost();
        int int40 = mongoClientOptions35.getMaxConnectionIdleTime();
        int int41 = mongoClientOptions35.getHeartbeatFrequency();
        int int42 = mongoClientOptions35.getSocketTimeout();
        boolean boolean43 = mongoClientOptions35.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder47 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder47.build();
        boolean boolean49 = mongoClientOptions48.isCursorFinalizerEnabled();
        int int50 = mongoClientOptions48.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern51 = mongoClientOptions48.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList52 = mongoClientOptions48.getCommandListeners();
        org.bson.codecs.configuration.CodecRegistry codecRegistry53 = mongoClientOptions48.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions48);
        com.mongodb.DBEncoderFactory dBEncoderFactory55 = mongoClientOptions48.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder56 = builder44.dbEncoderFactory(dBEncoderFactory55);
        boolean boolean57 = mongoClientOptions1.equals((java.lang.Object) builder56);
        boolean boolean58 = mongoClientOptions1.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10000 + "'", int41 == 10000);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20000 + "'", int50 == 20000);
        org.junit.Assert.assertNotNull(writeConcern51);
        org.junit.Assert.assertNotNull(commandListenerList52);
        org.junit.Assert.assertNotNull(codecRegistry53);
        org.junit.Assert.assertNotNull(dBEncoderFactory55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        int int1 = java.lang.Integer.reverse((-445636928));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 58199719 + "'", int1 == 58199719);
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        int int19 = mongoClientOptions18.getServerSelectionTimeout();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30000 + "'", int19 == 30000);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setUsername("34");
        mongoProperties0.setPort((java.lang.Integer) 120000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        org.springframework.core.env.Environment environment22 = null;
        com.mongodb.MongoClient mongoClient23 = mongoProperties20.createMongoClient(mongoClientOptions21, environment22);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder27 = builder24.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties20.builder(mongoClientOptions30);
        com.mongodb.DBDecoderFactory dBDecoderFactory32 = mongoClientOptions30.getDbDecoderFactory();
        int int33 = mongoClientOptions30.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties0.builder(mongoClientOptions30);
        int int35 = mongoClientOptions30.getHeartbeatConnectTimeout();
        int int36 = mongoClientOptions30.getServerSelectionTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory37 = mongoClientOptions30.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(dBDecoderFactory32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 30000 + "'", int36 == 30000);
        org.junit.Assert.assertNotNull(dBEncoderFactory37);
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int3 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry5 = mongoClientOptions1.getCodecRegistry();
        int int6 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.build();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray16 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties9.password = charArray16;
        java.lang.Class<java.lang.Integer> intClass18 = java.lang.Integer.TYPE;
        mongoProperties9.fieldNamingStrategy = intClass18;
        java.lang.String str20 = mongoProperties9.username;
        java.lang.String str21 = mongoProperties9.getUsername();
        mongoProperties9.setHost("1100100");
        mongoProperties9.setUri("5");
        java.lang.String str26 = mongoProperties9.getDatabase();
        mongoProperties9.setAuthenticationDatabase("1200000000");
        mongoProperties9.setAuthenticationDatabase("11010");
        char[] charArray31 = mongoProperties9.password;
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray40 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties33.password = charArray40;
        java.lang.Class<java.lang.Integer> intClass42 = java.lang.Integer.TYPE;
        mongoProperties33.fieldNamingStrategy = intClass42;
        java.lang.String str44 = mongoProperties33.username;
        com.mongodb.MongoClientOptions mongoClientOptions45 = null;
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties33.builder(mongoClientOptions45);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions48 = null;
        org.springframework.core.env.Environment environment49 = null;
        com.mongodb.MongoClient mongoClient50 = mongoProperties47.createMongoClient(mongoClientOptions48, environment49);
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder54 = builder51.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder54.build();
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties47.builder(mongoClientOptions57);
        int int59 = mongoClientOptions57.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder60 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions57);
        java.lang.String str61 = mongoClientOptions57.getDescription();
        com.mongodb.MongoClientOptions.Builder builder62 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions57);
        java.lang.String str63 = mongoClientOptions57.getDescription();
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions57);
        boolean boolean65 = mongoClientOptions57.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder66 = com.mongodb.MongoClientOptions.builder(mongoClientOptions57);
        org.springframework.core.env.Environment environment67 = null;
        com.mongodb.MongoClient mongoClient68 = mongoProperties33.createMongoClient(mongoClientOptions57, environment67);
        boolean boolean69 = mongoClientOptions57.isAlwaysUseMBeans();
        boolean boolean70 = mongoClientOptions57.isSslEnabled();
        javax.net.SocketFactory socketFactory71 = mongoClientOptions57.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder72 = builder32.socketFactory(socketFactory71);
        com.mongodb.MongoClientOptions mongoClientOptions73 = builder72.build();
        int int74 = mongoClientOptions73.getHeartbeatConnectTimeout();
        org.springframework.core.env.Environment environment75 = null;
        com.mongodb.MongoClient mongoClient76 = mongoProperties9.createMongoClient(mongoClientOptions73, environment75);
        com.mongodb.DBEncoderFactory dBEncoderFactory77 = mongoClientOptions73.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder78 = builder7.dbEncoderFactory(dBEncoderFactory77);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codecRegistry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClient50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoClient68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(socketFactory71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClientOptions73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 20000 + "'", int74 == 20000);
        org.junit.Assert.assertNotNull(mongoClient76);
        org.junit.Assert.assertNotNull(dBEncoderFactory77);
        org.junit.Assert.assertNotNull(builder78);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        int int1 = java.lang.Integer.numberOfLeadingZeros(536870990);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        int int2 = java.lang.Integer.parseInt("370", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 370 + "'", int2 == 370);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str14 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.description("73050");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        int int2 = java.lang.Integer.parseInt("1310720", 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 657069994 + "'", int2 == 657069994);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatConnectTimeout(4194304);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder6.threadsAllowedToBlockForConnectionMultiplier((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: threadsAllowedToBlockForConnectionMultiplier must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int13 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.springframework.core.env.Environment environment16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties14.createMongoClient(mongoClientOptions15, environment16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties14.builder(mongoClientOptions24);
        int int26 = mongoClientOptions24.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        java.lang.String str28 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        java.lang.String str30 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder34 = com.mongodb.MongoClientOptions.builder(mongoClientOptions24);
        boolean boolean35 = mongoClientOptions24.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        int int5 = mongoClientOptions1.getHeartbeatSocketTimeout();
        int int6 = mongoClientOptions1.getHeartbeatConnectTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry7 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertNotNull(codecRegistry7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray17 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties10.password = charArray17;
        mongoProperties10.database = "";
        boolean boolean21 = mongoProperties10.hasCustomAddress();
        java.lang.String str22 = mongoProperties10.authenticationDatabase;
        java.lang.Integer int23 = mongoProperties10.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray31 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties24.password = charArray31;
        java.lang.Class<java.lang.Integer> intClass33 = java.lang.Integer.TYPE;
        mongoProperties24.fieldNamingStrategy = intClass33;
        java.lang.String str35 = mongoProperties24.username;
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties24.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties24.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties24.builder(mongoClientOptions40);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.database;
        java.lang.String str44 = mongoProperties42.authenticationDatabase;
        java.lang.Integer int45 = mongoProperties42.port;
        java.lang.Class<java.lang.Integer> intClass46 = java.lang.Integer.TYPE;
        mongoProperties42.fieldNamingStrategy = intClass46;
        mongoProperties24.fieldNamingStrategy = intClass46;
        mongoProperties10.setFieldNamingStrategy(intClass46);
        java.lang.String str50 = mongoProperties10.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties51 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions52 = null;
        org.springframework.core.env.Environment environment53 = null;
        com.mongodb.MongoClient mongoClient54 = mongoProperties51.createMongoClient(mongoClientOptions52, environment53);
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder58 = builder55.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions61 = builder58.build();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties51.builder(mongoClientOptions61);
        int int63 = mongoClientOptions61.getLocalThreshold();
        int int64 = mongoClientOptions61.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties10.builder(mongoClientOptions61);
        com.mongodb.ReadPreference readPreference66 = mongoClientOptions61.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder67 = mongoProperties0.builder(mongoClientOptions61);
        java.lang.Class<?> wildcardClass68 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<java.lang.Integer> intClass69 = null;
        mongoProperties0.fieldNamingStrategy = intClass69;
        java.lang.String str71 = mongoProperties0.database;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(intClass46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(mongoClient54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(mongoClientOptions61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 15 + "'", int63 == 15);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(readPreference66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNull(wildcardClass68);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        mongoProperties0.setUsername("");
        java.lang.String str6 = mongoProperties0.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        org.springframework.core.env.Environment environment9 = null;
        com.mongodb.MongoClient mongoClient10 = mongoProperties7.createMongoClient(mongoClientOptions8, environment9);
        mongoProperties7.username = "test";
        mongoProperties7.setDatabase("80");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int16 = mongoProperties15.port;
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties15.builder(mongoClientOptions17);
        mongoProperties15.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray28 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties21.password = charArray28;
        java.lang.String str30 = mongoProperties21.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str32 = mongoProperties31.database;
        java.lang.String str33 = mongoProperties31.authenticationDatabase;
        java.lang.Integer int34 = mongoProperties31.port;
        java.lang.Class<java.lang.Integer> intClass35 = java.lang.Integer.TYPE;
        mongoProperties31.fieldNamingStrategy = intClass35;
        mongoProperties21.setFieldNamingStrategy(intClass35);
        mongoProperties15.fieldNamingStrategy = intClass35;
        mongoProperties7.setFieldNamingStrategy(intClass35);
        mongoProperties0.setFieldNamingStrategy(intClass35);
        char[] charArray41 = mongoProperties0.password;
        java.lang.String str42 = mongoProperties0.getUri();
        java.lang.Class<?> wildcardClass43 = mongoProperties0.fieldNamingStrategy;
        char[] charArray44 = mongoProperties0.password;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(mongoClient10);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(intClass35);
        org.junit.Assert.assertNull(charArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(charArray44);
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        java.lang.String str5 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.database = "15143b01";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions14, environment17);
        char[] charArray19 = mongoProperties0.getPassword();
        mongoProperties0.setDatabase("25600");
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.description("");
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        boolean boolean36 = mongoClientOptions35.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions35);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        int int39 = mongoClientOptions35.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        int int10 = mongoClientOptions9.getHeartbeatConnectTimeout();
        int int11 = mongoClientOptions9.getConnectionsPerHost();
        int int12 = mongoClientOptions9.getHeartbeatSocketTimeout();
        org.springframework.core.env.Environment environment13 = null;
        com.mongodb.MongoClient mongoClient14 = mongoProperties0.createMongoClient(mongoClientOptions9, environment13);
        char[] charArray15 = mongoProperties0.password;
        java.lang.String str16 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass17 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.gridFsDatabase = "11010";
        boolean boolean20 = mongoProperties0.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties21.createMongoClient(mongoClientOptions22, environment23);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties21.builder(mongoClientOptions31);
        int int33 = mongoClientOptions31.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions31);
        int int35 = mongoClientOptions31.getHeartbeatFrequency();
        int int36 = mongoClientOptions31.getLocalThreshold();
        java.lang.String str37 = mongoClientOptions31.getRequiredReplicaSetName();
        int int38 = mongoClientOptions31.getHeartbeatFrequency();
        int int39 = mongoClientOptions31.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties0.builder(mongoClientOptions31);
        boolean boolean41 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNotNull(mongoClient14);
        org.junit.Assert.assertNull(charArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10000 + "'", int35 == 10000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10000 + "'", int38 == 10000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.host = "25600";
        mongoProperties0.setAuthenticationDatabase("133fde");
        mongoProperties0.setGridFsDatabase("20000064610");
        java.lang.String str10 = mongoProperties0.getUsername();
        mongoProperties0.database = "1917396";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(52);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxConnectionIdleTime((-2147483644));
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(167772160);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.connectTimeout(20000);
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
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions6.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions6);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions6.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions6.getDbEncoderFactory();
        int int12 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions6.getConnectTimeout();
        int int14 = mongoClientOptions6.getHeartbeatConnectTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry15 = mongoClientOptions6.getCodecRegistry();
        int int16 = mongoClientOptions6.getConnectTimeout();
        int int17 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int18 = mongoClientOptions6.getServerSelectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertNotNull(codecRegistry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30000 + "'", int18 == 30000);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.maxConnectionLifeTime(1);
        com.mongodb.MongoClientOptions.Builder builder23 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder23.build();
        boolean boolean25 = mongoClientOptions24.isCursorFinalizerEnabled();
        int int26 = mongoClientOptions24.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions24.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder28 = builder18.writeConcern(writeConcern27);
        com.mongodb.MongoClientOptions.Builder builder29 = builder7.writeConcern(writeConcern27);
        com.mongodb.MongoClientOptions.Builder builder30 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList32 = mongoClientOptions31.getCommandListeners();
        javax.net.SocketFactory socketFactory33 = mongoClientOptions31.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder34 = builder29.socketFactory(socketFactory33);
        com.mongodb.MongoClientOptions.Builder builder36 = builder29.heartbeatConnectTimeout(9765625);
        com.mongodb.MongoClientOptions.Builder builder38 = builder29.maxWaitTime(838860799);
        com.mongodb.MongoClientOptions.Builder builder40 = builder29.connectTimeout(35);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20000 + "'", int26 == 20000);
        org.junit.Assert.assertNotNull(writeConcern27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(commandListenerList32);
        org.junit.Assert.assertNotNull(socketFactory33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder9 = builder0.maxConnectionIdleTime(35);
        com.mongodb.MongoClientOptions.Builder builder11 = builder0.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketTimeout(12);
        com.mongodb.event.CommandListener commandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder11 = builder9.addCommandListener(commandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.database;
        java.lang.String str5 = mongoProperties0.getUsername();
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.springframework.core.env.Environment environment10 = null;
        com.mongodb.MongoClient mongoClient11 = mongoProperties8.createMongoClient(mongoClientOptions9, environment10);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder15 = builder12.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties8.builder(mongoClientOptions18);
        int int20 = mongoClientOptions18.getLocalThreshold();
        int int21 = mongoClientOptions18.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory22 = mongoClientOptions18.getDbEncoderFactory();
        com.mongodb.ReadConcern readConcern23 = mongoClientOptions18.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder25 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        boolean boolean27 = mongoClientOptions26.isCursorFinalizerEnabled();
        int int28 = mongoClientOptions26.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern29 = mongoClientOptions26.getWriteConcern();
        com.mongodb.ReadPreference readPreference30 = mongoClientOptions26.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder31 = builder24.readPreference(readPreference30);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxWaitTime((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder37 = builder33.requiredReplicaSetName("e6");
        com.mongodb.MongoClientOptions.Builder builder39 = builder33.serverSelectionTimeout(536870990);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.serverSelectionTimeout(257949696);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory22);
        org.junit.Assert.assertNotNull(readConcern23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertNotNull(writeConcern29);
        org.junit.Assert.assertNotNull(readPreference30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        mongoProperties0.setGridFsDatabase("30000");
        mongoProperties0.authenticationDatabase = "128";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        com.mongodb.MongoClientOptions.Builder builder9 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int12 = mongoClientOptions10.getConnectionsPerHost();
        int int13 = mongoClientOptions10.getHeartbeatSocketTimeout();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int17 = mongoClientOptions10.getMinHeartbeatFrequency();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setUsername("34");
        char[] charArray18 = mongoProperties0.password;
        java.lang.String str19 = mongoProperties0.getUri();
        java.lang.Class<?> wildcardClass20 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setGridFsDatabase("78528512");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray30 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties23.password = charArray30;
        java.lang.Class<java.lang.Integer> intClass32 = java.lang.Integer.TYPE;
        mongoProperties23.fieldNamingStrategy = intClass32;
        java.lang.String str34 = mongoProperties23.username;
        java.lang.String str35 = mongoProperties23.getUsername();
        mongoProperties23.setGridFsDatabase("hi!");
        java.lang.String str38 = mongoProperties23.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray46 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties39.password = charArray46;
        java.lang.Class<java.lang.Integer> intClass48 = java.lang.Integer.TYPE;
        mongoProperties39.fieldNamingStrategy = intClass48;
        java.lang.String str50 = mongoProperties39.username;
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties39.builder(mongoClientOptions51);
        com.mongodb.MongoClientOptions mongoClientOptions53 = null;
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties39.builder(mongoClientOptions53);
        com.mongodb.MongoClientOptions mongoClientOptions55 = null;
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties39.builder(mongoClientOptions55);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties57 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str58 = mongoProperties57.database;
        java.lang.String str59 = mongoProperties57.authenticationDatabase;
        java.lang.Integer int60 = mongoProperties57.port;
        java.lang.Class<java.lang.Integer> intClass61 = java.lang.Integer.TYPE;
        mongoProperties57.fieldNamingStrategy = intClass61;
        mongoProperties39.fieldNamingStrategy = intClass61;
        mongoProperties23.fieldNamingStrategy = intClass61;
        mongoProperties0.setFieldNamingStrategy(intClass61);
        mongoProperties0.clearPassword();
        mongoProperties0.gridFsDatabase = "g9f9670";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNotNull(intClass61);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.setGridFsDatabase("gbdc852");
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder11 = builder8.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.getDescription();
        int int16 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str17 = mongoClientOptions14.getRequiredReplicaSetName();
        int int18 = mongoClientOptions14.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder(mongoClientOptions14);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList20 = mongoClientOptions14.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        int int22 = mongoClientOptions14.getConnectTimeout();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions14.getWriteConcern();
        boolean boolean24 = mongoClientOptions14.isSslInvalidHostNameAllowed();
        int int25 = mongoClientOptions14.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions14);
        char[] charArray28 = mongoProperties0.getPassword();
        mongoProperties0.port = 7;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(commandListenerList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(charArray28);
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        int int2 = java.lang.Integer.remainderUnsigned(104, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.setAuthenticationDatabase("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.database;
        java.lang.String str8 = mongoProperties6.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties6.builder(mongoClientOptions9);
        java.lang.String str11 = mongoProperties6.gridFsDatabase;
        com.mongodb.MongoClientOptions.Builder builder12 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        boolean boolean14 = mongoClientOptions13.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions13.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions13.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory17 = mongoClientOptions13.getDbEncoderFactory();
        boolean boolean18 = mongoClientOptions13.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties6.builder(mongoClientOptions13);
        org.springframework.core.env.Environment environment20 = null;
        com.mongodb.MongoClient mongoClient21 = mongoProperties0.createMongoClient(mongoClientOptions13, environment20);
        mongoProperties0.host = "23";
        java.lang.String str24 = mongoProperties0.database;
        java.lang.String str25 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(dBEncoderFactory17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        java.lang.String str14 = mongoProperties5.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.database;
        java.lang.String str17 = mongoProperties15.authenticationDatabase;
        java.lang.Integer int18 = mongoProperties15.port;
        java.lang.Class<java.lang.Integer> intClass19 = java.lang.Integer.TYPE;
        mongoProperties15.fieldNamingStrategy = intClass19;
        mongoProperties5.setFieldNamingStrategy(intClass19);
        mongoProperties0.fieldNamingStrategy = intClass19;
        java.lang.String str23 = mongoProperties0.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        org.springframework.core.env.Environment environment26 = null;
        com.mongodb.MongoClient mongoClient27 = mongoProperties24.createMongoClient(mongoClientOptions25, environment26);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder31 = builder28.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties24.builder(mongoClientOptions34);
        int int36 = mongoClientOptions34.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties0.builder(mongoClientOptions34);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder40 = builder38.connectionsPerHost((-2147483589));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectionPerHost must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(intClass19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int13 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray21 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties14.password = charArray21;
        java.lang.Class<java.lang.Integer> intClass23 = java.lang.Integer.TYPE;
        mongoProperties14.fieldNamingStrategy = intClass23;
        java.lang.String str25 = mongoProperties14.username;
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties14.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties14.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties14.builder(mongoClientOptions30);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str33 = mongoProperties32.database;
        java.lang.String str34 = mongoProperties32.authenticationDatabase;
        java.lang.Integer int35 = mongoProperties32.port;
        java.lang.Class<java.lang.Integer> intClass36 = java.lang.Integer.TYPE;
        mongoProperties32.fieldNamingStrategy = intClass36;
        mongoProperties14.fieldNamingStrategy = intClass36;
        mongoProperties0.setFieldNamingStrategy(intClass36);
        java.lang.String str40 = mongoProperties0.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions42 = null;
        org.springframework.core.env.Environment environment43 = null;
        com.mongodb.MongoClient mongoClient44 = mongoProperties41.createMongoClient(mongoClientOptions42, environment43);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder48 = builder45.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties41.builder(mongoClientOptions51);
        int int53 = mongoClientOptions51.getLocalThreshold();
        int int54 = mongoClientOptions51.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties0.builder(mongoClientOptions51);
        java.lang.String str56 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(intClass36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(mongoClient44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 15 + "'", int53 == 15);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str5 = mongoProperties0.gridFsDatabase;
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions10.getCommandListeners();
        java.lang.String str13 = mongoClientOptions10.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory14 = mongoClientOptions10.getDbEncoderFactory();
        int int15 = mongoClientOptions10.getServerSelectionTimeout();
        com.mongodb.ReadConcern readConcern16 = mongoClientOptions10.getReadConcern();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.database;
        java.lang.String str19 = mongoProperties17.authenticationDatabase;
        java.lang.Class<?> wildcardClass20 = mongoProperties17.fieldNamingStrategy;
        mongoProperties17.setPort((java.lang.Integer) 0);
        java.lang.String str23 = mongoProperties17.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int25 = mongoProperties24.port;
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties24.builder(mongoClientOptions26);
        mongoProperties24.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray37 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties30.password = charArray37;
        java.lang.String str39 = mongoProperties30.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.database;
        java.lang.String str42 = mongoProperties40.authenticationDatabase;
        java.lang.Integer int43 = mongoProperties40.port;
        java.lang.Class<java.lang.Integer> intClass44 = java.lang.Integer.TYPE;
        mongoProperties40.fieldNamingStrategy = intClass44;
        mongoProperties30.setFieldNamingStrategy(intClass44);
        mongoProperties24.fieldNamingStrategy = intClass44;
        mongoProperties17.setFieldNamingStrategy(intClass44);
        boolean boolean49 = mongoClientOptions10.equals((java.lang.Object) mongoProperties17);
        java.lang.String str50 = mongoProperties17.getUri();
        mongoProperties17.setDatabase("45155214203");
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dBEncoderFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertNotNull(readConcern16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(intClass44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "mongodb://localhost/test" + "'", str50, "mongodb://localhost/test");
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        int int1 = java.lang.Integer.reverseBytes(1941307648);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112243 + "'", int1 == 112243);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.description("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.springframework.core.env.Environment environment25 = null;
        com.mongodb.MongoClient mongoClient26 = mongoProperties23.createMongoClient(mongoClientOptions24, environment25);
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder30 = builder27.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties23.builder(mongoClientOptions33);
        com.mongodb.DBDecoderFactory dBDecoderFactory35 = mongoClientOptions33.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = builder22.dbDecoderFactory(dBDecoderFactory35);
        com.mongodb.MongoClientOptions.Builder builder37 = builder17.dbDecoderFactory(dBDecoderFactory35);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.database;
        mongoProperties38.setHost("mongodb://localhost/test");
        java.lang.String str42 = mongoProperties38.getHost();
        com.mongodb.MongoClientOptions.Builder builder43 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder43.build();
        int int45 = mongoClientOptions44.getHeartbeatConnectTimeout();
        int int46 = mongoClientOptions44.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties38.builder(mongoClientOptions44);
        javax.net.SocketFactory socketFactory48 = mongoClientOptions44.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory49 = mongoClientOptions44.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder50 = builder17.dbEncoderFactory(dBEncoderFactory49);
        com.mongodb.MongoClientOptions.Builder builder52 = builder17.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder53 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder53.build();
        int int55 = mongoClientOptions54.getHeartbeatConnectTimeout();
        int int56 = mongoClientOptions54.getConnectionsPerHost();
        int int57 = mongoClientOptions54.getLocalThreshold();
        javax.net.SocketFactory socketFactory58 = mongoClientOptions54.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder52.socketFactory(socketFactory58);
        com.mongodb.MongoClientOptions.Builder builder60 = builder8.socketFactory(socketFactory58);
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.connectTimeout(9997);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClient26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(dBDecoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "mongodb://localhost/test" + "'", str42, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(socketFactory48);
        org.junit.Assert.assertNotNull(dBEncoderFactory49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20000 + "'", int55 == 20000);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 15 + "'", int57 == 15);
        org.junit.Assert.assertNotNull(socketFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10000000000000101000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000101000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str14 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str16 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str19 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.description("");
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.description("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder32 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        boolean boolean34 = mongoClientOptions33.isCursorFinalizerEnabled();
        int int35 = mongoClientOptions33.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern36 = mongoClientOptions33.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder37 = builder31.writeConcern(writeConcern36);
        com.mongodb.MongoClientOptions.Builder builder38 = builder22.writeConcern(writeConcern36);
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.description("");
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder47 = builder41.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder51 = builder48.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder57 = builder53.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder58 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions59 = builder58.build();
        boolean boolean60 = mongoClientOptions59.isCursorFinalizerEnabled();
        int int61 = mongoClientOptions59.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern62 = mongoClientOptions59.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder63 = builder57.writeConcern(writeConcern62);
        com.mongodb.MongoClientOptions.Builder builder64 = builder47.writeConcern(writeConcern62);
        com.mongodb.MongoClientOptions.Builder builder65 = builder22.writeConcern(writeConcern62);
        boolean boolean66 = mongoClientOptions10.equals((java.lang.Object) builder65);
        javax.net.SocketFactory socketFactory67 = mongoClientOptions10.getSocketFactory();
        boolean boolean68 = mongoClientOptions10.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder69 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertNotNull(writeConcern36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoClientOptions59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20000 + "'", int61 == 20000);
        org.junit.Assert.assertNotNull(writeConcern62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(socketFactory67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.ReadPreference readPreference5 = mongoClientOptions1.getReadPreference();
        int int6 = mongoClientOptions1.getConnectTimeout();
        int int7 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(readPreference5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        mongoProperties0.host = "1200000000";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray15 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties8.password = charArray15;
        java.lang.Class<java.lang.Integer> intClass17 = java.lang.Integer.TYPE;
        mongoProperties8.fieldNamingStrategy = intClass17;
        java.lang.String str19 = mongoProperties8.username;
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties8.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions22);
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties8.builder(mongoClientOptions24);
        char[] charArray26 = mongoProperties8.password;
        mongoProperties0.password = charArray26;
        mongoProperties0.authenticationDatabase = "18";
        char[] charArray30 = mongoProperties0.password;
        int int31 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 27017 + "'", int31 == 27017);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        java.lang.String str15 = mongoProperties0.getDatabase();
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.host = "10060000";
        java.lang.Integer int19 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions20);
        mongoProperties0.host = "10100111";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray31 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties24.password = charArray31;
        java.lang.Class<java.lang.Integer> intClass33 = java.lang.Integer.TYPE;
        mongoProperties24.fieldNamingStrategy = intClass33;
        java.lang.String str35 = mongoProperties24.username;
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties24.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties24.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties24.builder(mongoClientOptions40);
        char[] charArray42 = mongoProperties24.password;
        java.lang.Integer int43 = mongoProperties24.getPort();
        java.lang.String str44 = mongoProperties24.getHost();
        java.lang.String str45 = mongoProperties24.host;
        char[] charArray46 = mongoProperties24.getPassword();
        mongoProperties0.setPassword(charArray46);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("12");
        mongoProperties0.clearPassword();
        org.springframework.core.env.Environment environment18 = null;
        int int19 = mongoProperties0.determinePort(environment18);
        org.springframework.core.env.Environment environment20 = null;
        int int21 = mongoProperties0.determinePort(environment20);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder25 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        int int29 = mongoClientOptions28.getMinHeartbeatFrequency();
        boolean boolean30 = mongoClientOptions28.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties0.builder(mongoClientOptions28);
        java.lang.String str32 = mongoProperties0.username;
        java.lang.Class<?> wildcardClass33 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 500 + "'", int29 == 500);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "12" + "'", str32, "12");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("100000000000000000", (-926897920));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -926897920 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(20648881);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20648881" + "'", str1, "20648881");
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str8 = mongoProperties0.getDatabase();
        java.lang.String str9 = mongoProperties0.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions11.getCommandListeners();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions11.getSocketFactory();
        int int14 = mongoClientOptions11.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions11);
        int int16 = mongoClientOptions11.getSocketTimeout();
        int int17 = mongoClientOptions11.getMaxWaitTime();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNotNull(socketFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 120000 + "'", int17 == 120000);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        int int2 = java.lang.Integer.divideUnsigned(215, 1250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        int int2 = java.lang.Integer.rotateRight(147521536, 23420000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 147521536 + "'", int2 == 147521536);
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        int int2 = java.lang.Integer.remainderUnsigned(123, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUsername("-1");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties6.authenticationDatabase = "12";
        boolean boolean9 = mongoProperties6.hasCustomAddress();
        java.lang.String str10 = mongoProperties6.getMongoClientDatabase();
        int int11 = mongoProperties6.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties6.host;
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder13.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMinHeartbeatFrequency();
        int int21 = mongoClientOptions19.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.ReadConcern readConcern22 = mongoClientOptions19.getReadConcern();
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties6.createMongoClient(mongoClientOptions19, environment23);
        int int25 = mongoClientOptions19.getLocalThreshold();
        int int26 = mongoClientOptions19.getHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions19.getWriteConcern();
        int int28 = mongoClientOptions19.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(readConcern22);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertNotNull(writeConcern27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean13 = mongoProperties0.hasCustomAddress();
        mongoProperties0.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.authenticationDatabase;
        boolean boolean17 = mongoProperties15.hasCustomAddress();
        java.lang.String str18 = mongoProperties15.username;
        mongoProperties15.username = "test";
        java.lang.Class<?> wildcardClass21 = mongoProperties15.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray29 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties22.password = charArray29;
        java.lang.Class<java.lang.Integer> intClass31 = java.lang.Integer.TYPE;
        mongoProperties22.fieldNamingStrategy = intClass31;
        java.lang.String str33 = mongoProperties22.username;
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties22.builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties22.builder(mongoClientOptions36);
        boolean boolean38 = mongoProperties22.hasCustomCredentials();
        java.lang.String str39 = mongoProperties22.gridFsDatabase;
        char[] charArray40 = mongoProperties22.password;
        mongoProperties15.setPassword(charArray40);
        mongoProperties0.password = charArray40;
        boolean boolean43 = mongoProperties0.hasCustomCredentials();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions45 = null;
        org.springframework.core.env.Environment environment46 = null;
        com.mongodb.MongoClient mongoClient47 = mongoProperties44.createMongoClient(mongoClientOptions45, environment46);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder51 = builder48.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder51.build();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties44.builder(mongoClientOptions54);
        int int56 = mongoClientOptions54.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions54);
        int int58 = mongoClientOptions54.getHeartbeatFrequency();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str60 = mongoProperties59.database;
        java.lang.String str61 = mongoProperties59.authenticationDatabase;
        java.lang.String str62 = mongoProperties59.getMongoClientDatabase();
        java.lang.String str63 = mongoProperties59.database;
        java.lang.String str64 = mongoProperties59.getDatabase();
        boolean boolean65 = mongoClientOptions54.equals((java.lang.Object) mongoProperties59);
        int int66 = mongoClientOptions54.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern67 = mongoClientOptions54.getWriteConcern();
        boolean boolean68 = mongoClientOptions54.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder69 = mongoProperties0.builder(mongoClientOptions54);
        java.lang.String str70 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setPort((java.lang.Integer) 109051);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(mongoClient47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10000 + "'", int58 == 10000);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "test" + "'", str62, "test");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(writeConcern67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "test" + "'", str70, "test");
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minHeartbeatFrequency(52);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder17 = builder14.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder24 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder24.build();
        boolean boolean26 = mongoClientOptions25.isCursorFinalizerEnabled();
        int int27 = mongoClientOptions25.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern28 = mongoClientOptions25.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder29 = builder19.writeConcern(writeConcern28);
        com.mongodb.MongoClientOptions.Builder builder30 = builder11.writeConcern(writeConcern28);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime(52);
        com.mongodb.MongoClientOptions.Builder builder33 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder33.build();
        int int35 = mongoClientOptions34.getHeartbeatConnectTimeout();
        int int36 = mongoClientOptions34.getMaxConnectionIdleTime();
        int int37 = mongoClientOptions34.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions34);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int40 = mongoProperties39.port;
        mongoProperties39.setUri("hi!");
        char[] charArray43 = mongoProperties39.getPassword();
        com.mongodb.MongoClientOptions.Builder builder44 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder44.build();
        boolean boolean46 = mongoClientOptions45.isCursorFinalizerEnabled();
        int int47 = mongoClientOptions45.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern48 = mongoClientOptions45.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties39.builder(mongoClientOptions45);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions51 = null;
        org.springframework.core.env.Environment environment52 = null;
        com.mongodb.MongoClient mongoClient53 = mongoProperties50.createMongoClient(mongoClientOptions51, environment52);
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder57 = builder54.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder57.build();
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties50.builder(mongoClientOptions60);
        int int62 = mongoClientOptions60.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder63 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions60);
        int int64 = mongoClientOptions60.getHeartbeatFrequency();
        int int65 = mongoClientOptions60.getLocalThreshold();
        com.mongodb.ReadPreference readPreference66 = mongoClientOptions60.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder67 = builder49.readPreference(readPreference66);
        com.mongodb.MongoClientOptions.Builder builder68 = builder38.readPreference(readPreference66);
        com.mongodb.MongoClientOptions.Builder builder69 = builder32.readPreference(readPreference66);
        com.mongodb.MongoClientOptions.Builder builder71 = builder32.sslInvalidHostNameAllowed(false);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertNotNull(writeConcern28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20000 + "'", int47 == 20000);
        org.junit.Assert.assertNotNull(writeConcern48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClient53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10000 + "'", int64 == 10000);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 15 + "'", int65 == 15);
        org.junit.Assert.assertNotNull(readPreference66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setDatabase("34");
        java.lang.String str10 = mongoProperties0.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        int int13 = mongoClientOptions12.getHeartbeatConnectTimeout();
        int int14 = mongoClientOptions12.getMaxConnectionIdleTime();
        int int15 = mongoClientOptions12.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties0.builder(mongoClientOptions12);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "34" + "'", str10, "34");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties17.createMongoClient(mongoClientOptions18, environment19);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder21.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties17.builder(mongoClientOptions27);
        int int29 = mongoClientOptions27.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        boolean boolean32 = mongoClientOptions27.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray17 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties10.password = charArray17;
        mongoProperties10.database = "";
        boolean boolean21 = mongoProperties10.hasCustomAddress();
        java.lang.String str22 = mongoProperties10.authenticationDatabase;
        java.lang.Integer int23 = mongoProperties10.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray31 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties24.password = charArray31;
        java.lang.Class<java.lang.Integer> intClass33 = java.lang.Integer.TYPE;
        mongoProperties24.fieldNamingStrategy = intClass33;
        java.lang.String str35 = mongoProperties24.username;
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties24.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties24.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties24.builder(mongoClientOptions40);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.database;
        java.lang.String str44 = mongoProperties42.authenticationDatabase;
        java.lang.Integer int45 = mongoProperties42.port;
        java.lang.Class<java.lang.Integer> intClass46 = java.lang.Integer.TYPE;
        mongoProperties42.fieldNamingStrategy = intClass46;
        mongoProperties24.fieldNamingStrategy = intClass46;
        mongoProperties10.setFieldNamingStrategy(intClass46);
        java.lang.String str50 = mongoProperties10.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties51 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions52 = null;
        org.springframework.core.env.Environment environment53 = null;
        com.mongodb.MongoClient mongoClient54 = mongoProperties51.createMongoClient(mongoClientOptions52, environment53);
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder58 = builder55.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions61 = builder58.build();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties51.builder(mongoClientOptions61);
        int int63 = mongoClientOptions61.getLocalThreshold();
        int int64 = mongoClientOptions61.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties10.builder(mongoClientOptions61);
        com.mongodb.ReadPreference readPreference66 = mongoClientOptions61.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder67 = mongoProperties0.builder(mongoClientOptions61);
        char[] charArray68 = mongoProperties0.password;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(intClass46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(mongoClient54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(mongoClientOptions61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 15 + "'", int63 == 15);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(readPreference66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.description("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.springframework.core.env.Environment environment16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties14.createMongoClient(mongoClientOptions15, environment16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties14.builder(mongoClientOptions24);
        com.mongodb.DBDecoderFactory dBDecoderFactory26 = mongoClientOptions24.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder27 = builder13.dbDecoderFactory(dBDecoderFactory26);
        com.mongodb.MongoClientOptions.Builder builder28 = builder8.dbDecoderFactory(dBDecoderFactory26);
        com.mongodb.MongoClientOptions.Builder builder30 = builder8.maxConnectionLifeTime(1610612736);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.serverSelectionTimeout(838860805);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(dBDecoderFactory26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        boolean boolean12 = mongoClientOptions11.isCursorFinalizerEnabled();
        int int13 = mongoClientOptions11.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern14 = mongoClientOptions11.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.writeConcern(writeConcern14);
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.connectionsPerHost(31);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.requiredReplicaSetName("1000000000000000000000");
        com.mongodb.event.CommandListener commandListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder22 = builder20.addCommandListener(commandListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(writeConcern14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder2.build();
        boolean boolean8 = mongoClientOptions7.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder9 = com.mongodb.MongoClientOptions.builder(mongoClientOptions7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        mongoProperties0.setHost("141");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray15 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties8.password = charArray15;
        java.lang.Class<java.lang.Integer> intClass17 = java.lang.Integer.TYPE;
        mongoProperties8.fieldNamingStrategy = intClass17;
        java.lang.String str19 = mongoProperties8.username;
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties8.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions22);
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties8.builder(mongoClientOptions24);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.database;
        java.lang.String str28 = mongoProperties26.authenticationDatabase;
        java.lang.Integer int29 = mongoProperties26.port;
        java.lang.Class<java.lang.Integer> intClass30 = java.lang.Integer.TYPE;
        mongoProperties26.fieldNamingStrategy = intClass30;
        mongoProperties8.fieldNamingStrategy = intClass30;
        mongoProperties0.setFieldNamingStrategy(intClass30);
        mongoProperties0.authenticationDatabase = "167";
        java.lang.String str36 = mongoProperties0.getHost();
        java.lang.String str37 = mongoProperties0.database;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(intClass30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "141" + "'", str36, "141");
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.description("");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder14.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions25);
        int int28 = mongoClientOptions25.getMinHeartbeatFrequency();
        int int29 = mongoClientOptions25.getMinHeartbeatFrequency();
        int int30 = mongoClientOptions25.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 500 + "'", int28 == 500);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 500 + "'", int29 == 500);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.maxConnectionLifeTime(1);
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        boolean boolean17 = mongoClientOptions16.isCursorFinalizerEnabled();
        int int18 = mongoClientOptions16.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions16.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder20 = builder10.writeConcern(writeConcern19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.serverSelectionTimeout(110100);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        boolean boolean24 = mongoClientOptions23.isAlwaysUseMBeans();
        boolean boolean25 = mongoClientOptions23.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertNotNull(writeConcern19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions16);
        char[] charArray18 = mongoProperties0.password;
        mongoProperties0.authenticationDatabase = "0";
        java.lang.String str21 = mongoProperties0.authenticationDatabase;
        java.lang.String str22 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str24 = mongoProperties23.database;
        java.lang.String str25 = mongoProperties23.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int27 = mongoProperties26.port;
        mongoProperties26.setUri("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray37 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties30.password = charArray37;
        mongoProperties26.password = charArray37;
        mongoProperties23.password = charArray37;
        mongoProperties0.password = charArray37;
        java.lang.String str42 = mongoProperties0.getUri();
        mongoProperties0.setPort((java.lang.Integer) (-536870913));
        java.lang.Class<?> wildcardClass45 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setAuthenticationDatabase("838860800");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mongodb://localhost/test" + "'", str25, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "mongodb://localhost/test" + "'", str42, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean14 = mongoClientOptions13.isSocketKeepAlive();
        boolean boolean15 = mongoClientOptions13.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions13.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        java.lang.String str2 = java.lang.Integer.toString(49, (-129));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "49" + "'", str2, "49");
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        int int2 = java.lang.Integer.sum((-1543503872), 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1543503841) + "'", int2 == (-1543503841));
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions6.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions6.getCommandListeners();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions6.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        int int2 = java.lang.Integer.min(47200, 345);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 345 + "'", int2 == 345);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1011000, 575360412);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1011000" + "'", str2, "1011000");
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        java.lang.Integer int1 = java.lang.Integer.getInteger("35610734");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties17.createMongoClient(mongoClientOptions18, environment19);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder21.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties17.builder(mongoClientOptions27);
        int int29 = mongoClientOptions27.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        int int32 = mongoClientOptions27.getMaxConnectionIdleTime();
        int int33 = mongoClientOptions27.getMaxWaitTime();
        com.mongodb.ReadConcern readConcern34 = mongoClientOptions27.getReadConcern();
        org.bson.codecs.configuration.CodecRegistry codecRegistry35 = mongoClientOptions27.getCodecRegistry();
        com.mongodb.DBEncoderFactory dBEncoderFactory36 = mongoClientOptions27.getDbEncoderFactory();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 120000 + "'", int33 == 120000);
        org.junit.Assert.assertNotNull(readConcern34);
        org.junit.Assert.assertNotNull(codecRegistry35);
        org.junit.Assert.assertNotNull(dBEncoderFactory36);
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.Class<?> wildcardClass16 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setUsername("35");
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder22 = builder19.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        java.lang.String str26 = mongoClientOptions25.getDescription();
        int int27 = mongoClientOptions25.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str28 = mongoClientOptions25.getRequiredReplicaSetName();
        int int29 = mongoClientOptions25.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder30 = com.mongodb.MongoClientOptions.builder(mongoClientOptions25);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList31 = mongoClientOptions25.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        java.lang.String str33 = mongoClientOptions25.getDescription();
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties0.builder(mongoClientOptions25);
        boolean boolean36 = mongoClientOptions25.isCursorFinalizerEnabled();
        int int37 = mongoClientOptions25.getMaxWaitTime();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(commandListenerList31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 120000 + "'", int37 == 120000);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.setAuthenticationDatabase("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.database;
        java.lang.String str8 = mongoProperties6.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties6.builder(mongoClientOptions9);
        java.lang.String str11 = mongoProperties6.gridFsDatabase;
        com.mongodb.MongoClientOptions.Builder builder12 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        boolean boolean14 = mongoClientOptions13.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions13.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions13.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory17 = mongoClientOptions13.getDbEncoderFactory();
        boolean boolean18 = mongoClientOptions13.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties6.builder(mongoClientOptions13);
        org.springframework.core.env.Environment environment20 = null;
        com.mongodb.MongoClient mongoClient21 = mongoProperties0.createMongoClient(mongoClientOptions13, environment20);
        mongoProperties0.host = "23";
        java.lang.String str24 = mongoProperties0.database;
        com.mongodb.MongoClientOptions.Builder builder25 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        int int27 = mongoClientOptions26.getHeartbeatConnectTimeout();
        int int28 = mongoClientOptions26.getMaxConnectionIdleTime();
        boolean boolean29 = mongoClientOptions26.isAlwaysUseMBeans();
        boolean boolean30 = mongoClientOptions26.isSslInvalidHostNameAllowed();
        org.springframework.core.env.Environment environment31 = null;
        com.mongodb.MongoClient mongoClient32 = mongoProperties0.createMongoClient(mongoClientOptions26, environment31);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(dBEncoderFactory17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mongoClient32);
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        int int2 = java.lang.Integer.max(2, 50000001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50000001 + "'", int2 == 50000001);
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions14, environment17);
        char[] charArray19 = mongoProperties0.getPassword();
        mongoProperties0.setDatabase("25600");
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.description("");
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        boolean boolean36 = mongoClientOptions35.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions35);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        boolean boolean39 = mongoClientOptions35.isSocketKeepAlive();
        int int40 = mongoClientOptions35.getHeartbeatSocketTimeout();
        int int41 = mongoClientOptions35.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        boolean boolean43 = mongoClientOptions35.isSslInvalidHostNameAllowed();
        int int44 = mongoClientOptions35.getHeartbeatFrequency();
        int int45 = mongoClientOptions35.getHeartbeatSocketTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory46 = mongoClientOptions35.getDbDecoderFactory();
        int int47 = mongoClientOptions35.getConnectTimeout();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 500 + "'", int41 == 500);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10000 + "'", int44 == 10000);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(dBDecoderFactory46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10000 + "'", int47 == 10000);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setUsername("34");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.springframework.core.env.Environment environment20 = null;
        com.mongodb.MongoClient mongoClient21 = mongoProperties18.createMongoClient(mongoClientOptions19, environment20);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder25 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties18.builder(mongoClientOptions28);
        com.mongodb.DBDecoderFactory dBDecoderFactory30 = mongoClientOptions28.getDbDecoderFactory();
        int int31 = mongoClientOptions28.getSocketTimeout();
        int int32 = mongoClientOptions28.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions28);
        mongoProperties0.gridFsDatabase = "200";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray43 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties36.password = charArray43;
        java.lang.Class<java.lang.Integer> intClass45 = java.lang.Integer.TYPE;
        mongoProperties36.fieldNamingStrategy = intClass45;
        mongoProperties0.fieldNamingStrategy = intClass45;
        int int48 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str49 = mongoProperties0.gridFsDatabase;
        mongoProperties0.authenticationDatabase = "11010";
        mongoProperties0.setUri("12l0kc8");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 27017 + "'", int48 == 27017);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "200" + "'", str49, "200");
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        boolean boolean4 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setPort((java.lang.Integer) 8);
        boolean boolean7 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        java.lang.Integer int5 = mongoProperties0.port;
        mongoProperties0.setDatabase("141");
        java.lang.String str8 = mongoProperties0.getUsername();
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.host = "";
        java.lang.String str12 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97" + "'", str8, "97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "141" + "'", str9, "141");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "141" + "'", str12, "141");
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder14 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getHeartbeatConnectTimeout();
        int int17 = mongoClientOptions15.getConnectionsPerHost();
        int int18 = mongoClientOptions15.getLocalThreshold();
        int int19 = mongoClientOptions15.getHeartbeatFrequency();
        int int20 = mongoClientOptions15.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatSocketTimeout((-2013265901));
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        int int1 = java.lang.Integer.lowestOneBit((-1543503872));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.springframework.core.env.Environment environment16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties14.createMongoClient(mongoClientOptions15, environment16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties14.builder(mongoClientOptions24);
        int int26 = mongoClientOptions24.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        java.lang.String str28 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        java.lang.String str30 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        boolean boolean32 = mongoClientOptions24.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder33 = com.mongodb.MongoClientOptions.builder(mongoClientOptions24);
        org.springframework.core.env.Environment environment34 = null;
        com.mongodb.MongoClient mongoClient35 = mongoProperties0.createMongoClient(mongoClientOptions24, environment34);
        boolean boolean36 = mongoClientOptions24.isAlwaysUseMBeans();
        boolean boolean37 = mongoClientOptions24.isAlwaysUseMBeans();
        int int38 = mongoClientOptions24.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        int int40 = mongoClientOptions24.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10000 + "'", int40 == 10000);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        java.lang.Class<?> wildcardClass3 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray4 = mongoProperties0.password;
        mongoProperties0.gridFsDatabase = "7";
        mongoProperties0.uri = "71954";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        boolean boolean4 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setPort((java.lang.Integer) 8);
        org.springframework.core.env.Environment environment7 = null;
        int int8 = mongoProperties0.determinePort(environment7);
        mongoProperties0.setUri("10001000000000000000111001011");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.authenticationDatabase;
        boolean boolean13 = mongoProperties11.hasCustomAddress();
        java.lang.String str14 = mongoProperties11.username;
        int int15 = mongoProperties11.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.database;
        java.lang.String str18 = mongoProperties16.authenticationDatabase;
        java.lang.Class<?> wildcardClass19 = mongoProperties16.fieldNamingStrategy;
        mongoProperties16.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties16.builder(mongoClientOptions22);
        java.lang.Class<java.lang.Integer> intClass24 = java.lang.Integer.TYPE;
        mongoProperties16.setFieldNamingStrategy(intClass24);
        mongoProperties11.setFieldNamingStrategy(intClass24);
        java.lang.Integer int27 = mongoProperties11.getPort();
        org.springframework.core.env.Environment environment28 = null;
        int int29 = mongoProperties11.determinePort(environment28);
        mongoProperties11.gridFsDatabase = "15";
        mongoProperties11.authenticationDatabase = "10060000";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray41 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties34.password = charArray41;
        java.lang.String str43 = mongoProperties34.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.database;
        java.lang.String str46 = mongoProperties44.authenticationDatabase;
        java.lang.Integer int47 = mongoProperties44.port;
        java.lang.Class<java.lang.Integer> intClass48 = java.lang.Integer.TYPE;
        mongoProperties44.fieldNamingStrategy = intClass48;
        mongoProperties34.setFieldNamingStrategy(intClass48);
        mongoProperties11.setFieldNamingStrategy(intClass48);
        mongoProperties0.fieldNamingStrategy = intClass48;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(intClass24);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 27017 + "'", int29 == 27017);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNotNull(intClass48);
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        int int1 = java.lang.Integer.lowestOneBit((-2004221696));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUsername("-1");
        java.lang.String str6 = mongoProperties0.getDatabase();
        java.lang.String str7 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.description("");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder14.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.maxConnectionLifeTime(1);
        boolean boolean27 = mongoClientOptions9.equals((java.lang.Object) 1);
        int int28 = mongoClientOptions9.getMaxConnectionIdleTime();
        int int29 = mongoClientOptions9.getMaxWaitTime();
        int int30 = mongoClientOptions9.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties0.builder(mongoClientOptions9);
        boolean boolean32 = mongoClientOptions9.isCursorFinalizerEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 120000 + "'", int29 == 120000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        int int2 = java.lang.Integer.compareUnsigned(46137344, 3840000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.username = "test";
        mongoProperties0.setDatabase("200");
        char[] charArray8 = mongoProperties0.getPassword();
        java.lang.String str9 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10110000000100010101000101000011");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10110000000100010101000101000011\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder3.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.getDescription();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        int int12 = mongoClientOptions9.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions9);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int15 = mongoProperties14.port;
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties14.builder(mongoClientOptions16);
        mongoProperties14.port = 1;
        java.lang.String str20 = mongoProperties14.getMongoClientDatabase();
        java.lang.String str21 = mongoProperties14.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.springframework.core.env.Environment environment24 = null;
        com.mongodb.MongoClient mongoClient25 = mongoProperties22.createMongoClient(mongoClientOptions23, environment24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder29 = builder26.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties22.builder(mongoClientOptions32);
        int int34 = mongoClientOptions32.getLocalThreshold();
        int int35 = mongoClientOptions32.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.DBDecoderFactory dBDecoderFactory38 = mongoClientOptions32.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties14.builder(mongoClientOptions32);
        int int40 = mongoClientOptions32.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties0.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 500 + "'", int12 == 500);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "test" + "'", str20, "test");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions6.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions6);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions6.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions6.getDbEncoderFactory();
        int int12 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions6.getConnectTimeout();
        int int14 = mongoClientOptions6.getHeartbeatConnectTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry15 = mongoClientOptions6.getCodecRegistry();
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions6.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertNotNull(codecRegistry15);
        org.junit.Assert.assertNotNull(readPreference16);
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.minConnectionsPerHost(141);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.minConnectionsPerHost(9765625);
        com.mongodb.MongoClientOptions.Builder builder24 = builder18.maxConnectionLifeTime(1015);
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
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder17 = builder14.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder18 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList20 = mongoClientOptions19.getCommandListeners();
        javax.net.SocketFactory socketFactory21 = mongoClientOptions19.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder14.socketFactory(socketFactory21);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.localThreshold(83886080);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.description("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder33 = builder27.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.serverSelectionTimeout(500);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.heartbeatConnectTimeout((int) (short) -1);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray45 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties38.password = charArray45;
        java.lang.Class<java.lang.Integer> intClass47 = java.lang.Integer.TYPE;
        mongoProperties38.fieldNamingStrategy = intClass47;
        java.lang.String str49 = mongoProperties38.username;
        com.mongodb.MongoClientOptions mongoClientOptions50 = null;
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties38.builder(mongoClientOptions50);
        com.mongodb.MongoClientOptions mongoClientOptions52 = null;
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties38.builder(mongoClientOptions52);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.socketKeepAlive(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties58 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str59 = mongoProperties58.database;
        mongoProperties58.setHost("mongodb://localhost/test");
        java.lang.String str62 = mongoProperties58.getHost();
        com.mongodb.MongoClientOptions.Builder builder63 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions64 = builder63.build();
        int int65 = mongoClientOptions64.getHeartbeatConnectTimeout();
        int int66 = mongoClientOptions64.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder67 = mongoProperties58.builder(mongoClientOptions64);
        javax.net.SocketFactory socketFactory68 = mongoClientOptions64.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder69 = builder57.socketFactory(socketFactory68);
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.connectionsPerHost(15);
        com.mongodb.MongoClientOptions.Builder builder72 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions73 = builder72.build();
        boolean boolean74 = mongoClientOptions73.isCursorFinalizerEnabled();
        int int75 = mongoClientOptions73.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern76 = mongoClientOptions73.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory77 = mongoClientOptions73.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder78 = builder69.dbEncoderFactory(dBEncoderFactory77);
        com.mongodb.MongoClientOptions.Builder builder79 = builder35.dbEncoderFactory(dBEncoderFactory77);
        com.mongodb.MongoClientOptions.Builder builder81 = builder79.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder83 = builder81.maxConnectionIdleTime(1200000123);
        com.mongodb.MongoClientOptions.Builder builder84 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions85 = builder84.build();
        boolean boolean86 = mongoClientOptions85.isCursorFinalizerEnabled();
        int int87 = mongoClientOptions85.getHeartbeatConnectTimeout();
        int int88 = mongoClientOptions85.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference89 = mongoClientOptions85.getReadPreference();
        int int90 = mongoClientOptions85.getHeartbeatFrequency();
        int int91 = mongoClientOptions85.getServerSelectionTimeout();
        com.mongodb.MongoClientOptions.Builder builder92 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions85);
        javax.net.SocketFactory socketFactory93 = mongoClientOptions85.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder94 = builder83.socketFactory(socketFactory93);
        com.mongodb.MongoClientOptions.Builder builder95 = builder22.socketFactory(socketFactory93);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(commandListenerList20);
        org.junit.Assert.assertNotNull(socketFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "mongodb://localhost/test" + "'", str62, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(mongoClientOptions64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 20000 + "'", int65 == 20000);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(socketFactory68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClientOptions73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 20000 + "'", int75 == 20000);
        org.junit.Assert.assertNotNull(writeConcern76);
        org.junit.Assert.assertNotNull(dBEncoderFactory77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(mongoClientOptions85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 20000 + "'", int87 == 20000);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(readPreference89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10000 + "'", int90 == 10000);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 30000 + "'", int91 == 30000);
        org.junit.Assert.assertNotNull(socketFactory93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder95);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        boolean boolean16 = mongoProperties0.hasCustomCredentials();
        java.lang.String str17 = mongoProperties0.gridFsDatabase;
        char[] charArray18 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int20 = mongoProperties19.port;
        mongoProperties19.setUri("hi!");
        char[] charArray23 = mongoProperties19.getPassword();
        com.mongodb.MongoClientOptions.Builder builder24 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder24.build();
        boolean boolean26 = mongoClientOptions25.isCursorFinalizerEnabled();
        int int27 = mongoClientOptions25.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern28 = mongoClientOptions25.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties19.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int33 = mongoProperties32.port;
        mongoProperties32.setAuthenticationDatabase("");
        java.lang.Integer int36 = mongoProperties32.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray44 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties37.password = charArray44;
        mongoProperties32.setPassword(charArray44);
        mongoProperties32.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties49 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions50 = null;
        org.springframework.core.env.Environment environment51 = null;
        com.mongodb.MongoClient mongoClient52 = mongoProperties49.createMongoClient(mongoClientOptions50, environment51);
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder56 = builder53.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions59 = builder56.build();
        com.mongodb.MongoClientOptions.Builder builder60 = mongoProperties49.builder(mongoClientOptions59);
        int int61 = mongoClientOptions59.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties32.builder(mongoClientOptions59);
        int int63 = mongoClientOptions59.getConnectionsPerHost();
        int int64 = mongoClientOptions59.getMaxConnectionIdleTime();
        int int65 = mongoClientOptions59.getHeartbeatFrequency();
        int int66 = mongoClientOptions59.getSocketTimeout();
        boolean boolean67 = mongoClientOptions59.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder68 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions59);
        boolean boolean69 = mongoClientOptions25.equals((java.lang.Object) builder68);
        int int70 = mongoClientOptions25.getServerSelectionTimeout();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertNotNull(writeConcern28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoClientOptions59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 30000 + "'", int70 == 30000);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.authenticationDatabase = "2000000000";
        mongoProperties0.setUsername("11010");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.port = 100;
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.database;
        java.lang.String str12 = mongoProperties10.authenticationDatabase;
        java.lang.Class<?> wildcardClass13 = mongoProperties10.fieldNamingStrategy;
        mongoProperties10.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties10.builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties10.builder(mongoClientOptions18);
        java.lang.String str20 = mongoProperties10.username;
        com.mongodb.MongoClientOptions.Builder builder21 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        int int23 = mongoClientOptions22.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties10.builder(mongoClientOptions22);
        boolean boolean25 = mongoClientOptions22.isCursorFinalizerEnabled();
        boolean boolean26 = mongoClientOptions22.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions22);
        mongoProperties0.setHost("3020");
        mongoProperties0.setPort((java.lang.Integer) (-994836476));
        java.lang.String str32 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 500 + "'", int23 == 500);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions16);
        char[] charArray18 = mongoProperties0.password;
        java.lang.Integer int19 = mongoProperties0.getPort();
        java.lang.String str20 = mongoProperties0.getHost();
        java.lang.String str21 = mongoProperties0.username;
        mongoProperties0.database = "10c944";
        java.lang.String str24 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass25 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.springframework.core.env.Environment environment28 = null;
        com.mongodb.MongoClient mongoClient29 = mongoProperties26.createMongoClient(mongoClientOptions27, environment28);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder33 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties26.builder(mongoClientOptions36);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList38 = mongoClientOptions36.getCommandListeners();
        java.lang.String str39 = mongoClientOptions36.getRequiredReplicaSetName();
        int int40 = mongoClientOptions36.getThreadsAllowedToBlockForConnectionMultiplier();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList41 = mongoClientOptions36.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties0.builder(mongoClientOptions36);
        java.lang.String str44 = mongoProperties0.getUsername();
        mongoProperties0.setUsername("13959168");
        java.lang.Class<?> wildcardClass47 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10c944" + "'", str24, "10c944");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(mongoClient29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandListenerList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(commandListenerList41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatConnectTimeout(16);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.serverSelectionTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder17 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.connectionsPerHost(525);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionLifeTime(25);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        org.springframework.core.env.Environment environment27 = null;
        com.mongodb.MongoClient mongoClient28 = mongoProperties25.createMongoClient(mongoClientOptions26, environment27);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder32 = builder29.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties25.builder(mongoClientOptions35);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList37 = mongoClientOptions35.getCommandListeners();
        java.lang.String str38 = mongoClientOptions35.getRequiredReplicaSetName();
        int int39 = mongoClientOptions35.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.ReadPreference readPreference40 = mongoClientOptions35.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder41 = builder22.readPreference(readPreference40);
        com.mongodb.MongoClientOptions.Builder builder42 = builder8.readPreference(readPreference40);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.sslInvalidHostNameAllowed(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(commandListenerList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertNotNull(readPreference40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        int int1 = java.lang.Integer.parseInt("202");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 202 + "'", int1 == 202);
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList3 = mongoClientOptions1.getCommandListeners();
        boolean boolean4 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int7 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(commandListenerList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.database;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str5 = mongoProperties4.database;
        java.lang.String str6 = mongoProperties4.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int8 = mongoProperties7.port;
        mongoProperties7.setUri("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray18 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties11.password = charArray18;
        mongoProperties7.password = charArray18;
        mongoProperties4.password = charArray18;
        mongoProperties0.password = charArray18;
        java.lang.String str23 = mongoProperties0.getUsername();
        boolean boolean24 = mongoProperties0.hasCustomCredentials();
        java.lang.String str25 = mongoProperties0.getGridFsDatabase();
        char[] charArray26 = mongoProperties0.password;
        mongoProperties0.host = "6744695";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.clearPassword();
        java.lang.Class<?> wildcardClass3 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions10.getCommandListeners();
        int int13 = mongoClientOptions10.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.ReadConcern readConcern15 = mongoClientOptions10.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder17.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        java.lang.String str24 = mongoClientOptions23.getDescription();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        int int26 = mongoClientOptions23.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder27 = com.mongodb.MongoClientOptions.builder(mongoClientOptions23);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        org.springframework.core.env.Environment environment30 = null;
        com.mongodb.MongoClient mongoClient31 = mongoProperties28.createMongoClient(mongoClientOptions29, environment30);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder35 = builder32.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties28.builder(mongoClientOptions38);
        int int40 = mongoClientOptions38.getLocalThreshold();
        int int41 = mongoClientOptions38.getMaxConnectionIdleTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry42 = mongoClientOptions38.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder43 = builder27.codecRegistry(codecRegistry42);
        com.mongodb.MongoClientOptions.Builder builder44 = builder16.codecRegistry(codecRegistry42);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder16.build();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(readConcern15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 500 + "'", int26 == 500);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClient31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(codecRegistry42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        java.lang.String str1 = java.lang.Integer.toOctalString(8388657);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "40000061" + "'", str1, "40000061");
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatConnectTimeout((int) (byte) -1);
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        boolean boolean12 = mongoClientOptions11.isCursorFinalizerEnabled();
        int int13 = mongoClientOptions11.getHeartbeatConnectTimeout();
        boolean boolean14 = mongoClientOptions11.isSslEnabled();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions11.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.writeConcern(writeConcern15);
        com.mongodb.MongoClientOptions.Builder builder18 = builder9.connectTimeout(1862391011);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatSocketTimeout(78545072);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(writeConcern15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder17 = builder14.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatFrequency(736557408);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.socketKeepAlive(false);
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
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.Class<?> wildcardClass16 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setUsername("35");
        java.lang.String str19 = mongoProperties0.database;
        java.lang.String str20 = mongoProperties0.host;
        mongoProperties0.setUsername("-2147483648");
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder26 = builder23.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.heartbeatSocketTimeout(8);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        int int30 = mongoClientOptions29.getHeartbeatSocketTimeout();
        int int31 = mongoClientOptions29.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions29);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 120000 + "'", int31 == 120000);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder4 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder4.build();
        int int6 = mongoClientOptions5.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions5.getConnectionsPerHost();
        int int8 = mongoClientOptions5.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str10 = mongoProperties0.database;
        mongoProperties0.setPort((java.lang.Integer) 83886080);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        java.lang.Integer int5 = mongoProperties0.port;
        mongoProperties0.setDatabase("141");
        java.lang.String str8 = mongoProperties0.getUsername();
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str10 = mongoProperties0.getUri();
        mongoProperties0.host = "61a800";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.springframework.core.env.Environment environment15 = null;
        com.mongodb.MongoClient mongoClient16 = mongoProperties13.createMongoClient(mongoClientOptions14, environment15);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder17.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties13.builder(mongoClientOptions23);
        int int25 = mongoClientOptions23.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        java.lang.String str27 = mongoClientOptions23.getDescription();
        int int28 = mongoClientOptions23.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        java.lang.String str30 = mongoProperties0.host;
        java.lang.String str31 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97" + "'", str8, "97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "141" + "'", str9, "141");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "61a800" + "'", str30, "61a800");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(40000, 295043073);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40000" + "'", str2, "40000");
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(73138176, 112243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "73138176" + "'", str2, "73138176");
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        int int2 = java.lang.Integer.compare(8000000, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("22930800");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.connectionsPerHost(1090519040);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("11011100000000000000000000000001");
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.threadsAllowedToBlockForConnectionMultiplier(60);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setAuthenticationDatabase("2147510664");
        java.lang.String str7 = mongoProperties0.getUri();
        java.lang.String str8 = mongoProperties0.getHost();
        java.lang.String str9 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2147510664" + "'", str9, "2147510664");
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList2 = mongoClientOptions1.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.connectTimeout(24);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minHeartbeatFrequency(80);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.description("");
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.heartbeatConnectTimeout(83886080);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.springframework.core.env.Environment environment28 = null;
        com.mongodb.MongoClient mongoClient29 = mongoProperties26.createMongoClient(mongoClientOptions27, environment28);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder33 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties26.builder(mongoClientOptions36);
        com.mongodb.DBDecoderFactory dBDecoderFactory38 = mongoClientOptions36.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder39 = builder25.dbDecoderFactory(dBDecoderFactory38);
        com.mongodb.MongoClientOptions.Builder builder40 = builder16.dbDecoderFactory(dBDecoderFactory38);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.heartbeatConnectTimeout(34);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions44 = null;
        org.springframework.core.env.Environment environment45 = null;
        com.mongodb.MongoClient mongoClient46 = mongoProperties43.createMongoClient(mongoClientOptions44, environment45);
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder50 = builder47.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder50.build();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties43.builder(mongoClientOptions53);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList55 = mongoClientOptions53.getCommandListeners();
        java.lang.String str56 = mongoClientOptions53.getRequiredReplicaSetName();
        java.lang.String str57 = mongoClientOptions53.getDescription();
        int int58 = mongoClientOptions53.getConnectTimeout();
        com.mongodb.WriteConcern writeConcern59 = mongoClientOptions53.getWriteConcern();
        int int60 = mongoClientOptions53.getSocketTimeout();
        com.mongodb.ReadConcern readConcern61 = mongoClientOptions53.getReadConcern();
        com.mongodb.WriteConcern writeConcern62 = mongoClientOptions53.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder63 = builder42.writeConcern(writeConcern62);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.description("");
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder70 = builder66.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder72 = builder66.connectionsPerHost((int) ' ');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties73 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str74 = mongoProperties73.database;
        mongoProperties73.setHost("mongodb://localhost/test");
        java.lang.String str77 = mongoProperties73.getUri();
        int int78 = mongoProperties73.getDEFAULT_PORT();
        java.lang.String str79 = mongoProperties73.gridFsDatabase;
        java.lang.String str80 = mongoProperties73.getUri();
        com.mongodb.MongoClientOptions.Builder builder81 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions82 = builder81.build();
        com.mongodb.MongoClientOptions.Builder builder83 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions82);
        com.mongodb.MongoClientOptions.Builder builder84 = mongoProperties73.builder(mongoClientOptions82);
        com.mongodb.MongoClientOptions.Builder builder85 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions82);
        boolean boolean86 = mongoClientOptions82.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder87 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions82);
        org.bson.codecs.configuration.CodecRegistry codecRegistry88 = mongoClientOptions82.getCodecRegistry();
        int int89 = mongoClientOptions82.getMinHeartbeatFrequency();
        org.bson.codecs.configuration.CodecRegistry codecRegistry90 = mongoClientOptions82.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder91 = builder72.codecRegistry(codecRegistry90);
        com.mongodb.MongoClientOptions.Builder builder92 = builder63.codecRegistry(codecRegistry90);
        com.mongodb.MongoClientOptions.Builder builder93 = builder9.codecRegistry(codecRegistry90);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(commandListenerList2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClient29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(dBDecoderFactory38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClient46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(commandListenerList55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10000 + "'", int58 == 10000);
        org.junit.Assert.assertNotNull(writeConcern59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(readConcern61);
        org.junit.Assert.assertNotNull(writeConcern62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "mongodb://localhost/test" + "'", str77, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 27017 + "'", int78 == 27017);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "mongodb://localhost/test" + "'", str80, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoClientOptions82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(codecRegistry88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 500 + "'", int89 == 500);
        org.junit.Assert.assertNotNull(codecRegistry90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions14.getHeartbeatConnectTimeout();
        boolean boolean17 = mongoClientOptions14.isSslEnabled();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions14, environment18);
        com.mongodb.MongoClientOptions.Builder builder20 = com.mongodb.MongoClientOptions.builder(mongoClientOptions14);
        int int21 = mongoClientOptions14.getConnectTimeout();
        boolean boolean22 = mongoClientOptions14.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        char[] charArray4 = mongoProperties0.getPassword();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.database = "2147483652";
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        mongoProperties0.database = "10000000000000";
        org.springframework.core.env.Environment environment11 = null;
        int int12 = mongoProperties0.determinePort(environment11);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.DBDecoderFactory dBDecoderFactory12 = mongoClientOptions10.getDbDecoderFactory();
        java.lang.String str13 = mongoClientOptions10.getDescription();
        int int14 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionIdleTime(1250000582);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.host;
        java.lang.String str6 = mongoProperties0.username;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setUsername("31000000");
        java.lang.String str10 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        java.lang.String str15 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties16.createMongoClient(mongoClientOptions17, environment18);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder23 = builder20.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties16.builder(mongoClientOptions26);
        com.mongodb.DBDecoderFactory dBDecoderFactory28 = mongoClientOptions26.getDbDecoderFactory();
        java.lang.String str29 = mongoClientOptions26.getDescription();
        int int30 = mongoClientOptions26.getSocketTimeout();
        int int31 = mongoClientOptions26.getSocketTimeout();
        int int32 = mongoClientOptions26.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.socketTimeout(32768);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.description("10010000000000000000000000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(dBDecoderFactory28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 500 + "'", int32 == 500);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.Integer int4 = mongoProperties0.getPort();
        mongoProperties0.gridFsDatabase = "hi!";
        java.lang.String str7 = mongoProperties0.getDatabase();
        int int8 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setAuthenticationDatabase("7280");
        java.lang.String str11 = mongoProperties0.getHost();
        boolean boolean12 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions9);
        java.lang.String str12 = mongoProperties0.getDatabase();
        mongoProperties0.gridFsDatabase = "de000000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        int int2 = java.lang.Integer.remainderUnsigned(27016, 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2440 + "'", int2 == 2440);
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        int int7 = mongoClientOptions6.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions6.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions6);
        java.lang.String str10 = mongoProperties0.database;
        java.lang.Integer int11 = mongoProperties0.port;
        mongoProperties0.setUsername("-528443136");
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        boolean boolean8 = mongoClientOptions6.isSocketKeepAlive();
        int int9 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions6.getDbEncoderFactory();
        int int11 = mongoClientOptions6.getMaxConnectionIdleTime();
        java.lang.String str12 = mongoClientOptions6.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getLocalThreshold();
        int int13 = mongoClientOptions10.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory14 = mongoClientOptions10.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder16 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        com.mongodb.ReadConcern readConcern17 = mongoClientOptions10.getReadConcern();
        boolean boolean18 = mongoClientOptions10.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int20 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.DBEncoderFactory dBEncoderFactory21 = mongoClientOptions10.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(readConcern17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(dBEncoderFactory21);
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        org.springframework.core.env.Environment environment7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties5.createMongoClient(mongoClientOptions6, environment7);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties5.builder(mongoClientOptions15);
        int int17 = mongoClientOptions15.getLocalThreshold();
        int int18 = mongoClientOptions15.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions15);
        java.lang.String str20 = mongoClientOptions15.getRequiredReplicaSetName();
        boolean boolean21 = mongoClientOptions15.isSslInvalidHostNameAllowed();
        int int22 = mongoClientOptions15.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions15.getWriteConcern();
        java.lang.String str24 = mongoClientOptions15.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.clearPassword();
        mongoProperties0.setUsername("924209280");
        mongoProperties0.setDatabase("111010100110000");
        mongoProperties0.setGridFsDatabase("20648881");
        mongoProperties0.setAuthenticationDatabase("111000000011001100100000000");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setUsername("34");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        org.springframework.core.env.Environment environment20 = null;
        com.mongodb.MongoClient mongoClient21 = mongoProperties18.createMongoClient(mongoClientOptions19, environment20);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder25 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties18.builder(mongoClientOptions28);
        com.mongodb.DBDecoderFactory dBDecoderFactory30 = mongoClientOptions28.getDbDecoderFactory();
        int int31 = mongoClientOptions28.getSocketTimeout();
        int int32 = mongoClientOptions28.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
        int int36 = mongoClientOptions28.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10000 + "'", int36 == 10000);
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder4 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder4.build();
        int int6 = mongoClientOptions5.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions5.getConnectionsPerHost();
        int int8 = mongoClientOptions5.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions5);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier(5120000);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.serverSelectionTimeout(50000000);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.serverSelectionTimeout(2000000000);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatConnectTimeout(33564532);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.sslInvalidHostNameAllowed(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.WriteConcern writeConcern7 = mongoClientOptions1.getWriteConcern();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions1.getSocketFactory();
        com.mongodb.ReadConcern readConcern9 = mongoClientOptions1.getReadConcern();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(writeConcern7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(readConcern9);
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder4 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder4.build();
        int int6 = mongoClientOptions5.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions5.getConnectionsPerHost();
        int int8 = mongoClientOptions5.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str10 = mongoProperties0.getUri();
        java.lang.Integer int11 = mongoProperties0.getPort();
        int int12 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        int int10 = mongoClientOptions9.getHeartbeatConnectTimeout();
        int int11 = mongoClientOptions9.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry12 = mongoClientOptions9.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties0.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("35");
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        boolean boolean18 = mongoClientOptions17.isSslEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(codecRegistry12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        boolean boolean13 = mongoClientOptions10.isCursorFinalizerEnabled();
        com.mongodb.WriteConcern writeConcern14 = mongoClientOptions10.getWriteConcern();
        int int15 = mongoClientOptions10.getServerSelectionTimeout();
        int int16 = mongoClientOptions10.getServerSelectionTimeout();
        boolean boolean17 = mongoClientOptions10.isSslEnabled();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(writeConcern14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30000 + "'", int16 == 30000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.serverSelectionTimeout((-2147456632));
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.connectionsPerHost(536870912);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.threadsAllowedToBlockForConnectionMultiplier(120);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        int int1 = java.lang.Integer.signum((-2021225087));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("12");
        mongoProperties0.setHost("5");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.springframework.core.env.Environment environment21 = null;
        com.mongodb.MongoClient mongoClient22 = mongoProperties19.createMongoClient(mongoClientOptions20, environment21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder26 = builder23.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties19.builder(mongoClientOptions29);
        int int31 = mongoClientOptions29.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions29);
        java.lang.String str33 = mongoClientOptions29.getDescription();
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions29);
        java.lang.String str35 = mongoClientOptions29.getDescription();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions29);
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions29);
        boolean boolean38 = mongoClientOptions29.isSslInvalidHostNameAllowed();
        int int39 = mongoClientOptions29.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mongoClient22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10000 + "'", int39 == 10000);
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        boolean boolean12 = mongoClientOptions10.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions10.getSocketFactory();
        boolean boolean14 = mongoClientOptions10.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(socketFactory13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        java.lang.Integer int15 = mongoProperties0.port;
        java.lang.Integer int16 = mongoProperties0.port;
        java.lang.String str17 = mongoProperties0.getUri();
        char[] charArray18 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int20 = mongoProperties19.port;
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties19.builder(mongoClientOptions21);
        mongoProperties19.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray32 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties25.password = charArray32;
        java.lang.String str34 = mongoProperties25.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str36 = mongoProperties35.database;
        java.lang.String str37 = mongoProperties35.authenticationDatabase;
        java.lang.Integer int38 = mongoProperties35.port;
        java.lang.Class<java.lang.Integer> intClass39 = java.lang.Integer.TYPE;
        mongoProperties35.fieldNamingStrategy = intClass39;
        mongoProperties25.setFieldNamingStrategy(intClass39);
        mongoProperties19.fieldNamingStrategy = intClass39;
        mongoProperties0.setFieldNamingStrategy(intClass39);
        java.lang.String str44 = mongoProperties0.getHost();
        mongoProperties0.setDatabase("215");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(intClass39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1100100" + "'", str44, "1100100");
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("12");
        mongoProperties0.clearPassword();
        org.springframework.core.env.Environment environment18 = null;
        int int19 = mongoProperties0.determinePort(environment18);
        org.springframework.core.env.Environment environment20 = null;
        int int21 = mongoProperties0.determinePort(environment20);
        java.lang.String str22 = mongoProperties0.authenticationDatabase;
        java.lang.String str23 = mongoProperties0.username;
        org.springframework.core.env.Environment environment24 = null;
        int int25 = mongoProperties0.determinePort(environment24);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.springframework.core.env.Environment environment28 = null;
        com.mongodb.MongoClient mongoClient29 = mongoProperties26.createMongoClient(mongoClientOptions27, environment28);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder33 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties26.builder(mongoClientOptions36);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList38 = mongoClientOptions36.getCommandListeners();
        int int39 = mongoClientOptions36.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList40 = mongoClientOptions36.getCommandListeners();
        boolean boolean41 = mongoClientOptions36.isSocketKeepAlive();
        int int42 = mongoClientOptions36.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties0.builder(mongoClientOptions36);
        int int45 = mongoClientOptions36.getHeartbeatConnectTimeout();
        int int46 = mongoClientOptions36.getServerSelectionTimeout();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList47 = mongoClientOptions36.getCommandListeners();
        int int48 = mongoClientOptions36.getMaxConnectionLifeTime();
        java.lang.Object obj49 = null;
        boolean boolean50 = mongoClientOptions36.equals(obj49);
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions36);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12" + "'", str23, "12");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 27017 + "'", int25 == 27017);
        org.junit.Assert.assertNotNull(mongoClient29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandListenerList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(commandListenerList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 30000 + "'", int46 == 30000);
        org.junit.Assert.assertNotNull(commandListenerList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str14 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime(5120000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties21.createMongoClient(mongoClientOptions22, environment23);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties21.builder(mongoClientOptions31);
        int int33 = mongoClientOptions31.getLocalThreshold();
        int int34 = mongoClientOptions31.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory35 = mongoClientOptions31.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions31);
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions31.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder38 = builder18.readPreference(readPreference37);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory35);
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        java.lang.String str17 = mongoClientOptions16.getDescription();
        int int18 = mongoClientOptions16.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str19 = mongoClientOptions16.getRequiredReplicaSetName();
        int int20 = mongoClientOptions16.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern21 = mongoClientOptions16.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder22 = builder5.readConcern(readConcern21);
        com.mongodb.MongoClientOptions.Builder builder24 = builder5.localThreshold(111110100);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(17459436);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.requiredReplicaSetName("2616570500");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
        org.junit.Assert.assertNotNull(readConcern21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        int int10 = mongoClientOptions9.getHeartbeatConnectTimeout();
        int int11 = mongoClientOptions9.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry12 = mongoClientOptions9.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties0.builder(mongoClientOptions9);
        mongoProperties0.setUsername("10");
        char[] charArray17 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int19 = mongoProperties18.port;
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties18.builder(mongoClientOptions20);
        mongoProperties18.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray31 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties24.password = charArray31;
        java.lang.String str33 = mongoProperties24.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str35 = mongoProperties34.database;
        java.lang.String str36 = mongoProperties34.authenticationDatabase;
        java.lang.Integer int37 = mongoProperties34.port;
        java.lang.Class<java.lang.Integer> intClass38 = java.lang.Integer.TYPE;
        mongoProperties34.fieldNamingStrategy = intClass38;
        mongoProperties24.setFieldNamingStrategy(intClass38);
        mongoProperties18.fieldNamingStrategy = intClass38;
        mongoProperties0.setFieldNamingStrategy(intClass38);
        int int43 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Class<?> wildcardClass44 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(codecRegistry12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNotNull(intClass38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 27017 + "'", int43 == 27017);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setDatabase("34");
        mongoProperties0.uri = "35";
        java.lang.String str12 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str13 = mongoProperties0.getDatabase();
        java.lang.String str14 = mongoProperties0.getUri();
        java.lang.String str15 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.gridFsDatabase = "45201371";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "34" + "'", str13, "34");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35" + "'", str14, "35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "34" + "'", str15, "34");
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray18 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties11.password = charArray18;
        java.lang.String str20 = mongoProperties11.database;
        java.lang.String str21 = mongoProperties11.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.springframework.core.env.Environment environment24 = null;
        com.mongodb.MongoClient mongoClient25 = mongoProperties22.createMongoClient(mongoClientOptions23, environment24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder29 = builder26.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties22.builder(mongoClientOptions32);
        int int34 = mongoClientOptions32.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        java.lang.String str36 = mongoClientOptions32.getDescription();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        org.springframework.core.env.Environment environment38 = null;
        com.mongodb.MongoClient mongoClient39 = mongoProperties11.createMongoClient(mongoClientOptions32, environment38);
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties0.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder40.build();
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList44 = mongoClientOptions41.getCommandListeners();
        int int45 = mongoClientOptions41.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder50 = builder47.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder52 = builder47.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder54 = builder47.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder56 = builder47.maxConnectionIdleTime(35);
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.sslInvalidHostNameAllowed(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str60 = mongoProperties59.database;
        mongoProperties59.setHost("mongodb://localhost/test");
        java.lang.String str63 = mongoProperties59.getHost();
        com.mongodb.MongoClientOptions.Builder builder64 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions65 = builder64.build();
        int int66 = mongoClientOptions65.getHeartbeatConnectTimeout();
        int int67 = mongoClientOptions65.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder68 = mongoProperties59.builder(mongoClientOptions65);
        javax.net.SocketFactory socketFactory69 = mongoClientOptions65.getSocketFactory();
        java.lang.String str70 = mongoClientOptions65.getDescription();
        int int71 = mongoClientOptions65.getSocketTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry72 = mongoClientOptions65.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder73 = builder56.codecRegistry(codecRegistry72);
        com.mongodb.MongoClientOptions.Builder builder74 = builder46.codecRegistry(codecRegistry72);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertNotNull(commandListenerList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10000 + "'", int45 == 10000);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "mongodb://localhost/test" + "'", str63, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoClientOptions65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 20000 + "'", int66 == 20000);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(socketFactory69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(codecRegistry72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions16);
        char[] charArray18 = mongoProperties0.password;
        java.lang.Integer int19 = mongoProperties0.getPort();
        java.lang.String str20 = mongoProperties0.getHost();
        java.lang.String str21 = mongoProperties0.username;
        mongoProperties0.database = "10c944";
        java.lang.String str24 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass25 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int27 = mongoProperties26.port;
        mongoProperties26.setAuthenticationDatabase("");
        java.lang.Integer int30 = mongoProperties26.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray38 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties31.password = charArray38;
        mongoProperties26.setPassword(charArray38);
        mongoProperties26.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions44 = null;
        org.springframework.core.env.Environment environment45 = null;
        com.mongodb.MongoClient mongoClient46 = mongoProperties43.createMongoClient(mongoClientOptions44, environment45);
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder50 = builder47.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder50.build();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties43.builder(mongoClientOptions53);
        int int55 = mongoClientOptions53.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties26.builder(mongoClientOptions53);
        int int57 = mongoClientOptions53.getConnectionsPerHost();
        int int58 = mongoClientOptions53.getMaxConnectionIdleTime();
        int int59 = mongoClientOptions53.getHeartbeatFrequency();
        int int60 = mongoClientOptions53.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties0.builder(mongoClientOptions53);
        mongoProperties0.setAuthenticationDatabase("1100100");
        int int64 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str65 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10c944" + "'", str24, "10c944");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10000 + "'", int59 == 10000);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 27017 + "'", int64 == 27017);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.database;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str5 = mongoProperties4.database;
        java.lang.String str6 = mongoProperties4.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int8 = mongoProperties7.port;
        mongoProperties7.setUri("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray18 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties11.password = charArray18;
        mongoProperties7.password = charArray18;
        mongoProperties4.password = charArray18;
        mongoProperties0.password = charArray18;
        java.lang.String str23 = mongoProperties0.getUsername();
        boolean boolean24 = mongoProperties0.hasCustomCredentials();
        java.lang.String str25 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.port = 1090519040;
        int int28 = mongoProperties0.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray36 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties29.password = charArray36;
        java.lang.Class<java.lang.Integer> intClass38 = java.lang.Integer.TYPE;
        mongoProperties29.fieldNamingStrategy = intClass38;
        java.lang.String str40 = mongoProperties29.username;
        java.lang.String str41 = mongoProperties29.getUsername();
        mongoProperties29.setHost("1100100");
        mongoProperties29.setDatabase("100");
        java.lang.String str46 = mongoProperties29.database;
        mongoProperties29.setUri("-536870913");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties49 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions50 = null;
        org.springframework.core.env.Environment environment51 = null;
        com.mongodb.MongoClient mongoClient52 = mongoProperties49.createMongoClient(mongoClientOptions50, environment51);
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder56 = builder53.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions59 = builder56.build();
        com.mongodb.MongoClientOptions.Builder builder60 = mongoProperties49.builder(mongoClientOptions59);
        int int61 = mongoClientOptions59.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList62 = mongoClientOptions59.getCommandListeners();
        int int63 = mongoClientOptions59.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions59);
        org.springframework.core.env.Environment environment65 = null;
        com.mongodb.MongoClient mongoClient66 = mongoProperties29.createMongoClient(mongoClientOptions59, environment65);
        char[] charArray67 = mongoProperties29.password;
        mongoProperties0.setPassword(charArray67);
        mongoProperties0.setAuthenticationDatabase("1e");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 27017 + "'", int28 == 27017);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "100" + "'", str46, "100");
        org.junit.Assert.assertNotNull(mongoClient52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoClientOptions59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 15 + "'", int61 == 15);
        org.junit.Assert.assertNotNull(commandListenerList62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 15 + "'", int63 == 15);
        org.junit.Assert.assertNotNull(mongoClient66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[\000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("64611", 808884974);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 808884974 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        int int10 = mongoClientOptions9.getHeartbeatConnectTimeout();
        int int11 = mongoClientOptions9.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry12 = mongoClientOptions9.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties0.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder16 = builder15.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.description("");
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.description("test");
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder31 = builder23.heartbeatSocketTimeout(268435456);
        com.mongodb.MongoClientOptions.Builder builder32 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        int int34 = mongoClientOptions33.getHeartbeatConnectTimeout();
        int int35 = mongoClientOptions33.getMaxConnectionIdleTime();
        int int36 = mongoClientOptions33.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions33);
        int int38 = mongoClientOptions33.getMinConnectionsPerHost();
        int int39 = mongoClientOptions33.getLocalThreshold();
        javax.net.SocketFactory socketFactory40 = mongoClientOptions33.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = builder23.socketFactory(socketFactory40);
        com.mongodb.MongoClientOptions.Builder builder42 = builder16.socketFactory(socketFactory40);
        com.mongodb.MongoClientOptions.Builder builder44 = builder16.sslInvalidHostNameAllowed(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(codecRegistry12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertNotNull(socketFactory40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions14, environment17);
        char[] charArray19 = mongoProperties0.getPassword();
        mongoProperties0.setDatabase("25600");
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.description("");
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        boolean boolean36 = mongoClientOptions35.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions35);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        boolean boolean39 = mongoClientOptions35.isSocketKeepAlive();
        int int40 = mongoClientOptions35.getHeartbeatSocketTimeout();
        int int41 = mongoClientOptions35.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        boolean boolean43 = mongoClientOptions35.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder44 = com.mongodb.MongoClientOptions.builder(mongoClientOptions35);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 500 + "'", int41 == 500);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMinHeartbeatFrequency();
        boolean boolean8 = mongoClientOptions6.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference9 = mongoClientOptions6.getReadPreference();
        com.mongodb.ReadConcern readConcern10 = mongoClientOptions6.getReadConcern();
        int int11 = mongoClientOptions6.getMaxConnectionLifeTime();
        boolean boolean12 = mongoClientOptions6.isSslEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(readPreference9);
        org.junit.Assert.assertNotNull(readConcern10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setUsername("34");
        mongoProperties0.setPort((java.lang.Integer) 120000);
        org.springframework.core.env.Environment environment20 = null;
        int int21 = mongoProperties0.determinePort(environment20);
        mongoProperties0.uri = "hi!";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        org.springframework.core.env.Environment environment26 = null;
        com.mongodb.MongoClient mongoClient27 = mongoProperties24.createMongoClient(mongoClientOptions25, environment26);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder31 = builder28.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties24.builder(mongoClientOptions34);
        int int36 = mongoClientOptions34.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions34);
        int int38 = mongoClientOptions34.getHeartbeatConnectTimeout();
        int int39 = mongoClientOptions34.getServerSelectionTimeout();
        int int40 = mongoClientOptions34.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties0.builder(mongoClientOptions34);
        mongoProperties0.port = 10100;
        java.lang.String str44 = mongoProperties0.getHost();
        java.lang.String str45 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120000 + "'", int21 == 120000);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 30000 + "'", int39 == 30000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10000 + "'", int40 == 10000);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        java.lang.String str10 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.springframework.core.env.Environment environment13 = null;
        com.mongodb.MongoClient mongoClient14 = mongoProperties11.createMongoClient(mongoClientOptions12, environment13);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder15.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties11.builder(mongoClientOptions21);
        int int23 = mongoClientOptions21.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        java.lang.String str25 = mongoClientOptions21.getDescription();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        org.springframework.core.env.Environment environment27 = null;
        com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions21, environment27);
        int int29 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str30 = mongoProperties0.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        org.springframework.core.env.Environment environment33 = null;
        com.mongodb.MongoClient mongoClient34 = mongoProperties31.createMongoClient(mongoClientOptions32, environment33);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder38 = builder35.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties31.builder(mongoClientOptions41);
        com.mongodb.DBDecoderFactory dBDecoderFactory43 = mongoClientOptions41.getDbDecoderFactory();
        int int44 = mongoClientOptions41.getSocketTimeout();
        int int45 = mongoClientOptions41.getMinHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern46 = mongoClientOptions41.getReadConcern();
        boolean boolean47 = mongoClientOptions41.isCursorFinalizerEnabled();
        org.springframework.core.env.Environment environment48 = null;
        com.mongodb.MongoClient mongoClient49 = mongoProperties0.createMongoClient(mongoClientOptions41, environment48);
        java.lang.String str50 = mongoProperties0.host;
        mongoProperties0.setAuthenticationDatabase("11010011110000000010100011001101");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(mongoClient14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 27017 + "'", int29 == 27017);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(dBDecoderFactory43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 500 + "'", int45 == 500);
        org.junit.Assert.assertNotNull(readConcern46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(mongoClient49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        int int2 = java.lang.Integer.sum(0, (-167772160));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-167772160) + "'", int2 == (-167772160));
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.database;
        java.lang.String str12 = mongoProperties10.authenticationDatabase;
        java.lang.Integer int13 = mongoProperties10.port;
        java.lang.Class<java.lang.Integer> intClass14 = java.lang.Integer.TYPE;
        mongoProperties10.fieldNamingStrategy = intClass14;
        mongoProperties0.setFieldNamingStrategy(intClass14);
        mongoProperties0.setUri("a");
        java.lang.String str19 = mongoProperties0.host;
        char[] charArray20 = mongoProperties0.password;
        boolean boolean21 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setDatabase("134217728");
        java.lang.Integer int24 = mongoProperties0.getPort();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(intClass14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties17.createMongoClient(mongoClientOptions18, environment19);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder21.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties17.builder(mongoClientOptions27);
        int int29 = mongoClientOptions27.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern32 = mongoClientOptions27.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions27);
        com.mongodb.DBEncoderFactory dBEncoderFactory34 = mongoClientOptions27.getDbEncoderFactory();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(writeConcern32);
        org.junit.Assert.assertNotNull(dBEncoderFactory34);
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxWaitTime((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxWaitTime(1114112);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.database = "128";
        java.lang.Integer int6 = mongoProperties0.port;
        char[] charArray7 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.authenticationDatabase;
        boolean boolean10 = mongoProperties8.hasCustomAddress();
        java.lang.String str11 = mongoProperties8.username;
        mongoProperties8.username = "test";
        java.lang.Class<?> wildcardClass14 = mongoProperties8.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray22 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties15.password = charArray22;
        java.lang.Class<java.lang.Integer> intClass24 = java.lang.Integer.TYPE;
        mongoProperties15.fieldNamingStrategy = intClass24;
        java.lang.String str26 = mongoProperties15.username;
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties15.builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties15.builder(mongoClientOptions29);
        boolean boolean31 = mongoProperties15.hasCustomCredentials();
        java.lang.String str32 = mongoProperties15.gridFsDatabase;
        char[] charArray33 = mongoProperties15.password;
        mongoProperties8.setPassword(charArray33);
        char[] charArray35 = mongoProperties8.password;
        mongoProperties0.password = charArray35;
        mongoProperties0.port = 167;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.springframework.core.env.Environment environment16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties14.createMongoClient(mongoClientOptions15, environment16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties14.builder(mongoClientOptions24);
        int int26 = mongoClientOptions24.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        java.lang.String str28 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        java.lang.String str30 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        boolean boolean32 = mongoClientOptions24.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder33 = com.mongodb.MongoClientOptions.builder(mongoClientOptions24);
        org.springframework.core.env.Environment environment34 = null;
        com.mongodb.MongoClient mongoClient35 = mongoProperties0.createMongoClient(mongoClientOptions24, environment34);
        boolean boolean36 = mongoClientOptions24.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        boolean boolean38 = mongoClientOptions24.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder39 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder39.build();
        boolean boolean41 = mongoClientOptions40.isCursorFinalizerEnabled();
        int int42 = mongoClientOptions40.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern43 = mongoClientOptions40.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList44 = mongoClientOptions40.getCommandListeners();
        org.bson.codecs.configuration.CodecRegistry codecRegistry45 = mongoClientOptions40.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions40);
        int int47 = mongoClientOptions40.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions40);
        int int49 = mongoClientOptions40.getMinHeartbeatFrequency();
        boolean boolean50 = mongoClientOptions24.equals((java.lang.Object) mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(writeConcern43);
        org.junit.Assert.assertNotNull(commandListenerList44);
        org.junit.Assert.assertNotNull(codecRegistry45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 500 + "'", int49 == 500);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        int int1 = java.lang.Integer.lowestOneBit(37748736);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4194304 + "'", int1 == 4194304);
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int14 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int15 = mongoClientOptions10.getServerSelectionTimeout();
        int int16 = mongoClientOptions10.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder23 = builder20.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        java.lang.String str27 = mongoClientOptions26.getDescription();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions26);
        int int29 = mongoClientOptions26.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder30 = com.mongodb.MongoClientOptions.builder(mongoClientOptions26);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        org.springframework.core.env.Environment environment33 = null;
        com.mongodb.MongoClient mongoClient34 = mongoProperties31.createMongoClient(mongoClientOptions32, environment33);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder38 = builder35.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties31.builder(mongoClientOptions41);
        int int43 = mongoClientOptions41.getLocalThreshold();
        int int44 = mongoClientOptions41.getMaxConnectionIdleTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry45 = mongoClientOptions41.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder46 = builder30.codecRegistry(codecRegistry45);
        com.mongodb.MongoClientOptions.Builder builder47 = builder17.codecRegistry(codecRegistry45);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 500 + "'", int29 == 500);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(codecRegistry45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUsername();
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.uri = "";
        char[] charArray5 = mongoProperties0.password;
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        mongoProperties0.setPort((java.lang.Integer) 120);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray17 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties10.password = charArray17;
        java.lang.Class<java.lang.Integer> intClass19 = java.lang.Integer.TYPE;
        mongoProperties10.fieldNamingStrategy = intClass19;
        java.lang.String str21 = mongoProperties10.username;
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties10.builder(mongoClientOptions22);
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties10.builder(mongoClientOptions24);
        mongoProperties10.setUsername("34");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        org.springframework.core.env.Environment environment30 = null;
        com.mongodb.MongoClient mongoClient31 = mongoProperties28.createMongoClient(mongoClientOptions29, environment30);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder35 = builder32.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties28.builder(mongoClientOptions38);
        com.mongodb.DBDecoderFactory dBDecoderFactory40 = mongoClientOptions38.getDbDecoderFactory();
        int int41 = mongoClientOptions38.getSocketTimeout();
        int int42 = mongoClientOptions38.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties10.builder(mongoClientOptions38);
        int int44 = mongoClientOptions38.getLocalThreshold();
        int int45 = mongoClientOptions38.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions38);
        com.mongodb.ReadConcern readConcern47 = mongoClientOptions38.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties0.builder(mongoClientOptions38);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClient31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(dBDecoderFactory40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15 + "'", int42 == 15);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
        org.junit.Assert.assertNotNull(readConcern47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.minHeartbeatFrequency(25600);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.connectionsPerHost(5120000);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatConnectTimeout((-1985650167));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.serverSelectionTimeout((-2147456632));
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionIdleTime(123);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.alwaysUseMBeans(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        int int1 = java.lang.Integer.lowestOneBit(2011850240);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.serverSelectionTimeout(580061184);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency(3);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketTimeout(536871000);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatConnectTimeout(71954);
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
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str14 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str16 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatSocketTimeout(5120000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties21.createMongoClient(mongoClientOptions22, environment23);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties21.builder(mongoClientOptions31);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList33 = mongoClientOptions31.getCommandListeners();
        java.lang.String str34 = mongoClientOptions31.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory35 = mongoClientOptions31.getDbEncoderFactory();
        com.mongodb.WriteConcern writeConcern36 = mongoClientOptions31.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder37 = builder20.writeConcern(writeConcern36);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(commandListenerList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dBEncoderFactory35);
        org.junit.Assert.assertNotNull(writeConcern36);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        int int2 = java.lang.Integer.divideUnsigned(370, (-2133055320));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("3221418552");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 3221418552");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minHeartbeatFrequency(2147483647);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.description("10");
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.maxWaitTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(736557408);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder10.localThreshold((-566291712));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: localThreshold must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        int int1 = java.lang.Integer.reverse(54546204);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 955384512 + "'", int1 == 955384512);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setUsername("5");
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.uri = "1";
        java.lang.Class<java.lang.Integer> intClass8 = null;
        mongoProperties0.setFieldNamingStrategy(intClass8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        java.lang.String str2 = java.lang.Integer.toString((-469527843), 147521588);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-469527843" + "'", str2, "-469527843");
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        int int4 = mongoProperties0.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.database;
        java.lang.String str7 = mongoProperties5.authenticationDatabase;
        java.lang.Class<?> wildcardClass8 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties5.builder(mongoClientOptions11);
        java.lang.Class<java.lang.Integer> intClass13 = java.lang.Integer.TYPE;
        mongoProperties5.setFieldNamingStrategy(intClass13);
        mongoProperties0.setFieldNamingStrategy(intClass13);
        java.lang.Integer int16 = mongoProperties0.getPort();
        org.springframework.core.env.Environment environment17 = null;
        int int18 = mongoProperties0.determinePort(environment17);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray26 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties19.password = charArray26;
        java.lang.Class<java.lang.Integer> intClass28 = java.lang.Integer.TYPE;
        mongoProperties19.fieldNamingStrategy = intClass28;
        java.lang.String str30 = mongoProperties19.username;
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties19.builder(mongoClientOptions31);
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties19.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties19.builder(mongoClientOptions35);
        char[] charArray37 = mongoProperties19.password;
        java.lang.Integer int38 = mongoProperties19.getPort();
        java.lang.String str39 = mongoProperties19.getHost();
        java.lang.String str40 = mongoProperties19.username;
        java.lang.String str41 = mongoProperties19.getDatabase();
        org.springframework.core.env.Environment environment42 = null;
        int int43 = mongoProperties19.determinePort(environment42);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray51 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties44.password = charArray51;
        java.lang.Class<java.lang.Integer> intClass53 = java.lang.Integer.TYPE;
        mongoProperties44.fieldNamingStrategy = intClass53;
        java.lang.String str55 = mongoProperties44.username;
        com.mongodb.MongoClientOptions mongoClientOptions56 = null;
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties44.builder(mongoClientOptions56);
        com.mongodb.MongoClientOptions mongoClientOptions58 = null;
        com.mongodb.MongoClientOptions.Builder builder59 = mongoProperties44.builder(mongoClientOptions58);
        com.mongodb.MongoClientOptions mongoClientOptions60 = null;
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties44.builder(mongoClientOptions60);
        char[] charArray62 = mongoProperties44.password;
        mongoProperties19.setPassword(charArray62);
        mongoProperties0.password = charArray62;
        java.lang.Integer int65 = mongoProperties0.port;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(intClass13);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 27017 + "'", int43 == 27017);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int65);
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        java.lang.String str17 = mongoClientOptions16.getDescription();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions16);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.springframework.core.env.Environment environment21 = null;
        com.mongodb.MongoClient mongoClient22 = mongoProperties19.createMongoClient(mongoClientOptions20, environment21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder26 = builder23.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties19.builder(mongoClientOptions29);
        int int31 = mongoClientOptions29.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList32 = mongoClientOptions29.getCommandListeners();
        int int33 = mongoClientOptions29.getLocalThreshold();
        int int34 = mongoClientOptions29.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties0.builder(mongoClientOptions29);
        org.springframework.core.env.Environment environment36 = null;
        int int37 = mongoProperties0.determinePort(environment36);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.database;
        mongoProperties38.setHost("mongodb://localhost/test");
        java.lang.String str42 = mongoProperties38.getHost();
        com.mongodb.MongoClientOptions.Builder builder43 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder43.build();
        int int45 = mongoClientOptions44.getHeartbeatConnectTimeout();
        int int46 = mongoClientOptions44.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties38.builder(mongoClientOptions44);
        javax.net.SocketFactory socketFactory48 = mongoClientOptions44.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory49 = mongoClientOptions44.getDbEncoderFactory();
        int int50 = mongoClientOptions44.getMinHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference51 = mongoClientOptions44.getReadPreference();
        int int52 = mongoClientOptions44.getConnectionsPerHost();
        java.lang.String str53 = mongoClientOptions44.getDescription();
        int int54 = mongoClientOptions44.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment55 = null;
        com.mongodb.MongoClient mongoClient56 = mongoProperties0.createMongoClient(mongoClientOptions44, environment55);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions44);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClient22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertNotNull(commandListenerList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "mongodb://localhost/test" + "'", str42, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(socketFactory48);
        org.junit.Assert.assertNotNull(dBEncoderFactory49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 500 + "'", int50 == 500);
        org.junit.Assert.assertNotNull(readPreference51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertNotNull(mongoClient56);
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("100110011000000011100000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100110011000000011100000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int14 = mongoClientOptions10.getConnectTimeout();
        int int15 = mongoClientOptions10.getMinConnectionsPerHost();
        int int16 = mongoClientOptions10.getMaxWaitTime();
        com.mongodb.ReadConcern readConcern17 = mongoClientOptions10.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 120000 + "'", int16 == 120000);
        org.junit.Assert.assertNotNull(readConcern17);
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties17.createMongoClient(mongoClientOptions18, environment19);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder21.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties17.builder(mongoClientOptions27);
        int int29 = mongoClientOptions27.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions27);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties33.createMongoClient(mongoClientOptions34, environment35);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder40 = builder37.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties33.builder(mongoClientOptions43);
        int int45 = mongoClientOptions43.getLocalThreshold();
        int int46 = mongoClientOptions43.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory47 = mongoClientOptions43.getDbEncoderFactory();
        com.mongodb.ReadConcern readConcern48 = mongoClientOptions43.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder49 = builder32.readConcern(readConcern48);
        com.mongodb.MongoClientOptions.Builder builder51 = builder32.maxWaitTime(838860800);
        com.mongodb.MongoClientOptions.Builder builder53 = builder32.maxWaitTime(808146084);
        com.mongodb.MongoClientOptions.Builder builder55 = builder32.minConnectionsPerHost(0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory47);
        org.junit.Assert.assertNotNull(readConcern48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        int int2 = java.lang.Integer.compareUnsigned(54, 7280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.DBDecoderFactory dBDecoderFactory12 = mongoClientOptions10.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        int int14 = mongoClientOptions10.getServerSelectionTimeout();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30000 + "'", int14 == 30000);
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str8 = mongoProperties0.getDatabase();
        java.lang.String str9 = mongoProperties0.getDatabase();
        char[] charArray10 = null;
        mongoProperties0.setPassword(charArray10);
        mongoProperties0.setUsername("2");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.authenticationDatabase;
        boolean boolean16 = mongoProperties14.hasCustomAddress();
        java.lang.String str17 = mongoProperties14.username;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray25 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties18.password = charArray25;
        java.lang.String str27 = mongoProperties18.database;
        java.lang.String str28 = mongoProperties18.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        org.springframework.core.env.Environment environment31 = null;
        com.mongodb.MongoClient mongoClient32 = mongoProperties29.createMongoClient(mongoClientOptions30, environment31);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder36 = builder33.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties29.builder(mongoClientOptions39);
        int int41 = mongoClientOptions39.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions39);
        java.lang.String str43 = mongoClientOptions39.getDescription();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions39);
        org.springframework.core.env.Environment environment45 = null;
        com.mongodb.MongoClient mongoClient46 = mongoProperties18.createMongoClient(mongoClientOptions39, environment45);
        boolean boolean47 = mongoClientOptions39.isSslInvalidHostNameAllowed();
        java.lang.String str48 = mongoClientOptions39.getRequiredReplicaSetName();
        org.springframework.core.env.Environment environment49 = null;
        com.mongodb.MongoClient mongoClient50 = mongoProperties14.createMongoClient(mongoClientOptions39, environment49);
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties0.builder(mongoClientOptions39);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.alwaysUseMBeans(false);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(mongoClient32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(mongoClient46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(mongoClient50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions10.getCommandListeners();
        int int13 = mongoClientOptions10.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("10001000000000000000111001011");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10001000000000000000111001011\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.gridFsDatabase = "141";
        java.lang.String str7 = mongoProperties0.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int9 = mongoProperties8.port;
        mongoProperties8.setUri("hi!");
        char[] charArray12 = mongoProperties8.getPassword();
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions14.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions14.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties8.builder(mongoClientOptions14);
        int int19 = mongoClientOptions14.getSocketTimeout();
        int int20 = mongoClientOptions14.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions14);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray29 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties22.password = charArray29;
        java.lang.Class<java.lang.Integer> intClass31 = java.lang.Integer.TYPE;
        mongoProperties22.fieldNamingStrategy = intClass31;
        java.lang.String str33 = mongoProperties22.username;
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties22.builder(mongoClientOptions34);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        org.springframework.core.env.Environment environment38 = null;
        com.mongodb.MongoClient mongoClient39 = mongoProperties36.createMongoClient(mongoClientOptions37, environment38);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder43 = builder40.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder43.build();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties36.builder(mongoClientOptions46);
        int int48 = mongoClientOptions46.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions46);
        java.lang.String str50 = mongoClientOptions46.getDescription();
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions46);
        java.lang.String str52 = mongoClientOptions46.getDescription();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions46);
        boolean boolean54 = mongoClientOptions46.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder55 = com.mongodb.MongoClientOptions.builder(mongoClientOptions46);
        org.springframework.core.env.Environment environment56 = null;
        com.mongodb.MongoClient mongoClient57 = mongoProperties22.createMongoClient(mongoClientOptions46, environment56);
        int int58 = mongoClientOptions46.getConnectTimeout();
        com.mongodb.ReadPreference readPreference59 = mongoClientOptions46.getReadPreference();
        int int60 = mongoClientOptions46.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder61 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder61.build();
        boolean boolean63 = mongoClientOptions62.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList64 = mongoClientOptions62.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties0.builder(mongoClientOptions62);
        int int66 = mongoClientOptions62.getLocalThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClient57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10000 + "'", int58 == 10000);
        org.junit.Assert.assertNotNull(readPreference59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 15 + "'", int60 == 15);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(commandListenerList64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 15 + "'", int66 == 15);
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        int int2 = java.lang.Integer.min(1979853352, 3429385);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3429385 + "'", int2 == 3429385);
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int14 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int15 = mongoClientOptions10.getServerSelectionTimeout();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList16 = mongoClientOptions10.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        java.lang.String str18 = mongoClientOptions10.getDescription();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions10.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertNotNull(commandListenerList16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        mongoProperties0.authenticationDatabase = "-1";
        mongoProperties0.setUsername("");
        java.lang.String str16 = mongoProperties0.username;
        mongoProperties0.setPort((java.lang.Integer) 15);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray26 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties19.password = charArray26;
        mongoProperties19.database = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray37 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties30.password = charArray37;
        java.lang.String str39 = mongoProperties30.database;
        java.lang.String str40 = mongoProperties30.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions42 = null;
        org.springframework.core.env.Environment environment43 = null;
        com.mongodb.MongoClient mongoClient44 = mongoProperties41.createMongoClient(mongoClientOptions42, environment43);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder48 = builder45.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties41.builder(mongoClientOptions51);
        int int53 = mongoClientOptions51.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions51);
        java.lang.String str55 = mongoClientOptions51.getDescription();
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions51);
        org.springframework.core.env.Environment environment57 = null;
        com.mongodb.MongoClient mongoClient58 = mongoProperties30.createMongoClient(mongoClientOptions51, environment57);
        com.mongodb.MongoClientOptions.Builder builder59 = mongoProperties19.builder(mongoClientOptions51);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder59.build();
        int int61 = mongoClientOptions60.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties0.builder(mongoClientOptions60);
        com.mongodb.MongoClientOptions.Builder builder63 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.description("");
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder69 = builder65.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder71 = builder65.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder72 = builder65.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder74 = builder65.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder76 = builder74.connectTimeout(1024);
        com.mongodb.MongoClientOptions.Builder builder78 = builder74.minConnectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder79 = builder74.legacyDefaults();
        com.mongodb.MongoClientOptions mongoClientOptions80 = builder74.build();
        boolean boolean81 = mongoClientOptions60.equals((java.lang.Object) mongoClientOptions80);
        com.mongodb.DBDecoderFactory dBDecoderFactory82 = mongoClientOptions60.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder83 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions60);
        int int84 = mongoClientOptions60.getMaxConnectionIdleTime();
        boolean boolean85 = mongoClientOptions60.isSslEnabled();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(mongoClient44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(mongoClient58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 120000 + "'", int61 == 120000);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(mongoClientOptions80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions14.getHeartbeatConnectTimeout();
        boolean boolean17 = mongoClientOptions14.isSslEnabled();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions14, environment18);
        java.lang.String str20 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setUsername("5");
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int7 = mongoProperties6.port;
        mongoProperties6.setUri("hi!");
        char[] charArray10 = mongoProperties6.getPassword();
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        boolean boolean13 = mongoClientOptions12.isCursorFinalizerEnabled();
        int int14 = mongoClientOptions12.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions12.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties6.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        int int19 = mongoClientOptions12.getMinHeartbeatFrequency();
        int int20 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertNotNull(writeConcern15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("12");
        mongoProperties0.clearPassword();
        org.springframework.core.env.Environment environment18 = null;
        int int19 = mongoProperties0.determinePort(environment18);
        org.springframework.core.env.Environment environment20 = null;
        int int21 = mongoProperties0.determinePort(environment20);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder25 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        int int29 = mongoClientOptions28.getMinHeartbeatFrequency();
        boolean boolean30 = mongoClientOptions28.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties0.builder(mongoClientOptions28);
        java.lang.String str32 = mongoProperties0.uri;
        java.lang.Class<?> wildcardClass33 = mongoProperties0.fieldNamingStrategy;
        char[] charArray34 = null;
        mongoProperties0.password = charArray34;
        char[] charArray36 = mongoProperties0.password;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 500 + "'", int29 == 500);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "mongodb://localhost/test" + "'", str32, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(charArray36);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("12");
        mongoProperties0.clearPassword();
        mongoProperties0.authenticationDatabase = "mongodb://localhost/test";
        java.lang.Integer int20 = mongoProperties0.port;
        mongoProperties0.username = "1089550868";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(int20);
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        char[] charArray4 = mongoProperties0.getPassword();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        org.springframework.core.env.Environment environment9 = null;
        com.mongodb.MongoClient mongoClient10 = mongoProperties7.createMongoClient(mongoClientOptions8, environment9);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder14 = builder11.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties7.builder(mongoClientOptions17);
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions17.getDbDecoderFactory();
        int int20 = mongoClientOptions17.getSocketTimeout();
        int int21 = mongoClientOptions17.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder22 = com.mongodb.MongoClientOptions.builder(mongoClientOptions17);
        int int23 = mongoClientOptions17.getServerSelectionTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory24 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions17);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int27 = mongoProperties26.port;
        mongoProperties26.setAuthenticationDatabase("");
        mongoProperties26.setHost("1111111111111111111111111111111");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str33 = mongoProperties32.database;
        java.lang.String str34 = mongoProperties32.authenticationDatabase;
        java.lang.Class<?> wildcardClass35 = mongoProperties32.fieldNamingStrategy;
        mongoProperties32.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties32.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties32.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder45 = builder42.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder45.build();
        java.lang.String str49 = mongoClientOptions48.getDescription();
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties32.builder(mongoClientOptions48);
        mongoProperties32.setUri("5");
        java.lang.String str53 = mongoProperties32.getGridFsDatabase();
        java.lang.String str54 = mongoProperties32.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties55 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray62 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties55.password = charArray62;
        java.lang.String str64 = mongoProperties55.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties65 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str66 = mongoProperties65.database;
        java.lang.String str67 = mongoProperties65.authenticationDatabase;
        java.lang.Integer int68 = mongoProperties65.port;
        java.lang.Class<java.lang.Integer> intClass69 = java.lang.Integer.TYPE;
        mongoProperties65.fieldNamingStrategy = intClass69;
        mongoProperties55.setFieldNamingStrategy(intClass69);
        mongoProperties32.setFieldNamingStrategy(intClass69);
        mongoProperties26.fieldNamingStrategy = intClass69;
        boolean boolean74 = mongoClientOptions17.equals((java.lang.Object) intClass69);
        mongoProperties0.setFieldNamingStrategy(intClass69);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mongoClient10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500 + "'", int21 == 500);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 30000 + "'", int23 == 30000);
        org.junit.Assert.assertNotNull(dBDecoderFactory24);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(int68);
        org.junit.Assert.assertNotNull(intClass69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions1.getCodecRegistry();
        int int7 = mongoClientOptions1.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.connectTimeout(1024);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.minConnectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.heartbeatSocketTimeout(5000000);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.description("");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder26 = builder20.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder27 = builder20.legacyDefaults();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.database;
        mongoProperties28.setHost("mongodb://localhost/test");
        java.lang.String str32 = mongoProperties28.getHost();
        com.mongodb.MongoClientOptions.Builder builder33 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder33.build();
        int int35 = mongoClientOptions34.getHeartbeatConnectTimeout();
        int int36 = mongoClientOptions34.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties28.builder(mongoClientOptions34);
        javax.net.SocketFactory socketFactory38 = mongoClientOptions34.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions34.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder20.dbEncoderFactory(dBEncoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.alwaysUseMBeans(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions44 = null;
        org.springframework.core.env.Environment environment45 = null;
        com.mongodb.MongoClient mongoClient46 = mongoProperties43.createMongoClient(mongoClientOptions44, environment45);
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder50 = builder47.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder50.build();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties43.builder(mongoClientOptions53);
        com.mongodb.DBDecoderFactory dBDecoderFactory55 = mongoClientOptions53.getDbDecoderFactory();
        int int56 = mongoClientOptions53.getSocketTimeout();
        int int57 = mongoClientOptions53.getMinHeartbeatFrequency();
        org.bson.codecs.configuration.CodecRegistry codecRegistry58 = mongoClientOptions53.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions53);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties60 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str61 = mongoProperties60.database;
        mongoProperties60.setHost("mongodb://localhost/test");
        java.lang.String str64 = mongoProperties60.getUri();
        int int65 = mongoProperties60.getDEFAULT_PORT();
        java.lang.String str66 = mongoProperties60.gridFsDatabase;
        java.lang.String str67 = mongoProperties60.getUri();
        com.mongodb.MongoClientOptions.Builder builder68 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions69 = builder68.build();
        com.mongodb.MongoClientOptions.Builder builder70 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder71 = mongoProperties60.builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder72 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions69);
        boolean boolean73 = mongoClientOptions69.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder74 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions69);
        org.bson.codecs.configuration.CodecRegistry codecRegistry75 = mongoClientOptions69.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder76 = builder59.codecRegistry(codecRegistry75);
        com.mongodb.MongoClientOptions.Builder builder77 = builder42.codecRegistry(codecRegistry75);
        com.mongodb.MongoClientOptions.Builder builder78 = builder17.codecRegistry(codecRegistry75);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties79 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str80 = mongoProperties79.database;
        mongoProperties79.setHost("mongodb://localhost/test");
        java.lang.String str83 = mongoProperties79.getUri();
        int int84 = mongoProperties79.getDEFAULT_PORT();
        java.lang.String str85 = mongoProperties79.gridFsDatabase;
        java.lang.String str86 = mongoProperties79.getUri();
        com.mongodb.MongoClientOptions.Builder builder87 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions88 = builder87.build();
        com.mongodb.MongoClientOptions.Builder builder89 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions88);
        com.mongodb.MongoClientOptions.Builder builder90 = mongoProperties79.builder(mongoClientOptions88);
        com.mongodb.MongoClientOptions.Builder builder91 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions88);
        boolean boolean92 = mongoClientOptions88.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder93 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions88);
        org.bson.codecs.configuration.CodecRegistry codecRegistry94 = mongoClientOptions88.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder95 = builder17.codecRegistry(codecRegistry94);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "mongodb://localhost/test" + "'", str32, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClient46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(dBDecoderFactory55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 500 + "'", int57 == 500);
        org.junit.Assert.assertNotNull(codecRegistry58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "mongodb://localhost/test" + "'", str64, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 27017 + "'", int65 == 27017);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "mongodb://localhost/test" + "'", str67, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClientOptions69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(codecRegistry75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "mongodb://localhost/test" + "'", str83, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 27017 + "'", int84 == 27017);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "mongodb://localhost/test" + "'", str86, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(mongoClientOptions88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(codecRegistry94);
        org.junit.Assert.assertNotNull(builder95);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        int int2 = java.lang.Integer.rotateRight(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList13 = mongoClientOptions10.getCommandListeners();
        int int14 = mongoClientOptions10.getLocalThreshold();
        com.mongodb.ReadPreference readPreference15 = mongoClientOptions10.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions10.getDbDecoderFactory();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(commandListenerList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(readPreference15);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        int int2 = java.lang.Integer.max(838860805, 2011850240);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2011850240 + "'", int2 == 2011850240);
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        boolean boolean8 = mongoClientOptions6.isSocketKeepAlive();
        int int9 = mongoClientOptions6.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        int int11 = mongoClientOptions6.getMaxConnectionIdleTime();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int13 = mongoProperties12.port;
        mongoProperties12.setAuthenticationDatabase("");
        java.lang.Integer int16 = mongoProperties12.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray24 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties17.password = charArray24;
        mongoProperties12.setPassword(charArray24);
        mongoProperties12.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        org.springframework.core.env.Environment environment31 = null;
        com.mongodb.MongoClient mongoClient32 = mongoProperties29.createMongoClient(mongoClientOptions30, environment31);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder36 = builder33.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties29.builder(mongoClientOptions39);
        int int41 = mongoClientOptions39.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties12.builder(mongoClientOptions39);
        int int43 = mongoClientOptions39.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions39);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties45 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.springframework.core.env.Environment environment47 = null;
        com.mongodb.MongoClient mongoClient48 = mongoProperties45.createMongoClient(mongoClientOptions46, environment47);
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder52 = builder49.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions55 = builder52.build();
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties45.builder(mongoClientOptions55);
        int int57 = mongoClientOptions55.getLocalThreshold();
        int int58 = mongoClientOptions55.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory59 = mongoClientOptions55.getDbEncoderFactory();
        com.mongodb.ReadConcern readConcern60 = mongoClientOptions55.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder61 = builder44.readConcern(readConcern60);
        com.mongodb.MongoClientOptions.Builder builder63 = builder44.localThreshold(27017);
        boolean boolean64 = mongoClientOptions6.equals((java.lang.Object) builder44);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(mongoClient48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(mongoClientOptions55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 15 + "'", int57 == 15);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory59);
        org.junit.Assert.assertNotNull(readConcern60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("c31b21f0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"c31b21f0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions1.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.springframework.core.env.Environment environment11 = null;
        com.mongodb.MongoClient mongoClient12 = mongoProperties9.createMongoClient(mongoClientOptions10, environment11);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder13.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties9.builder(mongoClientOptions19);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList21 = mongoClientOptions19.getCommandListeners();
        int int22 = mongoClientOptions19.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions19);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        org.springframework.core.env.Environment environment26 = null;
        com.mongodb.MongoClient mongoClient27 = mongoProperties24.createMongoClient(mongoClientOptions25, environment26);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder31 = builder28.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties24.builder(mongoClientOptions34);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList36 = mongoClientOptions34.getCommandListeners();
        java.lang.String str37 = mongoClientOptions34.getRequiredReplicaSetName();
        int int38 = mongoClientOptions34.getThreadsAllowedToBlockForConnectionMultiplier();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList39 = mongoClientOptions34.getCommandListeners();
        boolean boolean40 = mongoClientOptions19.equals((java.lang.Object) commandListenerList39);
        int int41 = mongoClientOptions19.getHeartbeatFrequency();
        boolean boolean42 = mongoClientOptions1.equals((java.lang.Object) int41);
        int int43 = mongoClientOptions1.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoClient12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(commandListenerList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(commandListenerList36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(commandListenerList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10000 + "'", int41 == 10000);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int9 = mongoClientOptions6.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        int int11 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int12 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        int int13 = mongoClientOptions6.getSocketTimeout();
        int int14 = mongoClientOptions6.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList13 = mongoClientOptions10.getCommandListeners();
        int int14 = mongoClientOptions10.getLocalThreshold();
        int int15 = mongoClientOptions10.getMaxConnectionIdleTime();
        int int16 = mongoClientOptions10.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(commandListenerList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
        int int1 = java.lang.Integer.highestOneBit((-1493172224));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        mongoProperties0.database = "97";
        java.lang.String str19 = mongoProperties0.getHost();
        java.lang.String str20 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties21.createMongoClient(mongoClientOptions22, environment23);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties21.builder(mongoClientOptions31);
        int int33 = mongoClientOptions31.getLocalThreshold();
        int int34 = mongoClientOptions31.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory35 = mongoClientOptions31.getDbEncoderFactory();
        org.springframework.core.env.Environment environment36 = null;
        com.mongodb.MongoClient mongoClient37 = mongoProperties0.createMongoClient(mongoClientOptions31, environment36);
        int int38 = mongoClientOptions31.getLocalThreshold();
        boolean boolean39 = mongoClientOptions31.isCursorFinalizerEnabled();
        int int40 = mongoClientOptions31.getConnectTimeout();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory35);
        org.junit.Assert.assertNotNull(mongoClient37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10000 + "'", int40 == 10000);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder5.maxConnectionLifeTime(120035);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.description("");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.description("1100100");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str20 = mongoProperties19.database;
        java.lang.String str21 = mongoProperties19.authenticationDatabase;
        java.lang.String str22 = mongoProperties19.getMongoClientDatabase();
        java.lang.String str23 = mongoProperties19.database;
        java.lang.String str24 = mongoProperties19.getUsername();
        java.lang.String str25 = mongoProperties19.getMongoClientDatabase();
        java.lang.String str26 = mongoProperties19.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        org.springframework.core.env.Environment environment29 = null;
        com.mongodb.MongoClient mongoClient30 = mongoProperties27.createMongoClient(mongoClientOptions28, environment29);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder34 = builder31.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties27.builder(mongoClientOptions37);
        int int39 = mongoClientOptions37.getLocalThreshold();
        int int40 = mongoClientOptions37.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory41 = mongoClientOptions37.getDbEncoderFactory();
        com.mongodb.ReadConcern readConcern42 = mongoClientOptions37.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties19.builder(mongoClientOptions37);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions45 = null;
        org.springframework.core.env.Environment environment46 = null;
        com.mongodb.MongoClient mongoClient47 = mongoProperties44.createMongoClient(mongoClientOptions45, environment46);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder51 = builder48.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder51.build();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties44.builder(mongoClientOptions54);
        com.mongodb.DBDecoderFactory dBDecoderFactory56 = mongoClientOptions54.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder57 = builder43.dbDecoderFactory(dBDecoderFactory56);
        com.mongodb.MongoClientOptions.Builder builder58 = builder16.dbDecoderFactory(dBDecoderFactory56);
        com.mongodb.MongoClientOptions.Builder builder59 = builder11.dbDecoderFactory(dBDecoderFactory56);
        com.mongodb.MongoClientOptions.Builder builder61 = builder11.description("2000041445");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "test" + "'", str22, "test");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "test" + "'", str25, "test");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb://localhost/test" + "'", str26, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(mongoClient30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory41);
        org.junit.Assert.assertNotNull(readConcern42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClient47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(dBDecoderFactory56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.Integer int2 = mongoProperties0.getPort();
        java.lang.String str3 = mongoProperties0.gridFsDatabase;
        java.lang.Class<?> wildcardClass4 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUri("947912705");
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getFieldNamingStrategy();
        int int8 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        java.lang.String str10 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        int int13 = mongoClientOptions12.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.String str15 = mongoClientOptions12.getRequiredReplicaSetName();
        java.lang.String str16 = mongoClientOptions12.getDescription();
        int int17 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        int int18 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int19 = mongoClientOptions12.getMaxConnectionLifeTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties17.createMongoClient(mongoClientOptions18, environment19);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder21.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties17.builder(mongoClientOptions27);
        int int29 = mongoClientOptions27.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        int int32 = mongoClientOptions27.getMaxConnectionIdleTime();
        int int33 = mongoClientOptions27.getHeartbeatFrequency();
        int int34 = mongoClientOptions27.getHeartbeatConnectTimeout();
        int int35 = mongoClientOptions27.getMaxConnectionLifeTime();
        java.lang.String str36 = mongoClientOptions27.getDescription();
        com.mongodb.ReadConcern readConcern37 = mongoClientOptions27.getReadConcern();
        com.mongodb.WriteConcern writeConcern38 = mongoClientOptions27.getWriteConcern();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10000 + "'", int33 == 10000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(readConcern37);
        org.junit.Assert.assertNotNull(writeConcern38);
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("5000000");
        com.mongodb.MongoClientOptions.Builder builder6 = builder3.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("e6");
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.localThreshold(786694144);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatConnectTimeout(1034249933);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions11);
        int int13 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions11.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions11);
        boolean boolean17 = mongoClientOptions11.isSocketKeepAlive();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions11, environment18);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions11);
        int int21 = mongoClientOptions11.getServerSelectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30000 + "'", int21 == 30000);
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("34");
        mongoProperties0.setAuthenticationDatabase("35");
        java.lang.String str9 = mongoProperties0.getUri();
        java.lang.String str10 = mongoProperties0.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties11.authenticationDatabase = "12";
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.springframework.core.env.Environment environment15 = null;
        com.mongodb.MongoClient mongoClient16 = mongoProperties11.createMongoClient(mongoClientOptions14, environment15);
        org.springframework.core.env.Environment environment17 = null;
        int int18 = mongoProperties11.determinePort(environment17);
        boolean boolean19 = mongoProperties11.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.authenticationDatabase;
        boolean boolean22 = mongoProperties20.hasCustomAddress();
        java.lang.String str23 = mongoProperties20.username;
        java.lang.String str24 = mongoProperties20.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray32 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties25.password = charArray32;
        java.lang.String str34 = mongoProperties25.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str36 = mongoProperties35.database;
        java.lang.String str37 = mongoProperties35.authenticationDatabase;
        java.lang.Integer int38 = mongoProperties35.port;
        java.lang.Class<java.lang.Integer> intClass39 = java.lang.Integer.TYPE;
        mongoProperties35.fieldNamingStrategy = intClass39;
        mongoProperties25.setFieldNamingStrategy(intClass39);
        mongoProperties20.fieldNamingStrategy = intClass39;
        mongoProperties11.fieldNamingStrategy = intClass39;
        mongoProperties0.fieldNamingStrategy = intClass39;
        mongoProperties0.authenticationDatabase = "10000001000000000000000000000000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "34" + "'", str9, "34");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "34" + "'", str10, "34");
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(intClass39);
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions10.getCommandListeners();
        java.lang.String str13 = mongoClientOptions10.getRequiredReplicaSetName();
        java.lang.String str14 = mongoClientOptions10.getDescription();
        int int15 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int16 = mongoClientOptions10.getHeartbeatConnectTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry17 = mongoClientOptions10.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.requiredReplicaSetName("229");
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.minConnectionsPerHost(124437);
        com.mongodb.MongoClientOptions.Builder builder23 = builder18.legacyDefaults();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(codecRegistry17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }
}

